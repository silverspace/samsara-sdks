package controllers;

import apimodels.User;
import apimodels.UserRole;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class UsersApiControllerImp implements UsersApiControllerImpInterface {
    @Override
    public void deleteUserById( @NotNull String accessToken, Long userId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public User getUserById( @NotNull String accessToken, Long userId) throws Exception {
        //Do your magic!!!
        return new User();
    }

    @Override
    public List<UserRole> listUserRoles( @NotNull String accessToken) throws Exception {
        //Do your magic!!!
        return new ArrayList<UserRole>();
    }

    @Override
    public List<User> listUsers( @NotNull String accessToken) throws Exception {
        //Do your magic!!!
        return new ArrayList<User>();
    }

}
