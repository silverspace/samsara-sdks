package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.CargoResponse;
import org.openapitools.server.api.model.DoorResponse;
import org.openapitools.server.api.model.HumidityResponse;
import org.openapitools.server.api.model.InlineObject19;
import org.openapitools.server.api.model.InlineObject20;
import org.openapitools.server.api.model.InlineObject21;
import org.openapitools.server.api.model.InlineObject22;
import org.openapitools.server.api.model.InlineObject23;
import org.openapitools.server.api.model.InlineObject24;
import org.openapitools.server.api.model.InlineResponse2008;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.SensorHistoryResponse;
import org.openapitools.server.api.model.TemperatureResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SensorsApi  {
    //get_sensors
    void getSensors(String accessToken, InlineObject23 groupParam, Handler<AsyncResult<InlineResponse2008>> handler);
    
    //get_sensors_cargo
    void getSensorsCargo(String accessToken, InlineObject19 sensorParam, Handler<AsyncResult<CargoResponse>> handler);
    
    //get_sensors_door
    void getSensorsDoor(String accessToken, InlineObject20 sensorParam, Handler<AsyncResult<DoorResponse>> handler);
    
    //get_sensors_history
    void getSensorsHistory(String accessToken, InlineObject21 historyParam, Handler<AsyncResult<SensorHistoryResponse>> handler);
    
    //get_sensors_humidity
    void getSensorsHumidity(String accessToken, InlineObject22 sensorParam, Handler<AsyncResult<HumidityResponse>> handler);
    
    //get_sensors_temperature
    void getSensorsTemperature(String accessToken, InlineObject24 sensorParam, Handler<AsyncResult<TemperatureResponse>> handler);
    
}
