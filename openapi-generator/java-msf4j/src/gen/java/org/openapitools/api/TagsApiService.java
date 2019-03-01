package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.Tag;
import org.openapitools.model.TagCreate;
import org.openapitools.model.TagModify;
import org.openapitools.model.TagUpdate;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public abstract class TagsApiService {
    public abstract Response createTag(String accessToken
 ,TagCreate tagCreateParams
 ) throws NotFoundException;
    public abstract Response deleteTagById(String accessToken
 ,Long tagId
 ) throws NotFoundException;
    public abstract Response getAllTags(String accessToken
 ,Long groupId
 ) throws NotFoundException;
    public abstract Response getTagById(String accessToken
 ,Long tagId
 ) throws NotFoundException;
    public abstract Response modifyTagById(String accessToken
 ,Long tagId
 ,TagModify tagModifyParams
 ) throws NotFoundException;
    public abstract Response updateTagById(String accessToken
 ,Long tagId
 ,TagUpdate updateTagParams
 ) throws NotFoundException;
}
