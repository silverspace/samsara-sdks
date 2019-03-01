package org.openapitools.server.api.verticle;

import org.openapitools.server.api.model.AllRouteJobUpdates;
import org.openapitools.server.api.model.DispatchRoute;
import org.openapitools.server.api.model.DispatchRouteCreate;
import org.openapitools.server.api.model.DispatchRouteHistory;
import org.openapitools.server.api.MainApiException;

import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

import java.util.List;
import java.util.Map;

public interface RoutesApi  {
    //createDispatchRoute
    void createDispatchRoute(String accessToken, DispatchRouteCreate createDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //createDriverDispatchRoute
    void createDriverDispatchRoute(String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //createVehicleDispatchRoute
    void createVehicleDispatchRoute(String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
    //deleteDispatchRouteById
    void deleteDispatchRouteById(String accessToken, Long routeId, Handler<AsyncResult<Void>> handler);
    
    //fetchAllDispatchRoutes
    void fetchAllDispatchRoutes(String accessToken, Long groupId, Long endTime, Long duration, Handler<AsyncResult<List<DispatchRoute>>> handler);
    
    //fetchAllRouteJobUpdates
    void fetchAllRouteJobUpdates(String accessToken, Long groupId, String sequenceId, String include, Handler<AsyncResult<AllRouteJobUpdates>> handler);
    
    //getDispatchRouteById
    void getDispatchRouteById(String accessToken, Long routeId, Handler<AsyncResult<DispatchRoute>> handler);
    
    //getDispatchRouteHistory
    void getDispatchRouteHistory(String accessToken, Long routeId, Long startTime, Long endTime, Handler<AsyncResult<DispatchRouteHistory>> handler);
    
    //getDispatchRoutesByDriverId
    void getDispatchRoutesByDriverId(String accessToken, Long driverId, Long endTime, Long duration, Handler<AsyncResult<List<DispatchRoute>>> handler);
    
    //getDispatchRoutesByVehicleId
    void getDispatchRoutesByVehicleId(String accessToken, Long vehicleId, Long endTime, Long duration, Handler<AsyncResult<List<DispatchRoute>>> handler);
    
    //updateDispatchRouteById
    void updateDispatchRouteById(String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams, Handler<AsyncResult<DispatchRoute>> handler);
    
}
