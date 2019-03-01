-module(openapi_api).

-export([request_params/1]).
-export([request_param_info/2]).
-export([populate_request/3]).
-export([validate_response/4]).
%% exported to silence openapi complains
-export([get_value/3, validate_response_body/4]).

-type operation_id() :: atom().
-type request_param() :: atom().

-export_type([operation_id/0]).

-spec request_params(OperationID :: operation_id()) -> [Param :: request_param()].


request_params('GetAllAssetCurrentLocations') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetAllAssets') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetAssetLocation') ->
    [
        'access_token',
        'asset_id',
        'startMs',
        'endMs'
    ];

request_params('GetAssetReefer') ->
    [
        'access_token',
        'asset_id',
        'startMs',
        'endMs'
    ];


request_params('CreateDriver') ->
    [
        'access_token',
        'DriverForCreate'
    ];

request_params('DeactivateDriver') ->
    [
        'access_token',
        'driver_id_or_external_id'
    ];

request_params('GetAllDeactivatedDrivers') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetDeactivatedDriverById') ->
    [
        'access_token',
        'driver_id_or_external_id'
    ];

request_params('GetDriverById') ->
    [
        'access_token',
        'driver_id_or_external_id'
    ];

request_params('ReactivateDriverById') ->
    [
        'access_token',
        'driver_id_or_external_id',
        'InlineObject4'
    ];


request_params('AddFleetAddress') ->
    [
        'access_token',
        'InlineObject2'
    ];

request_params('AddOrganizationAddresses') ->
    [
        'access_token',
        'InlineObject'
    ];

request_params('CreateDispatchRoute') ->
    [
        'access_token',
        'DispatchRouteCreate'
    ];

request_params('CreateDriver') ->
    [
        'access_token',
        'DriverForCreate'
    ];

request_params('CreateDriverDispatchRoute') ->
    [
        'access_token',
        'driver_id',
        'DispatchRouteCreate'
    ];

request_params('CreateDriverDocument') ->
    [
        'access_token',
        'driver_id',
        'DocumentCreate'
    ];

request_params('CreateDvir') ->
    [
        'access_token',
        'InlineObject12'
    ];

request_params('CreateVehicleDispatchRoute') ->
    [
        'access_token',
        'vehicle_id',
        'DispatchRouteCreate'
    ];

request_params('DeactivateDriver') ->
    [
        'access_token',
        'driver_id_or_external_id'
    ];

request_params('DeleteDispatchRouteById') ->
    [
        'access_token',
        'route_id'
    ];

request_params('DeleteOrganizationAddress') ->
    [
        'access_token',
        'addressId'
    ];

request_params('FetchAllDispatchRoutes') ->
    [
        'access_token',
        'group_id',
        'end_time',
        'duration'
    ];

request_params('FetchAllRouteJobUpdates') ->
    [
        'access_token',
        'group_id',
        'sequence_id',
        'include'
    ];

request_params('GetAllAssetCurrentLocations') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetAllAssets') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetAllDeactivatedDrivers') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetAssetLocation') ->
    [
        'access_token',
        'asset_id',
        'startMs',
        'endMs'
    ];

request_params('GetAssetReefer') ->
    [
        'access_token',
        'asset_id',
        'startMs',
        'endMs'
    ];

request_params('GetDeactivatedDriverById') ->
    [
        'access_token',
        'driver_id_or_external_id'
    ];

request_params('GetDispatchRouteById') ->
    [
        'access_token',
        'route_id'
    ];

request_params('GetDispatchRouteHistory') ->
    [
        'access_token',
        'route_id',
        'start_time',
        'end_time'
    ];

request_params('GetDispatchRoutesByDriverId') ->
    [
        'access_token',
        'driver_id',
        'end_time',
        'duration'
    ];

request_params('GetDispatchRoutesByVehicleId') ->
    [
        'access_token',
        'vehicle_id',
        'end_time',
        'duration'
    ];

request_params('GetDriverById') ->
    [
        'access_token',
        'driver_id_or_external_id'
    ];

request_params('GetDriverDocumentTypesByOrgId') ->
    [
    ];

request_params('GetDriverDocumentsByOrgId') ->
    [
        'access_token',
        'endMs',
        'durationMs'
    ];

request_params('GetDriverSafetyScore') ->
    [
        'driverId',
        'access_token',
        'startMs',
        'endMs'
    ];

request_params('GetDvirs') ->
    [
        'access_token',
        'end_ms',
        'duration_ms',
        'group_id'
    ];

request_params('GetFleetDrivers') ->
    [
        'access_token',
        'InlineObject3'
    ];

request_params('GetFleetDriversHosDailyLogs') ->
    [
        'access_token',
        'driver_id',
        'InlineObject6'
    ];

request_params('GetFleetDriversSummary') ->
    [
        'access_token',
        'InlineObject5',
        'snap_to_day_bounds'
    ];

request_params('GetFleetHosAuthenticationLogs') ->
    [
        'access_token',
        'InlineObject7'
    ];

request_params('GetFleetHosLogs') ->
    [
        'access_token',
        'InlineObject8'
    ];

request_params('GetFleetHosLogsSummary') ->
    [
        'access_token',
        'InlineObject9'
    ];

