//! Server implementation of openapi_client.

#![allow(unused_imports)]

use futures::{self, Future};
use chrono;
use std::collections::HashMap;
use std::marker::PhantomData;

use swagger;
use swagger::{Has, XSpanIdString};

use openapi_client::{Api, ApiError,
                      GetAllAssetCurrentLocationsResponse,
                      GetAllAssetsResponse,
                      GetAssetLocationResponse,
                      GetAssetReeferResponse,
                      CreateDriverResponse,
                      DeactivateDriverResponse,
                      GetAllDeactivatedDriversResponse,
                      GetDeactivatedDriverByIdResponse,
                      GetDriverByIdResponse,
                      ReactivateDriverByIdResponse,
                      AddFleetAddressResponse,
                      AddOrganizationAddressesResponse,
                      CreateDispatchRouteResponse,
                      CreateDriverResponse,
                      CreateDriverDispatchRouteResponse,
                      CreateDriverDocumentResponse,
                      CreateDvirResponse,
                      CreateVehicleDispatchRouteResponse,
                      DeactivateDriverResponse,
                      DeleteDispatchRouteByIdResponse,
                      DeleteOrganizationAddressResponse,
                      FetchAllDispatchRoutesResponse,
                      FetchAllRouteJobUpdatesResponse,
                      GetAllAssetCurrentLocationsResponse,
                      GetAllAssetsResponse,
                      GetAllDeactivatedDriversResponse,
                      GetAssetLocationResponse,
                      GetAssetReeferResponse,
                      GetDeactivatedDriverByIdResponse,
                      GetDispatchRouteByIdResponse,
                      GetDispatchRouteHistoryResponse,
                      GetDispatchRoutesByDriverIdResponse,
                      GetDispatchRoutesByVehicleIdResponse,
                      GetDriverByIdResponse,
                      GetDriverDocumentTypesByOrgIdResponse,
                      GetDriverDocumentsByOrgIdResponse,
                      GetDriverSafetyScoreResponse,
                      GetDvirsResponse,
                      GetFleetDriversResponse,
                      GetFleetDriversHosDailyLogsResponse,
                      GetFleetDriversSummaryResponse,
                      GetFleetHosAuthenticationLogsResponse,
                      GetFleetHosLogsResponse,
                      GetFleetHosLogsSummaryResponse,
                      GetFleetLocationsResponse,
                      GetFleetMaintenanceListResponse,
                      GetFleetTripsResponse,
                      GetFleetVehicleResponse,
                      GetOrganizationAddressResponse,
                      GetOrganizationAddressesResponse,
                      GetOrganizationContactResponse,
                      GetVehicleHarshEventResponse,
                      GetVehicleLocationsResponse,
                      GetVehicleSafetyScoreResponse,
                      GetVehicleStatsResponse,
                      GetVehiclesLocationsResponse,
                      ListContactsResponse,
                      ListFleetResponse,
                      PatchFleetVehicleResponse,
                      ReactivateDriverByIdResponse,
                      UpdateDispatchRouteByIdResponse,
                      UpdateOrganizationAddressResponse,
                      UpdateVehiclesResponse,
                      GetAllDataInputsResponse,
                      GetDataInputResponse,
                      GetMachinesResponse,
                      GetMachinesHistoryResponse,
                      CreateDispatchRouteResponse,
                      CreateDriverDispatchRouteResponse,
                      CreateVehicleDispatchRouteResponse,
                      DeleteDispatchRouteByIdResponse,
                      FetchAllDispatchRoutesResponse,
                      FetchAllRouteJobUpdatesResponse,
                      GetDispatchRouteByIdResponse,
                      GetDispatchRouteHistoryResponse,
                      GetDispatchRoutesByDriverIdResponse,
                      GetDispatchRoutesByVehicleIdResponse,
                      UpdateDispatchRouteByIdResponse,
                      GetDriverSafetyScoreResponse,
                      GetVehicleHarshEventResponse,
                      GetVehicleSafetyScoreResponse,
                      GetSensorsResponse,
                      GetSensorsCargoResponse,
                      GetSensorsDoorResponse,
                      GetSensorsHistoryResponse,
                      GetSensorsHumidityResponse,
                      GetSensorsTemperatureResponse,
                      CreateTagResponse,
                      DeleteTagByIdResponse,
                      GetAllTagsResponse,
                      GetTagByIdResponse,
                      ModifyTagByIdResponse,
                      UpdateTagByIdResponse,
                      DeleteUserByIdResponse,
                      GetUserByIdResponse,
                      ListUserRolesResponse,
                      ListUsersResponse
};
use openapi_client::models;

