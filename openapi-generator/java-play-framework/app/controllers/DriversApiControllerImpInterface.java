package controllers;

import apimodels.Driver;
import apimodels.DriverForCreate;
import apimodels.InlineObject4;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface DriversApiControllerImpInterface {
    Driver createDriver( @NotNull String accessToken, DriverForCreate createDriverParam) throws Exception;

    void deactivateDriver( @NotNull String accessToken, String driverIdOrExternalId) throws Exception;

    List<Driver> getAllDeactivatedDrivers( @NotNull String accessToken, Long groupId) throws Exception;

    Driver getDeactivatedDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception;

    Driver getDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception;

    Driver reactivateDriverById( @NotNull String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) throws Exception;

}