request_params('GetFleetLocations') ->
    [
        'access_token',
        'InlineObject11'
    ];

request_params('GetFleetMaintenanceList') ->
    [
        'access_token',
        'InlineObject13'
    ];

request_params('GetFleetTrips') ->
    [
        'access_token',
        'InlineObject15'
    ];

request_params('GetFleetVehicle') ->
    [
        'access_token',
        'vehicle_id_or_external_id'
    ];

request_params('GetOrganizationAddress') ->
    [
        'access_token',
        'addressId'
    ];

request_params('GetOrganizationAddresses') ->
    [
        'access_token'
    ];

request_params('GetOrganizationContact') ->
    [
        'access_token',
        'contact_id'
    ];

request_params('GetVehicleHarshEvent') ->
    [
        'vehicleId',
        'access_token',
        'timestamp'
    ];

request_params('GetVehicleLocations') ->
    [
        'access_token',
        'vehicle_id',
        'startMs',
        'endMs'
    ];

request_params('GetVehicleSafetyScore') ->
    [
        'vehicleId',
        'access_token',
        'startMs',
        'endMs'
    ];

request_params('GetVehicleStats') ->
    [
        'access_token',
        'startMs',
        'endMs',
        'series',
        'tagIds',
        'startingAfter',
        'endingBefore',
        'limit'
    ];

request_params('GetVehiclesLocations') ->
    [
        'access_token',
        'startMs',
        'endMs'
    ];

request_params('ListContacts') ->
    [
        'access_token'
    ];

request_params('ListFleet') ->
    [
        'access_token',
        'InlineObject10',
        'startingAfter',
        'endingBefore',
        'limit'
    ];

request_params('PatchFleetVehicle') ->
    [
        'access_token',
        'vehicle_id_or_external_id',
        'InlineObject16'
    ];

request_params('ReactivateDriverById') ->
    [
        'access_token',
        'driver_id_or_external_id',
        'InlineObject4'
    ];

request_params('UpdateDispatchRouteById') ->
    [
        'access_token',
        'route_id',
        'DispatchRoute'
    ];

request_params('UpdateOrganizationAddress') ->
    [
        'access_token',
        'addressId',
        'InlineObject1'
    ];

request_params('UpdateVehicles') ->
    [
        'access_token',
        'InlineObject14'
    ];


request_params('GetAllDataInputs') ->
    [
        'access_token',
        'group_id',
        'startMs',
        'endMs'
    ];

request_params('GetDataInput') ->
    [
        'access_token',
        'data_input_id',
        'startMs',
        'endMs'
    ];

request_params('GetMachines') ->
    [
        'access_token',
        'InlineObject18'
    ];

request_params('GetMachinesHistory') ->
    [
        'access_token',
        'InlineObject17'
    ];


request_params('CreateDispatchRoute') ->
    [
        'access_token',
        'DispatchRouteCreate'
    ];

request_params('CreateDriverDispatchRoute') ->
    [
        'access_token',
        'driver_id',
        'DispatchRouteCreate'
    ];

request_params('CreateVehicleDispatchRoute') ->
    [
        'access_token',
        'vehicle_id',
        'DispatchRouteCreate'
    ];

request_params('DeleteDispatchRouteById') ->
    [
        'access_token',
        'route_id'
    ];

request_params('FetchAllDispatchRoutes') ->
    [
        'access_token',
        'group_id',
        'end_time',
        'duration'
    ];

request_params('FetchAllRouteJobUpdates') ->
    [
        'access_token',
        'group_id',
        'sequence_id',
        'include'
    ];

request_params('GetDispatchRouteById') ->
    [
        'access_token',
        'route_id'
    ];

request_params('GetDispatchRouteHistory') ->
    [
        'access_token',
        'route_id',
        'start_time',
        'end_time'
    ];

request_params('GetDispatchRoutesByDriverId') ->
    [
        'access_token',
        'driver_id',
        'end_time',
        'duration'
    ];

request_params('GetDispatchRoutesByVehicleId') ->
    [
        'access_token',
        'vehicle_id',
        'end_time',
        'duration'
    ];

request_params('UpdateDispatchRouteById') ->
    [
        'access_token',
        'route_id',
        'DispatchRoute'
    ];


request_params('GetDriverSafetyScore') ->
    [
        'driverId',
        'access_token',
        'startMs',
        'endMs'
    ];

request_params('GetVehicleHarshEvent') ->
    [
        'vehicleId',
        'access_token',
        'timestamp'
    ];

request_params('GetVehicleSafetyScore') ->
    [
        'vehicleId',
        'access_token',
        'startMs',
        'endMs'
    ];


request_params('GetSensors') ->
    [
        'access_token',
        'InlineObject23'
    ];

request_params('GetSensorsCargo') ->
    [
        'access_token',
        'InlineObject19'
    ];

request_params('GetSensorsDoor') ->
    [
        'access_token',
        'InlineObject20'
    ];

request_params('GetSensorsHistory') ->
    [
        'access_token',
        'InlineObject21'
    ];

request_params('GetSensorsHumidity') ->
    [
        'access_token',
        'InlineObject22'
    ];

request_params('GetSensorsTemperature') ->
    [
        'access_token',
        'InlineObject24'
    ];


