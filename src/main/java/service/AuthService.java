package com.manasa.employeemanagementsystem.service;

import com.manasa.employeemanagementsystem.dto.AuthResponse;
import com.manasa.employeemanagementsystem.dto.LoginRequest;
import com.manasa.employeemanagementsystem.dto.RegisterRequest;
import com.manasa.employeemanagementsystem.entity.User;
import com.manasa.employeemanagementsystem.repository.UserRepository;
import com.manasa.employeemanagementsystem.security.JwtUtil;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
public class AuthService {


    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    private final JwtUtil jwtUtil;



    public AuthService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            JwtUtil jwtUtil) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.jwtUtil = jwtUtil;
    }



    public String register(RegisterRequest request) {


        User user = new User();


        user.setName(request.getName());


        user.setEmail(request.getEmail());


        user.setPassword(
                passwordEncoder.encode(
                        request.getPassword()
                )
        );


        // New users get USER role
        user.setRole("USER");


        userRepository.save(user);


        return "User registered successfully";
    }




    public AuthResponse login(LoginRequest request) {


        User user =
                userRepository.findByEmail(request.getEmail())
                        .orElseThrow(
                                () -> new RuntimeException(
                                        "User not found"
                                )
                        );



        if(!passwordEncoder.matches(
                request.getPassword(),
                user.getPassword())) {


            throw new RuntimeException(
                    "Invalid password"
            );
        }



        String token =
                jwtUtil.generateToken(
                        user.getEmail()
                );



        return new AuthResponse(token);

    }

}