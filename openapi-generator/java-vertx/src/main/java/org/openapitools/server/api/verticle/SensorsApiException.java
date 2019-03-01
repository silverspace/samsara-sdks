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

public final class SensorsApiException extends MainApiException {
    public SensorsApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final SensorsApiException Sensors_getSensors_0_Exception = new SensorsApiException(0, "Unexpected error.");
    public static final SensorsApiException Sensors_getSensorsCargo_0_Exception = new SensorsApiException(0, "Unexpected error.");
    public static final SensorsApiException Sensors_getSensorsDoor_0_Exception = new SensorsApiException(0, "Unexpected error.");
    public static final SensorsApiException Sensors_getSensorsHistory_0_Exception = new SensorsApiException(0, "Unexpected error.");
    public static final SensorsApiException Sensors_getSensorsHumidity_0_Exception = new SensorsApiException(0, "Unexpected error.");
    public static final SensorsApiException Sensors_getSensorsTemperature_0_Exception = new SensorsApiException(0, "Unexpected error.");
    

}