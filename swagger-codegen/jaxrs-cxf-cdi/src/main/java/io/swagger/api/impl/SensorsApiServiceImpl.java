package io.swagger.api.impl;

import io.swagger.api.*;
import io.swagger.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

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

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T04:20:11.959Z")
public class SensorsApiServiceImpl implements SensorsApiService {
      @Override
      public Response getSensors(String accessToken, GroupParam groupParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsCargo(String accessToken, SensorParam sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsDoor(String accessToken, SensorParam sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsHistory(String accessToken, HistoryParam1 historyParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsHumidity(String accessToken, SensorParam sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsTemperature(String accessToken, SensorParam sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
