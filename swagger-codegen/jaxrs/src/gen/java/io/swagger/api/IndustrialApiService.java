package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.DataInputHistoryResponse;
import io.swagger.model.InlineResponse2006;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class IndustrialApiService {
    public abstract Response getAllDataInputs( @NotNull String accessToken, Long groupId, Long startMs, Long endMs,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getDataInput( @NotNull String accessToken,Long dataInputId, Long startMs, Long endMs,SecurityContext securityContext) throws NotFoundException;
}
