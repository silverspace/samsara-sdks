package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AllRouteJobUpdates;
import org.openapitools.server.api.model.DispatchRoute;
import org.openapitools.server.api.model.DispatchRouteCreate;
import org.openapitools.server.api.model.DispatchRouteHistory;
import org.openapitools.server.api.MainApiException;

public final class RoutesApiException extends MainApiException {
    public RoutesApiException(int statusCode, String statusMessage) {
        super(statusCode, statusMessage);
    }
    
    public static final RoutesApiException Routes_createDispatchRoute_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_createDriverDispatchRoute_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_createVehicleDispatchRoute_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_deleteDispatchRouteById_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_fetchAllDispatchRoutes_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_fetchAllRouteJobUpdates_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_getDispatchRouteById_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_getDispatchRouteHistory_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_getDispatchRoutesByDriverId_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_getDispatchRoutesByVehicleId_0_Exception = new RoutesApiException(0, "Unexpected error.");
    public static final RoutesApiException Routes_updateDispatchRouteById_0_Exception = new RoutesApiException(0, "Unexpected error.");
    

}