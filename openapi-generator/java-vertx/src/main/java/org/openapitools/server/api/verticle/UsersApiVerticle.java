package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.User;
import org.openapitools.server.api.model.UserRole;

import java.util.List;
import java.util.Map;

public class UsersApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(UsersApiVerticle.class); 
    
    final static String DELETEUSERBYID_SERVICE_ID = "deleteUserById";
    final static String GETUSERBYID_SERVICE_ID = "getUserById";
    final static String LISTUSERROLES_SERVICE_ID = "listUserRoles";
    final static String LIST_USERS_SERVICE_ID = "list_users";
    
    final UsersApi service;

    public UsersApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.UsersApiImpl");
            service = (UsersApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("UsersApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for deleteUserById
        vertx.eventBus().<JsonObject> consumer(DELETEUSERBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteUserById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String userIdParam = message.body().getString("userId");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "userId is required"), serviceId);
                    return;
                }
                Long userId = Json.mapper.readValue(userIdParam, Long.class);
                service.deleteUserById(accessToken, userId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteUserById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteUserById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getUserById
        vertx.eventBus().<JsonObject> consumer(GETUSERBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getUserById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String userIdParam = message.body().getString("userId");
                if(userIdParam == null) {
                    manageError(message, new MainApiException(400, "userId is required"), serviceId);
                    return;
                }
                Long userId = Json.mapper.readValue(userIdParam, Long.class);
                service.getUserById(accessToken, userId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getUserById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getUserById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for listUserRoles
        vertx.eventBus().<JsonObject> consumer(LISTUSERROLES_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "listUserRoles";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                service.listUserRoles(accessToken, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "listUserRoles");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("listUserRoles", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for list_users
        vertx.eventBus().<JsonObject> consumer(LIST_USERS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "list_users";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                service.listUsers(accessToken, result -> {
                    if (result.succeeded())
                        message.reply(new JsonArray(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "list_users");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("list_users", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
    }
    
    private void manageError(Message<JsonObject> message, Throwable cause, String serviceName) {
        int code = MainApiException.INTERNAL_SERVER_ERROR.getStatusCode();
        String statusMessage = MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage();
        if (cause instanceof MainApiException) {
            code = ((MainApiException)cause).getStatusCode();
            statusMessage = ((MainApiException)cause).getStatusMessage();
        } else {
            logUnexpectedError(serviceName, cause); 
        }
            
        message.fail(code, statusMessage);
    }
    
    private void logUnexpectedError(String serviceName, Throwable cause) {
        LOGGER.error("Unexpected error in "+ serviceName, cause);
    }
}
