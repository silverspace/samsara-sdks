package controllers;

import apimodels.AllRouteJobUpdates;
import apimodels.DispatchRoute;
import apimodels.DispatchRouteCreate;
import apimodels.DispatchRouteHistory;

import play.mvc.Http;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.FileInputStream;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

public class RoutesApiControllerImp implements RoutesApiControllerImpInterface {
    @Override
    public DispatchRoute createDispatchRoute( @NotNull String accessToken, DispatchRouteCreate createDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public DispatchRoute createDriverDispatchRoute( @NotNull String accessToken, Long driverId, DispatchRouteCreate createDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public DispatchRoute createVehicleDispatchRoute( @NotNull String accessToken, Long vehicleId, DispatchRouteCreate createDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public void deleteDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception {
        //Do your magic!!!
    }

    @Override
    public List<DispatchRoute> fetchAllDispatchRoutes( @NotNull String accessToken, Long groupId, Long endTime, Long duration) throws Exception {
        //Do your magic!!!
        return new ArrayList<DispatchRoute>();
    }

    @Override
    public AllRouteJobUpdates fetchAllRouteJobUpdates( @NotNull String accessToken, Long groupId, String sequenceId, String include) throws Exception {
        //Do your magic!!!
        return new AllRouteJobUpdates();
    }

    @Override
    public DispatchRoute getDispatchRouteById( @NotNull String accessToken, Long routeId) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

    @Override
    public DispatchRouteHistory getDispatchRouteHistory( @NotNull String accessToken, Long routeId, Long startTime, Long endTime) throws Exception {
        //Do your magic!!!
        return new DispatchRouteHistory();
    }

    @Override
    public List<DispatchRoute> getDispatchRoutesByDriverId( @NotNull String accessToken, Long driverId, Long endTime, Long duration) throws Exception {
        //Do your magic!!!
        return new ArrayList<DispatchRoute>();
    }

    @Override
    public List<DispatchRoute> getDispatchRoutesByVehicleId( @NotNull String accessToken, Long vehicleId, Long endTime, Long duration) throws Exception {
        //Do your magic!!!
        return new ArrayList<DispatchRoute>();
    }

    @Override
    public DispatchRoute updateDispatchRouteById( @NotNull String accessToken, Long routeId, DispatchRoute updateDispatchRouteParams) throws Exception {
        //Do your magic!!!
        return new DispatchRoute();
    }

}
