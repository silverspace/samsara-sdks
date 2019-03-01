package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.Driver;
import org.openapitools.server.api.model.DriverForCreate;
import org.openapitools.server.api.model.InlineObject4;
import org.openapitools.server.api.MainApiException;

public final class DriversApiException extends MainApiException {
    public DriversApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final DriversApiException Drivers_createDriver_0_Exception = new DriversApiException(0, "Unexpected error.");
    public static final DriversApiException Drivers_deactivateDriver_0_Exception = new DriversApiException(0, "Unexpected error.");
    public static final DriversApiException Drivers_getAllDeactivatedDrivers_0_Exception = new DriversApiException(0, "Unexpected error.");
    public static final DriversApiException Drivers_getDeactivatedDriverById_0_Exception = new DriversApiException(0, "Unexpected error.");
    public static final DriversApiException Drivers_getDriverById_0_Exception = new DriversApiException(0, "Unexpected error.");
    public static final DriversApiException Drivers_reactivateDriverById_0_Exception = new DriversApiException(0, "Unexpected error.");
    

}