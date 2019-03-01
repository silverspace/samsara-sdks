package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface UsersApiService {
      Response deleteUserById(String accessToken,Long userId,SecurityContext securityContext)
      throws NotFoundException;
      Response getUserById(String accessToken,Long userId,SecurityContext securityContext)
      throws NotFoundException;
      Response listUsers(String accessToken,SecurityContext securityContext)
      throws NotFoundException;
}
