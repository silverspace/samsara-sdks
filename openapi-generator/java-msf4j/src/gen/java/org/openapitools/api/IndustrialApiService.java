package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

import org.openapitools.model.DataInputHistoryResponse;
import org.openapitools.model.InlineResponse2006;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public abstract class IndustrialApiService {
    public abstract Response getAllDataInputs(String accessToken
 ,Long groupId
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
    public abstract Response getDataInput(String accessToken
 ,Long dataInputId
 ,Long startMs
 ,Long endMs
 ) throws NotFoundException;
}
