# routes_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDispatchRoute**](routes_api.md#CreateDispatchRoute) | **POST** /fleet/dispatch/routes | /fleet/dispatch/routes
[**CreateDriverDispatchRoute**](routes_api.md#CreateDriverDispatchRoute) | **POST** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**CreateVehicleDispatchRoute**](routes_api.md#CreateVehicleDispatchRoute) | **POST** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**DeleteDispatchRouteById**](routes_api.md#DeleteDispatchRouteById) | **DELETE** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/
[**FetchAllDispatchRoutes**](routes_api.md#FetchAllDispatchRoutes) | **GET** /fleet/dispatch/routes | /fleet/dispatch/routes
[**FetchAllRouteJobUpdates**](routes_api.md#FetchAllRouteJobUpdates) | **GET** /fleet/dispatch/routes/job_updates | /fleet/dispatch/routes/job_updates
[**GetDispatchRouteById**](routes_api.md#GetDispatchRouteById) | **GET** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}
[**GetDispatchRouteHistory**](routes_api.md#GetDispatchRouteHistory) | **GET** /fleet/dispatch/routes/{route_id}/history | /fleet/dispatch/routes/{route_id:[0-9]+}/history
[**GetDispatchRoutesByDriverId**](routes_api.md#GetDispatchRoutesByDriverId) | **GET** /fleet/drivers/{driver_id}/dispatch/routes | /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
[**GetDispatchRoutesByVehicleId**](routes_api.md#GetDispatchRoutesByVehicleId) | **GET** /fleet/vehicles/{vehicle_id}/dispatch/routes | /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
[**UpdateDispatchRouteById**](routes_api.md#UpdateDispatchRouteById) | **PUT** /fleet/dispatch/routes/{route_id} | /fleet/dispatch/routes/{route_id:[0-9]+}/


<a name="CreateDispatchRoute"></a>
# **CreateDispatchRoute**
> DispatchRoute CreateDispatchRoute(accessToken, createDispatchRouteParams)

/fleet/dispatch/routes

Create a new dispatch route.
<a name="CreateDriverDispatchRoute"></a>
# **CreateDriverDispatchRoute**
> DispatchRoute CreateDriverDispatchRoute(accessToken, driverId, createDispatchRouteParams)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the driver with driver_id.
<a name="CreateVehicleDispatchRoute"></a>
# **CreateVehicleDispatchRoute**
> DispatchRoute CreateVehicleDispatchRoute(accessToken, vehicleId, createDispatchRouteParams)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Create a new dispatch route for the vehicle with vehicle_id.
<a name="DeleteDispatchRouteById"></a>
# **DeleteDispatchRouteById**
> DeleteDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Delete a dispatch route and its associated jobs.
<a name="FetchAllDispatchRoutes"></a>
# **FetchAllDispatchRoutes**
> DispatchRoute FetchAllDispatchRoutes(accessToken, groupId, endTime, duration)

/fleet/dispatch/routes

Fetch all of the dispatch routes for the group.
<a name="FetchAllRouteJobUpdates"></a>
# **FetchAllRouteJobUpdates**
> AllRouteJobUpdates FetchAllRouteJobUpdates(accessToken, groupId, sequenceId, include)

/fleet/dispatch/routes/job_updates

Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
<a name="GetDispatchRouteById"></a>
# **GetDispatchRouteById**
> DispatchRoute GetDispatchRouteById(accessToken, routeId)

/fleet/dispatch/routes/{route_id:[0-9]+}

Fetch a dispatch route by id.
<a name="GetDispatchRouteHistory"></a>
# **GetDispatchRouteHistory**
> DispatchRouteHistory GetDispatchRouteHistory(accessToken, routeId, startTime, endTime)

/fleet/dispatch/routes/{route_id:[0-9]+}/history

Fetch the history of a dispatch route.
<a name="GetDispatchRoutesByDriverId"></a>
# **GetDispatchRoutesByDriverId**
> DispatchRoute GetDispatchRoutesByDriverId(accessToken, driverId, endTime, duration)

/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given driver.
<a name="GetDispatchRoutesByVehicleId"></a>
# **GetDispatchRoutesByVehicleId**
> DispatchRoute GetDispatchRoutesByVehicleId(accessToken, vehicleId, endTime, duration)

/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes

Fetch all of the dispatch routes for a given vehicle.
<a name="UpdateDispatchRouteById"></a>
# **UpdateDispatchRouteById**
> DispatchRoute UpdateDispatchRouteById(accessToken, routeId, updateDispatchRouteParams)

/fleet/dispatch/routes/{route_id:[0-9]+}/

Update a dispatch route and its associated jobs.
