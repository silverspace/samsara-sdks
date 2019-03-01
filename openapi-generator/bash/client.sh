#!/usr/bin/env bash

# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
# !
# ! Note:
# !
# ! THIS SCRIPT HAS BEEN AUTOMATICALLY GENERATED USING
# ! openapi-generator (https://openapi-generator.tech)
# ! FROM OPENAPI SPECIFICATION IN JSON.
# !
# !
# !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

#
# This is a Bash client for Samsara API.
#
# LICENSE:
# 
#
# CONTACT:
# 
#
# MORE INFORMATION:
# 
#

# For improved pattern matching in case statemets
shopt -s extglob

###############################################################################
#
# Make sure Bash is at least in version 4.3
#
###############################################################################
if ! ( (("${BASH_VERSION:0:1}" == "4")) && (("${BASH_VERSION:2:1}" >= "3")) ) \
  && ! (("${BASH_VERSION:0:1}" >= "5")); then
    echo ""
    echo "Sorry - your Bash version is ${BASH_VERSION}"
    echo ""
    echo "You need at least Bash 4.3 to run this script."
    echo ""
    exit 1
fi

###############################################################################
#
# Global variables
#
###############################################################################

##
# The filename of this script for help messages
script_name=$(basename "$0")

##
# Map for headers passed after operation as KEY:VALUE
declare -A header_arguments


##
# Map for operation parameters passed after operation as PARAMETER=VALUE
# These will be mapped to appropriate path or query parameters
# The values in operation_parameters are arrays, so that multiple values
# can be provided for the same parameter if allowed by API specification
declare -A operation_parameters

##
# Declare colors with autodection if output is terminal
if [ -t 1 ]; then
    RED="$(tput setaf 1)"
    GREEN="$(tput setaf 2)"
    YELLOW="$(tput setaf 3)"
    BLUE="$(tput setaf 4)"
    MAGENTA="$(tput setaf 5)"
    CYAN="$(tput setaf 6)"
    WHITE="$(tput setaf 7)"
    BOLD="$(tput bold)"
    OFF="$(tput sgr0)"
else
    RED=""
    GREEN=""
    YELLOW=""
    BLUE=""
    MAGENTA=""
    CYAN=""
    WHITE=""
    BOLD=""
    OFF=""
fi

declare -a result_color_table=( "$WHITE" "$WHITE" "$GREEN" "$YELLOW" "$WHITE" "$MAGENTA" "$WHITE" )

