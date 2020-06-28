package com.mgmt.librarymgmt.Exception;

public class UserNotFoundException extends Throwable {

    public UserNotFoundException()  {
        super("User not found");
    }

    public UserNotFoundException(int id)  {
        super("User not found");
    }
}
