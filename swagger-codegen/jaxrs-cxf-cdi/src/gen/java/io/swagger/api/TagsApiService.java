package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.InlineResponse2009;
import io.swagger.model.Tag;
import io.swagger.model.TagCreate;
import io.swagger.model.TagModify;
import io.swagger.model.TagUpdate;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")
public interface TagsApiService {
      public Response createTag(String accessToken, TagCreate tagCreateParams, SecurityContext securityContext);
      public Response deleteTagById(String accessToken, Long tagId, SecurityContext securityContext);
      public Response getAllTags(String accessToken, Long groupId, SecurityContext securityContext);
      public Response getTagById(String accessToken, Long tagId, SecurityContext securityContext);
      public Response modifyTagById(String accessToken, Long tagId, TagModify tagModifyParams, SecurityContext securityContext);
      public Response updateTagById(String accessToken, Long tagId, TagUpdate updateTagParams, SecurityContext securityContext);
}
