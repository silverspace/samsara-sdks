package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.User;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class UsersApiService {
    public abstract Response deleteUserById( @NotNull String accessToken,Long userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getUserById( @NotNull String accessToken,Long userId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listUsers( @NotNull String accessToken,SecurityContext securityContext) throws NotFoundException;
}