#[derive(Copy, Clone)]
pub struct Server<C> {
    marker: PhantomData<C>,
}

impl<C> Server<C> {
    pub fn new() -> Self {
        Server{marker: PhantomData}
    }
}

impl<C> Api<C> for Server<C> where C: Has<XSpanIdString>{

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_asset_current_locations(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_assets(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_asset_location(\"{}\", {}, {}, {}) - X-Span-ID: {:?}", access_token, asset_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_asset_reefer(\"{}\", {}, {}, {}) - X-Span-ID: {:?}", access_token, asset_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate, context: &C) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_driver(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, create_driver_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>> {
        let context = context.clone();
        println!("deactivate_driver(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, driver_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_deactivated_drivers(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_deactivated_driver_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, driver_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_driver_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, driver_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4, context: &C) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("reactivate_driver_by_id(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", access_token, driver_id_or_external_id, reactivate_driver_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/add_address
    fn add_fleet_address(&self, access_token: String, address_param: models::InlineObject2, context: &C) -> Box<Future<Item=AddFleetAddressResponse, Error=ApiError>> {
        let context = context.clone();
        println!("add_fleet_address(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, address_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /addresses
    fn add_organization_addresses(&self, access_token: String, addresses: models::InlineObject, context: &C) -> Box<Future<Item=AddOrganizationAddressesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("add_organization_addresses(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, addresses, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_dispatch_route(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, create_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/create
    fn create_driver(&self, access_token: String, create_driver_param: models::DriverForCreate, context: &C) -> Box<Future<Item=CreateDriverResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_driver(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, create_driver_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_driver_dispatch_route(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, driver_id, create_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/documents
    fn create_driver_document(&self, access_token: String, driver_id: i64, create_document_params: models::DocumentCreate, context: &C) -> Box<Future<Item=CreateDriverDocumentResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_driver_document(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, driver_id, create_document_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/maintenance/dvirs
    fn create_dvir(&self, access_token: String, create_dvir_param: models::InlineObject12, context: &C) -> Box<Future<Item=CreateDvirResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_dvir(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, create_dvir_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_vehicle_dispatch_route(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, vehicle_id, create_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn deactivate_driver(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=DeactivateDriverResponse, Error=ApiError>> {
        let context = context.clone();
        println!("deactivate_driver(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, driver_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_dispatch_route_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, route_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /addresses/{addressId}
    fn delete_organization_address(&self, access_token: String, address_id: i64, context: &C) -> Box<Future<Item=DeleteOrganizationAddressResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_organization_address(\"{}\", {}) - X-Span-ID: {:?}", access_token, address_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("fetch_all_dispatch_routes(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, group_id, end_time, duration, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>, context: &C) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("fetch_all_route_job_updates(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, group_id, sequence_id, include, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets/locations
    fn get_all_asset_current_locations(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetCurrentLocationsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_asset_current_locations(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets
    fn get_all_assets(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllAssetsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_assets(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/inactive
    fn get_all_deactivated_drivers(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllDeactivatedDriversResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_deactivated_drivers(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets/{assetId:[0-9]+}/locations
    fn get_asset_location(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetLocationResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_asset_location(\"{}\", {}, {}, {}) - X-Span-ID: {:?}", access_token, asset_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/assets/{assetId:[0-9]+}/reefer
    fn get_asset_reefer(&self, access_token: String, asset_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetAssetReeferResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_asset_reefer(\"{}\", {}, {}, {}) - X-Span-ID: {:?}", access_token, asset_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_deactivated_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDeactivatedDriverByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_deactivated_driver_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, driver_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_route_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, route_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_route_history(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, route_id, start_time, end_time, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_routes_by_driver_id(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, driver_id, end_time, duration, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_routes_by_vehicle_id(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, vehicle_id, end_time, duration, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, context: &C) -> Box<Future<Item=GetDriverByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_driver_by_id(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, driver_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/document_types
    fn get_driver_document_types_by_org_id(&self, context: &C) -> Box<Future<Item=GetDriverDocumentTypesByOrgIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_driver_document_types_by_org_id() - X-Span-ID: {:?}", context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/documents
    fn get_driver_documents_by_org_id(&self, access_token: String, end_ms: Option<i64>, duration_ms: Option<i64>, context: &C) -> Box<Future<Item=GetDriverDocumentsByOrgIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_driver_documents_by_org_id(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", access_token, end_ms, duration_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_driver_safety_score({}, \"{}\", {}, {}) - X-Span-ID: {:?}", driver_id, access_token, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/maintenance/dvirs
    fn get_dvirs(&self, access_token: String, end_ms: i32, duration_ms: i32, group_id: Option<i32>, context: &C) -> Box<Future<Item=GetDvirsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dvirs(\"{}\", {}, {}, {:?}) - X-Span-ID: {:?}", access_token, end_ms, duration_ms, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers
    fn get_fleet_drivers(&self, access_token: String, group_drivers_param: models::InlineObject3, context: &C) -> Box<Future<Item=GetFleetDriversResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_drivers(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_drivers_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
    fn get_fleet_drivers_hos_daily_logs(&self, access_token: String, driver_id: i64, hos_logs_param: models::InlineObject6, context: &C) -> Box<Future<Item=GetFleetDriversHosDailyLogsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_drivers_hos_daily_logs(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, driver_id, hos_logs_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/summary
    fn get_fleet_drivers_summary(&self, access_token: String, drivers_summary_param: models::InlineObject5, snap_to_day_bounds: Option<bool>, context: &C) -> Box<Future<Item=GetFleetDriversSummaryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_drivers_summary(\"{}\", {:?}, {:?}) - X-Span-ID: {:?}", access_token, drivers_summary_param, snap_to_day_bounds, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/hos_authentication_logs
    fn get_fleet_hos_authentication_logs(&self, access_token: String, hos_authentication_logs_param: models::InlineObject7, context: &C) -> Box<Future<Item=GetFleetHosAuthenticationLogsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_hos_authentication_logs(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, hos_authentication_logs_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/hos_logs
    fn get_fleet_hos_logs(&self, access_token: String, hos_logs_param: models::InlineObject8, context: &C) -> Box<Future<Item=GetFleetHosLogsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_hos_logs(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, hos_logs_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/hos_logs_summary
    fn get_fleet_hos_logs_summary(&self, access_token: String, hos_logs_param: models::InlineObject9, context: &C) -> Box<Future<Item=GetFleetHosLogsSummaryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_hos_logs_summary(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, hos_logs_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/locations
    fn get_fleet_locations(&self, access_token: String, group_param: models::InlineObject11, context: &C) -> Box<Future<Item=GetFleetLocationsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_locations(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/maintenance/list
    fn get_fleet_maintenance_list(&self, access_token: String, group_param: models::InlineObject13, context: &C) -> Box<Future<Item=GetFleetMaintenanceListResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_maintenance_list(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/trips
    fn get_fleet_trips(&self, access_token: String, trips_param: models::InlineObject15, context: &C) -> Box<Future<Item=GetFleetTripsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_trips(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, trips_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn get_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String, context: &C) -> Box<Future<Item=GetFleetVehicleResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_fleet_vehicle(\"{}\", \"{}\") - X-Span-ID: {:?}", access_token, vehicle_id_or_external_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /addresses/{addressId}
    fn get_organization_address(&self, access_token: String, address_id: i64, context: &C) -> Box<Future<Item=GetOrganizationAddressResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_organization_address(\"{}\", {}) - X-Span-ID: {:?}", access_token, address_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /addresses
    fn get_organization_addresses(&self, access_token: String, context: &C) -> Box<Future<Item=GetOrganizationAddressesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_organization_addresses(\"{}\") - X-Span-ID: {:?}", access_token, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /contacts/{contact_id}
    fn get_organization_contact(&self, access_token: String, contact_id: i64, context: &C) -> Box<Future<Item=GetOrganizationContactResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_organization_contact(\"{}\", {}) - X-Span-ID: {:?}", access_token, contact_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64, context: &C) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicle_harsh_event({}, \"{}\", {}) - X-Span-ID: {:?}", vehicle_id, access_token, timestamp, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
    fn get_vehicle_locations(&self, access_token: String, vehicle_id: i64, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleLocationsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicle_locations(\"{}\", {}, {}, {}) - X-Span-ID: {:?}", access_token, vehicle_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicle_safety_score({}, \"{}\", {}, {}) - X-Span-ID: {:?}", vehicle_id, access_token, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/stats
    fn get_vehicle_stats(&self, access_token: String, start_ms: i32, end_ms: i32, series: Option<String>, tag_ids: Option<String>, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>, context: &C) -> Box<Future<Item=GetVehicleStatsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicle_stats(\"{}\", {}, {}, {:?}, {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, start_ms, end_ms, series, tag_ids, starting_after, ending_before, limit, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/locations
    fn get_vehicles_locations(&self, access_token: String, start_ms: i32, end_ms: i32, context: &C) -> Box<Future<Item=GetVehiclesLocationsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicles_locations(\"{}\", {}, {}) - X-Span-ID: {:?}", access_token, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /contacts
    fn list_contacts(&self, access_token: String, context: &C) -> Box<Future<Item=ListContactsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("list_contacts(\"{}\") - X-Span-ID: {:?}", access_token, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/list
    fn list_fleet(&self, access_token: String, group_param: models::InlineObject10, starting_after: Option<String>, ending_before: Option<String>, limit: Option<i64>, context: &C) -> Box<Future<Item=ListFleetResponse, Error=ApiError>> {
        let context = context.clone();
        println!("list_fleet(\"{}\", {:?}, {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, group_param, starting_after, ending_before, limit, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn patch_fleet_vehicle(&self, access_token: String, vehicle_id_or_external_id: String, data: models::InlineObject16, context: &C) -> Box<Future<Item=PatchFleetVehicleResponse, Error=ApiError>> {
        let context = context.clone();
        println!("patch_fleet_vehicle(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", access_token, vehicle_id_or_external_id, data, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
    fn reactivate_driver_by_id(&self, access_token: String, driver_id_or_external_id: String, reactivate_driver_param: models::InlineObject4, context: &C) -> Box<Future<Item=ReactivateDriverByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("reactivate_driver_by_id(\"{}\", \"{}\", {:?}) - X-Span-ID: {:?}", access_token, driver_id_or_external_id, reactivate_driver_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute, context: &C) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("update_dispatch_route_by_id(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, route_id, update_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /addresses/{addressId}
    fn update_organization_address(&self, access_token: String, address_id: i64, address: models::InlineObject1, context: &C) -> Box<Future<Item=UpdateOrganizationAddressResponse, Error=ApiError>> {
        let context = context.clone();
        println!("update_organization_address(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, address_id, address, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/set_data
    fn update_vehicles(&self, access_token: String, vehicle_update_param: models::InlineObject14, context: &C) -> Box<Future<Item=UpdateVehiclesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("update_vehicles(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, vehicle_update_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /industrial/data
    fn get_all_data_inputs(&self, access_token: String, group_id: Option<i64>, start_ms: Option<i64>, end_ms: Option<i64>, context: &C) -> Box<Future<Item=GetAllDataInputsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_data_inputs(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, group_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /industrial/data/{data_input_id:[0-9]+}
    fn get_data_input(&self, access_token: String, data_input_id: i64, start_ms: Option<i64>, end_ms: Option<i64>, context: &C) -> Box<Future<Item=GetDataInputResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_data_input(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, data_input_id, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /machines/list
    fn get_machines(&self, access_token: String, group_param: models::InlineObject18, context: &C) -> Box<Future<Item=GetMachinesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_machines(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /machines/history
    fn get_machines_history(&self, access_token: String, history_param: models::InlineObject17, context: &C) -> Box<Future<Item=GetMachinesHistoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_machines_history(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, history_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes
    fn create_dispatch_route(&self, access_token: String, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDispatchRouteResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_dispatch_route(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, create_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn create_driver_dispatch_route(&self, access_token: String, driver_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateDriverDispatchRouteResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_driver_dispatch_route(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, driver_id, create_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn create_vehicle_dispatch_route(&self, access_token: String, vehicle_id: i64, create_dispatch_route_params: models::DispatchRouteCreate, context: &C) -> Box<Future<Item=CreateVehicleDispatchRouteResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_vehicle_dispatch_route(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, vehicle_id, create_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn delete_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=DeleteDispatchRouteByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_dispatch_route_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, route_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes
    fn fetch_all_dispatch_routes(&self, access_token: String, group_id: Option<i64>, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=FetchAllDispatchRoutesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("fetch_all_dispatch_routes(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, group_id, end_time, duration, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/job_updates
    fn fetch_all_route_job_updates(&self, access_token: String, group_id: Option<i64>, sequence_id: Option<String>, include: Option<String>, context: &C) -> Box<Future<Item=FetchAllRouteJobUpdatesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("fetch_all_route_job_updates(\"{}\", {:?}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, group_id, sequence_id, include, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}
    fn get_dispatch_route_by_id(&self, access_token: String, route_id: i64, context: &C) -> Box<Future<Item=GetDispatchRouteByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_route_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, route_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/history
    fn get_dispatch_route_history(&self, access_token: String, route_id: i64, start_time: Option<i64>, end_time: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRouteHistoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_route_history(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, route_id, start_time, end_time, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_driver_id(&self, access_token: String, driver_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByDriverIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_routes_by_driver_id(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, driver_id, end_time, duration, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
    fn get_dispatch_routes_by_vehicle_id(&self, access_token: String, vehicle_id: i64, end_time: Option<i64>, duration: Option<i64>, context: &C) -> Box<Future<Item=GetDispatchRoutesByVehicleIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_dispatch_routes_by_vehicle_id(\"{}\", {}, {:?}, {:?}) - X-Span-ID: {:?}", access_token, vehicle_id, end_time, duration, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/dispatch/routes/{route_id:[0-9]+}/
    fn update_dispatch_route_by_id(&self, access_token: String, route_id: i64, update_dispatch_route_params: models::DispatchRoute, context: &C) -> Box<Future<Item=UpdateDispatchRouteByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("update_dispatch_route_by_id(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, route_id, update_dispatch_route_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/drivers/{driverId:[0-9]+}/safety/score
    fn get_driver_safety_score(&self, driver_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetDriverSafetyScoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_driver_safety_score({}, \"{}\", {}, {}) - X-Span-ID: {:?}", driver_id, access_token, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
    fn get_vehicle_harsh_event(&self, vehicle_id: i64, access_token: String, timestamp: i64, context: &C) -> Box<Future<Item=GetVehicleHarshEventResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicle_harsh_event({}, \"{}\", {}) - X-Span-ID: {:?}", vehicle_id, access_token, timestamp, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
    fn get_vehicle_safety_score(&self, vehicle_id: i64, access_token: String, start_ms: i64, end_ms: i64, context: &C) -> Box<Future<Item=GetVehicleSafetyScoreResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_vehicle_safety_score({}, \"{}\", {}, {}) - X-Span-ID: {:?}", vehicle_id, access_token, start_ms, end_ms, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /sensors/list
    fn get_sensors(&self, access_token: String, group_param: models::InlineObject23, context: &C) -> Box<Future<Item=GetSensorsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_sensors(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /sensors/cargo
    fn get_sensors_cargo(&self, access_token: String, sensor_param: models::InlineObject19, context: &C) -> Box<Future<Item=GetSensorsCargoResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_sensors_cargo(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, sensor_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /sensors/door
    fn get_sensors_door(&self, access_token: String, sensor_param: models::InlineObject20, context: &C) -> Box<Future<Item=GetSensorsDoorResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_sensors_door(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, sensor_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /sensors/history
    fn get_sensors_history(&self, access_token: String, history_param: models::InlineObject21, context: &C) -> Box<Future<Item=GetSensorsHistoryResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_sensors_history(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, history_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /sensors/humidity
    fn get_sensors_humidity(&self, access_token: String, sensor_param: models::InlineObject22, context: &C) -> Box<Future<Item=GetSensorsHumidityResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_sensors_humidity(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, sensor_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /sensors/temperature
    fn get_sensors_temperature(&self, access_token: String, sensor_param: models::InlineObject24, context: &C) -> Box<Future<Item=GetSensorsTemperatureResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_sensors_temperature(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, sensor_param, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /tags
    fn create_tag(&self, access_token: String, tag_create_params: models::TagCreate, context: &C) -> Box<Future<Item=CreateTagResponse, Error=ApiError>> {
        let context = context.clone();
        println!("create_tag(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, tag_create_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /tags/{tag_id:[0-9]+}
    fn delete_tag_by_id(&self, access_token: String, tag_id: i64, context: &C) -> Box<Future<Item=DeleteTagByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_tag_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, tag_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /tags
    fn get_all_tags(&self, access_token: String, group_id: Option<i64>, context: &C) -> Box<Future<Item=GetAllTagsResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_all_tags(\"{}\", {:?}) - X-Span-ID: {:?}", access_token, group_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /tags/{tag_id:[0-9]+}
    fn get_tag_by_id(&self, access_token: String, tag_id: i64, context: &C) -> Box<Future<Item=GetTagByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_tag_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, tag_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /tags/{tag_id:[0-9]+}
    fn modify_tag_by_id(&self, access_token: String, tag_id: i64, tag_modify_params: models::TagModify, context: &C) -> Box<Future<Item=ModifyTagByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("modify_tag_by_id(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, tag_id, tag_modify_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /tags/{tag_id:[0-9]+}
    fn update_tag_by_id(&self, access_token: String, tag_id: i64, update_tag_params: models::TagUpdate, context: &C) -> Box<Future<Item=UpdateTagByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("update_tag_by_id(\"{}\", {}, {:?}) - X-Span-ID: {:?}", access_token, tag_id, update_tag_params, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /users/{userId:[0-9]+}
    fn delete_user_by_id(&self, access_token: String, user_id: i64, context: &C) -> Box<Future<Item=DeleteUserByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("delete_user_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, user_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /users/{userId:[0-9]+}
    fn get_user_by_id(&self, access_token: String, user_id: i64, context: &C) -> Box<Future<Item=GetUserByIdResponse, Error=ApiError>> {
        let context = context.clone();
        println!("get_user_by_id(\"{}\", {}) - X-Span-ID: {:?}", access_token, user_id, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /user_roles
    fn list_user_roles(&self, access_token: String, context: &C) -> Box<Future<Item=ListUserRolesResponse, Error=ApiError>> {
        let context = context.clone();
        println!("list_user_roles(\"{}\") - X-Span-ID: {:?}", access_token, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

    /// /users
    fn list_users(&self, access_token: String, context: &C) -> Box<Future<Item=ListUsersResponse, Error=ApiError>> {
        let context = context.clone();
        println!("list_users(\"{}\") - X-Span-ID: {:?}", access_token, context.get().0.clone());
        Box::new(futures::failed("Generic failure".into()))
    }

}
