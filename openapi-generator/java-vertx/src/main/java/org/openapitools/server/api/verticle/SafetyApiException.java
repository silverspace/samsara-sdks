package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DriverSafetyScoreResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.VehicleHarshEventResponse;
import org.openapitools.server.api.model.VehicleSafetyScoreResponse;

public final class SafetyApiException extends MainApiException {
    public SafetyApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final SafetyApiException Safety_getDriverSafetyScore_0_Exception = new SafetyApiException(0, "Unexpected error.");
    public static final SafetyApiException Safety_getVehicleHarshEvent_0_Exception = new SafetyApiException(0, "Unexpected error.");
    public static final SafetyApiException Safety_getVehicleSafetyScore_0_Exception = new SafetyApiException(0, "Unexpected error.");
    

}