package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.User;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")
public interface UsersApiService {
      public Response deleteUserById(String accessToken, Long userId, SecurityContext securityContext);
      public Response getUserById(String accessToken, Long userId, SecurityContext securityContext);
      public Response listUsers(String accessToken, SecurityContext securityContext);
}
