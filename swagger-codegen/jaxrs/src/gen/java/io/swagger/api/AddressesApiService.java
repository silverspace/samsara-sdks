package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.Address;
import io.swagger.model.Addresses;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class AddressesApiService {
    public abstract Response addOrganizationAddresses( @NotNull String accessToken,Addresses addresses,SecurityContext securityContext) throws NotFoundException;
    public abstract Response deleteOrganizationAddress( @NotNull String accessToken,Long addressId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrganizationAddress( @NotNull String accessToken,Long addressId,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getOrganizationAddresses( @NotNull String accessToken,SecurityContext securityContext) throws NotFoundException;
    public abstract Response updateOrganizationAddress( @NotNull String accessToken,Address address,Long addressId,SecurityContext securityContext) throws NotFoundException;
}
