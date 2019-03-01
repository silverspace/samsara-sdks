package controllers;

import apimodels.User;
import apimodels.UserRole;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface UsersApiControllerImpInterface {
    void deleteUserById( @NotNull String accessToken, Long userId) throws Exception;

    User getUserById( @NotNull String accessToken, Long userId) throws Exception;

    List<UserRole> listUserRoles( @NotNull String accessToken) throws Exception;

    List<User> listUsers( @NotNull String accessToken) throws Exception;

}
