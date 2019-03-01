package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.Address;
import org.openapitools.model.InlineObject;
import org.openapitools.model.InlineObject1;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public abstract class AddressesApiService {
    public abstract Response addOrganizationAddresses(String accessToken
 ,InlineObject addresses
 ) throws NotFoundException;
    public abstract Response deleteOrganizationAddress(String accessToken
 ,Long addressId
 ) throws NotFoundException;
    public abstract Response getOrganizationAddress(String accessToken
 ,Long addressId
 ) throws NotFoundException;
    public abstract Response getOrganizationAddresses(String accessToken
 ) throws NotFoundException;
    public abstract Response updateOrganizationAddress(String accessToken
 ,Long addressId
 ,InlineObject1 address
 ) throws NotFoundException;
}
