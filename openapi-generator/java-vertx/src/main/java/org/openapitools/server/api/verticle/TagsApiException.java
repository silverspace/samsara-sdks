package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InlineResponse2009;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Tag;
import org.openapitools.server.api.model.TagCreate;
import org.openapitools.server.api.model.TagModify;
import org.openapitools.server.api.model.TagUpdate;

public final class TagsApiException extends MainApiException {
    public TagsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final TagsApiException Tags_createTag_0_Exception = new TagsApiException(0, "Unexpected error.");
    public static final TagsApiException Tags_deleteTagById_0_Exception = new TagsApiException(0, "Unexpected error.");
    public static final TagsApiException Tags_getAllTags_0_Exception = new TagsApiException(0, "Unexpected error.");
    public static final TagsApiException Tags_getTagById_0_Exception = new TagsApiException(0, "Unexpected error.");
    public static final TagsApiException Tags_modifyTagById_0_Exception = new TagsApiException(0, "Unexpected error.");
    public static final TagsApiException Tags_updateTagById_0_Exception = new TagsApiException(0, "Unexpected error.");
    

}