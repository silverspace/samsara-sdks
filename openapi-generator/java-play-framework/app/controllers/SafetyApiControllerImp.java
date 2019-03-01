package controllers;

import apimodels.DriverSafetyScoreResponse;
import apimodels.VehicleHarshEventResponse;
import apimodels.VehicleSafetyScoreResponse;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class SafetyApiControllerImp implements SafetyApiControllerImpInterface {
    @Override
    public DriverSafetyScoreResponse getDriverSafetyScore(Long driverId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new DriverSafetyScoreResponse();
    }

    @Override
    public VehicleHarshEventResponse getVehicleHarshEvent(Long vehicleId,  @NotNull String accessToken,  @NotNull Long timestamp) throws Exception {
        //Do your magic!!!
        return new VehicleHarshEventResponse();
    }

    @Override
    public VehicleSafetyScoreResponse getVehicleSafetyScore(Long vehicleId,  @NotNull String accessToken,  @NotNull Long startMs,  @NotNull Long endMs) throws Exception {
        //Do your magic!!!
        return new VehicleSafetyScoreResponse();
    }

}