request_params('CreateTag') ->
    [
        'access_token',
        'TagCreate'
    ];

request_params('DeleteTagById') ->
    [
        'access_token',
        'tag_id'
    ];

request_params('GetAllTags') ->
    [
        'access_token',
        'group_id'
    ];

request_params('GetTagById') ->
    [
        'access_token',
        'tag_id'
    ];

request_params('ModifyTagById') ->
    [
        'access_token',
        'tag_id',
        'TagModify'
    ];

request_params('UpdateTagById') ->
    [
        'access_token',
        'tag_id',
        'TagUpdate'
    ];


request_params('DeleteUserById') ->
    [
        'access_token',
        'userId'
    ];

request_params('GetUserById') ->
    [
        'access_token',
        'userId'
    ];

request_params('ListUserRoles') ->
    [
        'access_token'
    ];

request_params('ListUsers') ->
    [
        'access_token'
    ];

request_params(_) ->
    error(unknown_operation).

-type rule() ::
    {type, 'binary'} |
    {type, 'integer'} |
    {type, 'float'} |
    {type, 'binary'} |
    {type, 'boolean'} |
    {type, 'date'} |
    {type, 'datetime'} |
    {enum, [atom()]} |
    {max, Max :: number()} |
    {exclusive_max, Max :: number()} |
    {min, Min :: number()} |
    {exclusive_min, Min :: number()} |
    {max_length, MaxLength :: integer()} |
    {min_length, MaxLength :: integer()} |
    {pattern, Pattern :: string()} |
    schema |
    required |
    not_required.

-spec request_param_info(OperationID :: operation_id(), Name :: request_param()) -> #{
    source => qs_val | binding | header | body,
    rules => [rule()]
}.



request_param_info('GetAllAssetCurrentLocations', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllAssetCurrentLocations', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAllAssets', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllAssets', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAssetLocation', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAssetLocation', 'asset_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetLocation', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetLocation', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'asset_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('CreateDriver', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDriver', 'DriverForCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('DeactivateDriver', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeactivateDriver', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllDeactivatedDrivers', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllDeactivatedDrivers', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDeactivatedDriverById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDeactivatedDriverById', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverById', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ReactivateDriverById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ReactivateDriverById', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ReactivateDriverById', 'InlineObject4') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('AddFleetAddress', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddFleetAddress', 'InlineObject2') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('AddOrganizationAddresses', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('AddOrganizationAddresses', 'InlineObject') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateDispatchRoute', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDispatchRoute', 'DispatchRouteCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateDriver', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDriver', 'DriverForCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateDriverDispatchRoute', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDriverDispatchRoute', 'driver_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('CreateDriverDispatchRoute', 'DispatchRouteCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateDriverDocument', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDriverDocument', 'driver_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('CreateDriverDocument', 'DocumentCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateDvir', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDvir', 'InlineObject12') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateVehicleDispatchRoute', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateVehicleDispatchRoute', 'vehicle_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('CreateVehicleDispatchRoute', 'DispatchRouteCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('DeactivateDriver', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeactivateDriver', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteDispatchRouteById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteDispatchRouteById', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('DeleteOrganizationAddress', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteOrganizationAddress', 'addressId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'duration') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'sequence_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'include') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetAllAssetCurrentLocations', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllAssetCurrentLocations', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAllAssets', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllAssets', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAllDeactivatedDrivers', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllDeactivatedDrivers', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAssetLocation', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAssetLocation', 'asset_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetLocation', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetLocation', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'asset_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAssetReefer', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDeactivatedDriverById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDeactivatedDriverById', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRouteById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRouteById', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'start_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'driver_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'duration') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'vehicle_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'duration') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDriverById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverById', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverDocumentsByOrgId', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverDocumentsByOrgId', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDriverDocumentsByOrgId', 'durationMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDriverSafetyScore', 'driverId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDriverSafetyScore', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverSafetyScore', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDriverSafetyScore', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDvirs', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDvirs', 'end_ms') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDvirs', 'duration_ms') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDvirs', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetFleetDrivers', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetDrivers', 'InlineObject3') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetDriversHosDailyLogs', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetDriversHosDailyLogs', 'driver_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetFleetDriversHosDailyLogs', 'InlineObject6') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetDriversSummary', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetDriversSummary', 'InlineObject5') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetDriversSummary', 'snap_to_day_bounds') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'boolean'},
            not_required
        ]
    };

request_param_info('GetFleetHosAuthenticationLogs', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetHosAuthenticationLogs', 'InlineObject7') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetHosLogs', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetHosLogs', 'InlineObject8') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetHosLogsSummary', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetHosLogsSummary', 'InlineObject9') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetLocations', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetLocations', 'InlineObject11') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetMaintenanceList', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetMaintenanceList', 'InlineObject13') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetTrips', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetTrips', 'InlineObject15') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetFleetVehicle', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetFleetVehicle', 'vehicle_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetOrganizationAddress', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetOrganizationAddress', 'addressId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetOrganizationAddresses', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetOrganizationContact', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetOrganizationContact', 'contact_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleHarshEvent', 'vehicleId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleHarshEvent', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehicleHarshEvent', 'timestamp') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleLocations', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehicleLocations', 'vehicle_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleLocations', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleLocations', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'vehicleId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleStats', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehicleStats', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleStats', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleStats', 'series') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            {enum, ['engineState', 'auxInput1', 'auxInput2'] },
            not_required
        ]
    };

