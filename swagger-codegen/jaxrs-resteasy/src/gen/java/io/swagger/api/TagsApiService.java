package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface TagsApiService {
      Response createTag(String accessToken,TagCreate tagCreateParams,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteTagById(String accessToken,Long tagId,SecurityContext securityContext)
      throws NotFoundException;
      Response getAllTags(String accessToken,Long groupId,SecurityContext securityContext)
      throws NotFoundException;
      Response getTagById(String accessToken,Long tagId,SecurityContext securityContext)
      throws NotFoundException;
      Response modifyTagById(String accessToken,Long tagId,TagModify tagModifyParams,SecurityContext securityContext)
      throws NotFoundException;
      Response updateTagById(String accessToken,Long tagId,TagUpdate updateTagParams,SecurityContext securityContext)
      throws NotFoundException;
}