##
# This array stores the minimum number of required occurrences for parameter
# 0 - optional
# 1 - required
declare -A operation_parameters_minimum_occurrences
operation_parameters_minimum_occurrences["getAllAssetCurrentLocations:::access_token"]=1
operation_parameters_minimum_occurrences["getAllAssetCurrentLocations:::group_id"]=0
operation_parameters_minimum_occurrences["getAllAssets:::access_token"]=1
operation_parameters_minimum_occurrences["getAllAssets:::group_id"]=0
operation_parameters_minimum_occurrences["getAssetLocation:::access_token"]=1
operation_parameters_minimum_occurrences["getAssetLocation:::asset_id"]=1
operation_parameters_minimum_occurrences["getAssetLocation:::startMs"]=1
operation_parameters_minimum_occurrences["getAssetLocation:::endMs"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::access_token"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::asset_id"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::startMs"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::endMs"]=1
operation_parameters_minimum_occurrences["createDriver:::access_token"]=1
operation_parameters_minimum_occurrences["createDriver:::createDriverParam"]=1
operation_parameters_minimum_occurrences["deactivateDriver:::access_token"]=1
operation_parameters_minimum_occurrences["deactivateDriver:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["getAllDeactivatedDrivers:::access_token"]=1
operation_parameters_minimum_occurrences["getAllDeactivatedDrivers:::group_id"]=0
operation_parameters_minimum_occurrences["getDeactivatedDriverById:::access_token"]=1
operation_parameters_minimum_occurrences["getDeactivatedDriverById:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["getDriverById:::access_token"]=1
operation_parameters_minimum_occurrences["getDriverById:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["reactivateDriverById:::access_token"]=1
operation_parameters_minimum_occurrences["reactivateDriverById:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["reactivateDriverById:::reactivateDriverParam"]=1
operation_parameters_minimum_occurrences["addFleetAddress:::access_token"]=1
operation_parameters_minimum_occurrences["addFleetAddress:::addressParam"]=1
operation_parameters_minimum_occurrences["addOrganizationAddresses:::access_token"]=1
operation_parameters_minimum_occurrences["addOrganizationAddresses:::addresses"]=1
operation_parameters_minimum_occurrences["createDispatchRoute:::access_token"]=1
operation_parameters_minimum_occurrences["createDispatchRoute:::createDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["createDriver:::access_token"]=1
operation_parameters_minimum_occurrences["createDriver:::createDriverParam"]=1
operation_parameters_minimum_occurrences["createDriverDispatchRoute:::access_token"]=1
operation_parameters_minimum_occurrences["createDriverDispatchRoute:::driver_id"]=1
operation_parameters_minimum_occurrences["createDriverDispatchRoute:::createDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["createDriverDocument:::access_token"]=1
operation_parameters_minimum_occurrences["createDriverDocument:::driver_id"]=1
operation_parameters_minimum_occurrences["createDriverDocument:::createDocumentParams"]=1
operation_parameters_minimum_occurrences["createDvir:::access_token"]=1
operation_parameters_minimum_occurrences["createDvir:::createDvirParam"]=1
operation_parameters_minimum_occurrences["createVehicleDispatchRoute:::access_token"]=1
operation_parameters_minimum_occurrences["createVehicleDispatchRoute:::vehicle_id"]=1
operation_parameters_minimum_occurrences["createVehicleDispatchRoute:::createDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["deactivateDriver:::access_token"]=1
operation_parameters_minimum_occurrences["deactivateDriver:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["deleteDispatchRouteById:::access_token"]=1
operation_parameters_minimum_occurrences["deleteDispatchRouteById:::route_id"]=1
operation_parameters_minimum_occurrences["deleteOrganizationAddress:::access_token"]=1
operation_parameters_minimum_occurrences["deleteOrganizationAddress:::addressId"]=1
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::access_token"]=1
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::group_id"]=0
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::end_time"]=0
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::duration"]=0
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::access_token"]=1
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::group_id"]=0
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::sequence_id"]=0
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::include"]=0
operation_parameters_minimum_occurrences["getAllAssetCurrentLocations:::access_token"]=1
operation_parameters_minimum_occurrences["getAllAssetCurrentLocations:::group_id"]=0
operation_parameters_minimum_occurrences["getAllAssets:::access_token"]=1
operation_parameters_minimum_occurrences["getAllAssets:::group_id"]=0
operation_parameters_minimum_occurrences["getAllDeactivatedDrivers:::access_token"]=1
operation_parameters_minimum_occurrences["getAllDeactivatedDrivers:::group_id"]=0
operation_parameters_minimum_occurrences["getAssetLocation:::access_token"]=1
operation_parameters_minimum_occurrences["getAssetLocation:::asset_id"]=1
operation_parameters_minimum_occurrences["getAssetLocation:::startMs"]=1
operation_parameters_minimum_occurrences["getAssetLocation:::endMs"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::access_token"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::asset_id"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::startMs"]=1
operation_parameters_minimum_occurrences["getAssetReefer:::endMs"]=1
operation_parameters_minimum_occurrences["getDeactivatedDriverById:::access_token"]=1
operation_parameters_minimum_occurrences["getDeactivatedDriverById:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["getDispatchRouteById:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRouteById:::route_id"]=1
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::route_id"]=1
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::start_time"]=0
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::end_time"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::driver_id"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::end_time"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::duration"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::vehicle_id"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::end_time"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::duration"]=0
operation_parameters_minimum_occurrences["getDriverById:::access_token"]=1
operation_parameters_minimum_occurrences["getDriverById:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["getDriverDocumentsByOrgId:::access_token"]=1
operation_parameters_minimum_occurrences["getDriverDocumentsByOrgId:::endMs"]=0
operation_parameters_minimum_occurrences["getDriverDocumentsByOrgId:::durationMs"]=0
operation_parameters_minimum_occurrences["getDriverSafetyScore:::driverId"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::access_token"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::startMs"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::endMs"]=1
operation_parameters_minimum_occurrences["getDvirs:::access_token"]=1
operation_parameters_minimum_occurrences["getDvirs:::end_ms"]=1
operation_parameters_minimum_occurrences["getDvirs:::duration_ms"]=1
operation_parameters_minimum_occurrences["getDvirs:::group_id"]=0
operation_parameters_minimum_occurrences["getFleetDrivers:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetDrivers:::groupDriversParam"]=1
operation_parameters_minimum_occurrences["getFleetDriversHosDailyLogs:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetDriversHosDailyLogs:::driver_id"]=1
operation_parameters_minimum_occurrences["getFleetDriversHosDailyLogs:::hosLogsParam"]=1
operation_parameters_minimum_occurrences["getFleetDriversSummary:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetDriversSummary:::driversSummaryParam"]=1
operation_parameters_minimum_occurrences["getFleetDriversSummary:::snap_to_day_bounds"]=0
operation_parameters_minimum_occurrences["getFleetHosAuthenticationLogs:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetHosAuthenticationLogs:::hosAuthenticationLogsParam"]=1
operation_parameters_minimum_occurrences["getFleetHosLogs:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetHosLogs:::hosLogsParam"]=1
operation_parameters_minimum_occurrences["getFleetHosLogsSummary:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetHosLogsSummary:::hosLogsParam"]=1
operation_parameters_minimum_occurrences["getFleetLocations:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetLocations:::groupParam"]=1
operation_parameters_minimum_occurrences["getFleetMaintenanceList:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetMaintenanceList:::groupParam"]=1
operation_parameters_minimum_occurrences["getFleetTrips:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetTrips:::tripsParam"]=1
operation_parameters_minimum_occurrences["getFleetVehicle:::access_token"]=1
operation_parameters_minimum_occurrences["getFleetVehicle:::vehicle_id_or_external_id"]=1
operation_parameters_minimum_occurrences["getOrganizationAddress:::access_token"]=1
operation_parameters_minimum_occurrences["getOrganizationAddress:::addressId"]=1
operation_parameters_minimum_occurrences["getOrganizationAddresses:::access_token"]=1
operation_parameters_minimum_occurrences["getOrganizationContact:::access_token"]=1
operation_parameters_minimum_occurrences["getOrganizationContact:::contact_id"]=1
operation_parameters_minimum_occurrences["getVehicleHarshEvent:::vehicleId"]=1
operation_parameters_minimum_occurrences["getVehicleHarshEvent:::access_token"]=1
operation_parameters_minimum_occurrences["getVehicleHarshEvent:::timestamp"]=1
operation_parameters_minimum_occurrences["getVehicleLocations:::access_token"]=1
operation_parameters_minimum_occurrences["getVehicleLocations:::vehicle_id"]=1
operation_parameters_minimum_occurrences["getVehicleLocations:::startMs"]=1
operation_parameters_minimum_occurrences["getVehicleLocations:::endMs"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::vehicleId"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::access_token"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::startMs"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::endMs"]=1
operation_parameters_minimum_occurrences["getVehicleStats:::access_token"]=1
operation_parameters_minimum_occurrences["getVehicleStats:::startMs"]=1
operation_parameters_minimum_occurrences["getVehicleStats:::endMs"]=1
operation_parameters_minimum_occurrences["getVehicleStats:::series"]=0
operation_parameters_minimum_occurrences["getVehicleStats:::tagIds"]=0
operation_parameters_minimum_occurrences["getVehicleStats:::startingAfter"]=0
operation_parameters_minimum_occurrences["getVehicleStats:::endingBefore"]=0
operation_parameters_minimum_occurrences["getVehicleStats:::limit"]=0
operation_parameters_minimum_occurrences["getVehiclesLocations:::access_token"]=1
operation_parameters_minimum_occurrences["getVehiclesLocations:::startMs"]=1
operation_parameters_minimum_occurrences["getVehiclesLocations:::endMs"]=1
operation_parameters_minimum_occurrences["listContacts:::access_token"]=1
operation_parameters_minimum_occurrences["listFleet:::access_token"]=1
operation_parameters_minimum_occurrences["listFleet:::groupParam"]=1
operation_parameters_minimum_occurrences["listFleet:::startingAfter"]=0
operation_parameters_minimum_occurrences["listFleet:::endingBefore"]=0
operation_parameters_minimum_occurrences["listFleet:::limit"]=0
operation_parameters_minimum_occurrences["patchFleetVehicle:::access_token"]=1
operation_parameters_minimum_occurrences["patchFleetVehicle:::vehicle_id_or_external_id"]=1
operation_parameters_minimum_occurrences["patchFleetVehicle:::data"]=1
operation_parameters_minimum_occurrences["reactivateDriverById:::access_token"]=1
operation_parameters_minimum_occurrences["reactivateDriverById:::driver_id_or_external_id"]=1
operation_parameters_minimum_occurrences["reactivateDriverById:::reactivateDriverParam"]=1
operation_parameters_minimum_occurrences["updateDispatchRouteById:::access_token"]=1
operation_parameters_minimum_occurrences["updateDispatchRouteById:::route_id"]=1
operation_parameters_minimum_occurrences["updateDispatchRouteById:::updateDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["updateOrganizationAddress:::access_token"]=1
operation_parameters_minimum_occurrences["updateOrganizationAddress:::addressId"]=1
operation_parameters_minimum_occurrences["updateOrganizationAddress:::address"]=1
operation_parameters_minimum_occurrences["updateVehicles:::access_token"]=1
operation_parameters_minimum_occurrences["updateVehicles:::vehicleUpdateParam"]=1
operation_parameters_minimum_occurrences["getAllDataInputs:::access_token"]=1
operation_parameters_minimum_occurrences["getAllDataInputs:::group_id"]=0
operation_parameters_minimum_occurrences["getAllDataInputs:::startMs"]=0
operation_parameters_minimum_occurrences["getAllDataInputs:::endMs"]=0
operation_parameters_minimum_occurrences["getDataInput:::access_token"]=1
operation_parameters_minimum_occurrences["getDataInput:::data_input_id"]=1
operation_parameters_minimum_occurrences["getDataInput:::startMs"]=0
operation_parameters_minimum_occurrences["getDataInput:::endMs"]=0
operation_parameters_minimum_occurrences["getMachines:::access_token"]=1
operation_parameters_minimum_occurrences["getMachines:::groupParam"]=1
operation_parameters_minimum_occurrences["getMachinesHistory:::access_token"]=1
operation_parameters_minimum_occurrences["getMachinesHistory:::historyParam"]=1
operation_parameters_minimum_occurrences["createDispatchRoute:::access_token"]=1
operation_parameters_minimum_occurrences["createDispatchRoute:::createDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["createDriverDispatchRoute:::access_token"]=1
operation_parameters_minimum_occurrences["createDriverDispatchRoute:::driver_id"]=1
operation_parameters_minimum_occurrences["createDriverDispatchRoute:::createDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["createVehicleDispatchRoute:::access_token"]=1
operation_parameters_minimum_occurrences["createVehicleDispatchRoute:::vehicle_id"]=1
operation_parameters_minimum_occurrences["createVehicleDispatchRoute:::createDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["deleteDispatchRouteById:::access_token"]=1
operation_parameters_minimum_occurrences["deleteDispatchRouteById:::route_id"]=1
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::access_token"]=1
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::group_id"]=0
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::end_time"]=0
operation_parameters_minimum_occurrences["fetchAllDispatchRoutes:::duration"]=0
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::access_token"]=1
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::group_id"]=0
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::sequence_id"]=0
operation_parameters_minimum_occurrences["fetchAllRouteJobUpdates:::include"]=0
operation_parameters_minimum_occurrences["getDispatchRouteById:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRouteById:::route_id"]=1
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::route_id"]=1
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::start_time"]=0
operation_parameters_minimum_occurrences["getDispatchRouteHistory:::end_time"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::driver_id"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::end_time"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByDriverId:::duration"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::access_token"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::vehicle_id"]=1
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::end_time"]=0
operation_parameters_minimum_occurrences["getDispatchRoutesByVehicleId:::duration"]=0
operation_parameters_minimum_occurrences["updateDispatchRouteById:::access_token"]=1
operation_parameters_minimum_occurrences["updateDispatchRouteById:::route_id"]=1
operation_parameters_minimum_occurrences["updateDispatchRouteById:::updateDispatchRouteParams"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::driverId"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::access_token"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::startMs"]=1
operation_parameters_minimum_occurrences["getDriverSafetyScore:::endMs"]=1
operation_parameters_minimum_occurrences["getVehicleHarshEvent:::vehicleId"]=1
operation_parameters_minimum_occurrences["getVehicleHarshEvent:::access_token"]=1
operation_parameters_minimum_occurrences["getVehicleHarshEvent:::timestamp"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::vehicleId"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::access_token"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::startMs"]=1
operation_parameters_minimum_occurrences["getVehicleSafetyScore:::endMs"]=1
operation_parameters_minimum_occurrences["getSensors:::access_token"]=1
operation_parameters_minimum_occurrences["getSensors:::groupParam"]=1
operation_parameters_minimum_occurrences["getSensorsCargo:::access_token"]=1
operation_parameters_minimum_occurrences["getSensorsCargo:::sensorParam"]=1
operation_parameters_minimum_occurrences["getSensorsDoor:::access_token"]=1
operation_parameters_minimum_occurrences["getSensorsDoor:::sensorParam"]=1
operation_parameters_minimum_occurrences["getSensorsHistory:::access_token"]=1
operation_parameters_minimum_occurrences["getSensorsHistory:::historyParam"]=1
operation_parameters_minimum_occurrences["getSensorsHumidity:::access_token"]=1
operation_parameters_minimum_occurrences["getSensorsHumidity:::sensorParam"]=1
operation_parameters_minimum_occurrences["getSensorsTemperature:::access_token"]=1
operation_parameters_minimum_occurrences["getSensorsTemperature:::sensorParam"]=1
operation_parameters_minimum_occurrences["createTag:::access_token"]=1
operation_parameters_minimum_occurrences["createTag:::tagCreateParams"]=1
operation_parameters_minimum_occurrences["deleteTagById:::access_token"]=1
operation_parameters_minimum_occurrences["deleteTagById:::tag_id"]=1
operation_parameters_minimum_occurrences["getAllTags:::access_token"]=1
operation_parameters_minimum_occurrences["getAllTags:::group_id"]=0
operation_parameters_minimum_occurrences["getTagById:::access_token"]=1
operation_parameters_minimum_occurrences["getTagById:::tag_id"]=1
operation_parameters_minimum_occurrences["modifyTagById:::access_token"]=1
operation_parameters_minimum_occurrences["modifyTagById:::tag_id"]=1
operation_parameters_minimum_occurrences["modifyTagById:::tagModifyParams"]=1
operation_parameters_minimum_occurrences["updateTagById:::access_token"]=1
operation_parameters_minimum_occurrences["updateTagById:::tag_id"]=1
operation_parameters_minimum_occurrences["updateTagById:::updateTagParams"]=1
operation_parameters_minimum_occurrences["deleteUserById:::access_token"]=1
operation_parameters_minimum_occurrences["deleteUserById:::userId"]=1
operation_parameters_minimum_occurrences["getUserById:::access_token"]=1
operation_parameters_minimum_occurrences["getUserById:::userId"]=1
operation_parameters_minimum_occurrences["listUserRoles:::access_token"]=1
operation_parameters_minimum_occurrences["listUsers:::access_token"]=1

##
# This array stores the maximum number of allowed occurrences for parameter
# 1 - single value
# 2 - 2 values
# N - N values
# 0 - unlimited
declare -A operation_parameters_maximum_occurrences
operation_parameters_maximum_occurrences["getAllAssetCurrentLocations:::access_token"]=0
operation_parameters_maximum_occurrences["getAllAssetCurrentLocations:::group_id"]=0
operation_parameters_maximum_occurrences["getAllAssets:::access_token"]=0
operation_parameters_maximum_occurrences["getAllAssets:::group_id"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::access_token"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::asset_id"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::startMs"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::endMs"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::access_token"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::asset_id"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::startMs"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::endMs"]=0
operation_parameters_maximum_occurrences["createDriver:::access_token"]=0
operation_parameters_maximum_occurrences["createDriver:::createDriverParam"]=0
operation_parameters_maximum_occurrences["deactivateDriver:::access_token"]=0
operation_parameters_maximum_occurrences["deactivateDriver:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["getAllDeactivatedDrivers:::access_token"]=0
operation_parameters_maximum_occurrences["getAllDeactivatedDrivers:::group_id"]=0
operation_parameters_maximum_occurrences["getDeactivatedDriverById:::access_token"]=0
operation_parameters_maximum_occurrences["getDeactivatedDriverById:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["getDriverById:::access_token"]=0
operation_parameters_maximum_occurrences["getDriverById:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["reactivateDriverById:::access_token"]=0
operation_parameters_maximum_occurrences["reactivateDriverById:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["reactivateDriverById:::reactivateDriverParam"]=0
operation_parameters_maximum_occurrences["addFleetAddress:::access_token"]=0
operation_parameters_maximum_occurrences["addFleetAddress:::addressParam"]=0
operation_parameters_maximum_occurrences["addOrganizationAddresses:::access_token"]=0
operation_parameters_maximum_occurrences["addOrganizationAddresses:::addresses"]=0
operation_parameters_maximum_occurrences["createDispatchRoute:::access_token"]=0
operation_parameters_maximum_occurrences["createDispatchRoute:::createDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["createDriver:::access_token"]=0
operation_parameters_maximum_occurrences["createDriver:::createDriverParam"]=0
operation_parameters_maximum_occurrences["createDriverDispatchRoute:::access_token"]=0
operation_parameters_maximum_occurrences["createDriverDispatchRoute:::driver_id"]=0
operation_parameters_maximum_occurrences["createDriverDispatchRoute:::createDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["createDriverDocument:::access_token"]=0
operation_parameters_maximum_occurrences["createDriverDocument:::driver_id"]=0
operation_parameters_maximum_occurrences["createDriverDocument:::createDocumentParams"]=0
operation_parameters_maximum_occurrences["createDvir:::access_token"]=0
operation_parameters_maximum_occurrences["createDvir:::createDvirParam"]=0
operation_parameters_maximum_occurrences["createVehicleDispatchRoute:::access_token"]=0
operation_parameters_maximum_occurrences["createVehicleDispatchRoute:::vehicle_id"]=0
operation_parameters_maximum_occurrences["createVehicleDispatchRoute:::createDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["deactivateDriver:::access_token"]=0
operation_parameters_maximum_occurrences["deactivateDriver:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["deleteDispatchRouteById:::access_token"]=0
operation_parameters_maximum_occurrences["deleteDispatchRouteById:::route_id"]=0
operation_parameters_maximum_occurrences["deleteOrganizationAddress:::access_token"]=0
operation_parameters_maximum_occurrences["deleteOrganizationAddress:::addressId"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::access_token"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::group_id"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::end_time"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::duration"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::access_token"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::group_id"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::sequence_id"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::include"]=0
operation_parameters_maximum_occurrences["getAllAssetCurrentLocations:::access_token"]=0
operation_parameters_maximum_occurrences["getAllAssetCurrentLocations:::group_id"]=0
operation_parameters_maximum_occurrences["getAllAssets:::access_token"]=0
operation_parameters_maximum_occurrences["getAllAssets:::group_id"]=0
operation_parameters_maximum_occurrences["getAllDeactivatedDrivers:::access_token"]=0
operation_parameters_maximum_occurrences["getAllDeactivatedDrivers:::group_id"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::access_token"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::asset_id"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::startMs"]=0
operation_parameters_maximum_occurrences["getAssetLocation:::endMs"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::access_token"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::asset_id"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::startMs"]=0
operation_parameters_maximum_occurrences["getAssetReefer:::endMs"]=0
operation_parameters_maximum_occurrences["getDeactivatedDriverById:::access_token"]=0
operation_parameters_maximum_occurrences["getDeactivatedDriverById:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["getDispatchRouteById:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRouteById:::route_id"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::route_id"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::start_time"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::end_time"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::driver_id"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::end_time"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::duration"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::vehicle_id"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::end_time"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::duration"]=0
operation_parameters_maximum_occurrences["getDriverById:::access_token"]=0
operation_parameters_maximum_occurrences["getDriverById:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["getDriverDocumentsByOrgId:::access_token"]=0
operation_parameters_maximum_occurrences["getDriverDocumentsByOrgId:::endMs"]=0
operation_parameters_maximum_occurrences["getDriverDocumentsByOrgId:::durationMs"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::driverId"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::access_token"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::startMs"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::endMs"]=0
operation_parameters_maximum_occurrences["getDvirs:::access_token"]=0
operation_parameters_maximum_occurrences["getDvirs:::end_ms"]=0
operation_parameters_maximum_occurrences["getDvirs:::duration_ms"]=0
operation_parameters_maximum_occurrences["getDvirs:::group_id"]=0
operation_parameters_maximum_occurrences["getFleetDrivers:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetDrivers:::groupDriversParam"]=0
operation_parameters_maximum_occurrences["getFleetDriversHosDailyLogs:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetDriversHosDailyLogs:::driver_id"]=0
operation_parameters_maximum_occurrences["getFleetDriversHosDailyLogs:::hosLogsParam"]=0
operation_parameters_maximum_occurrences["getFleetDriversSummary:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetDriversSummary:::driversSummaryParam"]=0
operation_parameters_maximum_occurrences["getFleetDriversSummary:::snap_to_day_bounds"]=0
operation_parameters_maximum_occurrences["getFleetHosAuthenticationLogs:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetHosAuthenticationLogs:::hosAuthenticationLogsParam"]=0
operation_parameters_maximum_occurrences["getFleetHosLogs:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetHosLogs:::hosLogsParam"]=0
operation_parameters_maximum_occurrences["getFleetHosLogsSummary:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetHosLogsSummary:::hosLogsParam"]=0
operation_parameters_maximum_occurrences["getFleetLocations:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetLocations:::groupParam"]=0
operation_parameters_maximum_occurrences["getFleetMaintenanceList:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetMaintenanceList:::groupParam"]=0
operation_parameters_maximum_occurrences["getFleetTrips:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetTrips:::tripsParam"]=0
operation_parameters_maximum_occurrences["getFleetVehicle:::access_token"]=0
operation_parameters_maximum_occurrences["getFleetVehicle:::vehicle_id_or_external_id"]=0
operation_parameters_maximum_occurrences["getOrganizationAddress:::access_token"]=0
operation_parameters_maximum_occurrences["getOrganizationAddress:::addressId"]=0
operation_parameters_maximum_occurrences["getOrganizationAddresses:::access_token"]=0
operation_parameters_maximum_occurrences["getOrganizationContact:::access_token"]=0
operation_parameters_maximum_occurrences["getOrganizationContact:::contact_id"]=0
operation_parameters_maximum_occurrences["getVehicleHarshEvent:::vehicleId"]=0
operation_parameters_maximum_occurrences["getVehicleHarshEvent:::access_token"]=0
operation_parameters_maximum_occurrences["getVehicleHarshEvent:::timestamp"]=0
operation_parameters_maximum_occurrences["getVehicleLocations:::access_token"]=0
operation_parameters_maximum_occurrences["getVehicleLocations:::vehicle_id"]=0
operation_parameters_maximum_occurrences["getVehicleLocations:::startMs"]=0
operation_parameters_maximum_occurrences["getVehicleLocations:::endMs"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::vehicleId"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::access_token"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::startMs"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::endMs"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::access_token"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::startMs"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::endMs"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::series"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::tagIds"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::startingAfter"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::endingBefore"]=0
operation_parameters_maximum_occurrences["getVehicleStats:::limit"]=0
operation_parameters_maximum_occurrences["getVehiclesLocations:::access_token"]=0
operation_parameters_maximum_occurrences["getVehiclesLocations:::startMs"]=0
operation_parameters_maximum_occurrences["getVehiclesLocations:::endMs"]=0
operation_parameters_maximum_occurrences["listContacts:::access_token"]=0
operation_parameters_maximum_occurrences["listFleet:::access_token"]=0
operation_parameters_maximum_occurrences["listFleet:::groupParam"]=0
operation_parameters_maximum_occurrences["listFleet:::startingAfter"]=0
operation_parameters_maximum_occurrences["listFleet:::endingBefore"]=0
operation_parameters_maximum_occurrences["listFleet:::limit"]=0
operation_parameters_maximum_occurrences["patchFleetVehicle:::access_token"]=0
operation_parameters_maximum_occurrences["patchFleetVehicle:::vehicle_id_or_external_id"]=0
operation_parameters_maximum_occurrences["patchFleetVehicle:::data"]=0
operation_parameters_maximum_occurrences["reactivateDriverById:::access_token"]=0
operation_parameters_maximum_occurrences["reactivateDriverById:::driver_id_or_external_id"]=0
operation_parameters_maximum_occurrences["reactivateDriverById:::reactivateDriverParam"]=0
operation_parameters_maximum_occurrences["updateDispatchRouteById:::access_token"]=0
operation_parameters_maximum_occurrences["updateDispatchRouteById:::route_id"]=0
operation_parameters_maximum_occurrences["updateDispatchRouteById:::updateDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["updateOrganizationAddress:::access_token"]=0
operation_parameters_maximum_occurrences["updateOrganizationAddress:::addressId"]=0
operation_parameters_maximum_occurrences["updateOrganizationAddress:::address"]=0
operation_parameters_maximum_occurrences["updateVehicles:::access_token"]=0
operation_parameters_maximum_occurrences["updateVehicles:::vehicleUpdateParam"]=0
operation_parameters_maximum_occurrences["getAllDataInputs:::access_token"]=0
operation_parameters_maximum_occurrences["getAllDataInputs:::group_id"]=0
operation_parameters_maximum_occurrences["getAllDataInputs:::startMs"]=0
operation_parameters_maximum_occurrences["getAllDataInputs:::endMs"]=0
operation_parameters_maximum_occurrences["getDataInput:::access_token"]=0
operation_parameters_maximum_occurrences["getDataInput:::data_input_id"]=0
operation_parameters_maximum_occurrences["getDataInput:::startMs"]=0
operation_parameters_maximum_occurrences["getDataInput:::endMs"]=0
operation_parameters_maximum_occurrences["getMachines:::access_token"]=0
operation_parameters_maximum_occurrences["getMachines:::groupParam"]=0
operation_parameters_maximum_occurrences["getMachinesHistory:::access_token"]=0
operation_parameters_maximum_occurrences["getMachinesHistory:::historyParam"]=0
operation_parameters_maximum_occurrences["createDispatchRoute:::access_token"]=0
operation_parameters_maximum_occurrences["createDispatchRoute:::createDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["createDriverDispatchRoute:::access_token"]=0
operation_parameters_maximum_occurrences["createDriverDispatchRoute:::driver_id"]=0
operation_parameters_maximum_occurrences["createDriverDispatchRoute:::createDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["createVehicleDispatchRoute:::access_token"]=0
operation_parameters_maximum_occurrences["createVehicleDispatchRoute:::vehicle_id"]=0
operation_parameters_maximum_occurrences["createVehicleDispatchRoute:::createDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["deleteDispatchRouteById:::access_token"]=0
operation_parameters_maximum_occurrences["deleteDispatchRouteById:::route_id"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::access_token"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::group_id"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::end_time"]=0
operation_parameters_maximum_occurrences["fetchAllDispatchRoutes:::duration"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::access_token"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::group_id"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::sequence_id"]=0
operation_parameters_maximum_occurrences["fetchAllRouteJobUpdates:::include"]=0
operation_parameters_maximum_occurrences["getDispatchRouteById:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRouteById:::route_id"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::route_id"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::start_time"]=0
operation_parameters_maximum_occurrences["getDispatchRouteHistory:::end_time"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::driver_id"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::end_time"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByDriverId:::duration"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::access_token"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::vehicle_id"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::end_time"]=0
operation_parameters_maximum_occurrences["getDispatchRoutesByVehicleId:::duration"]=0
operation_parameters_maximum_occurrences["updateDispatchRouteById:::access_token"]=0
operation_parameters_maximum_occurrences["updateDispatchRouteById:::route_id"]=0
operation_parameters_maximum_occurrences["updateDispatchRouteById:::updateDispatchRouteParams"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::driverId"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::access_token"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::startMs"]=0
operation_parameters_maximum_occurrences["getDriverSafetyScore:::endMs"]=0
operation_parameters_maximum_occurrences["getVehicleHarshEvent:::vehicleId"]=0
operation_parameters_maximum_occurrences["getVehicleHarshEvent:::access_token"]=0
operation_parameters_maximum_occurrences["getVehicleHarshEvent:::timestamp"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::vehicleId"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::access_token"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::startMs"]=0
operation_parameters_maximum_occurrences["getVehicleSafetyScore:::endMs"]=0
operation_parameters_maximum_occurrences["getSensors:::access_token"]=0
operation_parameters_maximum_occurrences["getSensors:::groupParam"]=0
operation_parameters_maximum_occurrences["getSensorsCargo:::access_token"]=0
operation_parameters_maximum_occurrences["getSensorsCargo:::sensorParam"]=0
operation_parameters_maximum_occurrences["getSensorsDoor:::access_token"]=0
operation_parameters_maximum_occurrences["getSensorsDoor:::sensorParam"]=0
operation_parameters_maximum_occurrences["getSensorsHistory:::access_token"]=0
operation_parameters_maximum_occurrences["getSensorsHistory:::historyParam"]=0
operation_parameters_maximum_occurrences["getSensorsHumidity:::access_token"]=0
operation_parameters_maximum_occurrences["getSensorsHumidity:::sensorParam"]=0
operation_parameters_maximum_occurrences["getSensorsTemperature:::access_token"]=0
operation_parameters_maximum_occurrences["getSensorsTemperature:::sensorParam"]=0
operation_parameters_maximum_occurrences["createTag:::access_token"]=0
operation_parameters_maximum_occurrences["createTag:::tagCreateParams"]=0
operation_parameters_maximum_occurrences["deleteTagById:::access_token"]=0
operation_parameters_maximum_occurrences["deleteTagById:::tag_id"]=0
operation_parameters_maximum_occurrences["getAllTags:::access_token"]=0
operation_parameters_maximum_occurrences["getAllTags:::group_id"]=0
operation_parameters_maximum_occurrences["getTagById:::access_token"]=0
operation_parameters_maximum_occurrences["getTagById:::tag_id"]=0
operation_parameters_maximum_occurrences["modifyTagById:::access_token"]=0
operation_parameters_maximum_occurrences["modifyTagById:::tag_id"]=0
operation_parameters_maximum_occurrences["modifyTagById:::tagModifyParams"]=0
operation_parameters_maximum_occurrences["updateTagById:::access_token"]=0
operation_parameters_maximum_occurrences["updateTagById:::tag_id"]=0
operation_parameters_maximum_occurrences["updateTagById:::updateTagParams"]=0
operation_parameters_maximum_occurrences["deleteUserById:::access_token"]=0
operation_parameters_maximum_occurrences["deleteUserById:::userId"]=0
operation_parameters_maximum_occurrences["getUserById:::access_token"]=0
operation_parameters_maximum_occurrences["getUserById:::userId"]=0
operation_parameters_maximum_occurrences["listUserRoles:::access_token"]=0
operation_parameters_maximum_occurrences["listUsers:::access_token"]=0

##
# The type of collection for specifying multiple values for parameter:
# - multi, csv, ssv, tsv
declare -A operation_parameters_collection_type
operation_parameters_collection_type["getAllAssetCurrentLocations:::access_token"]=""
operation_parameters_collection_type["getAllAssetCurrentLocations:::group_id"]=""
operation_parameters_collection_type["getAllAssets:::access_token"]=""
operation_parameters_collection_type["getAllAssets:::group_id"]=""
operation_parameters_collection_type["getAssetLocation:::access_token"]=""
operation_parameters_collection_type["getAssetLocation:::asset_id"]=""
operation_parameters_collection_type["getAssetLocation:::startMs"]=""
operation_parameters_collection_type["getAssetLocation:::endMs"]=""
operation_parameters_collection_type["getAssetReefer:::access_token"]=""
operation_parameters_collection_type["getAssetReefer:::asset_id"]=""
operation_parameters_collection_type["getAssetReefer:::startMs"]=""
operation_parameters_collection_type["getAssetReefer:::endMs"]=""
operation_parameters_collection_type["createDriver:::access_token"]=""
operation_parameters_collection_type["createDriver:::createDriverParam"]=""
operation_parameters_collection_type["deactivateDriver:::access_token"]=""
operation_parameters_collection_type["deactivateDriver:::driver_id_or_external_id"]=""
operation_parameters_collection_type["getAllDeactivatedDrivers:::access_token"]=""
operation_parameters_collection_type["getAllDeactivatedDrivers:::group_id"]=""
operation_parameters_collection_type["getDeactivatedDriverById:::access_token"]=""
operation_parameters_collection_type["getDeactivatedDriverById:::driver_id_or_external_id"]=""
operation_parameters_collection_type["getDriverById:::access_token"]=""
operation_parameters_collection_type["getDriverById:::driver_id_or_external_id"]=""
operation_parameters_collection_type["reactivateDriverById:::access_token"]=""
operation_parameters_collection_type["reactivateDriverById:::driver_id_or_external_id"]=""
operation_parameters_collection_type["reactivateDriverById:::reactivateDriverParam"]=""
operation_parameters_collection_type["addFleetAddress:::access_token"]=""
operation_parameters_collection_type["addFleetAddress:::addressParam"]=""
operation_parameters_collection_type["addOrganizationAddresses:::access_token"]=""
operation_parameters_collection_type["addOrganizationAddresses:::addresses"]=""
operation_parameters_collection_type["createDispatchRoute:::access_token"]=""
operation_parameters_collection_type["createDispatchRoute:::createDispatchRouteParams"]=""
operation_parameters_collection_type["createDriver:::access_token"]=""
operation_parameters_collection_type["createDriver:::createDriverParam"]=""
operation_parameters_collection_type["createDriverDispatchRoute:::access_token"]=""
operation_parameters_collection_type["createDriverDispatchRoute:::driver_id"]=""
operation_parameters_collection_type["createDriverDispatchRoute:::createDispatchRouteParams"]=""
operation_parameters_collection_type["createDriverDocument:::access_token"]=""
operation_parameters_collection_type["createDriverDocument:::driver_id"]=""
operation_parameters_collection_type["createDriverDocument:::createDocumentParams"]=""
operation_parameters_collection_type["createDvir:::access_token"]=""
operation_parameters_collection_type["createDvir:::createDvirParam"]=""
operation_parameters_collection_type["createVehicleDispatchRoute:::access_token"]=""
operation_parameters_collection_type["createVehicleDispatchRoute:::vehicle_id"]=""
operation_parameters_collection_type["createVehicleDispatchRoute:::createDispatchRouteParams"]=""
operation_parameters_collection_type["deactivateDriver:::access_token"]=""
operation_parameters_collection_type["deactivateDriver:::driver_id_or_external_id"]=""
operation_parameters_collection_type["deleteDispatchRouteById:::access_token"]=""
operation_parameters_collection_type["deleteDispatchRouteById:::route_id"]=""
operation_parameters_collection_type["deleteOrganizationAddress:::access_token"]=""
operation_parameters_collection_type["deleteOrganizationAddress:::addressId"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::access_token"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::group_id"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::end_time"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::duration"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::access_token"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::group_id"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::sequence_id"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::include"]=""
operation_parameters_collection_type["getAllAssetCurrentLocations:::access_token"]=""
operation_parameters_collection_type["getAllAssetCurrentLocations:::group_id"]=""
operation_parameters_collection_type["getAllAssets:::access_token"]=""
operation_parameters_collection_type["getAllAssets:::group_id"]=""
operation_parameters_collection_type["getAllDeactivatedDrivers:::access_token"]=""
operation_parameters_collection_type["getAllDeactivatedDrivers:::group_id"]=""
operation_parameters_collection_type["getAssetLocation:::access_token"]=""
operation_parameters_collection_type["getAssetLocation:::asset_id"]=""
operation_parameters_collection_type["getAssetLocation:::startMs"]=""
operation_parameters_collection_type["getAssetLocation:::endMs"]=""
operation_parameters_collection_type["getAssetReefer:::access_token"]=""
operation_parameters_collection_type["getAssetReefer:::asset_id"]=""
operation_parameters_collection_type["getAssetReefer:::startMs"]=""
operation_parameters_collection_type["getAssetReefer:::endMs"]=""
operation_parameters_collection_type["getDeactivatedDriverById:::access_token"]=""
operation_parameters_collection_type["getDeactivatedDriverById:::driver_id_or_external_id"]=""
operation_parameters_collection_type["getDispatchRouteById:::access_token"]=""
operation_parameters_collection_type["getDispatchRouteById:::route_id"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::access_token"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::route_id"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::start_time"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::end_time"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::access_token"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::driver_id"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::end_time"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::duration"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::access_token"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::vehicle_id"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::end_time"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::duration"]=""
operation_parameters_collection_type["getDriverById:::access_token"]=""
operation_parameters_collection_type["getDriverById:::driver_id_or_external_id"]=""
operation_parameters_collection_type["getDriverDocumentsByOrgId:::access_token"]=""
operation_parameters_collection_type["getDriverDocumentsByOrgId:::endMs"]=""
operation_parameters_collection_type["getDriverDocumentsByOrgId:::durationMs"]=""
operation_parameters_collection_type["getDriverSafetyScore:::driverId"]=""
operation_parameters_collection_type["getDriverSafetyScore:::access_token"]=""
operation_parameters_collection_type["getDriverSafetyScore:::startMs"]=""
operation_parameters_collection_type["getDriverSafetyScore:::endMs"]=""
operation_parameters_collection_type["getDvirs:::access_token"]=""
operation_parameters_collection_type["getDvirs:::end_ms"]=""
operation_parameters_collection_type["getDvirs:::duration_ms"]=""
operation_parameters_collection_type["getDvirs:::group_id"]=""
operation_parameters_collection_type["getFleetDrivers:::access_token"]=""
operation_parameters_collection_type["getFleetDrivers:::groupDriversParam"]=""
operation_parameters_collection_type["getFleetDriversHosDailyLogs:::access_token"]=""
operation_parameters_collection_type["getFleetDriversHosDailyLogs:::driver_id"]=""
operation_parameters_collection_type["getFleetDriversHosDailyLogs:::hosLogsParam"]=""
operation_parameters_collection_type["getFleetDriversSummary:::access_token"]=""
operation_parameters_collection_type["getFleetDriversSummary:::driversSummaryParam"]=""
operation_parameters_collection_type["getFleetDriversSummary:::snap_to_day_bounds"]=""
operation_parameters_collection_type["getFleetHosAuthenticationLogs:::access_token"]=""
operation_parameters_collection_type["getFleetHosAuthenticationLogs:::hosAuthenticationLogsParam"]=""
operation_parameters_collection_type["getFleetHosLogs:::access_token"]=""
operation_parameters_collection_type["getFleetHosLogs:::hosLogsParam"]=""
operation_parameters_collection_type["getFleetHosLogsSummary:::access_token"]=""
operation_parameters_collection_type["getFleetHosLogsSummary:::hosLogsParam"]=""
operation_parameters_collection_type["getFleetLocations:::access_token"]=""
operation_parameters_collection_type["getFleetLocations:::groupParam"]=""
operation_parameters_collection_type["getFleetMaintenanceList:::access_token"]=""
operation_parameters_collection_type["getFleetMaintenanceList:::groupParam"]=""
operation_parameters_collection_type["getFleetTrips:::access_token"]=""
operation_parameters_collection_type["getFleetTrips:::tripsParam"]=""
operation_parameters_collection_type["getFleetVehicle:::access_token"]=""
operation_parameters_collection_type["getFleetVehicle:::vehicle_id_or_external_id"]=""
operation_parameters_collection_type["getOrganizationAddress:::access_token"]=""
operation_parameters_collection_type["getOrganizationAddress:::addressId"]=""
operation_parameters_collection_type["getOrganizationAddresses:::access_token"]=""
operation_parameters_collection_type["getOrganizationContact:::access_token"]=""
operation_parameters_collection_type["getOrganizationContact:::contact_id"]=""
operation_parameters_collection_type["getVehicleHarshEvent:::vehicleId"]=""
operation_parameters_collection_type["getVehicleHarshEvent:::access_token"]=""
operation_parameters_collection_type["getVehicleHarshEvent:::timestamp"]=""
operation_parameters_collection_type["getVehicleLocations:::access_token"]=""
operation_parameters_collection_type["getVehicleLocations:::vehicle_id"]=""
operation_parameters_collection_type["getVehicleLocations:::startMs"]=""
operation_parameters_collection_type["getVehicleLocations:::endMs"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::vehicleId"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::access_token"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::startMs"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::endMs"]=""
operation_parameters_collection_type["getVehicleStats:::access_token"]=""
operation_parameters_collection_type["getVehicleStats:::startMs"]=""
operation_parameters_collection_type["getVehicleStats:::endMs"]=""
operation_parameters_collection_type["getVehicleStats:::series"]=""
operation_parameters_collection_type["getVehicleStats:::tagIds"]=""
operation_parameters_collection_type["getVehicleStats:::startingAfter"]=""
operation_parameters_collection_type["getVehicleStats:::endingBefore"]=""
operation_parameters_collection_type["getVehicleStats:::limit"]=""
operation_parameters_collection_type["getVehiclesLocations:::access_token"]=""
operation_parameters_collection_type["getVehiclesLocations:::startMs"]=""
operation_parameters_collection_type["getVehiclesLocations:::endMs"]=""
operation_parameters_collection_type["listContacts:::access_token"]=""
operation_parameters_collection_type["listFleet:::access_token"]=""
operation_parameters_collection_type["listFleet:::groupParam"]=""
operation_parameters_collection_type["listFleet:::startingAfter"]=""
operation_parameters_collection_type["listFleet:::endingBefore"]=""
operation_parameters_collection_type["listFleet:::limit"]=""
operation_parameters_collection_type["patchFleetVehicle:::access_token"]=""
operation_parameters_collection_type["patchFleetVehicle:::vehicle_id_or_external_id"]=""
operation_parameters_collection_type["patchFleetVehicle:::data"]=""
operation_parameters_collection_type["reactivateDriverById:::access_token"]=""
operation_parameters_collection_type["reactivateDriverById:::driver_id_or_external_id"]=""
operation_parameters_collection_type["reactivateDriverById:::reactivateDriverParam"]=""
operation_parameters_collection_type["updateDispatchRouteById:::access_token"]=""
operation_parameters_collection_type["updateDispatchRouteById:::route_id"]=""
operation_parameters_collection_type["updateDispatchRouteById:::updateDispatchRouteParams"]=""
operation_parameters_collection_type["updateOrganizationAddress:::access_token"]=""
operation_parameters_collection_type["updateOrganizationAddress:::addressId"]=""
operation_parameters_collection_type["updateOrganizationAddress:::address"]=""
operation_parameters_collection_type["updateVehicles:::access_token"]=""
operation_parameters_collection_type["updateVehicles:::vehicleUpdateParam"]=""
operation_parameters_collection_type["getAllDataInputs:::access_token"]=""
operation_parameters_collection_type["getAllDataInputs:::group_id"]=""
operation_parameters_collection_type["getAllDataInputs:::startMs"]=""
operation_parameters_collection_type["getAllDataInputs:::endMs"]=""
operation_parameters_collection_type["getDataInput:::access_token"]=""
operation_parameters_collection_type["getDataInput:::data_input_id"]=""
operation_parameters_collection_type["getDataInput:::startMs"]=""
operation_parameters_collection_type["getDataInput:::endMs"]=""
operation_parameters_collection_type["getMachines:::access_token"]=""
operation_parameters_collection_type["getMachines:::groupParam"]=""
operation_parameters_collection_type["getMachinesHistory:::access_token"]=""
operation_parameters_collection_type["getMachinesHistory:::historyParam"]=""
operation_parameters_collection_type["createDispatchRoute:::access_token"]=""
operation_parameters_collection_type["createDispatchRoute:::createDispatchRouteParams"]=""
operation_parameters_collection_type["createDriverDispatchRoute:::access_token"]=""
operation_parameters_collection_type["createDriverDispatchRoute:::driver_id"]=""
operation_parameters_collection_type["createDriverDispatchRoute:::createDispatchRouteParams"]=""
operation_parameters_collection_type["createVehicleDispatchRoute:::access_token"]=""
operation_parameters_collection_type["createVehicleDispatchRoute:::vehicle_id"]=""
operation_parameters_collection_type["createVehicleDispatchRoute:::createDispatchRouteParams"]=""
operation_parameters_collection_type["deleteDispatchRouteById:::access_token"]=""
operation_parameters_collection_type["deleteDispatchRouteById:::route_id"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::access_token"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::group_id"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::end_time"]=""
operation_parameters_collection_type["fetchAllDispatchRoutes:::duration"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::access_token"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::group_id"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::sequence_id"]=""
operation_parameters_collection_type["fetchAllRouteJobUpdates:::include"]=""
operation_parameters_collection_type["getDispatchRouteById:::access_token"]=""
operation_parameters_collection_type["getDispatchRouteById:::route_id"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::access_token"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::route_id"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::start_time"]=""
operation_parameters_collection_type["getDispatchRouteHistory:::end_time"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::access_token"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::driver_id"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::end_time"]=""
operation_parameters_collection_type["getDispatchRoutesByDriverId:::duration"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::access_token"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::vehicle_id"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::end_time"]=""
operation_parameters_collection_type["getDispatchRoutesByVehicleId:::duration"]=""
operation_parameters_collection_type["updateDispatchRouteById:::access_token"]=""
operation_parameters_collection_type["updateDispatchRouteById:::route_id"]=""
operation_parameters_collection_type["updateDispatchRouteById:::updateDispatchRouteParams"]=""
operation_parameters_collection_type["getDriverSafetyScore:::driverId"]=""
operation_parameters_collection_type["getDriverSafetyScore:::access_token"]=""
operation_parameters_collection_type["getDriverSafetyScore:::startMs"]=""
operation_parameters_collection_type["getDriverSafetyScore:::endMs"]=""
operation_parameters_collection_type["getVehicleHarshEvent:::vehicleId"]=""
operation_parameters_collection_type["getVehicleHarshEvent:::access_token"]=""
operation_parameters_collection_type["getVehicleHarshEvent:::timestamp"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::vehicleId"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::access_token"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::startMs"]=""
operation_parameters_collection_type["getVehicleSafetyScore:::endMs"]=""
operation_parameters_collection_type["getSensors:::access_token"]=""
operation_parameters_collection_type["getSensors:::groupParam"]=""
operation_parameters_collection_type["getSensorsCargo:::access_token"]=""
operation_parameters_collection_type["getSensorsCargo:::sensorParam"]=""
operation_parameters_collection_type["getSensorsDoor:::access_token"]=""
operation_parameters_collection_type["getSensorsDoor:::sensorParam"]=""
operation_parameters_collection_type["getSensorsHistory:::access_token"]=""
operation_parameters_collection_type["getSensorsHistory:::historyParam"]=""
operation_parameters_collection_type["getSensorsHumidity:::access_token"]=""
operation_parameters_collection_type["getSensorsHumidity:::sensorParam"]=""
operation_parameters_collection_type["getSensorsTemperature:::access_token"]=""
operation_parameters_collection_type["getSensorsTemperature:::sensorParam"]=""
operation_parameters_collection_type["createTag:::access_token"]=""
operation_parameters_collection_type["createTag:::tagCreateParams"]=""
operation_parameters_collection_type["deleteTagById:::access_token"]=""
operation_parameters_collection_type["deleteTagById:::tag_id"]=""
operation_parameters_collection_type["getAllTags:::access_token"]=""
operation_parameters_collection_type["getAllTags:::group_id"]=""
operation_parameters_collection_type["getTagById:::access_token"]=""
operation_parameters_collection_type["getTagById:::tag_id"]=""
operation_parameters_collection_type["modifyTagById:::access_token"]=""
operation_parameters_collection_type["modifyTagById:::tag_id"]=""
operation_parameters_collection_type["modifyTagById:::tagModifyParams"]=""
operation_parameters_collection_type["updateTagById:::access_token"]=""
operation_parameters_collection_type["updateTagById:::tag_id"]=""
operation_parameters_collection_type["updateTagById:::updateTagParams"]=""
operation_parameters_collection_type["deleteUserById:::access_token"]=""
operation_parameters_collection_type["deleteUserById:::userId"]=""
operation_parameters_collection_type["getUserById:::access_token"]=""
operation_parameters_collection_type["getUserById:::userId"]=""
operation_parameters_collection_type["listUserRoles:::access_token"]=""
operation_parameters_collection_type["listUsers:::access_token"]=""


##
# Map for body parameters passed after operation as
# PARAMETER==STRING_VALUE or PARAMETER:=NUMERIC_VALUE
# These will be mapped to top level json keys ( { "PARAMETER": "VALUE" })
declare -A body_parameters

##
# These arguments will be directly passed to cURL
curl_arguments=""

##
# The host for making the request
host=""

##
# The user credentials for basic authentication
basic_auth_credential=""


##
# If true, the script will only output the actual cURL command that would be
# used
print_curl=false

##
# The operation ID passed on the command line
operation=""

##
# The provided Accept header value
header_accept=""

##
# The provided Content-type header value
header_content_type=""

##
# If there is any body content on the stdin pass it to the body of the request
body_content_temp_file=""

##
# If this variable is set to true, the request will be performed even
# if parameters for required query, header or body values are not provided
# (path parameters are still required).
force=false

##
# Declare some mime types abbreviations for easier content-type and accepts
# headers specification
declare -A mime_type_abbreviations
# text/*
mime_type_abbreviations["text"]="text/plain"
mime_type_abbreviations["html"]="text/html"
mime_type_abbreviations["md"]="text/x-markdown"
mime_type_abbreviations["csv"]="text/csv"
mime_type_abbreviations["css"]="text/css"
mime_type_abbreviations["rtf"]="text/rtf"
# application/*
mime_type_abbreviations["json"]="application/json"
mime_type_abbreviations["xml"]="application/xml"
mime_type_abbreviations["yaml"]="application/yaml"
mime_type_abbreviations["js"]="application/javascript"
mime_type_abbreviations["bin"]="application/octet-stream"
mime_type_abbreviations["rdf"]="application/rdf+xml"
# image/*
mime_type_abbreviations["jpg"]="image/jpeg"
mime_type_abbreviations["png"]="image/png"
mime_type_abbreviations["gif"]="image/gif"
mime_type_abbreviations["bmp"]="image/bmp"
mime_type_abbreviations["tiff"]="image/tiff"


##############################################################################
#
# Escape special URL characters
# Based on table at http://www.w3schools.com/tags/ref_urlencode.asp
#
##############################################################################
url_escape() {
    local raw_url="$1"

    value=$(sed -e 's/ /%20/g' \
       -e 's/!/%21/g' \
       -e 's/"/%22/g' \
       -e 's/#/%23/g' \
       -e 's/\&/%26/g' \
       -e 's/'\''/%28/g' \
       -e 's/(/%28/g' \
       -e 's/)/%29/g' \
       -e 's/:/%3A/g' \
       -e 's/\t/%09/g' \
       -e 's/?/%3F/g' <<<"$raw_url");

    echo "$value"
}

##############################################################################
#
# Lookup the mime type abbreviation in the mime_type_abbreviations array.
# If not present assume the user provided a valid mime type
#
##############################################################################
lookup_mime_type() {
    local mime_type="$1"

    if [[ ${mime_type_abbreviations[$mime_type]} ]]; then
        echo "${mime_type_abbreviations[$mime_type]}"
    else
        echo "$mime_type"
    fi
}

##############################################################################
#
# Converts an associative array into a list of cURL header
# arguments (-H "KEY: VALUE")
#
##############################################################################
header_arguments_to_curl() {
    local headers_curl=""

    for key in "${!header_arguments[@]}"; do
        headers_curl+="-H \"${key}: ${header_arguments[${key}]}\" "
    done
    headers_curl+=" "

    echo "${headers_curl}"
}

##############################################################################
#
# Converts an associative array into a simple JSON with keys as top
# level object attributes
#
# \todo Add conversion of more complex attributes using paths
#
##############################################################################
body_parameters_to_json() {
    local body_json="-d '{"
    local count=0
    for key in "${!body_parameters[@]}"; do
        if [[ $((count++)) -gt 0 ]]; then
            body_json+=", "
        fi
        body_json+="\"${key}\": ${body_parameters[${key}]}"
    done
    body_json+="}'"

    if [[ "${#body_parameters[@]}" -eq 0 ]]; then
        echo ""
    else
        echo "${body_json}"
    fi
}

##############################################################################
#
# Helper method for showing error because for example echo in
# build_request_path() is evaluated as part of command line not printed on
# output. Anyway better idea for resource clean up ;-).
#
##############################################################################
ERROR_MSG=""
function finish {
    if [[ -n "$ERROR_MSG" ]]; then
        echo >&2 "${OFF}${RED}$ERROR_MSG"
        echo >&2 "${OFF}Check usage: '${script_name} --help'"
    fi
}
trap finish EXIT


##############################################################################
#
# Validate and build request path including query parameters
#
##############################################################################
build_request_path() {
    local path_template=$1
    local -n path_params=$2
    local -n query_params=$3


    #
    # Check input parameters count against minimum and maximum required
    #
    if [[ "$force" = false ]]; then
        local was_error=""
        for qparam in "${query_params[@]}" "${path_params[@]}"; do
            local parameter_values
            mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

            #
            # Check if the number of provided values is not less than minimum required
            #
            if [[ ${#parameter_values[@]} -lt ${operation_parameters_minimum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too few values provided for '${qparam}' parameter."
                was_error=true
            fi

            #
            # Check if the number of provided values is not more than maximum
            #
            if [[ ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} -gt 0 \
                  && ${#parameter_values[@]} -gt ${operation_parameters_maximum_occurrences["${operation}:::${qparam}"]} ]]; then
                echo "ERROR: Too many values provided for '${qparam}' parameter"
                was_error=true
            fi
        done
        if [[ -n "$was_error" ]]; then
            exit 1
        fi
    fi

    # First replace all path parameters in the path
    for pparam in "${path_params[@]}"; do
        local path_regex="(.*)(\\{$pparam\\})(.*)"
        if [[ $path_template =~ $path_regex ]]; then
            path_template=${BASH_REMATCH[1]}${operation_parameters[$pparam]}${BASH_REMATCH[3]}
        fi
    done

    local query_request_part=""

    local count=0
    for qparam in "${query_params[@]}"; do
        # Get the array of parameter values
        local parameter_value=""
        local parameter_values
        mapfile -t parameter_values < <(sed -e 's/'":::"'/\n/g' <<<"${operation_parameters[$qparam]}")

        if [[ -n "${parameter_values[*]}" ]]; then
            if [[ $((count++)) -gt 0 ]]; then
                query_request_part+="&"
            fi
        fi


        #
        # Append parameters without specific cardinality
        #
        local collection_type="${operation_parameters_collection_type["${operation}:::${qparam}"]}"
        if [[ "${collection_type}" == "" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'mutli' collections i.e. param=value1&param=value2&...
        #
        elif [[ "${collection_type}" == "multi" ]]; then
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="&"
                fi
                parameter_value+="${qparam}=${qvalue}"
            done
        #
        # Append parameters specified as 'csv' collections i.e. param=value1,value2,...
        #
        elif [[ "${collection_type}" == "csv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=","
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'ssv' collections i.e. param="value1 value2 ..."
        #
        elif [[ "${collection_type}" == "ssv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+=" "
                fi
                parameter_value+="${qvalue}"
            done
        #
        # Append parameters specified as 'tsv' collections i.e. param="value1\tvalue2\t..."
        #
        elif [[ "${collection_type}" == "tsv" ]]; then
            parameter_value+="${qparam}="
            local vcount=0
            for qvalue in "${parameter_values[@]}"; do
                if [[ $((vcount++)) -gt 0 ]]; then
                    parameter_value+="\\t"
                fi
                parameter_value+="${qvalue}"
            done
        else
            echo "Unsupported collection format \"${collection_type}\""
            exit 1
        fi

        if [[ -n "${parameter_value}" ]]; then
            query_request_part+="${parameter_value}"
        fi

    done


    # Now append query parameters - if any
    if [[ -n "${query_request_part}" ]]; then
        path_template+="?${query_request_part}"
    fi

    echo "$path_template"
}



###############################################################################
#
# Print main help message
#
###############################################################################
print_help() {
cat <<EOF

${BOLD}${WHITE}Samsara API command line client (API version 1.0.0)${OFF}

${BOLD}${WHITE}Usage${OFF}

  ${GREEN}${script_name}${OFF} [-h|--help] [-V|--version] [--about] [${RED}<curl-options>${OFF}]
           [-ac|--accept ${GREEN}<mime-type>${OFF}] [-ct,--content-type ${GREEN}<mime-type>${OFF}]
           [--host ${CYAN}<url>${OFF}] [--dry-run] [-nc|--no-colors] ${YELLOW}<operation>${OFF} [-h|--help]
           [${BLUE}<headers>${OFF}] [${MAGENTA}<parameters>${OFF}] [${MAGENTA}<body-parameters>${OFF}]

  - ${CYAN}<url>${OFF} - endpoint of the REST service without basepath

  - ${RED}<curl-options>${OFF} - any valid cURL options can be passed before ${YELLOW}<operation>${OFF}
  - ${GREEN}<mime-type>${OFF} - either full mime-type or one of supported abbreviations:
                   (text, html, md, csv, css, rtf, json, xml, yaml, js, bin,
                    rdf, jpg, png, gif, bmp, tiff)
  - ${BLUE}<headers>${OFF} - HTTP headers can be passed in the form ${YELLOW}HEADER${OFF}:${BLUE}VALUE${OFF}
  - ${MAGENTA}<parameters>${OFF} - REST operation parameters can be passed in the following
                   forms:
                   * ${YELLOW}KEY${OFF}=${BLUE}VALUE${OFF} - path or query parameters
  - ${MAGENTA}<body-parameters>${OFF} - simple JSON body content (first level only) can be build
                        using the following arguments:
                        * ${YELLOW}KEY${OFF}==${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": "${BLUE}VALUE${OFF}", ... }'
                        * ${YELLOW}KEY${OFF}:=${BLUE}VALUE${OFF} - body parameters which will be added to body
                                      JSON as '{ ..., "${YELLOW}KEY${OFF}": ${BLUE}VALUE${OFF}, ... }'

EOF
    echo -e "${BOLD}${WHITE}Operations (grouped by tags)${OFF}"
    echo ""
    echo -e "${BOLD}${WHITE}[assets]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getAllAssetCurrentLocations${OFF};/fleet/assets/locations
  ${CYAN}getAllAssets${OFF};/fleet/assets
  ${CYAN}getAssetLocation${OFF};/fleet/assets/{assetId:[0-9]+}/locations
  ${CYAN}getAssetReefer${OFF};/fleet/assets/{assetId:[0-9]+}/reefer
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[drivers]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createDriver${OFF};/fleet/drivers/create
  ${CYAN}deactivateDriver${OFF};/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}getAllDeactivatedDrivers${OFF};/fleet/drivers/inactive
  ${CYAN}getDeactivatedDriverById${OFF};/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}getDriverById${OFF};/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}reactivateDriverById${OFF};/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[fleet]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}addFleetAddress${OFF};/fleet/add_address
  ${CYAN}addOrganizationAddresses${OFF};/addresses
  ${CYAN}createDispatchRoute${OFF};/fleet/dispatch/routes
  ${CYAN}createDriver${OFF};/fleet/drivers/create
  ${CYAN}createDriverDispatchRoute${OFF};/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  ${CYAN}createDriverDocument${OFF};/fleet/drivers/{driver_id:[0-9]+}/documents
  ${CYAN}createDvir${OFF};/fleet/maintenance/dvirs
  ${CYAN}createVehicleDispatchRoute${OFF};/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  ${CYAN}deactivateDriver${OFF};/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}deleteDispatchRouteById${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}/
  ${CYAN}deleteOrganizationAddress${OFF};/addresses/{addressId}
  ${CYAN}fetchAllDispatchRoutes${OFF};/fleet/dispatch/routes
  ${CYAN}fetchAllRouteJobUpdates${OFF};/fleet/dispatch/routes/job_updates
  ${CYAN}getAllAssetCurrentLocations${OFF};/fleet/assets/locations
  ${CYAN}getAllAssets${OFF};/fleet/assets
  ${CYAN}getAllDeactivatedDrivers${OFF};/fleet/drivers/inactive
  ${CYAN}getAssetLocation${OFF};/fleet/assets/{assetId:[0-9]+}/locations
  ${CYAN}getAssetReefer${OFF};/fleet/assets/{assetId:[0-9]+}/reefer
  ${CYAN}getDeactivatedDriverById${OFF};/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}getDispatchRouteById${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}
  ${CYAN}getDispatchRouteHistory${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}/history
  ${CYAN}getDispatchRoutesByDriverId${OFF};/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  ${CYAN}getDispatchRoutesByVehicleId${OFF};/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  ${CYAN}getDriverById${OFF};/fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}getDriverDocumentTypesByOrgId${OFF};/fleet/drivers/document_types
  ${CYAN}getDriverDocumentsByOrgId${OFF};/fleet/drivers/documents
  ${CYAN}getDriverSafetyScore${OFF};/fleet/drivers/{driverId:[0-9]+}/safety/score
  ${CYAN}getDvirs${OFF};/fleet/maintenance/dvirs
  ${CYAN}getFleetDrivers${OFF};/fleet/drivers
  ${CYAN}getFleetDriversHosDailyLogs${OFF};/fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
  ${CYAN}getFleetDriversSummary${OFF};/fleet/drivers/summary
  ${CYAN}getFleetHosAuthenticationLogs${OFF};/fleet/hos_authentication_logs
  ${CYAN}getFleetHosLogs${OFF};/fleet/hos_logs
  ${CYAN}getFleetHosLogsSummary${OFF};/fleet/hos_logs_summary
  ${CYAN}getFleetLocations${OFF};/fleet/locations
  ${CYAN}getFleetMaintenanceList${OFF};/fleet/maintenance/list
  ${CYAN}getFleetTrips${OFF};/fleet/trips
  ${CYAN}getFleetVehicle${OFF};/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}getOrganizationAddress${OFF};/addresses/{addressId}
  ${CYAN}getOrganizationAddresses${OFF};/addresses
  ${CYAN}getOrganizationContact${OFF};/contacts/{contact_id}
  ${CYAN}getVehicleHarshEvent${OFF};/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  ${CYAN}getVehicleLocations${OFF};/fleet/vehicles/{vehicle_id:[0-9]+}/locations
  ${CYAN}getVehicleSafetyScore${OFF};/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
  ${CYAN}getVehicleStats${OFF};/fleet/vehicles/stats
  ${CYAN}getVehiclesLocations${OFF};/fleet/vehicles/locations
  ${CYAN}listContacts${OFF};/contacts
  ${CYAN}listFleet${OFF};/fleet/list
  ${CYAN}patchFleetVehicle${OFF};/fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}reactivateDriverById${OFF};/fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
  ${CYAN}updateDispatchRouteById${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}/
  ${CYAN}updateOrganizationAddress${OFF};/addresses/{addressId}
  ${CYAN}updateVehicles${OFF};/fleet/set_data
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[industrial]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getAllDataInputs${OFF};/industrial/data
  ${CYAN}getDataInput${OFF};/industrial/data/{data_input_id:[0-9]+}
  ${CYAN}getMachines${OFF};/machines/list
  ${CYAN}getMachinesHistory${OFF};/machines/history
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[routes]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createDispatchRoute${OFF};/fleet/dispatch/routes
  ${CYAN}createDriverDispatchRoute${OFF};/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  ${CYAN}createVehicleDispatchRoute${OFF};/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  ${CYAN}deleteDispatchRouteById${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}/
  ${CYAN}fetchAllDispatchRoutes${OFF};/fleet/dispatch/routes
  ${CYAN}fetchAllRouteJobUpdates${OFF};/fleet/dispatch/routes/job_updates
  ${CYAN}getDispatchRouteById${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}
  ${CYAN}getDispatchRouteHistory${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}/history
  ${CYAN}getDispatchRoutesByDriverId${OFF};/fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
  ${CYAN}getDispatchRoutesByVehicleId${OFF};/fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
  ${CYAN}updateDispatchRouteById${OFF};/fleet/dispatch/routes/{route_id:[0-9]+}/
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[safety]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getDriverSafetyScore${OFF};/fleet/drivers/{driverId:[0-9]+}/safety/score
  ${CYAN}getVehicleHarshEvent${OFF};/fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
  ${CYAN}getVehicleSafetyScore${OFF};/fleet/vehicles/{vehicleId:[0-9]+}/safety/score
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[sensors]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}getSensors${OFF};/sensors/list
  ${CYAN}getSensorsCargo${OFF};/sensors/cargo
  ${CYAN}getSensorsDoor${OFF};/sensors/door
  ${CYAN}getSensorsHistory${OFF};/sensors/history
  ${CYAN}getSensorsHumidity${OFF};/sensors/humidity
  ${CYAN}getSensorsTemperature${OFF};/sensors/temperature
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[tags]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}createTag${OFF};/tags
  ${CYAN}deleteTagById${OFF};/tags/{tag_id:[0-9]+}
  ${CYAN}getAllTags${OFF};/tags
  ${CYAN}getTagById${OFF};/tags/{tag_id:[0-9]+}
  ${CYAN}modifyTagById${OFF};/tags/{tag_id:[0-9]+}
  ${CYAN}updateTagById${OFF};/tags/{tag_id:[0-9]+}
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}[users]${OFF}"
read -r -d '' ops <<EOF
  ${CYAN}deleteUserById${OFF};/users/{userId:[0-9]+}
  ${CYAN}getUserById${OFF};/users/{userId:[0-9]+}
  ${CYAN}listUserRoles${OFF};/user_roles
  ${CYAN}listUsers${OFF};/users
EOF
echo "  $ops" | column -t -s ';'
    echo ""
    echo -e "${BOLD}${WHITE}Options${OFF}"
    echo -e "  -h,--help\\t\\t\\t\\tPrint this help"
    echo -e "  -V,--version\\t\\t\\t\\tPrint API version"
    echo -e "  --about\\t\\t\\t\\tPrint the information about service"
    echo -e "  --host ${CYAN}<url>${OFF}\\t\\t\\t\\tSpecify the host URL "
echo -e "              \\t\\t\\t\\t(e.g. 'https://api.samsara.com')"

    echo -e "  --force\\t\\t\\t\\tForce command invocation in spite of missing"
    echo -e "         \\t\\t\\t\\trequired parameters or wrong content type"
    echo -e "  --dry-run\\t\\t\\t\\tPrint out the cURL command without"
    echo -e "           \\t\\t\\t\\texecuting it"
    echo -e "  -nc,--no-colors\\t\\t\\tEnforce print without colors, otherwise autodected"
    echo -e "  -ac,--accept ${YELLOW}<mime-type>${OFF}\\t\\tSet the 'Accept' header in the request"
    echo -e "  -ct,--content-type ${YELLOW}<mime-type>${OFF}\\tSet the 'Content-type' header in "
    echo -e "                                \\tthe request"
    echo ""
}


##############################################################################
#
# Print REST service description
#
##############################################################################
print_about() {
    echo ""
    echo -e "${BOLD}${WHITE}Samsara API command line client (API version 1.0.0)${OFF}"
    echo ""
    echo -e "License: "
    echo -e "Contact: "
    echo ""
read -r -d '' appdescription <<EOF

# Introduction

Samsara provides API endpoints for interacting with Samsara Cloud, so that you can build powerful applications and custom solutions with sensor data. Samsara has endpoints available to track and analyze sensors, vehicles, and entire fleets.

The Samsara Cloud API is a [RESTful API](https://en.wikipedia.org/wiki/Representational_state_transfer) accessed by an [HTTP](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol) client such as wget or curl, or HTTP libraries of most modern programming languages including python, ruby, java. We use built-in HTTP features, like HTTP authentication and HTTP verbs, which are understood by off-the-shelf HTTP clients. We allow you to interact securely with our API from a client-side web application (though you should never expose your secret API key). [JSON](http://www.json.org/) is returned by all API responses, including errors. If you’re familiar with what you can build with a REST API, the following API reference guide will be your go-to resource.

API access to the Samsara cloud is available to all Samsara administrators. To start developing with Samsara APIs you will need to [obtain your API keys](#section/Authentication) to authenticate your API requests.

If you have any questions you can reach out to us on [support@samsara.com](mailto:support@samsara.com)

# Endpoints

All our APIs can be accessed through HTTP requests to URLs like:

'''curl
https://api.samsara.com/<version>/<endpoint>
'''

All our APIs are [versioned](#section/Versioning). If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version.

# Authentication

To authenticate your API request you will need to include your secret token. You can manage your API tokens in the [Dashboard](https://cloud.samsara.com). They are visible under 'Settings->Organization->API Tokens'.

Your API tokens carry many privileges, so be sure to keep them secure. Do not share your secret API tokens in publicly accessible areas such as GitHub, client-side code, and so on.

Authentication to the API is performed via [HTTP Basic Auth](https://en.wikipedia.org/wiki/Basic_access_authentication). Provide your API token as the basic access_token value in the URL. You do not need to provide a password.

'''curl
https://api.samsara.com/<version>/<endpoint>?access_token={access_token}
'''

All API requests must be made over [HTTPS](https://en.wikipedia.org/wiki/HTTPS). Calls made over plain HTTP or without authentication will fail.

# Request Methods

Our API endpoints use [HTTP request methods](https://en.wikipedia.org/wiki/Hypertext_Transfer_Protocol#Request_methods) to specify the desired operation to be performed. The documentation below specified request method supported by each endpoint and the resulting action.

## GET

GET requests are typically used for fetching data (like data for a particular driver).

## POST

POST requests are typically used for creating or updating a record (like adding new tags to the system). With that being said, a few of our POST requests can be used for fetching data (like current location data of your fleet).

## PUT

PUT requests are typically used for updating an existing record (like updating all devices associated with a particular tag).

## PATCH

PATCH requests are typically used for modifying an existing record (like modifying a few devices associated with a particular tag).

## DELETE

DELETE requests are used for deleting a record (like deleting a tag from the system).

# Response Codes

All API requests will respond with appropriate [HTTP status code](https://en.wikipedia.org/wiki/List_of_HTTP_status_codes). Your API client should handle each response class differently.

## 2XX

These are successful responses and indicate that the API request returned the expected response.

## 4XX

These indicate that there was a problem with the request like a missing parameter or invalid values. Check the response for specific [error details](#section/Error-Responses). Requests that respond with a 4XX status code, should be modified before retrying.

## 5XX

These indicate server errors when the server is unreachable or is misconfigured. In this case, you should retry the API request after some delay.

# Error Responses

In case of a 4XX status code, the body of the response will contain information to briefly explain the error reported. To help debugging the error, you can refer to the following table for understanding the error message.

| Status Code | Message | Description |
|-------------|----------------|-------------------------------------------------------------------|
| 401 | Invalid token | The API token is invalid and could not be authenticated. Please refer to the [authentication section](#section/Authentication). |
| 404 | Page not found | The API endpoint being accessed is invalid. |
| 400 | Bad request | Default response for an invalid request. Please check the request to make sure it follows the format specified in the documentation. |

# Versioning

All our APIs are versioned. Our current API version is 'v1' and we are continuously working on improving it further and provide additional endpoints. If we intend to make breaking changes to an API which either changes the response format or request parameter, we will increment the version. Thus, you can use our current API version worry free.

# FAQs

Check out our [responses to FAQs here](https://kb.samsara.com/hc/en-us/sections/360000538054-APIs). Don’t see an answer to your question? Reach out to us on [support@samsara.com](mailto:support@samsara.com).
EOF
echo "$appdescription" | paste -sd' ' | fold -sw 80
}


##############################################################################
#
# Print REST api version
#
##############################################################################
print_version() {
    echo ""
    echo -e "${BOLD}Samsara API command line client (API version 1.0.0)${OFF}"
    echo ""
}

##############################################################################
#
# Print help for getAllAssetCurrentLocations operation
#
##############################################################################
print_getAllAssetCurrentLocations_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllAssetCurrentLocations - /fleet/assets/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch current locations of all assets for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of assets and their current locations.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllAssets operation
#
##############################################################################
print_getAllAssets_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllAssets - /fleet/assets${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the assets for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of assets.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAssetLocation operation
#
##############################################################################
print_getAssetLocation_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAssetLocation - /fleet/assets/{assetId:[0-9]+}/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the historical locations for the asset." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}asset_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the asset ${YELLOW}Specify as: asset_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Asset location details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAssetReefer operation
#
##############################################################################
print_getAssetReefer_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAssetReefer - /fleet/assets/{assetId:[0-9]+}/reefer${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the reefer-specific stats of an asset." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}asset_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the asset ${YELLOW}Specify as: asset_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Reefer-specific asset details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDriver operation
#
##############################################################################
print_createDriver_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDriver - /fleet/drivers/create${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Driver creation body" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the successfully created the driver.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deactivateDriver operation
#
##############################################################################
print_deactivateDriver_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deactivateDriver - /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Deactivate a driver with the given id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllDeactivatedDrivers operation
#
##############################################################################
print_getAllDeactivatedDrivers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllDeactivatedDrivers - /fleet/drivers/inactive${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all deactivated drivers for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDeactivatedDriverById operation
#
##############################################################################
print_getDeactivatedDriverById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDeactivatedDriverById - /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch deactivated driver by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the deactivated driver with the given driver_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDriverById operation
#
##############################################################################
print_getDriverById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDriverById - /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch driver by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the driver for the given driver_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for reactivateDriverById operation
#
##############################################################################
print_reactivateDriverById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}reactivateDriverById - /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Reactivate the inactive driver having id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for addFleetAddress operation
#
##############################################################################
print_addFleetAddress_help() {
    echo ""
    echo -e "${BOLD}${WHITE}addFleetAddress - /fleet/add_address${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This method adds an address book entry to the specified group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Address was successfully added. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for addOrganizationAddresses operation
#
##############################################################################
print_addOrganizationAddresses_help() {
    echo ""
    echo -e "${BOLD}${WHITE}addOrganizationAddresses - /addresses${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Add one or more addresses to the organization" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of added addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type. Circle geofences added without a specific lat/lng are geocoded asynchronously, and will be 0,0 in the immediate response.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDispatchRoute operation
#
##############################################################################
print_createDispatchRoute_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDispatchRoute - /fleet/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dispatch route." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Created route object including the new route ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDriver operation
#
##############################################################################
print_createDriver_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDriver - /fleet/drivers/create${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - Driver creation body" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the successfully created the driver.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDriverDispatchRoute operation
#
##############################################################################
print_createDriverDispatchRoute_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDriverDispatchRoute - /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dispatch route for the driver with driver_id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver with the associated routes. ${YELLOW}Specify as: driver_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Created route object including the new route ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDriverDocument operation
#
##############################################################################
print_createDriverDocument_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDriverDocument - /fleet/drivers/{driver_id:[0-9]+}/documents${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a driver document for the given driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver for whom the document is created. ${YELLOW}Specify as: driver_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_." | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the created document.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDvir operation
#
##############################################################################
print_createDvir_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDvir - /fleet/maintenance/dvirs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dvir, marking a vehicle or trailer safe or unsafe." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Newly created DVIR.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createVehicleDispatchRoute operation
#
##############################################################################
print_createVehicleDispatchRoute_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createVehicleDispatchRoute - /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dispatch route for the vehicle with vehicle_id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle with the associated routes. ${YELLOW}Specify as: vehicle_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Created route object including the new route ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deactivateDriver operation
#
##############################################################################
print_deactivateDriver_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deactivateDriver - /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Deactivate a driver with the given id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successfully deactivated the driver, which is now referenced by /fleet/drivers/inactive/{driver_id}.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteDispatchRouteById operation
#
##############################################################################
print_deleteDispatchRouteById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}/${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a dispatch route and its associated jobs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the dispatch route. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successfully deleted the dispatch route. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteOrganizationAddress operation
#
##############################################################################
print_deleteOrganizationAddress_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteOrganizationAddress - /addresses/{addressId}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete an address." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addressId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the address/geofence ${YELLOW}Specify as: addressId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Address was successfully deleted. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for fetchAllDispatchRoutes operation
#
##############################################################################
print_fetchAllDispatchRoutes_help() {
    echo ""
    echo -e "${BOLD}${WHITE}fetchAllDispatchRoutes - /fleet/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the dispatch routes for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.${YELLOW} Specify as: duration=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;All dispatch route objects for the group.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for fetchAllRouteJobUpdates operation
#
##############################################################################
print_fetchAllRouteJobUpdates_help() {
    echo ""
    echo -e "${BOLD}${WHITE}fetchAllRouteJobUpdates - /fleet/dispatch/routes/job_updates${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}sequence_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.${YELLOW} Specify as: sequence_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Optionally set include=route to include route object in response payload.${YELLOW} Specify as: include=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;All job updates on routes.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllAssetCurrentLocations operation
#
##############################################################################
print_getAllAssetCurrentLocations_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllAssetCurrentLocations - /fleet/assets/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch current locations of all assets for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of assets and their current locations.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllAssets operation
#
##############################################################################
print_getAllAssets_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllAssets - /fleet/assets${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the assets for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of assets.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllDeactivatedDrivers operation
#
##############################################################################
print_getAllDeactivatedDrivers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllDeactivatedDrivers - /fleet/drivers/inactive${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all deactivated drivers for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns an array of all deactivated drivers for the group. Deactivated drivers are referenced at /fleet/drivers/inactive/{driver_id}${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAssetLocation operation
#
##############################################################################
print_getAssetLocation_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAssetLocation - /fleet/assets/{assetId:[0-9]+}/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the historical locations for the asset." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}asset_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the asset ${YELLOW}Specify as: asset_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Asset location details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAssetReefer operation
#
##############################################################################
print_getAssetReefer_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAssetReefer - /fleet/assets/{assetId:[0-9]+}/reefer${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the reefer-specific stats of an asset." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}asset_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the asset ${YELLOW}Specify as: asset_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Reefer-specific asset details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDeactivatedDriverById operation
#
##############################################################################
print_getDeactivatedDriverById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDeactivatedDriverById - /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch deactivated driver by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the deactivated driver with the given driver_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRouteById operation
#
##############################################################################
print_getDispatchRouteById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch a dispatch route by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the dispatch route. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The dispatch route corresponding to route_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRouteHistory operation
#
##############################################################################
print_getDispatchRouteHistory_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRouteHistory - /fleet/dispatch/routes/{route_id:[0-9]+}/history${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the history of a dispatch route." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the route with history. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The historical route state changes between start_time and end_time.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRoutesByDriverId operation
#
##############################################################################
print_getDispatchRoutesByDriverId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRoutesByDriverId - /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the dispatch routes for a given driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver with the associated routes. ${YELLOW}Specify as: driver_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.${YELLOW} Specify as: duration=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the dispatch routes for the given driver_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRoutesByVehicleId operation
#
##############################################################################
print_getDispatchRoutesByVehicleId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRoutesByVehicleId - /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the dispatch routes for a given vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle with the associated routes. ${YELLOW}Specify as: vehicle_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.${YELLOW} Specify as: duration=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns all of the dispatch routes for the given vehicle_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDriverById operation
#
##############################################################################
print_getDriverById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDriverById - /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch driver by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the driver for the given driver_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDriverDocumentTypesByOrgId operation
#
##############################################################################
print_getDriverDocumentTypesByOrgId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDriverDocumentTypesByOrgId - /fleet/drivers/document_types${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the document types." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns all of the document types.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDriverDocumentsByOrgId operation
#
##############################################################################
print_getDriverDocumentsByOrgId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDriverDocumentsByOrgId - /fleet/drivers/documents${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the documents." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}durationMs${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours.${YELLOW} Specify as: durationMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns all of the documents.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDriverSafetyScore operation
#
##############################################################################
print_getDriverSafetyScore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDriverSafetyScore - /fleet/drivers/{driverId:[0-9]+}/safety/score${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the safety score for the driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}driverId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver ${YELLOW}Specify as: driverId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Safety score details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDvirs operation
#
##############################################################################
print_getDvirs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDvirs - /fleet/maintenance/dvirs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get DVIRs for the org within provided time constraints" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_ms${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - time in millis until the last dvir log.${YELLOW} Specify as: end_ms=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration_ms${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - time in millis which corresponds to the duration before the end_ms.${YELLOW} Specify as: duration_ms=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Group ID to query.${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;DVIRs for the specified duration.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetDrivers operation
#
##############################################################################
print_getFleetDrivers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetDrivers - /fleet/drivers${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all the drivers for the specified group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;All drivers in the group.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetDriversHosDailyLogs operation
#
##############################################################################
print_getFleetDriversHosDailyLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetDriversHosDailyLogs - /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get summarized daily HOS charts for a specified driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver with HOS logs. ${YELLOW}Specify as: driver_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Distance traveled and time active for each driver in the organization over the specified time period.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetDriversSummary operation
#
##############################################################################
print_getFleetDriversSummary_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetDriversSummary - /fleet/drivers/summary${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the distance and time each driver in an organization has driven in a given time period." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}snap_to_day_bounds${OFF} ${BLUE}[boolean]${OFF} ${CYAN}(default: null)${OFF} - Snap query result to HOS day boundaries.${YELLOW} Specify as: snap_to_day_bounds=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Distance traveled and time active for each driver in the organization over the specified time period.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetHosAuthenticationLogs operation
#
##############################################################################
print_getFleetHosAuthenticationLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetHosAuthenticationLogs - /fleet/hos_authentication_logs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;HOS authentication logs for the specified driver.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetHosLogs operation
#
##############################################################################
print_getFleetHosLogs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetHosLogs - /fleet/hos_logs${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;HOS logs for the specified driver.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetHosLogsSummary operation
#
##############################################################################
print_getFleetHosLogsSummary_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetHosLogsSummary - /fleet/hos_logs_summary${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get the current HOS status for all drivers in the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;HOS logs for the specified driver.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetLocations operation
#
##############################################################################
print_getFleetLocations_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetLocations - /fleet/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of vehicle objects containing their location and the time at which that location was logged.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetMaintenanceList operation
#
##############################################################################
print_getFleetMaintenanceList_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetMaintenanceList - /fleet/maintenance/list${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get list of the vehicles with any engine faults or check light data." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of vehicles and maintenance information about each.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetTrips operation
#
##############################################################################
print_getFleetTrips_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetTrips - /fleet/trips${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of trips taken by the requested vehicle within the specified timeframe.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getFleetVehicle operation
#
##############################################################################
print_getFleetVehicle_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getFleetVehicle - /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Gets a specific vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: vehicle_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The specified vehicle.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getOrganizationAddress operation
#
##############################################################################
print_getOrganizationAddress_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getOrganizationAddress - /addresses/{addressId}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch an address by its id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addressId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the address/geofence ${YELLOW}Specify as: addressId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The address/geofence. The geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getOrganizationAddresses operation
#
##############################################################################
print_getOrganizationAddresses_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getOrganizationAddresses - /addresses${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of addresses/geofences. For each address entry, the geofence field will only be populated with either 'circle' or 'polygon', depending on the geofence type.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getOrganizationContact operation
#
##############################################################################
print_getOrganizationContact_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getOrganizationContact - /contacts/{contact_id}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch a contact by its id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}contact_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the contact ${YELLOW}Specify as: contact_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The contact.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehicleHarshEvent operation
#
##############################################################################
print_getVehicleHarshEvent_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehicleHarshEvent - /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch harsh event details for a vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vehicleId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle ${YELLOW}Specify as: vehicleId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}timestamp${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the timestamp of a harsh event.${YELLOW} Specify as: timestamp=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Harsh event details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehicleLocations operation
#
##############################################################################
print_getVehicleLocations_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehicleLocations - /fleet/vehicles/{vehicle_id:[0-9]+}/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle with the associated routes. ${YELLOW}Specify as: vehicle_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour)${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour)${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns locations for a given vehicle between a start/end time, with a maximum query duration of one hour.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehicleSafetyScore operation
#
##############################################################################
print_getVehicleSafetyScore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehicleSafetyScore - /fleet/vehicles/{vehicleId:[0-9]+}/safety/score${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the safety score for the vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vehicleId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle ${YELLOW}Specify as: vehicleId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Safety score details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehicleStats operation
#
##############################################################################
print_getVehicleStats_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehicleStats - /fleet/vehicles/stats${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Time in Unix epoch milliseconds for the start of the query.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Time in Unix epoch milliseconds for the end of the query.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}series${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2${YELLOW} Specify as: series=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}tagIds${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Comma-separated list of tag ids. Example: tagIds=1,2,3${YELLOW} Specify as: tagIds=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startingAfter${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.${YELLOW} Specify as: startingAfter=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endingBefore${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.${YELLOW} Specify as: endingBefore=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns engine state and/or aux input data for all vehicles in the group between a start/end time.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehiclesLocations operation
#
##############################################################################
print_getVehiclesLocations_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehiclesLocations - /fleet/vehicles/locations${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes)${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes)${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns locations for a given vehicle between a start/end time, with a maximum query duration of 30 minutes.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listContacts operation
#
##############################################################################
print_listContacts_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listContacts - /contacts${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all contacts for the organization." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of contacts.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listFleet operation
#
##############################################################################
print_listFleet_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listFleet - /fleet/list${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startingAfter${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter.${YELLOW} Specify as: startingAfter=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endingBefore${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter.${YELLOW} Specify as: endingBefore=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}limit${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'.${YELLOW} Specify as: limit=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of vehicles and information about each.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for patchFleetVehicle operation
#
##############################################################################
print_patchFleetVehicle_help() {
    echo ""
    echo -e "${BOLD}${WHITE}patchFleetVehicle - /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: vehicle_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json,application/merge-patch+json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The updated vehicle.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for reactivateDriverById operation
#
##############################################################################
print_reactivateDriverById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}reactivateDriverById - /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Reactivate the inactive driver having id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id_or_external_id${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. ${YELLOW}Specify as: driver_id_or_external_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the reactivated driver, which is now available at /fleet/drivers/{driver_id}.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateDispatchRouteById operation
#
##############################################################################
print_updateDispatchRouteById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}/${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a dispatch route and its associated jobs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the dispatch route. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateOrganizationAddress operation
#
##############################################################################
print_updateOrganizationAddress_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateOrganizationAddress - /addresses/{addressId}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}addressId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the address/geofence ${YELLOW}Specify as: addressId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Address was successfully updated. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateVehicles operation
#
##############################################################################
print_updateVehicles_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateVehicles - /fleet/set_data${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "This method enables the mutation of metadata for vehicles in the Samsara Cloud." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Vehicles were successfully updated. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllDataInputs operation
#
##############################################################################
print_getAllDataInputs_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllDataInputs - /industrial/data${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the data inputs for a group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of data inputs.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDataInput operation
#
##############################################################################
print_getDataInput_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDataInput - /industrial/data/{data_input_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch datapoints from a given data input." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}data_input_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the data input ${YELLOW}Specify as: data_input_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns datapoints for the given data input${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getMachines operation
#
##############################################################################
print_getMachines_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getMachines - /machines/list${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of machine objects.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getMachinesHistory operation
#
##############################################################################
print_getMachinesHistory_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getMachinesHistory - /machines/history${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get historical data for machine objects. This method returns a set of historical data for all machines in a group" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of machine results objects, each containing a time and a datapoint.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDispatchRoute operation
#
##############################################################################
print_createDispatchRoute_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDispatchRoute - /fleet/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dispatch route." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Created route object including the new route ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createDriverDispatchRoute operation
#
##############################################################################
print_createDriverDispatchRoute_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createDriverDispatchRoute - /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dispatch route for the driver with driver_id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver with the associated routes. ${YELLOW}Specify as: driver_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Created route object including the new route ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createVehicleDispatchRoute operation
#
##############################################################################
print_createVehicleDispatchRoute_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createVehicleDispatchRoute - /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new dispatch route for the vehicle with vehicle_id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle with the associated routes. ${YELLOW}Specify as: vehicle_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Created route object including the new route ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteDispatchRouteById operation
#
##############################################################################
print_deleteDispatchRouteById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}/${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Delete a dispatch route and its associated jobs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the dispatch route. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successfully deleted the dispatch route. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for fetchAllDispatchRoutes operation
#
##############################################################################
print_fetchAllDispatchRoutes_help() {
    echo ""
    echo -e "${BOLD}${WHITE}fetchAllDispatchRoutes - /fleet/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the dispatch routes for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.${YELLOW} Specify as: duration=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;All dispatch route objects for the group.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for fetchAllRouteJobUpdates operation
#
##############################################################################
print_fetchAllRouteJobUpdates_help() {
    echo ""
    echo -e "${BOLD}${WHITE}fetchAllRouteJobUpdates - /fleet/dispatch/routes/job_updates${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID" | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}sequence_id${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours.${YELLOW} Specify as: sequence_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}include${OFF} ${BLUE}[string]${OFF} ${CYAN}(default: null)${OFF} - Optionally set include=route to include route object in response payload.${YELLOW} Specify as: include=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;All job updates on routes.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRouteById operation
#
##############################################################################
print_getDispatchRouteById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch a dispatch route by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the dispatch route. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The dispatch route corresponding to route_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRouteHistory operation
#
##############################################################################
print_getDispatchRouteHistory_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRouteHistory - /fleet/dispatch/routes/{route_id:[0-9]+}/history${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the history of a dispatch route." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the route with history. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}start_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0.${YELLOW} Specify as: start_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The historical route state changes between start_time and end_time.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRoutesByDriverId operation
#
##############################################################################
print_getDispatchRoutesByDriverId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRoutesByDriverId - /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the dispatch routes for a given driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}driver_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver with the associated routes. ${YELLOW}Specify as: driver_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.${YELLOW} Specify as: duration=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns the dispatch routes for the given driver_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDispatchRoutesByVehicleId operation
#
##############################################################################
print_getDispatchRoutesByVehicleId_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDispatchRoutesByVehicleId - /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the dispatch routes for a given vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}vehicle_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle with the associated routes. ${YELLOW}Specify as: vehicle_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}end_time${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now.${YELLOW} Specify as: end_time=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}duration${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours.${YELLOW} Specify as: duration=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Returns all of the dispatch routes for the given vehicle_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateDispatchRouteById operation
#
##############################################################################
print_updateDispatchRouteById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateDispatchRouteById - /fleet/dispatch/routes/{route_id:[0-9]+}/${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a dispatch route and its associated jobs." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}route_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the dispatch route. ${YELLOW}Specify as: route_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Update the dispatch route. Allowable updates include setting job state, adding or removing jobs, and changing job locations and times.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getDriverSafetyScore operation
#
##############################################################################
print_getDriverSafetyScore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getDriverSafetyScore - /fleet/drivers/{driverId:[0-9]+}/safety/score${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the safety score for the driver." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}driverId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the driver ${YELLOW}Specify as: driverId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Safety score details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehicleHarshEvent operation
#
##############################################################################
print_getVehicleHarshEvent_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehicleHarshEvent - /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch harsh event details for a vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vehicleId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle ${YELLOW}Specify as: vehicleId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}timestamp${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the timestamp of a harsh event.${YELLOW} Specify as: timestamp=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Harsh event details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getVehicleSafetyScore operation
#
##############################################################################
print_getVehicleSafetyScore_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getVehicleSafetyScore - /fleet/vehicles/{vehicleId:[0-9]+}/safety/score${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch the safety score for the vehicle." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}vehicleId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the vehicle ${YELLOW}Specify as: vehicleId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}startMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.${YELLOW} Specify as: startMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}endMs${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.${YELLOW} Specify as: endMs=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Safety score details.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSensors operation
#
##############################################################################
print_getSensors_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSensors - /sensors/list${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of sensor objects.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSensorsCargo operation
#
##############################################################################
print_getSensorsCargo_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSensorsCargo - /sensors/cargo${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get cargo monitor status (empty / full) for requested sensors." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of sensor objects containing the current cargo status reported by each sensor.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSensorsDoor operation
#
##############################################################################
print_getSensorsDoor_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSensorsDoor - /sensors/door${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get door monitor status (closed / open) for requested sensors." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of sensor objects containing the current door status reported by each sensor.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSensorsHistory operation
#
##############################################################################
print_getSensorsHistory_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSensorsHistory - /sensors/history${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of results objects, each containing a time and a datapoint for each requested sensor/field pair.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSensorsHumidity operation
#
##############################################################################
print_getSensorsHumidity_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSensorsHumidity - /sensors/humidity${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of sensor objects containing the current humidity reported by each sensor.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getSensorsTemperature operation
#
##############################################################################
print_getSensorsTemperature_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getSensorsTemperature - /sensors/temperature${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of sensor objects containing the current temperature reported by each sensor.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for createTag operation
#
##############################################################################
print_createTag_help() {
    echo ""
    echo -e "${BOLD}${WHITE}createTag - /tags${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Create a new tag for the group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Newly created tag object, including the new tag ID.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteTagById operation
#
##############################################################################
print_deleteTagById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteTagById - /tags/{tag_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Permanently deletes a tag." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}tag_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the tag. ${YELLOW}Specify as: tag_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;Successfully deleted the tag. No response body is returned.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getAllTags operation
#
##############################################################################
print_getAllTags_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getAllTags - /tags${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch all of the tags for a group." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}group_id${OFF} ${BLUE}[integer]${OFF} ${CYAN}(default: null)${OFF} - Optional group ID if the organization has multiple groups (uncommon).${YELLOW} Specify as: group_id=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of tags.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getTagById operation
#
##############################################################################
print_getTagById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getTagById - /tags/{tag_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Fetch a tag by id." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}tag_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the tag. ${YELLOW}Specify as: tag_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The tag corresponding to tag_id.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for modifyTagById operation
#
##############################################################################
print_modifyTagById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}modifyTagById - /tags/{tag_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Add or delete specific members from a tag, or modify the name of a tag." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}tag_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the tag. ${YELLOW}Specify as: tag_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The updated tag data.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for updateTagById operation
#
##############################################################################
print_updateTagById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}updateTagById - /tags/{tag_id:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}tag_id${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the tag. ${YELLOW}Specify as: tag_id=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}body${OFF} ${BLUE}[application/json]${OFF} ${RED}(required)${OFF}${OFF} - " | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The updated tag data.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for deleteUserById operation
#
##############################################################################
print_deleteUserById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}deleteUserById - /users/{userId:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Remove a user from the organization." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the user. ${YELLOW}Specify as: userId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;The user was successfully removed.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for getUserById operation
#
##############################################################################
print_getUserById_help() {
    echo ""
    echo -e "${BOLD}${WHITE}getUserById - /users/{userId:[0-9]+}${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get a user." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e "  * ${GREEN}userId${OFF} ${BLUE}[integer]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - ID of the user. ${YELLOW}Specify as: userId=value${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;User record.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listUserRoles operation
#
##############################################################################
print_listUserRoles_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listUserRoles - /user_roles${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "Get all roles in the organization." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of user roles.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}
##############################################################################
#
# Print help for listUsers operation
#
##############################################################################
print_listUsers_help() {
    echo ""
    echo -e "${BOLD}${WHITE}listUsers - /users${OFF}" | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo -e ""
    echo -e "List all users in the organization." | paste -sd' ' | fold -sw 80
    echo -e ""
    echo -e "${BOLD}${WHITE}Parameters${OFF}"
    echo -e "  * ${GREEN}access_token${OFF} ${BLUE}[string]${OFF} ${RED}(required)${OFF} ${CYAN}(default: null)${OFF} - Samsara API access token.${YELLOW} Specify as: access_token=value${OFF}" \
        | paste -sd' ' | fold -sw 80 | sed '2,$s/^/    /'
    echo ""
    echo -e "${BOLD}${WHITE}Responses${OFF}"
    code=200
    echo -e "${result_color_table[${code:0:1}]}  200;List of users.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
    code=0
    echo -e "${result_color_table[${code:0:1}]}  0;Unexpected error.${OFF}" | paste -sd' ' | column -t -s ';' | fold -sw 80 | sed '2,$s/^/       /'
}


##############################################################################
#
# Call getAllAssetCurrentLocations operation
#
##############################################################################
call_getAllAssetCurrentLocations() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAllAssets operation
#
##############################################################################
call_getAllAssets() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAssetLocation operation
#
##############################################################################
call_getAssetLocation() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(asset_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets/{asset_id}/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAssetReefer operation
#
##############################################################################
call_getAssetReefer() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(asset_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets/{asset_id}/reefer" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call createDriver operation
#
##############################################################################
call_createDriver() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/create" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deactivateDriver operation
#
##############################################################################
call_deactivateDriver() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAllDeactivatedDrivers operation
#
##############################################################################
call_getAllDeactivatedDrivers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/inactive" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDeactivatedDriverById operation
#
##############################################################################
call_getDeactivatedDriverById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/inactive/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDriverById operation
#
##############################################################################
call_getDriverById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call reactivateDriverById operation
#
##############################################################################
call_reactivateDriverById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/inactive/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call addFleetAddress operation
#
##############################################################################
call_addFleetAddress() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/add_address" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call addOrganizationAddresses operation
#
##############################################################################
call_addOrganizationAddresses() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/addresses" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDispatchRoute operation
#
##############################################################################
call_createDispatchRoute() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDriver operation
#
##############################################################################
call_createDriver() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/create" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDriverDispatchRoute operation
#
##############################################################################
call_createDriverDispatchRoute() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDriverDocument operation
#
##############################################################################
call_createDriverDocument() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id}/documents" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDvir operation
#
##############################################################################
call_createDvir() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/maintenance/dvirs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createVehicleDispatchRoute operation
#
##############################################################################
call_createVehicleDispatchRoute() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deactivateDriver operation
#
##############################################################################
call_deactivateDriver() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteDispatchRouteById operation
#
##############################################################################
call_deleteDispatchRouteById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call deleteOrganizationAddress operation
#
##############################################################################
call_deleteOrganizationAddress() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(addressId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/addresses/{addressId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call fetchAllDispatchRoutes operation
#
##############################################################################
call_fetchAllDispatchRoutes() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id end_time duration)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call fetchAllRouteJobUpdates operation
#
##############################################################################
call_fetchAllRouteJobUpdates() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id sequence_id include)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/job_updates" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAllAssetCurrentLocations operation
#
##############################################################################
call_getAllAssetCurrentLocations() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAllAssets operation
#
##############################################################################
call_getAllAssets() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAllDeactivatedDrivers operation
#
##############################################################################
call_getAllDeactivatedDrivers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/inactive" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAssetLocation operation
#
##############################################################################
call_getAssetLocation() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(asset_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets/{asset_id}/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAssetReefer operation
#
##############################################################################
call_getAssetReefer() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(asset_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/assets/{asset_id}/reefer" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDeactivatedDriverById operation
#
##############################################################################
call_getDeactivatedDriverById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/inactive/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRouteById operation
#
##############################################################################
call_getDispatchRouteById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRouteHistory operation
#
##############################################################################
call_getDispatchRouteHistory() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token start_time end_time)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}/history" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRoutesByDriverId operation
#
##############################################################################
call_getDispatchRoutesByDriverId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token end_time duration)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRoutesByVehicleId operation
#
##############################################################################
call_getDispatchRoutesByVehicleId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token end_time duration)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDriverById operation
#
##############################################################################
call_getDriverById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDriverDocumentTypesByOrgId operation
#
##############################################################################
call_getDriverDocumentTypesByOrgId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=()
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/document_types" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDriverDocumentsByOrgId operation
#
##############################################################################
call_getDriverDocumentsByOrgId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token endMs durationMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/documents" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDriverSafetyScore operation
#
##############################################################################
call_getDriverSafetyScore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driverId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driverId}/safety/score" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDvirs operation
#
##############################################################################
call_getDvirs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token end_ms duration_ms group_id)
    local path

    if ! path=$(build_request_path "/v1/fleet/maintenance/dvirs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getFleetDrivers operation
#
##############################################################################
call_getFleetDrivers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetDriversHosDailyLogs operation
#
##############################################################################
call_getFleetDriversHosDailyLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id}/hos_daily_logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetDriversSummary operation
#
##############################################################################
call_getFleetDriversSummary() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token snap_to_day_bounds)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/summary" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetHosAuthenticationLogs operation
#
##############################################################################
call_getFleetHosAuthenticationLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/hos_authentication_logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetHosLogs operation
#
##############################################################################
call_getFleetHosLogs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/hos_logs" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetHosLogsSummary operation
#
##############################################################################
call_getFleetHosLogsSummary() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/hos_logs_summary" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetLocations operation
#
##############################################################################
call_getFleetLocations() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetMaintenanceList operation
#
##############################################################################
call_getFleetMaintenanceList() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/maintenance/list" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetTrips operation
#
##############################################################################
call_getFleetTrips() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/trips" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getFleetVehicle operation
#
##############################################################################
call_getFleetVehicle() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getOrganizationAddress operation
#
##############################################################################
call_getOrganizationAddress() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(addressId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/addresses/{addressId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getOrganizationAddresses operation
#
##############################################################################
call_getOrganizationAddresses() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/addresses" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getOrganizationContact operation
#
##############################################################################
call_getOrganizationContact() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(contact_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/contacts/{contact_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehicleHarshEvent operation
#
##############################################################################
call_getVehicleHarshEvent() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicleId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token timestamp)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicleId}/safety/harsh_event" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehicleLocations operation
#
##############################################################################
call_getVehicleLocations() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id}/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehicleSafetyScore operation
#
##############################################################################
call_getVehicleSafetyScore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicleId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicleId}/safety/score" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehicleStats operation
#
##############################################################################
call_getVehicleStats() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs series tagIds startingAfter endingBefore limit)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/stats" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehiclesLocations operation
#
##############################################################################
call_getVehiclesLocations() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/locations" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listContacts operation
#
##############################################################################
call_listContacts() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/contacts" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listFleet operation
#
##############################################################################
call_listFleet() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startingAfter endingBefore limit)
    local path

    if ! path=$(build_request_path "/v1/fleet/list" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call patchFleetVehicle operation
#
##############################################################################
call_patchFleetVehicle() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo -e "\\t- application/merge-patch+json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call reactivateDriverById operation
#
##############################################################################
call_reactivateDriverById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id_or_external_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/inactive/{driver_id_or_external_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call updateDispatchRouteById operation
#
##############################################################################
call_updateDispatchRouteById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call updateOrganizationAddress operation
#
##############################################################################
call_updateOrganizationAddress() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(addressId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/addresses/{addressId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call updateVehicles operation
#
##############################################################################
call_updateVehicles() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/set_data" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getAllDataInputs operation
#
##############################################################################
call_getAllDataInputs() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/industrial/data" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDataInput operation
#
##############################################################################
call_getDataInput() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(data_input_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/industrial/data/{data_input_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getMachines operation
#
##############################################################################
call_getMachines() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/machines/list" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getMachinesHistory operation
#
##############################################################################
call_getMachinesHistory() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/machines/history" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDispatchRoute operation
#
##############################################################################
call_createDispatchRoute() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createDriverDispatchRoute operation
#
##############################################################################
call_createDriverDispatchRoute() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createVehicleDispatchRoute operation
#
##############################################################################
call_createVehicleDispatchRoute() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteDispatchRouteById operation
#
##############################################################################
call_deleteDispatchRouteById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call fetchAllDispatchRoutes operation
#
##############################################################################
call_fetchAllDispatchRoutes() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id end_time duration)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call fetchAllRouteJobUpdates operation
#
##############################################################################
call_fetchAllRouteJobUpdates() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id sequence_id include)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/job_updates" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRouteById operation
#
##############################################################################
call_getDispatchRouteById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRouteHistory operation
#
##############################################################################
call_getDispatchRouteHistory() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token start_time end_time)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}/history" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRoutesByDriverId operation
#
##############################################################################
call_getDispatchRoutesByDriverId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driver_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token end_time duration)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driver_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getDispatchRoutesByVehicleId operation
#
##############################################################################
call_getDispatchRoutesByVehicleId() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicle_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token end_time duration)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicle_id}/dispatch/routes" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call updateDispatchRouteById operation
#
##############################################################################
call_updateDispatchRouteById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(route_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/fleet/dispatch/routes/{route_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getDriverSafetyScore operation
#
##############################################################################
call_getDriverSafetyScore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(driverId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/drivers/{driverId}/safety/score" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehicleHarshEvent operation
#
##############################################################################
call_getVehicleHarshEvent() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicleId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token timestamp)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicleId}/safety/harsh_event" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getVehicleSafetyScore operation
#
##############################################################################
call_getVehicleSafetyScore() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(vehicleId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token startMs endMs)
    local path

    if ! path=$(build_request_path "/v1/fleet/vehicles/{vehicleId}/safety/score" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getSensors operation
#
##############################################################################
call_getSensors() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/sensors/list" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getSensorsCargo operation
#
##############################################################################
call_getSensorsCargo() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/sensors/cargo" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getSensorsDoor operation
#
##############################################################################
call_getSensorsDoor() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/sensors/door" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getSensorsHistory operation
#
##############################################################################
call_getSensorsHistory() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/sensors/history" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getSensorsHumidity operation
#
##############################################################################
call_getSensorsHumidity() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/sensors/humidity" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call getSensorsTemperature operation
#
##############################################################################
call_getSensorsTemperature() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/sensors/temperature" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call createTag operation
#
##############################################################################
call_createTag() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/tags" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="POST"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteTagById operation
#
##############################################################################
call_deleteTagById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(tag_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/tags/{tag_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getAllTags operation
#
##############################################################################
call_getAllTags() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token group_id)
    local path

    if ! path=$(build_request_path "/v1/tags" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getTagById operation
#
##############################################################################
call_getTagById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(tag_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/tags/{tag_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call modifyTagById operation
#
##############################################################################
call_modifyTagById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(tag_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/tags/{tag_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PATCH"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call updateTagById operation
#
##############################################################################
call_updateTagById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(tag_id)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/tags/{tag_id}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="PUT"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    local body_json_curl=""

    #
    # Check if the user provided 'Content-type' headers in the
    # command line. If not try to set them based on the OpenAPI specification
    # if values produces and consumes are defined unambigously
    #
    if [[ -z $header_content_type ]]; then
        header_content_type="application/json"
    fi


    if [[ -z $header_content_type && "$force" = false ]]; then
        :
        echo "ERROR: Request's content-type not specified!!!"
        echo "This operation expects content-type in one of the following formats:"
        echo -e "\\t- application/json"
        echo ""
        echo "Use '--content-type' to set proper content type"
        exit 1
    else
        headers_curl="${headers_curl} -H 'Content-type: ${header_content_type}'"
    fi


    #
    # If we have received some body content over pipe, pass it from the
    # temporary file to cURL
    #
    if [[ -n $body_content_temp_file ]]; then
        if [[ "$print_curl" = true ]]; then
            echo "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        else
            eval "cat ${body_content_temp_file} | curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\" -d @-"
        fi
        rm "${body_content_temp_file}"
    #
    # If not, try to build the content body from arguments KEY==VALUE and KEY:=VALUE
    #
    else
        body_json_curl=$(body_parameters_to_json)
        if [[ "$print_curl" = true ]]; then
            echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        else
            eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} ${body_json_curl} \"${host}${path}\""
        fi
    fi
}

##############################################################################
#
# Call deleteUserById operation
#
##############################################################################
call_deleteUserById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(userId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/users/{userId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="DELETE"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call getUserById operation
#
##############################################################################
call_getUserById() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=(userId)
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/users/{userId}" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listUserRoles operation
#
##############################################################################
call_listUserRoles() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/user_roles" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}

##############################################################################
#
# Call listUsers operation
#
##############################################################################
call_listUsers() {
    # ignore error about 'path_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local path_parameter_names=()
    # ignore error about 'query_parameter_names' being unused; passed by reference
    # shellcheck disable=SC2034
    local query_parameter_names=(access_token)
    local path

    if ! path=$(build_request_path "/v1/users" path_parameter_names query_parameter_names); then
        ERROR_MSG=$path
        exit 1
    fi
    local method="GET"
    local headers_curl
    headers_curl=$(header_arguments_to_curl)
    if [[ -n $header_accept ]]; then
        headers_curl="${headers_curl} -H 'Accept: ${header_accept}'"
    fi

    local basic_auth_option=""
    if [[ -n $basic_auth_credential ]]; then
        basic_auth_option="-u ${basic_auth_credential}"
    fi
    if [[ "$print_curl" = true ]]; then
        echo "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    else
        eval "curl ${basic_auth_option} ${curl_arguments} ${headers_curl} -X ${method} \"${host}${path}\""
    fi
}



##############################################################################
#
# Main
#
##############################################################################


# Check dependencies
type curl >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'cURL' installed."; exit 1; }
type sed >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'sed' installed."; exit 1; }
type column >/dev/null 2>&1 || { echo >&2 "ERROR: You do not have 'bsdmainutils' installed."; exit 1; }

#
# Process command line
#
# Pass all arguments before 'operation' to cURL except the ones we override
#
take_user=false
take_host=false
take_accept_header=false
take_contenttype_header=false

for key in "$@"; do
# Take the value of -u|--user argument
if [[ "$take_user" = true ]]; then
    basic_auth_credential="$key"
    take_user=false
    continue
fi
# Take the value of --host argument
if [[ "$take_host" = true ]]; then
    host="$key"
    take_host=false
    continue
fi
# Take the value of --accept argument
if [[ "$take_accept_header" = true ]]; then
    header_accept=$(lookup_mime_type "$key")
    take_accept_header=false
    continue
fi
# Take the value of --content-type argument
if [[ "$take_contenttype_header" = true ]]; then
    header_content_type=$(lookup_mime_type "$key")
    take_contenttype_header=false
    continue
fi
case $key in
    -h|--help)
    if [[ "x$operation" == "x" ]]; then
        print_help
        exit 0
    else
        eval "print_${operation}_help"
        exit 0
    fi
    ;;
    -V|--version)
    print_version
    exit 0
    ;;
    --about)
    print_about
    exit 0
    ;;
    -u|--user)
    take_user=true
    ;;
    --host)
    take_host=true
    ;;
    --force)
    force=true
    ;;
    -ac|--accept)
    take_accept_header=true
    ;;
    -ct|--content-type)
    take_contenttype_header=true
    ;;
    --dry-run)
    print_curl=true
    ;;
    -nc|--no-colors)
        RED=""
        GREEN=""
        YELLOW=""
        BLUE=""
        MAGENTA=""
        CYAN=""
        WHITE=""
        BOLD=""
        OFF=""
        result_color_table=( "" "" "" "" "" "" "" )
    ;;
    getAllAssetCurrentLocations)
    operation="getAllAssetCurrentLocations"
    ;;
    getAllAssets)
    operation="getAllAssets"
    ;;
    getAssetLocation)
    operation="getAssetLocation"
    ;;
    getAssetReefer)
    operation="getAssetReefer"
    ;;
    createDriver)
    operation="createDriver"
    ;;
    deactivateDriver)
    operation="deactivateDriver"
    ;;
    getAllDeactivatedDrivers)
    operation="getAllDeactivatedDrivers"
    ;;
    getDeactivatedDriverById)
    operation="getDeactivatedDriverById"
    ;;
    getDriverById)
    operation="getDriverById"
    ;;
    reactivateDriverById)
    operation="reactivateDriverById"
    ;;
    addFleetAddress)
    operation="addFleetAddress"
    ;;
    addOrganizationAddresses)
    operation="addOrganizationAddresses"
    ;;
    createDispatchRoute)
    operation="createDispatchRoute"
    ;;
    createDriver)
    operation="createDriver"
    ;;
    createDriverDispatchRoute)
    operation="createDriverDispatchRoute"
    ;;
    createDriverDocument)
    operation="createDriverDocument"
    ;;
    createDvir)
    operation="createDvir"
    ;;
    createVehicleDispatchRoute)
    operation="createVehicleDispatchRoute"
    ;;
    deactivateDriver)
    operation="deactivateDriver"
    ;;
    deleteDispatchRouteById)
    operation="deleteDispatchRouteById"
    ;;
    deleteOrganizationAddress)
    operation="deleteOrganizationAddress"
    ;;
    fetchAllDispatchRoutes)
    operation="fetchAllDispatchRoutes"
    ;;
    fetchAllRouteJobUpdates)
    operation="fetchAllRouteJobUpdates"
    ;;
    getAllAssetCurrentLocations)
    operation="getAllAssetCurrentLocations"
    ;;
    getAllAssets)
    operation="getAllAssets"
    ;;
    getAllDeactivatedDrivers)
    operation="getAllDeactivatedDrivers"
    ;;
    getAssetLocation)
    operation="getAssetLocation"
    ;;
    getAssetReefer)
    operation="getAssetReefer"
    ;;
    getDeactivatedDriverById)
    operation="getDeactivatedDriverById"
    ;;
    getDispatchRouteById)
    operation="getDispatchRouteById"
    ;;
    getDispatchRouteHistory)
    operation="getDispatchRouteHistory"
    ;;
    getDispatchRoutesByDriverId)
    operation="getDispatchRoutesByDriverId"
    ;;
    getDispatchRoutesByVehicleId)
    operation="getDispatchRoutesByVehicleId"
    ;;
    getDriverById)
    operation="getDriverById"
    ;;
    getDriverDocumentTypesByOrgId)
    operation="getDriverDocumentTypesByOrgId"
    ;;
    getDriverDocumentsByOrgId)
    operation="getDriverDocumentsByOrgId"
    ;;
    getDriverSafetyScore)
    operation="getDriverSafetyScore"
    ;;
    getDvirs)
    operation="getDvirs"
    ;;
    getFleetDrivers)
    operation="getFleetDrivers"
    ;;
    getFleetDriversHosDailyLogs)
    operation="getFleetDriversHosDailyLogs"
    ;;
    getFleetDriversSummary)
    operation="getFleetDriversSummary"
    ;;
    getFleetHosAuthenticationLogs)
    operation="getFleetHosAuthenticationLogs"
    ;;
    getFleetHosLogs)
    operation="getFleetHosLogs"
    ;;
    getFleetHosLogsSummary)
    operation="getFleetHosLogsSummary"
    ;;
    getFleetLocations)
    operation="getFleetLocations"
    ;;
    getFleetMaintenanceList)
    operation="getFleetMaintenanceList"
    ;;
    getFleetTrips)
    operation="getFleetTrips"
    ;;
    getFleetVehicle)
    operation="getFleetVehicle"
    ;;
    getOrganizationAddress)
    operation="getOrganizationAddress"
    ;;
    getOrganizationAddresses)
    operation="getOrganizationAddresses"
    ;;
    getOrganizationContact)
    operation="getOrganizationContact"
    ;;
    getVehicleHarshEvent)
    operation="getVehicleHarshEvent"
    ;;
    getVehicleLocations)
    operation="getVehicleLocations"
    ;;
    getVehicleSafetyScore)
    operation="getVehicleSafetyScore"
    ;;
    getVehicleStats)
    operation="getVehicleStats"
    ;;
    getVehiclesLocations)
    operation="getVehiclesLocations"
    ;;
    listContacts)
    operation="listContacts"
    ;;
    listFleet)
    operation="listFleet"
    ;;
    patchFleetVehicle)
    operation="patchFleetVehicle"
    ;;
    reactivateDriverById)
    operation="reactivateDriverById"
    ;;
    updateDispatchRouteById)
    operation="updateDispatchRouteById"
    ;;
    updateOrganizationAddress)
    operation="updateOrganizationAddress"
    ;;
    updateVehicles)
    operation="updateVehicles"
    ;;
    getAllDataInputs)
    operation="getAllDataInputs"
    ;;
    getDataInput)
    operation="getDataInput"
    ;;
    getMachines)
    operation="getMachines"
    ;;
    getMachinesHistory)
    operation="getMachinesHistory"
    ;;
    createDispatchRoute)
    operation="createDispatchRoute"
    ;;
    createDriverDispatchRoute)
    operation="createDriverDispatchRoute"
    ;;
    createVehicleDispatchRoute)
    operation="createVehicleDispatchRoute"
    ;;
    deleteDispatchRouteById)
    operation="deleteDispatchRouteById"
    ;;
    fetchAllDispatchRoutes)
    operation="fetchAllDispatchRoutes"
    ;;
    fetchAllRouteJobUpdates)
    operation="fetchAllRouteJobUpdates"
    ;;
    getDispatchRouteById)
    operation="getDispatchRouteById"
    ;;
    getDispatchRouteHistory)
    operation="getDispatchRouteHistory"
    ;;
    getDispatchRoutesByDriverId)
    operation="getDispatchRoutesByDriverId"
    ;;
    getDispatchRoutesByVehicleId)
    operation="getDispatchRoutesByVehicleId"
    ;;
    updateDispatchRouteById)
    operation="updateDispatchRouteById"
    ;;
    getDriverSafetyScore)
    operation="getDriverSafetyScore"
    ;;
    getVehicleHarshEvent)
    operation="getVehicleHarshEvent"
    ;;
    getVehicleSafetyScore)
    operation="getVehicleSafetyScore"
    ;;
    getSensors)
    operation="getSensors"
    ;;
    getSensorsCargo)
    operation="getSensorsCargo"
    ;;
    getSensorsDoor)
    operation="getSensorsDoor"
    ;;
    getSensorsHistory)
    operation="getSensorsHistory"
    ;;
    getSensorsHumidity)
    operation="getSensorsHumidity"
    ;;
    getSensorsTemperature)
    operation="getSensorsTemperature"
    ;;
    createTag)
    operation="createTag"
    ;;
    deleteTagById)
    operation="deleteTagById"
    ;;
    getAllTags)
    operation="getAllTags"
    ;;
    getTagById)
    operation="getTagById"
    ;;
    modifyTagById)
    operation="modifyTagById"
    ;;
    updateTagById)
    operation="updateTagById"
    ;;
    deleteUserById)
    operation="deleteUserById"
    ;;
    getUserById)
    operation="getUserById"
    ;;
    listUserRoles)
    operation="listUserRoles"
    ;;
    listUsers)
    operation="listUsers"
    ;;
    *==*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content as strings
    if [[ "$operation" ]]; then
        IFS='==' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]="\"${body_value}\""
    fi
    ;;
    *:=*)
    # Parse body arguments and convert them into top level
    # JSON properties passed in the body content without qoutes
    if [[ "$operation" ]]; then
        # ignore error about 'sep' being unused
        # shellcheck disable=SC2034
        IFS=':=' read -r body_key sep body_value <<< "$key"
        body_parameters[${body_key}]=${body_value}
    fi
    ;;
    +\([^=]\):*)
    # Parse header arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS=':' read -r header_name header_value <<< "$key"
        header_arguments[$header_name]=$header_value
    else
        curl_arguments+=" $key"
    fi
    ;;
    -)
    body_content_temp_file=$(mktemp)
    cat - > "$body_content_temp_file"
    ;;
    *=*)
    # Parse operation arguments and convert them into curl
    # only after the operation argument
    if [[ "$operation" ]]; then
        IFS='=' read -r parameter_name parameter_value <<< "$key"
        if [[ -z "${operation_parameters[$parameter_name]+foo}" ]]; then
            operation_parameters[$parameter_name]=$(url_escape "${parameter_value}")
        else
            operation_parameters[$parameter_name]+=":::"$(url_escape "${parameter_value}")
        fi
    else
        curl_arguments+=" $key"
    fi
    ;;
    *)
    # If we are before the operation, treat the arguments as cURL arguments
    if [[ "x$operation" == "x" ]]; then
        # Maintain quotes around cURL arguments if necessary
        space_regexp="[[:space:]]"
        if [[ $key =~ $space_regexp ]]; then
            curl_arguments+=" \"$key\""
        else
            curl_arguments+=" $key"
        fi
    fi
    ;;
