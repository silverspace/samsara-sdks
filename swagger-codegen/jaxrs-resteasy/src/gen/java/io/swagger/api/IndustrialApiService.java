package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.DataInputHistoryResponse;
import io.swagger.model.InlineResponse2006;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface IndustrialApiService {
      Response getAllDataInputs(String accessToken,Long groupId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
      Response getDataInput(String accessToken,Long dataInputId,Long startMs,Long endMs,SecurityContext securityContext)
      throws NotFoundException;
}
