package com.userapp.service;

import com.userapp.exception.InvalidPasswordPatternException;
import com.userapp.exception.PasswordAuthenticationError;
import com.userapp.exception.UserAlreadyExistException;

public interface IvalidationService {
    boolean validateUserName(final String userName) throws UserAlreadyExistException;
    boolean validatePassword(final String password) throws InvalidPasswordPatternException;
}