esac
done


# Check if user provided host name
if [[ -z "$host" ]]; then
    ERROR_MSG="ERROR: No hostname provided!!! You have to  provide on command line option '--host ...'"
    exit 1
fi

# Check if user specified operation ID
if [[ -z "$operation" ]]; then
    ERROR_MSG="ERROR: No operation specified!!!"
    exit 1
fi


# Run cURL command based on the operation ID
case $operation in
    getAllAssetCurrentLocations)
    call_getAllAssetCurrentLocations
    ;;
    getAllAssets)
    call_getAllAssets
    ;;
    getAssetLocation)
    call_getAssetLocation
    ;;
    getAssetReefer)
    call_getAssetReefer
    ;;
    createDriver)
    call_createDriver
    ;;
    deactivateDriver)
    call_deactivateDriver
    ;;
    getAllDeactivatedDrivers)
    call_getAllDeactivatedDrivers
    ;;
    getDeactivatedDriverById)
    call_getDeactivatedDriverById
    ;;
    getDriverById)
    call_getDriverById
    ;;
    reactivateDriverById)
    call_reactivateDriverById
    ;;
    addFleetAddress)
    call_addFleetAddress
    ;;
    addOrganizationAddresses)
    call_addOrganizationAddresses
    ;;
    createDispatchRoute)
    call_createDispatchRoute
    ;;
    createDriver)
    call_createDriver
    ;;
    createDriverDispatchRoute)
    call_createDriverDispatchRoute
    ;;
    createDriverDocument)
    call_createDriverDocument
    ;;
    createDvir)
    call_createDvir
    ;;
    createVehicleDispatchRoute)
    call_createVehicleDispatchRoute
    ;;
    deactivateDriver)
    call_deactivateDriver
    ;;
    deleteDispatchRouteById)
    call_deleteDispatchRouteById
    ;;
    deleteOrganizationAddress)
    call_deleteOrganizationAddress
    ;;
    fetchAllDispatchRoutes)
    call_fetchAllDispatchRoutes
    ;;
    fetchAllRouteJobUpdates)
    call_fetchAllRouteJobUpdates
    ;;
    getAllAssetCurrentLocations)
    call_getAllAssetCurrentLocations
    ;;
    getAllAssets)
    call_getAllAssets
    ;;
    getAllDeactivatedDrivers)
    call_getAllDeactivatedDrivers
    ;;
    getAssetLocation)
    call_getAssetLocation
    ;;
    getAssetReefer)
    call_getAssetReefer
    ;;
    getDeactivatedDriverById)
    call_getDeactivatedDriverById
    ;;
    getDispatchRouteById)
    call_getDispatchRouteById
    ;;
    getDispatchRouteHistory)
    call_getDispatchRouteHistory
    ;;
    getDispatchRoutesByDriverId)
    call_getDispatchRoutesByDriverId
    ;;
    getDispatchRoutesByVehicleId)
    call_getDispatchRoutesByVehicleId
    ;;
    getDriverById)
    call_getDriverById
    ;;
    getDriverDocumentTypesByOrgId)
    call_getDriverDocumentTypesByOrgId
    ;;
    getDriverDocumentsByOrgId)
    call_getDriverDocumentsByOrgId
    ;;
    getDriverSafetyScore)
    call_getDriverSafetyScore
    ;;
    getDvirs)
    call_getDvirs
    ;;
    getFleetDrivers)
    call_getFleetDrivers
    ;;
    getFleetDriversHosDailyLogs)
    call_getFleetDriversHosDailyLogs
    ;;
    getFleetDriversSummary)
    call_getFleetDriversSummary
    ;;
    getFleetHosAuthenticationLogs)
    call_getFleetHosAuthenticationLogs
    ;;
    getFleetHosLogs)
    call_getFleetHosLogs
    ;;
    getFleetHosLogsSummary)
    call_getFleetHosLogsSummary
    ;;
    getFleetLocations)
    call_getFleetLocations
    ;;
    getFleetMaintenanceList)
    call_getFleetMaintenanceList
    ;;
    getFleetTrips)
    call_getFleetTrips
    ;;
    getFleetVehicle)
    call_getFleetVehicle
    ;;
    getOrganizationAddress)
    call_getOrganizationAddress
    ;;
    getOrganizationAddresses)
    call_getOrganizationAddresses
    ;;
    getOrganizationContact)
    call_getOrganizationContact
    ;;
    getVehicleHarshEvent)
    call_getVehicleHarshEvent
    ;;
    getVehicleLocations)
    call_getVehicleLocations
    ;;
    getVehicleSafetyScore)
    call_getVehicleSafetyScore
    ;;
    getVehicleStats)
    call_getVehicleStats
    ;;
    getVehiclesLocations)
    call_getVehiclesLocations
    ;;
    listContacts)
    call_listContacts
    ;;
    listFleet)
    call_listFleet
    ;;
    patchFleetVehicle)
    call_patchFleetVehicle
    ;;
    reactivateDriverById)
    call_reactivateDriverById
    ;;
    updateDispatchRouteById)
    call_updateDispatchRouteById
    ;;
    updateOrganizationAddress)
    call_updateOrganizationAddress
    ;;
    updateVehicles)
    call_updateVehicles
    ;;
    getAllDataInputs)
    call_getAllDataInputs
    ;;
    getDataInput)
    call_getDataInput
    ;;
    getMachines)
    call_getMachines
    ;;
    getMachinesHistory)
    call_getMachinesHistory
    ;;
    createDispatchRoute)
    call_createDispatchRoute
    ;;
    createDriverDispatchRoute)
    call_createDriverDispatchRoute
    ;;
    createVehicleDispatchRoute)
    call_createVehicleDispatchRoute
    ;;
    deleteDispatchRouteById)
    call_deleteDispatchRouteById
    ;;
    fetchAllDispatchRoutes)
    call_fetchAllDispatchRoutes
    ;;
    fetchAllRouteJobUpdates)
    call_fetchAllRouteJobUpdates
    ;;
    getDispatchRouteById)
    call_getDispatchRouteById
    ;;
    getDispatchRouteHistory)
    call_getDispatchRouteHistory
    ;;
    getDispatchRoutesByDriverId)
    call_getDispatchRoutesByDriverId
    ;;
    getDispatchRoutesByVehicleId)
    call_getDispatchRoutesByVehicleId
    ;;
    updateDispatchRouteById)
    call_updateDispatchRouteById
    ;;
    getDriverSafetyScore)
    call_getDriverSafetyScore
    ;;
    getVehicleHarshEvent)
    call_getVehicleHarshEvent
    ;;
    getVehicleSafetyScore)
    call_getVehicleSafetyScore
    ;;
    getSensors)
    call_getSensors
    ;;
    getSensorsCargo)
    call_getSensorsCargo
    ;;
    getSensorsDoor)
    call_getSensorsDoor
    ;;
    getSensorsHistory)
    call_getSensorsHistory
    ;;
    getSensorsHumidity)
    call_getSensorsHumidity
    ;;
    getSensorsTemperature)
    call_getSensorsTemperature
    ;;
    createTag)
    call_createTag
    ;;
    deleteTagById)
    call_deleteTagById
    ;;
    getAllTags)
    call_getAllTags
    ;;
    getTagById)
    call_getTagById
    ;;
    modifyTagById)
    call_modifyTagById
    ;;
    updateTagById)
    call_updateTagById
    ;;
    deleteUserById)
    call_deleteUserById
    ;;
    getUserById)
    call_getUserById
    ;;
    listUserRoles)
    call_listUserRoles
    ;;
    listUsers)
    call_listUsers
    ;;
    *)
    ERROR_MSG="ERROR: Unknown operation: $operation"
    exit 1
esac