request_param_info('GetVehicleStats', 'tagIds') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetVehicleStats', 'startingAfter') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetVehicleStats', 'endingBefore') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetVehicleStats', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetVehiclesLocations', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehiclesLocations', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehiclesLocations', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('ListContacts', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ListFleet', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ListFleet', 'InlineObject10') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ListFleet', 'startingAfter') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('ListFleet', 'endingBefore') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('ListFleet', 'limit') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('PatchFleetVehicle', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchFleetVehicle', 'vehicle_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('PatchFleetVehicle', 'InlineObject16') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('ReactivateDriverById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ReactivateDriverById', 'driver_id_or_external_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ReactivateDriverById', 'InlineObject4') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('UpdateDispatchRouteById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateDispatchRouteById', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateDispatchRouteById', 'DispatchRoute') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('UpdateOrganizationAddress', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateOrganizationAddress', 'addressId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateOrganizationAddress', 'InlineObject1') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('UpdateVehicles', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateVehicles', 'InlineObject14') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('GetAllDataInputs', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllDataInputs', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAllDataInputs', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetAllDataInputs', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDataInput', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDataInput', 'data_input_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDataInput', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDataInput', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetMachines', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetMachines', 'InlineObject18') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetMachinesHistory', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetMachinesHistory', 'InlineObject17') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('CreateDispatchRoute', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDispatchRoute', 'DispatchRouteCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateDriverDispatchRoute', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateDriverDispatchRoute', 'driver_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('CreateDriverDispatchRoute', 'DispatchRouteCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('CreateVehicleDispatchRoute', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateVehicleDispatchRoute', 'vehicle_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('CreateVehicleDispatchRoute', 'DispatchRouteCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('DeleteDispatchRouteById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteDispatchRouteById', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllDispatchRoutes', 'duration') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'sequence_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('FetchAllRouteJobUpdates', 'include') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            not_required
        ]
    };

request_param_info('GetDispatchRouteById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRouteById', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'start_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRouteHistory', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'driver_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByDriverId', 'duration') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'vehicle_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'end_time') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetDispatchRoutesByVehicleId', 'duration') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('UpdateDispatchRouteById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateDispatchRouteById', 'route_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateDispatchRouteById', 'DispatchRoute') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('GetDriverSafetyScore', 'driverId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDriverSafetyScore', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetDriverSafetyScore', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetDriverSafetyScore', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleHarshEvent', 'vehicleId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleHarshEvent', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehicleHarshEvent', 'timestamp') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'vehicleId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'startMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetVehicleSafetyScore', 'endMs') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            required
        ]
    };


request_param_info('GetSensors', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetSensors', 'InlineObject23') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetSensorsCargo', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetSensorsCargo', 'InlineObject19') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetSensorsDoor', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetSensorsDoor', 'InlineObject20') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetSensorsHistory', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetSensorsHistory', 'InlineObject21') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetSensorsHumidity', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetSensorsHumidity', 'InlineObject22') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('GetSensorsTemperature', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetSensorsTemperature', 'InlineObject24') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('CreateTag', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('CreateTag', 'TagCreate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('DeleteTagById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteTagById', 'tag_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetAllTags', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetAllTags', 'group_id') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'integer'},
            not_required
        ]
    };

request_param_info('GetTagById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetTagById', 'tag_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('ModifyTagById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ModifyTagById', 'tag_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('ModifyTagById', 'TagModify') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };

request_param_info('UpdateTagById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('UpdateTagById', 'tag_id') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('UpdateTagById', 'TagUpdate') ->
    #{
        source =>   body,
        rules => [
            schema,
            required
        ]
    };


