package controllers;

import apimodels.AllRouteJobUpdates;
import apimodels.DispatchRoute;
import apimodels.DispatchRouteCreate;
import apimodels.DispatchRouteHistory;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;

import javax.validation.constraints.*;

@SuppressWarnings("RedundantThrows")
public interface RoutesApiControllerImpInterface {
    DispatchRoute createDispatchRoute( @NotNull String accessToken, DispatchRouteCreate createDispatchRouteParams) throws Exception;

    DispatchRoute createDriverDispatchRoute( @NotNull String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws Exception;

    DispatchRoute createVehicleDispatchRoute( @NotNull String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws Exception;

    void deleteDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception;

    List<DispatchRoute> fetchAllDispatchRoutes( @NotNull String accessToken, Long groupId, Long endTime, Long duration) throws Exception;

    AllRouteJobUpdates fetchAllRouteJobUpdates( @NotNull String accessToken, Long groupId, String sequenceId, String include) throws Exception;

    DispatchRoute getDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception;

    DispatchRouteHistory getDispatchRouteHistory( @NotNull String accessToken, Long routeId, Long startTime, Long endTime) throws Exception;

    List<DispatchRoute> getDispatchRoutesByDriverId( @NotNull String accessToken, Long driverId, Long endTime, Long duration) throws Exception;

    List<DispatchRoute> getDispatchRoutesByVehicleId( @NotNull String accessToken, Long vehicleId, Long endTime, Long duration) throws Exception;

    DispatchRoute updateDispatchRouteById( @NotNull String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws Exception;

}
