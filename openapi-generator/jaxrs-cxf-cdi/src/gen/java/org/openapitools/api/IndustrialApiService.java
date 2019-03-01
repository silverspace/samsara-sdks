package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")
public interface IndustrialApiService {
      public Response getAllDataInputs(String accessToken, Long groupId, Long startMs, Long endMs, SecurityContext securityContext);
      public Response getDataInput(String accessToken, Long dataInputId, Long startMs, Long endMs, SecurityContext securityContext);
}
