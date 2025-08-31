package com.userapp.register;

import com.userapp.exception.InvalidPasswordPatternException;
import com.userapp.exception.UserAlreadyExistException;
import com.userapp.service.ValidationServiceImpl;

import java.util.Objects;
import java.util.Scanner;

public class Registration {

    public static void main(String[] args) throws UserAlreadyExistException, InvalidPasswordPatternException {
        String userName;
        String password;
        System.out.println(":: User Registration :: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Username ::");
        userName = scanner.next();
        ValidationServiceImpl ivalidationService = new ValidationServiceImpl();
        if(Objects.nonNull(userName) && !ivalidationService.validateUserName(userName)){
            System.out.println("User Name Check Completed:: User Doesn't exist" );
            System.out.println("Enter Password ::");
            password = scanner.next();
            if(ivalidationService.validatePassword(password)){
                System.out.println("Account Creation Successful for "+ userName);
            }
        }
    }
}
