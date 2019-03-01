package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import io.swagger.model.CargoResponse;
import io.swagger.model.DoorResponse;
import io.swagger.model.GroupParam;
import io.swagger.model.HistoryParam1;
import io.swagger.model.HumidityResponse;
import io.swagger.model.InlineResponse2008;
import io.swagger.model.SensorHistoryResponse;
import io.swagger.model.SensorParam;
import io.swagger.model.TemperatureResponse;

import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2019-03-01T04:29:05.032Z")
public abstract class SensorsApiService {
    public abstract Response getSensors( @NotNull String accessToken,GroupParam groupParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsCargo( @NotNull String accessToken,SensorParam sensorParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsDoor( @NotNull String accessToken,SensorParam sensorParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsHistory( @NotNull String accessToken,HistoryParam1 historyParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsHumidity( @NotNull String accessToken,SensorParam sensorParam,SecurityContext securityContext) throws NotFoundException;
    public abstract Response getSensorsTemperature( @NotNull String accessToken,SensorParam sensorParam,SecurityContext securityContext) throws NotFoundException;
}
