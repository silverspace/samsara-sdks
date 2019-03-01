package controllers;

import apimodels.User;
import apimodels.UserRole;

import play.mvc.Controller;
import play.mvc.Result;
import play.mvc.Http;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.inject.Inject;
import java.io.File;
import openapitools.OpenAPIUtils;
import com.fasterxml.jackson.core.type.TypeReference;

import javax.validation.constraints.*;
import play.Configuration;

import openapitools.OpenAPIUtils.ApiAction;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class UsersApiController extends Controller {

    private final UsersApiControllerImpInterface imp;
    private final ObjectMapper mapper;
    private final Configuration configuration;

    @Inject
    private UsersApiController(Configuration configuration, UsersApiControllerImpInterface imp) {
        this.imp = imp;
        mapper = new ObjectMapper();
        this.configuration = configuration;
    }


    @ApiAction
    public Result deleteUserById(Long userId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        imp.deleteUserById(accessToken, userId);
        return ok();
    }

    @ApiAction
    public Result getUserById(Long userId) throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        User obj = imp.getUserById(accessToken, userId);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            OpenAPIUtils.validate(obj);
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result listUserRoles() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        List<UserRole> obj = imp.listUserRoles(accessToken);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (UserRole curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }

    @ApiAction
    public Result listUsers() throws Exception {
        String valueaccessToken = request().getQueryString("access_token");
        String accessToken;
        if (valueaccessToken != null) {
            accessToken = valueaccessToken;
        } else {
            throw new IllegalArgumentException("'access_token' parameter is required");
        }
        List<User> obj = imp.listUsers(accessToken);
        if (configuration.getBoolean("useOutputBeanValidation")) {
            for (User curItem : obj) {
                OpenAPIUtils.validate(curItem);
            }
        }
        JsonNode result = mapper.valueToTree(obj);
        return ok(result);
    }
}
