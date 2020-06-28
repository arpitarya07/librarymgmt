package com.mgmt.librarymgmt.Util;

import com.mgmt.librarymgmt.DataAccessLayer.Book;
import org.springframework.util.StringUtils;

public class BookValidator {

    public  Boolean isBookValid(Book book) {
        if (StringUtils.isEmpty(book.getTitle())) {
            return false;
        }
        return true;
    }
}
