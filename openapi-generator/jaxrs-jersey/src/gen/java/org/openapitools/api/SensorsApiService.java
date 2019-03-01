package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import org.openapitools.model.CargoResponse;
import org.openapitools.model.DoorResponse;
import org.openapitools.model.HumidityResponse;
import org.openapitools.model.InlineObject19;
import org.openapitools.model.InlineObject20;
import org.openapitools.model.InlineObject21;
import org.openapitools.model.InlineObject22;
import org.openapitools.model.InlineObject23;
import org.openapitools.model.InlineObject24;
import org.openapitools.model.InlineResponse2008;
import org.openapitools.model.SensorHistoryResponse;
import org.openapitools.model.TemperatureResponse;

import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T05:35:19.593Z[GMT]")
public abstract class SensorsApiService {
    public abstract Response getSensors( @NotNull String accessToken,InlineObject23 groupParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsCargo( @NotNull String accessToken,InlineObject19 sensorParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsDoor( @NotNull String accessToken,InlineObject20 sensorParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsHistory( @NotNull String accessToken,InlineObject21 historyParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsHumidity( @NotNull String accessToken,InlineObject22 sensorParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsTemperature( @NotNull String accessToken,InlineObject24 sensorParam,SecurityContext securityContext) throws NotFoundException;
}
