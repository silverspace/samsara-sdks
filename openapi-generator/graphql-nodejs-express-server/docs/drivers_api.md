# drivers_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateDriver**](drivers_api.md#CreateDriver) | **POST** /fleet/drivers/create | /fleet/drivers/create
[**DeactivateDriver**](drivers_api.md#DeactivateDriver) | **DELETE** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetAllDeactivatedDrivers**](drivers_api.md#GetAllDeactivatedDrivers) | **GET** /fleet/drivers/inactive | /fleet/drivers/inactive
[**GetDeactivatedDriverById**](drivers_api.md#GetDeactivatedDriverById) | **GET** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**GetDriverById**](drivers_api.md#GetDriverById) | **GET** /fleet/drivers/{driver_id_or_external_id} | /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
[**ReactivateDriverById**](drivers_api.md#ReactivateDriverById) | **PUT** /fleet/drivers/inactive/{driver_id_or_external_id} | /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}


<a name="CreateDriver"></a>
# **CreateDriver**
> Driver CreateDriver(accessToken, createDriverParam)

/fleet/drivers/create

Create a new driver.
<a name="DeactivateDriver"></a>
# **DeactivateDriver**
> DeactivateDriver(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Deactivate a driver with the given id.
<a name="GetAllDeactivatedDrivers"></a>
# **GetAllDeactivatedDrivers**
> Driver GetAllDeactivatedDrivers(accessToken, groupId)

/fleet/drivers/inactive

Fetch all deactivated drivers for the group.
<a name="GetDeactivatedDriverById"></a>
# **GetDeactivatedDriverById**
> Driver GetDeactivatedDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch deactivated driver by id.
<a name="GetDriverById"></a>
# **GetDriverById**
> Driver GetDriverById(accessToken, driverIdOrExternalId)

/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Fetch driver by id.
<a name="ReactivateDriverById"></a>
# **ReactivateDriverById**
> Driver ReactivateDriverById(accessToken, driverIdOrExternalId, reactivateDriverParam)

/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}

Reactivate the inactive driver having id.
