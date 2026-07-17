package com.manasa.employeemanagementsystem.exception;



import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.RestControllerAdvice;




@RestControllerAdvice
public class GlobalExceptionHandler {





    @ExceptionHandler(EmployeeNotFoundException.class)
    public ResponseEntity<ErrorResponse>
    handleEmployeeNotFound(EmployeeNotFoundException ex){



        ErrorResponse error = new ErrorResponse(

                ex.getMessage(),

                404

        );



        return new ResponseEntity<>(

                error,

                HttpStatus.NOT_FOUND

        );

    }







    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorResponse>
    handleException(Exception ex){



        ErrorResponse error = new ErrorResponse(

                ex.getMessage(),

                500

        );



        return new ResponseEntity<>(

                error,

                HttpStatus.INTERNAL_SERVER_ERROR

        );


    }


}