package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public interface MachinesApiService {
      Response getMachines(String accessToken,InlineObject18 groupParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getMachinesHistory(String accessToken,InlineObject17 historyParam,SecurityContext securityContext)
      throws NotFoundException;
}
