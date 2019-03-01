package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

import io.swagger.model.Address;
import io.swagger.model.Addresses;

import java.util.List;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")
public interface AddressesApiService {
      public Response addOrganizationAddresses(String accessToken, Addresses addresses, SecurityContext securityContext);
      public Response deleteOrganizationAddress(String accessToken, Long addressId, SecurityContext securityContext);
      public Response getOrganizationAddress(String accessToken, Long addressId, SecurityContext securityContext);
      public Response getOrganizationAddresses(String accessToken, SecurityContext securityContext);
      public Response updateOrganizationAddress(String accessToken, Address address, Long addressId, SecurityContext securityContext);
}
