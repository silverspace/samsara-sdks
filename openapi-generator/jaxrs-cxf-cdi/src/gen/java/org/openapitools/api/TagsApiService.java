package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.InlineResponse2009;
import org.openapitools.model.Tag;
import org.openapitools.model.TagCreate;
import org.openapitools.model.TagModify;
import org.openapitools.model.TagUpdate;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")
public interface TagsApiService {
      public Response createTag(String accessToken, TagCreate tagCreateParams, SecurityContext securityContext);
      public Response deleteTagById(String accessToken, Long tagId, SecurityContext securityContext);
      public Response getAllTags(String accessToken, Long groupId, SecurityContext securityContext);
      public Response getTagById(String accessToken, Long tagId, SecurityContext securityContext);
      public Response modifyTagById(String accessToken, Long tagId, TagModify tagModifyParams, SecurityContext securityContext);
      public Response updateTagById(String accessToken, Long tagId, TagUpdate updateTagParams, SecurityContext securityContext);
}
