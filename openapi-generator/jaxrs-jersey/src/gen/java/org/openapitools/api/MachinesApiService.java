package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.InlineObject17;
import org.openapitools.model.InlineObject18;
import org.openapitools.model.InlineResponse2007;
import org.openapitools.model.MachineHistoryResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public abstract class MachinesApiService {
    public abstract Response getMachines( @NotNull String accessToken,InlineObject18 groupParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getMachinesHistory( @NotNull String accessToken,InlineObject17 historyParam,SecurityContext securityContext) throws NotFoundException;
}
