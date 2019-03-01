package controllers;

import apimodels.DriverSafetyScoreResponse;
import apimodels.VehicleHarshEventResponse;
import apimodels.VehicleSafetyScoreResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface SafetyApiControllerImpInterface {
    DriverSafetyScoreResponse getDriverSafetyScore(Long driverId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

    VehicleHarshEventResponse getVehicleHarshEvent(Long vehicleId,  @NotNull String accessToken,  @NotNull Long timestamp) throws Exception;

    VehicleSafetyScoreResponse getVehicleSafetyScore(Long vehicleId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception;

}
