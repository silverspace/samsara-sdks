package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.InlineResponse2009;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.Tag;
import org.openapitools.server.api.model.TagCreate;
import org.openapitools.server.api.model.TagModify;
import org.openapitools.server.api.model.TagUpdate;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface TagsApi  {
    //CreateTag
    void createTag(String accessToken, TagCreate tagCreateParams, Handler<AsyncResult<Tag>> handler);
    
    //deleteTagById
    void deleteTagById(String accessToken, Long tagId, Handler<AsyncResult<Void>> handler);
    
    //GetAllTags
    void getAllTags(String accessToken, Long groupId, Handler<AsyncResult<InlineResponse2009>> handler);
    
    //getTagById
    void getTagById(String accessToken, Long tagId, Handler<AsyncResult<Tag>> handler);
    
    //modifyTagById
    void modifyTagById(String accessToken, Long tagId, TagModify tagModifyParams, Handler<AsyncResult<Tag>> handler);
    
    //updateTagById
    void updateTagById(String accessToken, Long tagId, TagUpdate updateTagParams, Handler<AsyncResult<Tag>> handler);
    
}
