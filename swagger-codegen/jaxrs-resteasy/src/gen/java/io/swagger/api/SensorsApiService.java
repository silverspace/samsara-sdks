package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;


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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T04:20:27.798Z")
public interface SensorsApiService {
      Response getSensors(String accessToken,GroupParam groupParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getSensorsCargo(String accessToken,SensorParam sensorParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getSensorsDoor(String accessToken,SensorParam sensorParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getSensorsHistory(String accessToken,HistoryParam1 historyParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getSensorsHumidity(String accessToken,SensorParam sensorParam,SecurityContext securityContext)
      throws NotFoundException;
      Response getSensorsTemperature(String accessToken,SensorParam sensorParam,SecurityContext securityContext)
      throws NotFoundException;
}
