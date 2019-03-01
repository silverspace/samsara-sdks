package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public interface IndustrialApiService {
      Response getAllDataInputs(String accessToken,Long groupId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getDataInput(String accessToken,Long dataInputId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
}
