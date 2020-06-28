package com.mgmt.librarymgmt.Exception;

public class BookNotFoundException extends Throwable{

    public BookNotFoundException()  {
        super("Book not found");
    }

    public BookNotFoundException(int id)  {
        super("Book id not found : " + id);
    }
}
