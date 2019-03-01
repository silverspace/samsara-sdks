package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.User;
import org.openapitools.server.api.model.UserRole;

public final class UsersApiException extends MainApiException {
    public UsersApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final UsersApiException Users_deleteUserById_0_Exception = new UsersApiException(0, "Unexpected error.");
    public static final UsersApiException Users_getUserById_0_Exception = new UsersApiException(0, "Unexpected error.");
    public static final UsersApiException Users_listUserRoles_0_Exception = new UsersApiException(0, "Unexpected error.");
    public static final UsersApiException Users_listUsers_0_Exception = new UsersApiException(0, "Unexpected error.");
    

}