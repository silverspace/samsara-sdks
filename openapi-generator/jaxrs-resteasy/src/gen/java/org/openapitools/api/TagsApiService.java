package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
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
