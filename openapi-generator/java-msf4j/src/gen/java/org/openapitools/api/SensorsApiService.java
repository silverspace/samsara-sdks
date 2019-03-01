package org.openapitools.api;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.wso2.msf4j.formparam.FormDataParam;
import org.wso2.msf4j.formparam.FileInfo;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2019-03-01T05:34:26.765Z[GMT]")
public abstract class SensorsApiService {
    public abstract Response getSensors(String accessToken
 ,InlineObject23 groupParam
 ) throws NotFoundException;
    public abstract Response getSensorsCargo(String accessToken
 ,InlineObject19 sensorParam
 ) throws NotFoundException;
    public abstract Response getSensorsDoor(String accessToken
 ,InlineObject20 sensorParam
 ) throws NotFoundException;
    public abstract Response getSensorsHistory(String accessToken
 ,InlineObject21 historyParam
 ) throws NotFoundException;
    public abstract Response getSensorsHumidity(String accessToken
 ,InlineObject22 sensorParam
 ) throws NotFoundException;
    public abstract Response getSensorsTemperature(String accessToken
 ,InlineObject24 sensorParam
 ) throws NotFoundException;
}
