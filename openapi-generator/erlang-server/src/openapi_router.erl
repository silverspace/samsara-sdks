-module(openapi_router).

-export([get_paths/1]).

-type operations() :: #{
    Method :: binary() => openapi_api:operation_id()
}.

-type init_opts()  :: {
    Operations :: operations(),
    LogicHandler :: atom(),
    ValidatorState :: jesse_state:state()
}.

-export_type([init_opts/0]).

-spec get_paths(LogicHandler :: atom()) ->  [{'_',[{
    Path :: string(),
    Handler :: atom(),
    InitOpts :: init_opts()
}]}].

get_paths(LogicHandler) ->
    ValidatorState = prepare_validator(),
    PreparedPaths = maps:fold(
        fun(Path, #{operations := Operations, handler := Handler}, Acc) ->
            [{Path, Handler, Operations} | Acc]
        end,
        [],
        group_paths()
    ),
    [
        {'_',
            [{P, H, {O, LogicHandler, ValidatorState}} || {P, H, O} <- PreparedPaths]
        }
    ].

group_paths() ->
    maps:fold(
        fun(OperationID, #{path := Path, method := Method, handler := Handler}, Acc) ->
            case maps:find(Path, Acc) of
                {ok, PathInfo0 = #{operations := Operations0}} ->
                    Operations = Operations0#{Method => OperationID},
                    PathInfo = PathInfo0#{operations => Operations},
                    Acc#{Path => PathInfo};
                error ->
                    Operations = #{Method => OperationID},
                    PathInfo = #{handler => Handler, operations => Operations},
                    Acc#{Path => PathInfo}
            end
        end,
        #{},
        get_operations()
    ).

get_operations() ->
    #{ 
        'GetAllAssetCurrentLocations' => #{
            path => "/v1/fleet/assets/locations",
            method => <<"GET">>,
            handler => 'openapi_assets_handler'
        },
        'GetAllAssets' => #{
            path => "/v1/fleet/assets",
            method => <<"GET">>,
            handler => 'openapi_assets_handler'
        },
        'GetAssetLocation' => #{
            path => "/v1/fleet/assets/:asset_id/locations",
            method => <<"GET">>,
            handler => 'openapi_assets_handler'
        },
        'GetAssetReefer' => #{
            path => "/v1/fleet/assets/:asset_id/reefer",
            method => <<"GET">>,
            handler => 'openapi_assets_handler'
        },
        'CreateDriver' => #{
            path => "/v1/fleet/drivers/create",
            method => <<"POST">>,
            handler => 'openapi_drivers_handler'
        },
        'DeactivateDriver' => #{
            path => "/v1/fleet/drivers/:driver_id_or_external_id",
            method => <<"DELETE">>,
            handler => 'openapi_drivers_handler'
        },
        'GetAllDeactivatedDrivers' => #{
            path => "/v1/fleet/drivers/inactive",
            method => <<"GET">>,
            handler => 'openapi_drivers_handler'
        },
        'GetDeactivatedDriverById' => #{
            path => "/v1/fleet/drivers/inactive/:driver_id_or_external_id",
            method => <<"GET">>,
            handler => 'openapi_drivers_handler'
        },
        'GetDriverById' => #{
            path => "/v1/fleet/drivers/:driver_id_or_external_id",
            method => <<"GET">>,
            handler => 'openapi_drivers_handler'
        },
        'ReactivateDriverById' => #{
            path => "/v1/fleet/drivers/inactive/:driver_id_or_external_id",
            method => <<"PUT">>,
            handler => 'openapi_drivers_handler'
        },
        'AddFleetAddress' => #{
            path => "/v1/fleet/add_address",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'AddOrganizationAddresses' => #{
            path => "/v1/addresses",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'CreateDispatchRoute' => #{
            path => "/v1/fleet/dispatch/routes",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'CreateDriver' => #{
            path => "/v1/fleet/drivers/create",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'CreateDriverDispatchRoute' => #{
            path => "/v1/fleet/drivers/:driver_id/dispatch/routes",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'CreateDriverDocument' => #{
            path => "/v1/fleet/drivers/:driver_id/documents",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'CreateDvir' => #{
            path => "/v1/fleet/maintenance/dvirs",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'CreateVehicleDispatchRoute' => #{
            path => "/v1/fleet/vehicles/:vehicle_id/dispatch/routes",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'DeactivateDriver' => #{
            path => "/v1/fleet/drivers/:driver_id_or_external_id",
            method => <<"DELETE">>,
            handler => 'openapi_fleet_handler'
        },
        'DeleteDispatchRouteById' => #{
            path => "/v1/fleet/dispatch/routes/:route_id",
            method => <<"DELETE">>,
            handler => 'openapi_fleet_handler'
        },
        'DeleteOrganizationAddress' => #{
            path => "/v1/addresses/:addressId",
            method => <<"DELETE">>,
            handler => 'openapi_fleet_handler'
        },
        'FetchAllDispatchRoutes' => #{
            path => "/v1/fleet/dispatch/routes",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'FetchAllRouteJobUpdates' => #{
            path => "/v1/fleet/dispatch/routes/job_updates",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetAllAssetCurrentLocations' => #{
            path => "/v1/fleet/assets/locations",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetAllAssets' => #{
            path => "/v1/fleet/assets",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetAllDeactivatedDrivers' => #{
            path => "/v1/fleet/drivers/inactive",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetAssetLocation' => #{
            path => "/v1/fleet/assets/:asset_id/locations",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetAssetReefer' => #{
            path => "/v1/fleet/assets/:asset_id/reefer",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDeactivatedDriverById' => #{
            path => "/v1/fleet/drivers/inactive/:driver_id_or_external_id",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDispatchRouteById' => #{
            path => "/v1/fleet/dispatch/routes/:route_id",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDispatchRouteHistory' => #{
            path => "/v1/fleet/dispatch/routes/:route_id/history",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDispatchRoutesByDriverId' => #{
            path => "/v1/fleet/drivers/:driver_id/dispatch/routes",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDispatchRoutesByVehicleId' => #{
            path => "/v1/fleet/vehicles/:vehicle_id/dispatch/routes",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDriverById' => #{
            path => "/v1/fleet/drivers/:driver_id_or_external_id",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDriverDocumentTypesByOrgId' => #{
            path => "/v1/fleet/drivers/document_types",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDriverDocumentsByOrgId' => #{
            path => "/v1/fleet/drivers/documents",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDriverSafetyScore' => #{
            path => "/v1/fleet/drivers/:driverId/safety/score",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetDvirs' => #{
            path => "/v1/fleet/maintenance/dvirs",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetDrivers' => #{
            path => "/v1/fleet/drivers",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetDriversHosDailyLogs' => #{
            path => "/v1/fleet/drivers/:driver_id/hos_daily_logs",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetDriversSummary' => #{
            path => "/v1/fleet/drivers/summary",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetHosAuthenticationLogs' => #{
            path => "/v1/fleet/hos_authentication_logs",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetHosLogs' => #{
            path => "/v1/fleet/hos_logs",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetHosLogsSummary' => #{
            path => "/v1/fleet/hos_logs_summary",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetLocations' => #{
            path => "/v1/fleet/locations",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetMaintenanceList' => #{
            path => "/v1/fleet/maintenance/list",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetTrips' => #{
            path => "/v1/fleet/trips",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetFleetVehicle' => #{
            path => "/v1/fleet/vehicles/:vehicle_id_or_external_id",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetOrganizationAddress' => #{
            path => "/v1/addresses/:addressId",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetOrganizationAddresses' => #{
            path => "/v1/addresses",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetOrganizationContact' => #{
            path => "/v1/contacts/:contact_id",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetVehicleHarshEvent' => #{
            path => "/v1/fleet/vehicles/:vehicleId/safety/harsh_event",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetVehicleLocations' => #{
            path => "/v1/fleet/vehicles/:vehicle_id/locations",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetVehicleSafetyScore' => #{
            path => "/v1/fleet/vehicles/:vehicleId/safety/score",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetVehicleStats' => #{
            path => "/v1/fleet/vehicles/stats",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'GetVehiclesLocations' => #{
            path => "/v1/fleet/vehicles/locations",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'ListContacts' => #{
            path => "/v1/contacts",
            method => <<"GET">>,
            handler => 'openapi_fleet_handler'
        },
        'ListFleet' => #{
            path => "/v1/fleet/list",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'PatchFleetVehicle' => #{
            path => "/v1/fleet/vehicles/:vehicle_id_or_external_id",
            method => <<"PATCH">>,
            handler => 'openapi_fleet_handler'
        },
        'ReactivateDriverById' => #{
            path => "/v1/fleet/drivers/inactive/:driver_id_or_external_id",
            method => <<"PUT">>,
            handler => 'openapi_fleet_handler'
        },
        'UpdateDispatchRouteById' => #{
            path => "/v1/fleet/dispatch/routes/:route_id",
            method => <<"PUT">>,
            handler => 'openapi_fleet_handler'
        },
        'UpdateOrganizationAddress' => #{
            path => "/v1/addresses/:addressId",
            method => <<"PATCH">>,
            handler => 'openapi_fleet_handler'
        },
        'UpdateVehicles' => #{
            path => "/v1/fleet/set_data",
            method => <<"POST">>,
            handler => 'openapi_fleet_handler'
        },
        'GetAllDataInputs' => #{
            path => "/v1/industrial/data",
            method => <<"GET">>,
            handler => 'openapi_industrial_handler'
        },
        'GetDataInput' => #{
            path => "/v1/industrial/data/:data_input_id",
            method => <<"GET">>,
            handler => 'openapi_industrial_handler'
        },
        'GetMachines' => #{
            path => "/v1/machines/list",
            method => <<"POST">>,
            handler => 'openapi_industrial_handler'
        },
        'GetMachinesHistory' => #{
            path => "/v1/machines/history",
            method => <<"POST">>,
            handler => 'openapi_industrial_handler'
        },
        'CreateDispatchRoute' => #{
            path => "/v1/fleet/dispatch/routes",
            method => <<"POST">>,
            handler => 'openapi_routes_handler'
        },
        'CreateDriverDispatchRoute' => #{
            path => "/v1/fleet/drivers/:driver_id/dispatch/routes",
            method => <<"POST">>,
            handler => 'openapi_routes_handler'
        },
        'CreateVehicleDispatchRoute' => #{
            path => "/v1/fleet/vehicles/:vehicle_id/dispatch/routes",
            method => <<"POST">>,
            handler => 'openapi_routes_handler'
        },
        'DeleteDispatchRouteById' => #{
            path => "/v1/fleet/dispatch/routes/:route_id",
            method => <<"DELETE">>,
            handler => 'openapi_routes_handler'
        },
        'FetchAllDispatchRoutes' => #{
            path => "/v1/fleet/dispatch/routes",
            method => <<"GET">>,
            handler => 'openapi_routes_handler'
        },
        'FetchAllRouteJobUpdates' => #{
            path => "/v1/fleet/dispatch/routes/job_updates",
            method => <<"GET">>,
            handler => 'openapi_routes_handler'
        },
        'GetDispatchRouteById' => #{
            path => "/v1/fleet/dispatch/routes/:route_id",
            method => <<"GET">>,
            handler => 'openapi_routes_handler'
        },
        'GetDispatchRouteHistory' => #{
            path => "/v1/fleet/dispatch/routes/:route_id/history",
            method => <<"GET">>,
            handler => 'openapi_routes_handler'
        },
        'GetDispatchRoutesByDriverId' => #{
            path => "/v1/fleet/drivers/:driver_id/dispatch/routes",
            method => <<"GET">>,
            handler => 'openapi_routes_handler'
        },
        'GetDispatchRoutesByVehicleId' => #{
            path => "/v1/fleet/vehicles/:vehicle_id/dispatch/routes",
            method => <<"GET">>,
            handler => 'openapi_routes_handler'
        },
        'UpdateDispatchRouteById' => #{
            path => "/v1/fleet/dispatch/routes/:route_id",
            method => <<"PUT">>,
            handler => 'openapi_routes_handler'
        },
        'GetDriverSafetyScore' => #{
            path => "/v1/fleet/drivers/:driverId/safety/score",
            method => <<"GET">>,
            handler => 'openapi_safety_handler'
        },
        'GetVehicleHarshEvent' => #{
            path => "/v1/fleet/vehicles/:vehicleId/safety/harsh_event",
            method => <<"GET">>,
            handler => 'openapi_safety_handler'
        },
        'GetVehicleSafetyScore' => #{
            path => "/v1/fleet/vehicles/:vehicleId/safety/score",
            method => <<"GET">>,
            handler => 'openapi_safety_handler'
        },
        'GetSensors' => #{
            path => "/v1/sensors/list",
            method => <<"POST">>,
            handler => 'openapi_sensors_handler'
        },
        'GetSensorsCargo' => #{
            path => "/v1/sensors/cargo",
            method => <<"POST">>,
            handler => 'openapi_sensors_handler'
        },
        'GetSensorsDoor' => #{
            path => "/v1/sensors/door",
            method => <<"POST">>,
            handler => 'openapi_sensors_handler'
        },
        'GetSensorsHistory' => #{
            path => "/v1/sensors/history",
            method => <<"POST">>,
            handler => 'openapi_sensors_handler'
        },
        'GetSensorsHumidity' => #{
            path => "/v1/sensors/humidity",
            method => <<"POST">>,
            handler => 'openapi_sensors_handler'
        },
        'GetSensorsTemperature' => #{
            path => "/v1/sensors/temperature",
            method => <<"POST">>,
            handler => 'openapi_sensors_handler'
        },
        'CreateTag' => #{
            path => "/v1/tags",
            method => <<"POST">>,
            handler => 'openapi_tags_handler'
        },
        'DeleteTagById' => #{
            path => "/v1/tags/:tag_id",
            method => <<"DELETE">>,
            handler => 'openapi_tags_handler'
        },
        'GetAllTags' => #{
            path => "/v1/tags",
            method => <<"GET">>,
            handler => 'openapi_tags_handler'
        },
        'GetTagById' => #{
            path => "/v1/tags/:tag_id",
            method => <<"GET">>,
            handler => 'openapi_tags_handler'
        },
        'ModifyTagById' => #{
            path => "/v1/tags/:tag_id",
            method => <<"PATCH">>,
            handler => 'openapi_tags_handler'
        },
        'UpdateTagById' => #{
            path => "/v1/tags/:tag_id",
            method => <<"PUT">>,
            handler => 'openapi_tags_handler'
        },
        'DeleteUserById' => #{
            path => "/v1/users/:userId",
            method => <<"DELETE">>,
            handler => 'openapi_users_handler'
        },
        'GetUserById' => #{
            path => "/v1/users/:userId",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'ListUserRoles' => #{
            path => "/v1/user_roles",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        },
        'ListUsers' => #{
            path => "/v1/users",
            method => <<"GET">>,
            handler => 'openapi_users_handler'
        }
    }.

prepare_validator() ->
    R = jsx:decode(element(2, file:read_file(get_openapi_path()))),
    jesse_state:new(R, [{default_schema_ver, <<"http://json-schema.org/draft-04/schema#">>}]).


get_openapi_path() ->
    {ok, AppName} = application:get_application(?MODULE),
    filename:join(openapi_utils:priv_dir(AppName), "openapi.json").


