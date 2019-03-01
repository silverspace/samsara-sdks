package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.DriverSafetyScoreResponse;
import org.openapitools.server.api.MainApiException;
import org.openapitools.server.api.model.VehicleHarshEventResponse;
import org.openapitools.server.api.model.VehicleSafetyScoreResponse;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface SafetyApi  {
    //GetDriverSafetyScore
    void getDriverSafetyScore(Long driverId, String accessToken, Long startMs, Long endMs, Handler<AsyncResult<DriverSafetyScoreResponse>> handler);
    
    //GetVehicleHarshEvent
    void getVehicleHarshEvent(Long vehicleId, String accessToken, Long timestamp, Handler<AsyncResult<VehicleHarshEventResponse>> handler);
    
    //GetVehicleSafetyScore
    void getVehicleSafetyScore(Long vehicleId, String accessToken, Long startMs, Long endMs, Handler<AsyncResult<VehicleSafetyScoreResponse>> handler);
    
}
