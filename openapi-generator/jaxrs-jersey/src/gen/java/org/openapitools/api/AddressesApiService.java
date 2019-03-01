package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public abstract class AddressesApiService {
    public abstract Response addOrganizationAddresses( @NotNull String accessToken,InlineObject addresses,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteOrganizationAddress( @NotNull String accessToken,Long addressId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrganizationAddress( @NotNull String accessToken,Long addressId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrganizationAddresses( @NotNull String accessToken,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateOrganizationAddress( @NotNull String accessToken,Long addressId,InlineObject1 address,SecurityContext securityContext) throws NotFoundException;
}
