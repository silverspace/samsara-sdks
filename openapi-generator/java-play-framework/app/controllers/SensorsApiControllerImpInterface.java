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

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface SensorsApiControllerImpInterface {
    InlineResponse2008 getSensors( @NotNull String accessToken, InlineObject23 groupParam) throws Exception;

    CargoResponse getSensorsCargo( @NotNull String accessToken, InlineObject19 sensorParam) throws Exception;

    DoorResponse getSensorsDoor( @NotNull String accessToken, InlineObject20 sensorParam) throws Exception;

    SensorHistoryResponse getSensorsHistory( @NotNull String accessToken, InlineObject21 historyParam) throws Exception;

    HumidityResponse getSensorsHumidity( @NotNull String accessToken, InlineObject22 sensorParam) throws Exception;

    TemperatureResponse getSensorsTemperature( @NotNull String accessToken, InlineObject24 sensorParam) throws Exception;

}
