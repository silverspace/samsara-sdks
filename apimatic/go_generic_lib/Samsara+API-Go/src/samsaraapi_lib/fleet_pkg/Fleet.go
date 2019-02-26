/*
 * samsaraapi_lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package fleet_pkg

import "samsaraapi_lib/models_pkg"
import "samsaraapi_lib/configuration_pkg"

/*
 * Interface for the FLEET_IMPL
 */
type FLEET interface {
    GetDriverDocumentTypesByOrgId () ([]*models_pkg.DocumentType, error)

    GetVehicleLocations (string, int64, int64, int64) ([]*models_pkg.FleetVehicleLocation, error)

    CreateVehicleDispatchRoute (*models_pkg.DispatchRouteCreate, string, int64) (*models_pkg.DispatchRoute, error)

    GetDispatchRoutesByVehicleId (string, int64, *int64, *int64) ([]*models_pkg.DispatchRoute, error)

    PatchFleetVehicle (string, string, *models_pkg.Data) (*models_pkg.FleetVehicleResponse, error)

    GetVehicleSafetyScore (string, int64, int64, int64) (*models_pkg.VehicleSafetyScoreResponse, error)

    GetVehicleHarshEvent (string, int64, int64) (*models_pkg.VehicleHarshEventResponse, error)

    GetVehiclesLocations (string, int64, int64) ([]*models_pkg.FleetVehiclesLocation, error)

    GetDvirs (string, int64, int64, *int64) (*models_pkg.DvirListResponse, error)

    GetFleetVehicle (string, string) (*models_pkg.FleetVehicleResponse, error)

    CreateListFleet (string, *models_pkg.GroupParam, *string, *string, *int64) (*models_pkg.ListFleetResponse, error)

    CreateGetFleetDriversHosDailyLogs (string, int64, *models_pkg.HosLogsParam) (*models_pkg.DriverDailyLogResponse, error)

    CreateDriverDocument (*models_pkg.DocumentCreate, string, int64) (*models_pkg.Document, error)

    CreateDriverDispatchRoute (*models_pkg.DispatchRouteCreate, string, int64) (*models_pkg.DispatchRoute, error)

    CreateGetFleetTrips (string, *models_pkg.TripsParam) (*models_pkg.TripResponse, error)

    UpdateVehicles (string, *models_pkg.VehicleUpdateParam) (error)

    CreateGetFleetMaintenanceList (string, *models_pkg.GroupParam) (*models_pkg.GetFleetMaintenanceListResponse, error)

    GetDispatchRoutesByDriverId (string, int64, *int64, *int64) ([]*models_pkg.DispatchRoute, error)

    CreateDvir (string, *models_pkg.CreateDvirParam) (*models_pkg.DvirBase, error)

    GetDriverSafetyScore (string, int64, int64, int64) (*models_pkg.DriverSafetyScoreResponse, error)

    CreateGetFleetLocations (string, *models_pkg.GroupParam) (*models_pkg.GetFleetLocationsResponse, error)

    CreateGetFleetHosLogsSummary (string, *models_pkg.HosLogsParam2) (*models_pkg.HosLogsSummaryResponse, error)

    CreateGetFleetHosLogs (string, *models_pkg.HosLogsParam) (*models_pkg.HosLogsResponse, error)

    CreateGetFleetHosAuthenticationLogs (string, *models_pkg.HosAuthenticationLogsParam) (*models_pkg.HosAuthenticationLogsResponse, error)

    CreateGetFleetDriversSummary (string, *models_pkg.DriversSummaryParam, *bool) (*models_pkg.DriversSummaryResponse, error)

    GetVehicleStats (string, int64, int64, models_pkg.SeriesEnum, *string, *string, *string, *int64) (*models_pkg.GetVehicleStatsResponse, error)

    UpdateReactivateDriverById (*models_pkg.ReactivateDriverParam, string, string) (*models_pkg.Driver, error)

    GetDriverDocumentsByOrgId (string, *int64, *int64) ([]*models_pkg.Document, error)

    DeleteDeactivateDriver (string, string) (error)

    GetDispatchRouteHistory (string, int64, *int64, *int64) (*models_pkg.DispatchRouteHistory, error)

    UpdateDispatchRouteById (*models_pkg.DispatchRoute, string, int64) (*models_pkg.DispatchRoute, error)

    FetchAllRouteJobUpdates (string, *int64, *string, *string) (*models_pkg.AllRouteJobUpdates, error)

    FetchAllDispatchRoutes (string, *int64, *int64, *int64) ([]*models_pkg.DispatchRoute, error)

    GetAssetReefer (string, int64, int64, int64) (*models_pkg.AssetReeferResponse, error)

    GetAssetLocation (string, int64, int64, int64) ([]*models_pkg.AssetLocationResponse, error)

    GetDriverById (string, string) (*models_pkg.Driver, error)

    GetDeactivatedDriverById (string, string) (*models_pkg.Driver, error)

    GetAllDeactivatedDrivers (string, *int64) ([]*models_pkg.Driver, error)

    CreateDriver (string, *models_pkg.DriverForCreate) (*models_pkg.Driver, error)

    CreateGetFleetDrivers (string, *models_pkg.GroupDriversParam) (*models_pkg.DriversResponse, error)

    DeleteDispatchRouteById (string, int64) (error)

    GetDispatchRouteById (string, int64) (*models_pkg.DispatchRoute, error)

    CreateDispatchRoute (string, *models_pkg.DispatchRouteCreate) (*models_pkg.DispatchRoute, error)

    GetAllAssetCurrentLocations (string) (*models_pkg.GetAllAssetCurrentLocationsResponse, error)

    GetAllAssets (string) (*models_pkg.GetAllAssetsResponse, error)

    AddFleetAddress (string, *models_pkg.AddressParam) (error)

    GetOrganizationContact (string, int64) (*models_pkg.Contact, error)

    ListContacts (string) ([]*models_pkg.Contact, error)

    DeleteOrganizationAddress (string, int64) (error)

    GetOrganizationAddress (string, int64) (*models_pkg.Address, error)

    UpdateOrganizationAddress (string, *models_pkg.Address1, int64) (error)

    GetOrganizationAddresses (string) ([]*models_pkg.Address, error)

    AddOrganizationAddresses (string, *models_pkg.Addresses) ([]*models_pkg.Address, error)
}

/*
 * Factory for the FLEET interaface returning FLEET_IMPL
 */
func NewFLEET(config configuration_pkg.CONFIGURATION) *FLEET_IMPL {
    client := new(FLEET_IMPL)
    client.config = config
    return client
}