request_param_info('DeleteUserById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('DeleteUserById', 'userId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('GetUserById', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('GetUserById', 'userId') ->
    #{
        source =>  binding ,
        rules => [
            {type, 'integer'},
            required
        ]
    };

request_param_info('ListUserRoles', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info('ListUsers', 'access_token') ->
    #{
        source => qs_val  ,
        rules => [
            {type, 'binary'},
            required
        ]
    };

request_param_info(OperationID, Name) ->
    error({unknown_param, OperationID, Name}).

-spec populate_request(
    OperationID :: operation_id(),
    Req :: cowboy_req:req(),
    ValidatorState :: jesse_state:state()
) ->
    {ok, Model :: #{}, Req :: cowboy_req:req()} |
    {error, Reason :: any(), Req :: cowboy_req:req()}.

populate_request(OperationID, Req, ValidatorState) ->
    Params = request_params(OperationID),
    populate_request_params(OperationID, Params, Req, ValidatorState, #{}).

populate_request_params(_, [], Req, _, Model) ->
    {ok, Model, Req};

populate_request_params(OperationID, [FieldParams | T], Req0, ValidatorState, Model) ->
    case populate_request_param(OperationID, FieldParams, Req0, ValidatorState) of
        {ok, K, V, Req} ->
            populate_request_params(OperationID, T, Req, ValidatorState, maps:put(K, V, Model));
        Error ->
            Error
    end.

populate_request_param(OperationID, Name, Req0, ValidatorState) ->
    #{rules := Rules, source := Source} = request_param_info(OperationID, Name),
    case get_value(Source, Name, Req0) of
        {error, Reason, Req} ->
            {error, Reason, Req};
        {Value, Req} ->
            case prepare_param(Rules, Name, Value, ValidatorState) of
                {ok, Result} -> {ok, Name, Result, Req};
                {error, Reason} ->
                    {error, Reason, Req}
            end
    end.

-spec validate_response(
    OperationID :: operation_id(),
    Code :: 200..599,
    Body :: jesse:json_term(),
    ValidatorState :: jesse_state:state()
) -> ok | no_return().


validate_response('GetAllAssetCurrentLocations', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_1', 'inline_response_200_1', Body, ValidatorState);
validate_response('GetAllAssetCurrentLocations', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAllAssets', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200', 'inline_response_200', Body, ValidatorState);
validate_response('GetAllAssets', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAssetLocation', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('GetAssetLocation', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAssetReefer', 200, Body, ValidatorState) ->
    validate_response_body('AssetReeferResponse', 'AssetReeferResponse', Body, ValidatorState);
validate_response('GetAssetReefer', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('CreateDriver', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('CreateDriver', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('DeactivateDriver', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeactivateDriver', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAllDeactivatedDrivers', 200, Body, ValidatorState) ->
    validate_response_body('list', 'Driver', Body, ValidatorState);
validate_response('GetAllDeactivatedDrivers', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDeactivatedDriverById', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('GetDeactivatedDriverById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDriverById', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('GetDriverById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ReactivateDriverById', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('ReactivateDriverById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('AddFleetAddress', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('AddFleetAddress', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('AddOrganizationAddresses', 200, Body, ValidatorState) ->
    validate_response_body('list', 'Address', Body, ValidatorState);
validate_response('AddOrganizationAddresses', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateDispatchRoute', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('CreateDispatchRoute', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateDriver', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('CreateDriver', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateDriverDispatchRoute', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('CreateDriverDispatchRoute', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateDriverDocument', 200, Body, ValidatorState) ->
    validate_response_body('Document', 'Document', Body, ValidatorState);
validate_response('CreateDriverDocument', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateDvir', 200, Body, ValidatorState) ->
    validate_response_body('DvirBase', 'DvirBase', Body, ValidatorState);
validate_response('CreateDvir', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateVehicleDispatchRoute', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('CreateVehicleDispatchRoute', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('DeactivateDriver', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeactivateDriver', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('DeleteDispatchRouteById', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteDispatchRouteById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('DeleteOrganizationAddress', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteOrganizationAddress', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('FetchAllDispatchRoutes', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DispatchRoute', Body, ValidatorState);
validate_response('FetchAllDispatchRoutes', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('FetchAllRouteJobUpdates', 200, Body, ValidatorState) ->
    validate_response_body('allRouteJobUpdates', 'allRouteJobUpdates', Body, ValidatorState);
validate_response('FetchAllRouteJobUpdates', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAllAssetCurrentLocations', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_1', 'inline_response_200_1', Body, ValidatorState);
validate_response('GetAllAssetCurrentLocations', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAllAssets', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200', 'inline_response_200', Body, ValidatorState);
validate_response('GetAllAssets', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAllDeactivatedDrivers', 200, Body, ValidatorState) ->
    validate_response_body('list', 'Driver', Body, ValidatorState);
validate_response('GetAllDeactivatedDrivers', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAssetLocation', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('GetAssetLocation', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAssetReefer', 200, Body, ValidatorState) ->
    validate_response_body('AssetReeferResponse', 'AssetReeferResponse', Body, ValidatorState);
validate_response('GetAssetReefer', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDeactivatedDriverById', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('GetDeactivatedDriverById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRouteById', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('GetDispatchRouteById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRouteHistory', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRouteHistory', 'DispatchRouteHistory', Body, ValidatorState);
validate_response('GetDispatchRouteHistory', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRoutesByDriverId', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DispatchRoute', Body, ValidatorState);
validate_response('GetDispatchRoutesByDriverId', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRoutesByVehicleId', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DispatchRoute', Body, ValidatorState);
validate_response('GetDispatchRoutesByVehicleId', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDriverById', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('GetDriverById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDriverDocumentTypesByOrgId', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DocumentType', Body, ValidatorState);
validate_response('GetDriverDocumentTypesByOrgId', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDriverDocumentsByOrgId', 200, Body, ValidatorState) ->
    validate_response_body('list', 'Document', Body, ValidatorState);
validate_response('GetDriverDocumentsByOrgId', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDriverSafetyScore', 200, Body, ValidatorState) ->
    validate_response_body('DriverSafetyScoreResponse', 'DriverSafetyScoreResponse', Body, ValidatorState);
validate_response('GetDriverSafetyScore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDvirs', 200, Body, ValidatorState) ->
    validate_response_body('DvirListResponse', 'DvirListResponse', Body, ValidatorState);
validate_response('GetDvirs', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetDrivers', 200, Body, ValidatorState) ->
    validate_response_body('DriversResponse', 'DriversResponse', Body, ValidatorState);
validate_response('GetFleetDrivers', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetDriversHosDailyLogs', 200, Body, ValidatorState) ->
    validate_response_body('DriverDailyLogResponse', 'DriverDailyLogResponse', Body, ValidatorState);
validate_response('GetFleetDriversHosDailyLogs', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetDriversSummary', 200, Body, ValidatorState) ->
    validate_response_body('DriversSummaryResponse', 'DriversSummaryResponse', Body, ValidatorState);
validate_response('GetFleetDriversSummary', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetHosAuthenticationLogs', 200, Body, ValidatorState) ->
    validate_response_body('HosAuthenticationLogsResponse', 'HosAuthenticationLogsResponse', Body, ValidatorState);
validate_response('GetFleetHosAuthenticationLogs', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetHosLogs', 200, Body, ValidatorState) ->
    validate_response_body('HosLogsResponse', 'HosLogsResponse', Body, ValidatorState);
validate_response('GetFleetHosLogs', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetHosLogsSummary', 200, Body, ValidatorState) ->
    validate_response_body('HosLogsSummaryResponse', 'HosLogsSummaryResponse', Body, ValidatorState);
validate_response('GetFleetHosLogsSummary', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetLocations', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_3', 'inline_response_200_3', Body, ValidatorState);
validate_response('GetFleetLocations', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetMaintenanceList', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_4', 'inline_response_200_4', Body, ValidatorState);
validate_response('GetFleetMaintenanceList', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetTrips', 200, Body, ValidatorState) ->
    validate_response_body('TripResponse', 'TripResponse', Body, ValidatorState);
validate_response('GetFleetTrips', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetFleetVehicle', 200, Body, ValidatorState) ->
    validate_response_body('FleetVehicleResponse', 'FleetVehicleResponse', Body, ValidatorState);
validate_response('GetFleetVehicle', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetOrganizationAddress', 200, Body, ValidatorState) ->
    validate_response_body('Address', 'Address', Body, ValidatorState);
validate_response('GetOrganizationAddress', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetOrganizationAddresses', 200, Body, ValidatorState) ->
    validate_response_body('list', 'Address', Body, ValidatorState);
validate_response('GetOrganizationAddresses', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetOrganizationContact', 200, Body, ValidatorState) ->
    validate_response_body('Contact', 'Contact', Body, ValidatorState);
validate_response('GetOrganizationContact', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehicleHarshEvent', 200, Body, ValidatorState) ->
    validate_response_body('VehicleHarshEventResponse', 'VehicleHarshEventResponse', Body, ValidatorState);
validate_response('GetVehicleHarshEvent', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehicleLocations', 200, Body, ValidatorState) ->
    validate_response_body('list', 'FleetVehicleLocation', Body, ValidatorState);
validate_response('GetVehicleLocations', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehicleSafetyScore', 200, Body, ValidatorState) ->
    validate_response_body('VehicleSafetyScoreResponse', 'VehicleSafetyScoreResponse', Body, ValidatorState);
validate_response('GetVehicleSafetyScore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehicleStats', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_5', 'inline_response_200_5', Body, ValidatorState);
validate_response('GetVehicleStats', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehiclesLocations', 200, Body, ValidatorState) ->
    validate_response_body('list', 'object', Body, ValidatorState);
validate_response('GetVehiclesLocations', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ListContacts', 200, Body, ValidatorState) ->
    validate_response_body('list', 'Contact', Body, ValidatorState);
validate_response('ListContacts', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ListFleet', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_2', 'inline_response_200_2', Body, ValidatorState);
validate_response('ListFleet', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('PatchFleetVehicle', 200, Body, ValidatorState) ->
    validate_response_body('FleetVehicleResponse', 'FleetVehicleResponse', Body, ValidatorState);
validate_response('PatchFleetVehicle', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ReactivateDriverById', 200, Body, ValidatorState) ->
    validate_response_body('Driver', 'Driver', Body, ValidatorState);
validate_response('ReactivateDriverById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('UpdateDispatchRouteById', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('UpdateDispatchRouteById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('UpdateOrganizationAddress', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('UpdateOrganizationAddress', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('UpdateVehicles', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('UpdateVehicles', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GetAllDataInputs', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_6', 'inline_response_200_6', Body, ValidatorState);
validate_response('GetAllDataInputs', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDataInput', 200, Body, ValidatorState) ->
    validate_response_body('DataInputHistoryResponse', 'DataInputHistoryResponse', Body, ValidatorState);
validate_response('GetDataInput', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetMachines', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_7', 'inline_response_200_7', Body, ValidatorState);
validate_response('GetMachines', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetMachinesHistory', 200, Body, ValidatorState) ->
    validate_response_body('MachineHistoryResponse', 'MachineHistoryResponse', Body, ValidatorState);
validate_response('GetMachinesHistory', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('CreateDispatchRoute', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('CreateDispatchRoute', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateDriverDispatchRoute', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('CreateDriverDispatchRoute', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('CreateVehicleDispatchRoute', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('CreateVehicleDispatchRoute', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('DeleteDispatchRouteById', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteDispatchRouteById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('FetchAllDispatchRoutes', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DispatchRoute', Body, ValidatorState);
validate_response('FetchAllDispatchRoutes', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('FetchAllRouteJobUpdates', 200, Body, ValidatorState) ->
    validate_response_body('allRouteJobUpdates', 'allRouteJobUpdates', Body, ValidatorState);
validate_response('FetchAllRouteJobUpdates', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRouteById', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('GetDispatchRouteById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRouteHistory', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRouteHistory', 'DispatchRouteHistory', Body, ValidatorState);
validate_response('GetDispatchRouteHistory', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRoutesByDriverId', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DispatchRoute', Body, ValidatorState);
validate_response('GetDispatchRoutesByDriverId', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetDispatchRoutesByVehicleId', 200, Body, ValidatorState) ->
    validate_response_body('list', 'DispatchRoute', Body, ValidatorState);
validate_response('GetDispatchRoutesByVehicleId', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('UpdateDispatchRouteById', 200, Body, ValidatorState) ->
    validate_response_body('DispatchRoute', 'DispatchRoute', Body, ValidatorState);
validate_response('UpdateDispatchRouteById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GetDriverSafetyScore', 200, Body, ValidatorState) ->
    validate_response_body('DriverSafetyScoreResponse', 'DriverSafetyScoreResponse', Body, ValidatorState);
validate_response('GetDriverSafetyScore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehicleHarshEvent', 200, Body, ValidatorState) ->
    validate_response_body('VehicleHarshEventResponse', 'VehicleHarshEventResponse', Body, ValidatorState);
validate_response('GetVehicleHarshEvent', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetVehicleSafetyScore', 200, Body, ValidatorState) ->
    validate_response_body('VehicleSafetyScoreResponse', 'VehicleSafetyScoreResponse', Body, ValidatorState);
validate_response('GetVehicleSafetyScore', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('GetSensors', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_8', 'inline_response_200_8', Body, ValidatorState);
validate_response('GetSensors', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetSensorsCargo', 200, Body, ValidatorState) ->
    validate_response_body('CargoResponse', 'CargoResponse', Body, ValidatorState);
validate_response('GetSensorsCargo', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetSensorsDoor', 200, Body, ValidatorState) ->
    validate_response_body('DoorResponse', 'DoorResponse', Body, ValidatorState);
validate_response('GetSensorsDoor', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetSensorsHistory', 200, Body, ValidatorState) ->
    validate_response_body('SensorHistoryResponse', 'SensorHistoryResponse', Body, ValidatorState);
validate_response('GetSensorsHistory', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetSensorsHumidity', 200, Body, ValidatorState) ->
    validate_response_body('HumidityResponse', 'HumidityResponse', Body, ValidatorState);
validate_response('GetSensorsHumidity', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetSensorsTemperature', 200, Body, ValidatorState) ->
    validate_response_body('TemperatureResponse', 'TemperatureResponse', Body, ValidatorState);
validate_response('GetSensorsTemperature', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('CreateTag', 200, Body, ValidatorState) ->
    validate_response_body('Tag', 'Tag', Body, ValidatorState);
validate_response('CreateTag', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('DeleteTagById', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteTagById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetAllTags', 200, Body, ValidatorState) ->
    validate_response_body('inline_response_200_9', 'inline_response_200_9', Body, ValidatorState);
validate_response('GetAllTags', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetTagById', 200, Body, ValidatorState) ->
    validate_response_body('Tag', 'Tag', Body, ValidatorState);
validate_response('GetTagById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ModifyTagById', 200, Body, ValidatorState) ->
    validate_response_body('Tag', 'Tag', Body, ValidatorState);
validate_response('ModifyTagById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('UpdateTagById', 200, Body, ValidatorState) ->
    validate_response_body('Tag', 'Tag', Body, ValidatorState);
validate_response('UpdateTagById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response('DeleteUserById', 200, Body, ValidatorState) ->
    validate_response_body('', '', Body, ValidatorState);
validate_response('DeleteUserById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('GetUserById', 200, Body, ValidatorState) ->
    validate_response_body('User', 'User', Body, ValidatorState);
validate_response('GetUserById', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ListUserRoles', 200, Body, ValidatorState) ->
    validate_response_body('list', 'UserRole', Body, ValidatorState);
validate_response('ListUserRoles', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);

validate_response('ListUsers', 200, Body, ValidatorState) ->
    validate_response_body('list', 'User', Body, ValidatorState);
validate_response('ListUsers', 0, Body, ValidatorState) ->
    validate_response_body('binary', 'string', Body, ValidatorState);


validate_response(_OperationID, _Code, _Body, _ValidatorState) ->
    ok.

validate_response_body('list', ReturnBaseType, Body, ValidatorState) ->
    [
        validate(schema, ReturnBaseType, Item, ValidatorState)
    || Item <- Body];

validate_response_body(_, ReturnBaseType, Body, ValidatorState) ->
    validate(schema, ReturnBaseType, Body, ValidatorState).

%%%
validate(Rule = required, Name, Value, _ValidatorState) ->
    case Value of
        undefined -> validation_error(Rule, Name);
        _ -> ok
    end;

validate(not_required, _Name, _Value, _ValidatorState) ->
    ok;

validate(_, _Name, undefined, _ValidatorState) ->
    ok;

validate(Rule = {type, 'integer'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_int(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'float'}, Name, Value, _ValidatorState) ->
    try
        {ok, openapi_utils:to_float(Value)}
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'binary'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(_Rule = {type, 'boolean'}, _Name, Value, _ValidatorState) when is_boolean(Value) ->
    {ok, Value};

validate(Rule = {type, 'boolean'}, Name, Value, _ValidatorState) ->
    V = binary_to_lower(Value),
    try
        case binary_to_existing_atom(V, utf8) of
            B when is_boolean(B) -> {ok, B};
            _ -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {type, 'date'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {type, 'datetime'}, Name, Value, _ValidatorState) ->
    case is_binary(Value) of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {enum, Values}, Name, Value, _ValidatorState) ->
    try
        FormattedValue = erlang:binary_to_existing_atom(Value, utf8),
        case lists:member(FormattedValue, Values) of
            true -> {ok, FormattedValue};
            false -> validation_error(Rule, Name)
        end
    catch
        error:badarg ->
            validation_error(Rule, Name)
    end;

validate(Rule = {max, Max}, Name, Value, _ValidatorState) ->
    case Value =< Max of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_max, ExclusiveMax}, Name, Value, _ValidatorState) ->
    case Value > ExclusiveMax of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min, Min}, Name, Value, _ValidatorState) ->
    case Value >= Min of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {exclusive_min, ExclusiveMin}, Name, Value, _ValidatorState) ->
    case Value =< ExclusiveMin of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {max_length, MaxLength}, Name, Value, _ValidatorState) ->
    case size(Value) =< MaxLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {min_length, MinLength}, Name, Value, _ValidatorState) ->
    case size(Value) >= MinLength of
        true -> ok;
        false -> validation_error(Rule, Name)
    end;

validate(Rule = {pattern, Pattern}, Name, Value, _ValidatorState) ->
    {ok, MP} = re:compile(Pattern),
    case re:run(Value, MP) of
        {match, _} -> ok;
        _ -> validation_error(Rule, Name)
    end;

validate(Rule = schema, Name, Value, ValidatorState) ->
    Definition =  list_to_binary("#/components/schemas/" ++ openapi_utils:to_list(Name)),
    try
        _ = validate_with_schema(Value, Definition, ValidatorState),
        ok
    catch
        throw:[{schema_invalid, _, Error} | _] ->
            Info = #{
                type => schema_invalid,
                error => Error
            },
            validation_error(Rule, Name, Info);
        throw:[{data_invalid, Schema, Error, _, Path} | _] ->
            Info = #{
                type => data_invalid,
                error => Error,
                schema => Schema,
                path => Path
            },
            validation_error(Rule, Name, Info)
    end;

validate(Rule, Name, _Value, _ValidatorState) ->
    error_logger:info_msg("Can't validate ~p with ~p", [Name, Rule]),
    error({unknown_validation_rule, Rule}).

-spec validation_error(Rule :: any(), Name :: any()) -> no_return().

validation_error(ViolatedRule, Name) ->
    validation_error(ViolatedRule, Name, #{}).

-spec validation_error(Rule :: any(), Name :: any(), Info :: #{}) -> no_return().

validation_error(ViolatedRule, Name, Info) ->
    throw({wrong_param, Name, ViolatedRule, Info}).

-spec get_value(body | qs_val | header | binding, Name :: any(), Req0 :: cowboy_req:req()) ->
    {Value :: any(), Req :: cowboy_req:req()} | 
    {error, Reason :: any(), Req :: cowboy_req:req()}.
get_value(body, _Name, Req0) ->
    {ok, Body, Req} = cowboy_req:read_body(Req0),
    case prepare_body(Body) of
        {error, Reason} ->
            {error, Reason, Req};
        Value ->
            {Value, Req}
    end;

get_value(qs_val, Name, Req) ->
    QS = cowboy_req:parse_qs(Req),
    Value = openapi_utils:get_opt(openapi_utils:to_qs(Name), QS),
    {Value, Req};

get_value(header, Name, Req) ->
    Headers = cowboy_req:headers(Req),
    Value =  maps:get(openapi_utils:to_header(Name), Headers, undefined),
    {Value, Req};

get_value(binding, Name, Req) ->
    Value = cowboy_req:binding(openapi_utils:to_binding(Name), Req),
    {Value, Req}.

prepare_body(Body) ->
    case Body of
        <<"">> -> <<"">>;
        _ ->
            try
                jsx:decode(Body, [return_maps]) 
            catch
              error:_ ->
                {error, {invalid_body, not_json, Body}}
            end
    end.

validate_with_schema(Body, Definition, ValidatorState) ->
    jesse_schema_validator:validate_with_state(
        [{<<"$ref">>, Definition}],
        Body,
        ValidatorState
    ).

prepare_param(Rules, Name, Value, ValidatorState) ->
    try
        Result = lists:foldl(
            fun(Rule, Acc) ->
                case validate(Rule, Name, Acc, ValidatorState) of
                    ok -> Acc;
                    {ok, Prepared} -> Prepared
                end
            end,
            Value,
            Rules
        ),
        {ok, Result}
    catch
        throw:Reason ->
            {error, Reason}
    end.

binary_to_lower(V) when is_binary(V) ->
    list_to_binary(string:to_lower(openapi_utils:to_list(V))).
