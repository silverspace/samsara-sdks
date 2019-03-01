package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Contact;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class ContactsApiService {
    public abstract Response getOrganizationContact( @NotNull String accessToken,Long contactId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response listContacts( @NotNull String accessToken,SecurityContext securityContext) throws NotFoundException;
}
