package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")
public interface MachinesApiService {
      public Response getMachines(String accessToken, InlineObject18 groupParam, SecurityContext securityContext);
      public Response getMachinesHistory(String accessToken, InlineObject17 historyParam, SecurityContext securityContext);
}
