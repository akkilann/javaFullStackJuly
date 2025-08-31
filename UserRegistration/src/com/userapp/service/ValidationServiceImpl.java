package com.userapp.service;

import com.userapp.exception.InvalidPasswordPatternException;
import com.userapp.exception.PasswordAuthenticationError;
import com.userapp.exception.UserAlreadyExistException;

public class ValidationServiceImpl implements IvalidationService{
    @Override
    public boolean validateUserName(String userName) throws UserAlreadyExistException {
        String[] userList = {"Jack", "Don", "Jadiel","Daniel"};

        boolean exists = false;
        for (String user : userList) {
            if (user.equals(userName)) {
                throw new UserAlreadyExistException("User Already Present");
            }
        }
        return exists;
    }

    @Override
    public boolean validatePassword(final String password) throws InvalidPasswordPatternException {
        // Check minimum length
        boolean checkPass = false;
        if (password.length() < 8 && !password.matches("[A-Za-z0-9]+"))  {
            throw new InvalidPasswordPatternException("Password Should Have 8 Chars && Only alpha numerics characters allowed");
        }
        else {
            checkPass = true;
        }
        return checkPass;
    }
}
