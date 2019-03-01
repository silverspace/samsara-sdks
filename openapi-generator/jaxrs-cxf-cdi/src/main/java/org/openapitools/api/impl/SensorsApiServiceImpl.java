package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.*;

import org.apache.cxf.jaxrs.ext.multipart.Attachment;

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

import java.io.InputStream;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@RequestScoped
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSCXFCDIServerCodegen", date = "2019-03-01T05:35:11.852Z[GMT]")
public class SensorsApiServiceImpl implements SensorsApiService {
      @Override
      public Response getSensors(String accessToken, InlineObject23 groupParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsCargo(String accessToken, InlineObject19 sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsDoor(String accessToken, InlineObject20 sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsHistory(String accessToken, InlineObject21 historyParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsHumidity(String accessToken, InlineObject22 sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
      @Override
      public Response getSensorsTemperature(String accessToken, InlineObject24 sensorParam, SecurityContext securityContext) {
      // do some magic!
      return Response.ok().entity("magic!").build();
  }
}
