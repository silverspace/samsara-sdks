package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.Tag;
import io.swagger.model.TagCreate;
import io.swagger.model.TagModify;
import io.swagger.model.TagUpdate;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class TagsApiService {
    public abstract Response createTag( @NotNull String accessToken,TagCreate tagCreateParams,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteTagById( @NotNull String accessToken,Long tagId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getAllTags( @NotNull String accessToken, Long groupId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getTagById( @NotNull String accessToken,Long tagId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response modifyTagById( @NotNull String accessToken,Long tagId,TagModify tagModifyParams,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateTagById( @NotNull String accessToken,Long tagId,TagUpdate updateTagParams,SecurityContext securityContext) throws NotFoundException;
}
