package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;
import org.apache.cxf.jaxrs.ext.multipart.Multipart;

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

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")
public interface SensorsApiService {
      public Response getSensors(String accessToken, GroupParam groupParam, SecurityContext securityContext);
      public Response getSensorsCargo(String accessToken, SensorParam sensorParam, SecurityContext securityContext);
      public Response getSensorsDoor(String accessToken, SensorParam sensorParam, SecurityContext securityContext);
      public Response getSensorsHistory(String accessToken, HistoryParam1 historyParam, SecurityContext securityContext);
      public Response getSensorsHumidity(String accessToken, SensorParam sensorParam, SecurityContext securityContext);
      public Response getSensorsTemperature(String accessToken, SensorParam sensorParam, SecurityContext securityContext);
}
