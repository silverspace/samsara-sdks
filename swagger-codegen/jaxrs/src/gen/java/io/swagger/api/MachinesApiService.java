package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam;
import io.swagger.model.InlineResponse2007;
import io.swagger.model.MachineHistoryResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class MachinesApiService {
    public abstract Response getMachines( @NotNull String accessToken,GroupParam groupParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getMachinesHistory( @NotNull String accessToken,HistoryParam historyParam,SecurityContext securityContext) throws NotFoundException;
}
