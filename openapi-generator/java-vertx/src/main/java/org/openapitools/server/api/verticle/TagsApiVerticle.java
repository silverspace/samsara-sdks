package org.openapitools.server.api.verticle;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.eventbus.Message;
import io.vertx.core.json.Json;
import io.vertx.core.json.JsonArray;
import io.vertx.core.json.JsonObject;
import io.vertx.core.logging.Logger;
import io.vertx.core.logging.LoggerFactory;

import org.openapitools.server.api.model.InlineResponse2009;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Tag;
import org.openapitools.server.api.model.TagCreate;
import org.openapitools.server.api.model.TagModify;
import org.openapitools.server.api.model.TagUpdate;

import java.util.List;
import java.util.Map;

public class TagsApiVerticle extends AbstractVerticle {
    final static Logger LOGGER = LoggerFactory.getLogger(TagsApiVerticle.class); 
    
    final static String CREATETAG_SERVICE_ID = "CreateTag";
    final static String DELETETAGBYID_SERVICE_ID = "deleteTagById";
    final static String GETALLTAGS_SERVICE_ID = "GetAllTags";
    final static String GETTAGBYID_SERVICE_ID = "getTagById";
    final static String MODIFYTAGBYID_SERVICE_ID = "modifyTagById";
    final static String UPDATETAGBYID_SERVICE_ID = "updateTagById";
    
    final TagsApi service;

    public TagsApiVerticle() {
        try {
            Class serviceImplClass = getClass().getClassLoader().loadClass("org.openapitools.server.api.verticle.TagsApiImpl");
            service = (TagsApi)serviceImplClass.newInstance();
        } catch (Exception e) {
            logUnexpectedError("TagsApiVerticle constructor", e);
            throw new RuntimeException(e);
        }
    }

    @Override
    public void start() throws Exception {
        
        //Consumer for CreateTag
        vertx.eventBus().<JsonObject> consumer(CREATETAG_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "CreateTag";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                JsonObject tagCreateParamsParam = message.body().getJsonObject("tagCreateParams");
                if (tagCreateParamsParam == null) {
                    manageError(message, new MainApiException(400, "tagCreateParams is required"), serviceId);
                    return;
                }
                TagCreate tagCreateParams = Json.mapper.readValue(tagCreateParamsParam.encode(), TagCreate.class);
                service.createTag(accessToken, tagCreateParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "CreateTag");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("CreateTag", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for deleteTagById
        vertx.eventBus().<JsonObject> consumer(DELETETAGBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "deleteTagById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String tagIdParam = message.body().getString("tag_id");
                if(tagIdParam == null) {
                    manageError(message, new MainApiException(400, "tag_id is required"), serviceId);
                    return;
                }
                Long tagId = Json.mapper.readValue(tagIdParam, Long.class);
                service.deleteTagById(accessToken, tagId, result -> {
                    if (result.succeeded())
                        message.reply(null);
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "deleteTagById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("deleteTagById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for GetAllTags
        vertx.eventBus().<JsonObject> consumer(GETALLTAGS_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "GetAllTags";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String groupIdParam = message.body().getString("group_id");
                Long groupId = (groupIdParam == null) ? null : Json.mapper.readValue(groupIdParam, Long.class);
                service.getAllTags(accessToken, groupId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "GetAllTags");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("GetAllTags", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for getTagById
        vertx.eventBus().<JsonObject> consumer(GETTAGBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "getTagById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String tagIdParam = message.body().getString("tag_id");
                if(tagIdParam == null) {
                    manageError(message, new MainApiException(400, "tag_id is required"), serviceId);
                    return;
                }
                Long tagId = Json.mapper.readValue(tagIdParam, Long.class);
                service.getTagById(accessToken, tagId, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "getTagById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("getTagById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for modifyTagById
        vertx.eventBus().<JsonObject> consumer(MODIFYTAGBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "modifyTagById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String tagIdParam = message.body().getString("tag_id");
                if(tagIdParam == null) {
                    manageError(message, new MainApiException(400, "tag_id is required"), serviceId);
                    return;
                }
                Long tagId = Json.mapper.readValue(tagIdParam, Long.class);
                JsonObject tagModifyParamsParam = message.body().getJsonObject("tagModifyParams");
                if (tagModifyParamsParam == null) {
                    manageError(message, new MainApiException(400, "tagModifyParams is required"), serviceId);
                    return;
                }
                TagModify tagModifyParams = Json.mapper.readValue(tagModifyParamsParam.encode(), TagModify.class);
                service.modifyTagById(accessToken, tagId, tagModifyParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "modifyTagById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("modifyTagById", e);
                message.fail(MainApiException.INTERNAL_SERVER_ERROR.getStatusCode(), MainApiException.INTERNAL_SERVER_ERROR.getStatusMessage());
            }
        });
        
        //Consumer for updateTagById
        vertx.eventBus().<JsonObject> consumer(UPDATETAGBYID_SERVICE_ID).handler(message -> {
            try {
                // Workaround for #allParams section clearing the vendorExtensions map
                String serviceId = "updateTagById";
                String accessTokenParam = message.body().getString("access_token");
                if(accessTokenParam == null) {
                    manageError(message, new MainApiException(400, "access_token is required"), serviceId);
                    return;
                }
                String accessToken = accessTokenParam;
                String tagIdParam = message.body().getString("tag_id");
                if(tagIdParam == null) {
                    manageError(message, new MainApiException(400, "tag_id is required"), serviceId);
                    return;
                }
                Long tagId = Json.mapper.readValue(tagIdParam, Long.class);
                JsonObject updateTagParamsParam = message.body().getJsonObject("updateTagParams");
                if (updateTagParamsParam == null) {
                    manageError(message, new MainApiException(400, "updateTagParams is required"), serviceId);
                    return;
                }
                TagUpdate updateTagParams = Json.mapper.readValue(updateTagParamsParam.encode(), TagUpdate.class);
                service.updateTagById(accessToken, tagId, updateTagParams, result -> {
                    if (result.succeeded())
                        message.reply(new JsonObject(Json.encode(result.result())).encodePrettily());
                    else {
                        Throwable cause = result.cause();
                        manageError(message, cause, "updateTagById");
                    }
                });
            } catch (Exception e) {
                logUnexpectedError("updateTagById", e);
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
