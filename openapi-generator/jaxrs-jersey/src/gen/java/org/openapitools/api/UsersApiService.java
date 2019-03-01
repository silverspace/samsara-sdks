package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.User;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public abstract class UsersApiService {
    public abstract Response deleteUserById( @NotNull String accessToken,Long userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserById( @NotNull String accessToken,Long userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUsers( @NotNull String accessToken,SecurityContext securityContext) throws NotFoundException;
}
