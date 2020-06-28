package com.mgmt.librarymgmt.Util;

import com.mgmt.librarymgmt.DataAccessLayer.User;
import org.springframework.util.StringUtils;

public class UserValidator {

    public  Boolean isUserValid(User user) {
        if (StringUtils.isEmpty(user.getEmail())) {
            return false;
        }
        return true;
    }
}
