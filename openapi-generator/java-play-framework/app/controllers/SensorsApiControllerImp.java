package controllers;

import apimodels.CargoResponse;
import apimodels.DoorResponse;
import apimodels.HumidityResponse;
import apimodels.InlineObject19;
import apimodels.InlineObject20;
import apimodels.InlineObject21;
import apimodels.InlineObject22;
import apimodels.InlineObject23;
import apimodels.InlineObject24;
import apimodels.InlineResponse2008;
import apimodels.SensorHistoryResponse;
import apimodels.TemperatureResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class SensorsApiControllerImp implements SensorsApiControllerImpInterface {
    @Override
    public InlineResponse2008 getSensors( @NotNull String accessToken, InlineObject23 groupParam) throws Exception {
        //Do your magic!!!
        return new InlineResponse2008();
    }

    @Override
    public CargoResponse getSensorsCargo( @NotNull String accessToken, InlineObject19 sensorParam) throws Exception {
        //Do your magic!!!
        return new CargoResponse();
    }

    @Override
    public DoorResponse getSensorsDoor( @NotNull String accessToken, InlineObject20 sensorParam) throws Exception {
        //Do your magic!!!
        return new DoorResponse();
    }

    @Override
    public SensorHistoryResponse getSensorsHistory( @NotNull String accessToken, InlineObject21 historyParam) throws Exception {
        //Do your magic!!!
        return new SensorHistoryResponse();
    }

    @Override
    public HumidityResponse getSensorsHumidity( @NotNull String accessToken, InlineObject22 sensorParam) throws Exception {
        //Do your magic!!!
        return new HumidityResponse();
    }

    @Override
    public TemperatureResponse getSensorsTemperature( @NotNull String accessToken, InlineObject24 sensorParam) throws Exception {
        //Do your magic!!!
        return new TemperatureResponse();
    }

}
