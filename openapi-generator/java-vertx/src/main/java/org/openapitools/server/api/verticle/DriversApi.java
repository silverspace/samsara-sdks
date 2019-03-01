package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Driver;
import org.openapitools.server.api.model.DriverForCreate;
import org.openapitools.server.api.model.InlineObject4;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface DriversApi  {
    //createDriver
    void createDriver(String accessToken, DriverForCreate createDriverParam, Handler<AsyncResult<Driver>> handler);
    
    //deactivateDriver
    void deactivateDriver(String accessToken, String driverIdOrExternalId, Handler<AsyncResult<Void>> handler);
    
    //getAllDeactivatedDrivers
    void getAllDeactivatedDrivers(String accessToken, Long groupId, Handler<AsyncResult<List<Driver>>> handler);
    
    //getDeactivatedDriverById
    void getDeactivatedDriverById(String accessToken, String driverIdOrExternalId, Handler<AsyncResult<Driver>> handler);
    
    //getDriverById
    void getDriverById(String accessToken, String driverIdOrExternalId, Handler<AsyncResult<Driver>> handler);
    
    //reactivateDriverById
    void reactivateDriverById(String accessToken, String driverIdOrExternalId, InlineObject4 reactivateDriverParam, Handler<AsyncResult<Driver>> handler);
    
}
