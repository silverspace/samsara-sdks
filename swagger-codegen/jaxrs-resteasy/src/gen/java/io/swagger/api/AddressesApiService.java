package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


import io.swagger.model.Address;
import io.swagger.model.Addresses;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface AddressesApiService {
      Response addOrganizationAddresses(String accessToken,Addresses addresses,SecurityContext securityContext)
      throws NotFoundException;
      Response deleteOrganizationAddress(String accessToken,Long addressId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrganizationAddress(String accessToken,Long addressId,SecurityContext securityContext)
      throws NotFoundException;
      Response getOrganizationAddresses(String accessToken,SecurityContext securityContext)
      throws NotFoundException;
      Response updateOrganizationAddress(String accessToken,Address address,Long addressId,SecurityContext securityContext)
      throws NotFoundException;
}
