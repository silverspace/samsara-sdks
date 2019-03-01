package org.openapitools.server.api.verticle;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.User;
import org.openapitools.server.api.model.UserRole;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface UsersApi  {
    //deleteUserById
    void deleteUserById(String accessToken, Long userId, Handler<AsyncResult<Void>> handler);
    
    //getUserById
    void getUserById(String accessToken, Long userId, Handler<AsyncResult<User>> handler);
    
    //listUserRoles
    void listUserRoles(String accessToken, Handler<AsyncResult<List<UserRole>>> handler);
    
    //list_users
    void listUsers(String accessToken, Handler<AsyncResult<List<User>>> handler);
    
}
