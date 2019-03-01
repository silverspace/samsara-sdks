# safety_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDriverSafetyScore**](safety_api.md#GetDriverSafetyScore) | **GET** /fleet/drivers/{driverId}/safety/score | /fleet/drivers/{driverId:[0-9]+}/safety/score
[**GetVehicleHarshEvent**](safety_api.md#GetVehicleHarshEvent) | **GET** /fleet/vehicles/{vehicleId}/safety/harsh_event | /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
[**GetVehicleSafetyScore**](safety_api.md#GetVehicleSafetyScore) | **GET** /fleet/vehicles/{vehicleId}/safety/score | /fleet/vehicles/{vehicleId:[0-9]+}/safety/score


<a name="GetDriverSafetyScore"></a>
# **GetDriverSafetyScore**
> DriverSafetyScoreResponse GetDriverSafetyScore(driverId, accessToken, startMs, endMs)

/fleet/drivers/{driverId:[0-9]+}/safety/score

Fetch the safety score for the driver.
<a name="GetVehicleHarshEvent"></a>
# **GetVehicleHarshEvent**
> VehicleHarshEventResponse GetVehicleHarshEvent(vehicleId, accessToken, timestamp)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event

Fetch harsh event details for a vehicle.
<a name="GetVehicleSafetyScore"></a>
# **GetVehicleSafetyScore**
> VehicleSafetyScoreResponse GetVehicleSafetyScore(vehicleId, accessToken, startMs, endMs)

/fleet/vehicles/{vehicleId:[0-9]+}/safety/score

Fetch the safety score for the vehicle.
