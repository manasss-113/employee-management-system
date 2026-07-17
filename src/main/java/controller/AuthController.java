package com.manasa.employeemanagementsystem.controller;

import com.manasa.employeemanagementsystem.dto.LoginRequest;
import com.manasa.employeemanagementsystem.dto.RegisterRequest;
import com.manasa.employeemanagementsystem.service.AuthService;

import jakarta.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/auth")
public class AuthController {


    private final AuthService authService;


    public AuthController(AuthService authService) {

        this.authService = authService;
    }



    // Register User
    @PostMapping("/register")
    public ResponseEntity<?> register(
            @Valid @RequestBody RegisterRequest request) {


        return ResponseEntity.ok(
                authService.register(request)
        );
    }



    // Login User
    @PostMapping("/login")
    public ResponseEntity<?> login(
            @RequestBody LoginRequest request) {


        return ResponseEntity.ok(
                authService.login(request)
        );
    }

}