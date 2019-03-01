package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.MachineHistoryResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface MachinesApiService {
      Response getMachines(String accessToken,GroupParam groupParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getMachinesHistory(String accessToken,HistoryParam historyParam,SecurityContext securityContext)
      throws NotFoundException;
}
