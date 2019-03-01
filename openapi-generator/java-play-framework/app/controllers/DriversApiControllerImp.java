package controllers;

import apimodels.Driver;
import apimodels.DriverForCreate;
import apimodels.InlineObject4;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class DriversApiControllerImp implements DriversApiControllerImpInterface {
    @Override
    public Driver createDriver( @NotNull String accessToken, DriverForCreate createDriverParam) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public void deactivateDriver( @NotNull String accessToken, String driverIdOrExternalId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<Driver> getAllDeactivatedDrivers( @NotNull String accessToken, Long groupId) throws Exception {
        //Do your magic!!!
        return new ArrayList<Driver>();
    }

    @Override
    public Driver getDeactivatedDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public Driver getDriverById( @NotNull String accessToken, String driverIdOrExternalId) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

    @Override
    public Driver reactivateDriverById( @NotNull String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam) throws Exception {
        //Do your magic!!!
        return new Driver();
    }

}
