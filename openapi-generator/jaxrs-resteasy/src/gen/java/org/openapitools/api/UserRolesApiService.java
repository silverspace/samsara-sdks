package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.UserRole;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public interface UserRolesApiService {
      Response listUserRoles(String accessToken,SecurityContext securityContext)
      throws NotFoundException;
}
