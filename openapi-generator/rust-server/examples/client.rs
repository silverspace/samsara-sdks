#![allow(missing_docs, unused_variables, trivial_casts)]

extern crate openapi_client;
#[allow(unused_extern_crates)]
extern crate futures;
#[allow(unused_extern_crates)]
#[macro_use]
extern crate swagger;
#[allow(unused_extern_crates)]
extern crate uuid;
extern crate clap;
extern crate tokio_core;

use swagger::{ContextBuilder, EmptyContext, XSpanIdString, Has, Push, AuthData};

#[allow(unused_imports)]
use futures::{Future, future, Stream, stream};
use tokio_core::reactor;
#[allow(unused_imports)]
use openapi_client::{ApiNoContext, ContextWrapperExt,
                      ApiError,
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
use clap::{App, Arg};

fn main() {
    let matches = App::new("client")
        .arg(Arg::with_name("operation")
            .help("Sets the operation to run")
            .possible_values(&[
    "GetAllAssetCurrentLocations",
    "GetAllAssets",
    "GetAssetLocation",
    "GetAssetReefer",
    "DeactivateDriver",
    "GetAllDeactivatedDrivers",
    "GetDeactivatedDriverById",
    "GetDriverById",
    "DeactivateDriver",
    "DeleteDispatchRouteById",
    "DeleteOrganizationAddress",
    "FetchAllDispatchRoutes",
    "FetchAllRouteJobUpdates",
    "GetAllAssetCurrentLocations",
    "GetAllAssets",
    "GetAllDeactivatedDrivers",
    "GetAssetLocation",
    "GetAssetReefer",
    "GetDeactivatedDriverById",
    "GetDispatchRouteById",
    "GetDispatchRouteHistory",
    "GetDispatchRoutesByDriverId",
    "GetDispatchRoutesByVehicleId",
    "GetDriverById",
    "GetDriverDocumentTypesByOrgId",
    "GetDriverDocumentsByOrgId",
    "GetDriverSafetyScore",
    "GetDvirs",
    "GetFleetVehicle",
    "GetOrganizationAddress",
    "GetOrganizationAddresses",
    "GetOrganizationContact",
    "GetVehicleHarshEvent",
    "GetVehicleLocations",
    "GetVehicleSafetyScore",
    "GetVehicleStats",
    "GetVehiclesLocations",
    "ListContacts",
    "GetAllDataInputs",
    "GetDataInput",
    "DeleteDispatchRouteById",
    "FetchAllDispatchRoutes",
    "FetchAllRouteJobUpdates",
    "GetDispatchRouteById",
    "GetDispatchRouteHistory",
    "GetDispatchRoutesByDriverId",
    "GetDispatchRoutesByVehicleId",
    "GetDriverSafetyScore",
    "GetVehicleHarshEvent",
    "GetVehicleSafetyScore",
    "DeleteTagById",
    "GetAllTags",
    "GetTagById",
    "DeleteUserById",
    "GetUserById",
    "ListUserRoles",
    "ListUsers",
])
            .required(true)
            .index(1))
        .arg(Arg::with_name("https")
            .long("https")
            .help("Whether to use HTTPS or not"))
        .arg(Arg::with_name("host")
            .long("host")
            .takes_value(true)
            .default_value("api.samsara.com")
            .help("Hostname to contact"))
        .arg(Arg::with_name("port")
            .long("port")
            .takes_value(true)
            .default_value("80")
            .help("Port to contact"))
        .get_matches();

    let mut core = reactor::Core::new().unwrap();
    let is_https = matches.is_present("https");
    let base_url = format!("{}://{}:{}",
                           if is_https { "https" } else { "http" },
                           matches.value_of("host").unwrap(),
                           matches.value_of("port").unwrap());
    let client = if matches.is_present("https") {
        // Using Simple HTTPS
        openapi_client::Client::try_new_https(core.handle(), &base_url, "examples/ca.pem")
            .expect("Failed to create HTTPS client")
    } else {
        // Using HTTP
        openapi_client::Client::try_new_http(core.handle(), &base_url)
            .expect("Failed to create HTTP client")
    };

    let context: make_context_ty!(ContextBuilder, EmptyContext, Option<AuthData>, XSpanIdString) =
        make_context!(ContextBuilder, EmptyContext, None as Option<AuthData>, XSpanIdString(self::uuid::Uuid::new_v4().to_string()));
    let client = client.with_context(context);

    match matches.value_of("operation") {

        Some("GetAllAssetCurrentLocations") => {
            let result = core.run(client.get_all_asset_current_locations("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAllAssets") => {
            let result = core.run(client.get_all_assets("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAssetLocation") => {
            let result = core.run(client.get_asset_location("access_token_example".to_string(), 789, 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAssetReefer") => {
            let result = core.run(client.get_asset_reefer("access_token_example".to_string(), 789, 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("CreateDriver") => {
        //     let result = core.run(client.create_driver("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("DeactivateDriver") => {
            let result = core.run(client.deactivate_driver("access_token_example".to_string(), "driver_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAllDeactivatedDrivers") => {
            let result = core.run(client.get_all_deactivated_drivers("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDeactivatedDriverById") => {
            let result = core.run(client.get_deactivated_driver_by_id("access_token_example".to_string(), "driver_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDriverById") => {
            let result = core.run(client.get_driver_by_id("access_token_example".to_string(), "driver_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("ReactivateDriverById") => {
        //     let result = core.run(client.reactivate_driver_by_id("access_token_example".to_string(), "driver_id_or_external_id_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("AddFleetAddress") => {
        //     let result = core.run(client.add_fleet_address("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("AddOrganizationAddresses") => {
        //     let result = core.run(client.add_organization_addresses("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDispatchRoute") => {
        //     let result = core.run(client.create_dispatch_route("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDriver") => {
        //     let result = core.run(client.create_driver("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDriverDispatchRoute") => {
        //     let result = core.run(client.create_driver_dispatch_route("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDriverDocument") => {
        //     let result = core.run(client.create_driver_document("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDvir") => {
        //     let result = core.run(client.create_dvir("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateVehicleDispatchRoute") => {
        //     let result = core.run(client.create_vehicle_dispatch_route("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("DeactivateDriver") => {
            let result = core.run(client.deactivate_driver("access_token_example".to_string(), "driver_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("DeleteDispatchRouteById") => {
            let result = core.run(client.delete_dispatch_route_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("DeleteOrganizationAddress") => {
            let result = core.run(client.delete_organization_address("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("FetchAllDispatchRoutes") => {
            let result = core.run(client.fetch_all_dispatch_routes("access_token_example".to_string(), Some(789), Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("FetchAllRouteJobUpdates") => {
            let result = core.run(client.fetch_all_route_job_updates("access_token_example".to_string(), Some(789), Some("sequence_id_example".to_string()), Some("include_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAllAssetCurrentLocations") => {
            let result = core.run(client.get_all_asset_current_locations("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAllAssets") => {
            let result = core.run(client.get_all_assets("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAllDeactivatedDrivers") => {
            let result = core.run(client.get_all_deactivated_drivers("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAssetLocation") => {
            let result = core.run(client.get_asset_location("access_token_example".to_string(), 789, 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAssetReefer") => {
            let result = core.run(client.get_asset_reefer("access_token_example".to_string(), 789, 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDeactivatedDriverById") => {
            let result = core.run(client.get_deactivated_driver_by_id("access_token_example".to_string(), "driver_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRouteById") => {
            let result = core.run(client.get_dispatch_route_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRouteHistory") => {
            let result = core.run(client.get_dispatch_route_history("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRoutesByDriverId") => {
            let result = core.run(client.get_dispatch_routes_by_driver_id("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRoutesByVehicleId") => {
            let result = core.run(client.get_dispatch_routes_by_vehicle_id("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDriverById") => {
            let result = core.run(client.get_driver_by_id("access_token_example".to_string(), "driver_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDriverDocumentTypesByOrgId") => {
            let result = core.run(client.get_driver_document_types_by_org_id());
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDriverDocumentsByOrgId") => {
            let result = core.run(client.get_driver_documents_by_org_id("access_token_example".to_string(), Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDriverSafetyScore") => {
            let result = core.run(client.get_driver_safety_score(789, "access_token_example".to_string(), 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDvirs") => {
            let result = core.run(client.get_dvirs("access_token_example".to_string(), 56, 56, Some(56)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("GetFleetDrivers") => {
        //     let result = core.run(client.get_fleet_drivers("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetDriversHosDailyLogs") => {
        //     let result = core.run(client.get_fleet_drivers_hos_daily_logs("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetDriversSummary") => {
        //     let result = core.run(client.get_fleet_drivers_summary("access_token_example".to_string(), ???, Some(true)));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetHosAuthenticationLogs") => {
        //     let result = core.run(client.get_fleet_hos_authentication_logs("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetHosLogs") => {
        //     let result = core.run(client.get_fleet_hos_logs("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetHosLogsSummary") => {
        //     let result = core.run(client.get_fleet_hos_logs_summary("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetLocations") => {
        //     let result = core.run(client.get_fleet_locations("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetMaintenanceList") => {
        //     let result = core.run(client.get_fleet_maintenance_list("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetFleetTrips") => {
        //     let result = core.run(client.get_fleet_trips("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("GetFleetVehicle") => {
            let result = core.run(client.get_fleet_vehicle("access_token_example".to_string(), "vehicle_id_or_external_id_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetOrganizationAddress") => {
            let result = core.run(client.get_organization_address("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetOrganizationAddresses") => {
            let result = core.run(client.get_organization_addresses("access_token_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetOrganizationContact") => {
            let result = core.run(client.get_organization_contact("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehicleHarshEvent") => {
            let result = core.run(client.get_vehicle_harsh_event(789, "access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehicleLocations") => {
            let result = core.run(client.get_vehicle_locations("access_token_example".to_string(), 789, 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehicleSafetyScore") => {
            let result = core.run(client.get_vehicle_safety_score(789, "access_token_example".to_string(), 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehicleStats") => {
            let result = core.run(client.get_vehicle_stats("access_token_example".to_string(), 56, 56, Some("series_example".to_string()), Some("tag_ids_example".to_string()), Some("starting_after_example".to_string()), Some("ending_before_example".to_string()), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehiclesLocations") => {
            let result = core.run(client.get_vehicles_locations("access_token_example".to_string(), 56, 56));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ListContacts") => {
            let result = core.run(client.list_contacts("access_token_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("ListFleet") => {
        //     let result = core.run(client.list_fleet("access_token_example".to_string(), ???, Some("starting_after_example".to_string()), Some("ending_before_example".to_string()), Some(789)));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("PatchFleetVehicle") => {
        //     let result = core.run(client.patch_fleet_vehicle("access_token_example".to_string(), "vehicle_id_or_external_id_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("ReactivateDriverById") => {
        //     let result = core.run(client.reactivate_driver_by_id("access_token_example".to_string(), "driver_id_or_external_id_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("UpdateDispatchRouteById") => {
        //     let result = core.run(client.update_dispatch_route_by_id("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("UpdateOrganizationAddress") => {
        //     let result = core.run(client.update_organization_address("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("UpdateVehicles") => {
        //     let result = core.run(client.update_vehicles("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("GetAllDataInputs") => {
            let result = core.run(client.get_all_data_inputs("access_token_example".to_string(), Some(789), Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDataInput") => {
            let result = core.run(client.get_data_input("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("GetMachines") => {
        //     let result = core.run(client.get_machines("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetMachinesHistory") => {
        //     let result = core.run(client.get_machines_history("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDispatchRoute") => {
        //     let result = core.run(client.create_dispatch_route("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateDriverDispatchRoute") => {
        //     let result = core.run(client.create_driver_dispatch_route("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateVehicleDispatchRoute") => {
        //     let result = core.run(client.create_vehicle_dispatch_route("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("DeleteDispatchRouteById") => {
            let result = core.run(client.delete_dispatch_route_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("FetchAllDispatchRoutes") => {
            let result = core.run(client.fetch_all_dispatch_routes("access_token_example".to_string(), Some(789), Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("FetchAllRouteJobUpdates") => {
            let result = core.run(client.fetch_all_route_job_updates("access_token_example".to_string(), Some(789), Some("sequence_id_example".to_string()), Some("include_example".to_string())));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRouteById") => {
            let result = core.run(client.get_dispatch_route_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRouteHistory") => {
            let result = core.run(client.get_dispatch_route_history("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRoutesByDriverId") => {
            let result = core.run(client.get_dispatch_routes_by_driver_id("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetDispatchRoutesByVehicleId") => {
            let result = core.run(client.get_dispatch_routes_by_vehicle_id("access_token_example".to_string(), 789, Some(789), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("UpdateDispatchRouteById") => {
        //     let result = core.run(client.update_dispatch_route_by_id("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("GetDriverSafetyScore") => {
            let result = core.run(client.get_driver_safety_score(789, "access_token_example".to_string(), 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehicleHarshEvent") => {
            let result = core.run(client.get_vehicle_harsh_event(789, "access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetVehicleSafetyScore") => {
            let result = core.run(client.get_vehicle_safety_score(789, "access_token_example".to_string(), 789, 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("GetSensors") => {
        //     let result = core.run(client.get_sensors("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetSensorsCargo") => {
        //     let result = core.run(client.get_sensors_cargo("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetSensorsDoor") => {
        //     let result = core.run(client.get_sensors_door("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetSensorsHistory") => {
        //     let result = core.run(client.get_sensors_history("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetSensorsHumidity") => {
        //     let result = core.run(client.get_sensors_humidity("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("GetSensorsTemperature") => {
        //     let result = core.run(client.get_sensors_temperature("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("CreateTag") => {
        //     let result = core.run(client.create_tag("access_token_example".to_string(), ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("DeleteTagById") => {
            let result = core.run(client.delete_tag_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetAllTags") => {
            let result = core.run(client.get_all_tags("access_token_example".to_string(), Some(789)));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetTagById") => {
            let result = core.run(client.get_tag_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        // Disabled because there's no example.
        // Some("ModifyTagById") => {
        //     let result = core.run(client.modify_tag_by_id("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        // Disabled because there's no example.
        // Some("UpdateTagById") => {
        //     let result = core.run(client.update_tag_by_id("access_token_example".to_string(), 789, ???));
        //     println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
        //  },

        Some("DeleteUserById") => {
            let result = core.run(client.delete_user_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("GetUserById") => {
            let result = core.run(client.get_user_by_id("access_token_example".to_string(), 789));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ListUserRoles") => {
            let result = core.run(client.list_user_roles("access_token_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        Some("ListUsers") => {
            let result = core.run(client.list_users("access_token_example".to_string()));
            println!("{:?} (X-Span-ID: {:?})", result, (client.context() as &Has<XSpanIdString>).get().clone());
         },

        _ => {
            panic!("Invalid operation provided")
        }
    }
}

