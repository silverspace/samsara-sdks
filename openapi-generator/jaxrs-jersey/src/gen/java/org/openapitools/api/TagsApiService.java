package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

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
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public abstract class TagsApiService {
    public abstract Response createTag( @NotNull String accessToken,TagCreate tagCreateParams,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTagById( @NotNull String accessToken,Long tagId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllTags( @NotNull String accessToken,Long groupId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTagById( @NotNull String accessToken,Long tagId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyTagById( @NotNull String accessToken,Long tagId,TagModify tagModifyParams,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTagById( @NotNull String accessToken,Long tagId,TagUpdate updateTagParams,SecurityContext securityContext) throws NotFoundException;
}
