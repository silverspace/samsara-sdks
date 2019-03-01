package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;


import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public interface AddressesApiService {
      Response addOrganizationAddresses(String accessToken,InlineObject addresses,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOrganizationAddress(String accessToken,Long addressId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrganizationAddress(String accessToken,Long addressId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrganizationAddresses(String accessToken,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrganizationAddress(String accessToken,Long addressId,InlineObject1 address,SecurityContext securityContext)
      throws NotFoundException;
}
