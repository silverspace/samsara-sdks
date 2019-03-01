%% basic handler
-module(openapi_fleet_handler).

%% Cowboy REST callbacks
-export([allowed_methods/2]).
-export([init/2]).
-export([allow_missing_post/2]).
-export([content_types_accepted/2]).
-export([content_types_provided/2]).
-export([delete_resource/2]).
-export([is_authorized/2]).
-export([known_content_type/2]).
-export([malformed_request/2]).
-export([valid_content_headers/2]).
-export([valid_entity_length/2]).

%% Handlers
-export([handle_request_json/2]).

-record(state, {
    operation_id :: openapi_api:operation_id(),
    logic_handler :: atom(),
    validator_state :: jesse_state:state(),
    context=#{} :: #{}
}).

-type state() :: state().

-spec init(Req :: cowboy_req:req(), Opts :: openapi_router:init_opts()) ->
    {cowboy_rest, Req :: cowboy_req:req(), State :: state()}.

init(Req, {Operations, LogicHandler, ValidatorState}) ->
    Method = cowboy_req:method(Req),
    OperationID = maps:get(Method, Operations, undefined),

    error_logger:info_msg("Attempt to process operation: ~p", [OperationID]),

    State = #state{
        operation_id = OperationID,
        logic_handler = LogicHandler,
        validator_state = ValidatorState
    },
    {cowboy_rest, Req, State}.

-spec allowed_methods(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: [binary()], Req :: cowboy_req:req(), State :: state()}.


allowed_methods(
    Req,
    State = #state{
        operation_id = 'AddFleetAddress'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'AddOrganizationAddresses'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateDispatchRoute'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateDriver'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateDriverDispatchRoute'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateDriverDocument'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateDvir'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'CreateVehicleDispatchRoute'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeactivateDriver'
    }
) ->
    {[<<"DELETE">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteDispatchRouteById'
    }
) ->
    {[<<"DELETE">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'DeleteOrganizationAddress'
    }
) ->
    {[<<"DELETE">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'FetchAllDispatchRoutes'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'FetchAllRouteJobUpdates'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetAllAssetCurrentLocations'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetAllAssets'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetAllDeactivatedDrivers'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetAssetLocation'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetAssetReefer'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDeactivatedDriverById'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDispatchRouteById'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDispatchRouteHistory'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDispatchRoutesByDriverId'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDispatchRoutesByVehicleId'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDriverById'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDriverDocumentTypesByOrgId'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDriverDocumentsByOrgId'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDriverSafetyScore'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetDvirs'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetDrivers'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetDriversHosDailyLogs'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetDriversSummary'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetHosAuthenticationLogs'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetHosLogs'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetHosLogsSummary'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetLocations'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetMaintenanceList'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetTrips'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetFleetVehicle'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrganizationAddress'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrganizationAddresses'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetOrganizationContact'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetVehicleHarshEvent'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetVehicleLocations'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetVehicleSafetyScore'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetVehicleStats'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'GetVehiclesLocations'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ListContacts'
    }
) ->
    {[<<"GET">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ListFleet'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'PatchFleetVehicle'
    }
) ->
    {[<<"PATCH">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'ReactivateDriverById'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateDispatchRouteById'
    }
) ->
    {[<<"PUT">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateOrganizationAddress'
    }
) ->
    {[<<"PATCH">>], Req, State};

allowed_methods(
    Req,
    State = #state{
        operation_id = 'UpdateVehicles'
    }
) ->
    {[<<"POST">>], Req, State};

allowed_methods(Req, State) ->
    {[], Req, State}.

-spec is_authorized(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: true | {false, AuthHeader :: iodata()},
        Req :: cowboy_req:req(),
        State :: state()
    }.
is_authorized(Req, State) ->
    {true, Req, State}.

-spec content_types_accepted(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: [{binary(), AcceptResource :: atom()}],
        Req :: cowboy_req:req(),
        State :: state()
    }.

content_types_accepted(Req, State) ->
    {[
        {<<"application/json">>, handle_request_json}
    ], Req, State}.

-spec valid_content_headers(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: boolean(), Req :: cowboy_req:req(), State :: state()}.

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AddFleetAddress'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'AddOrganizationAddresses'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateDispatchRoute'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateDriver'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateDriverDispatchRoute'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateDriverDocument'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateDvir'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'CreateVehicleDispatchRoute'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeactivateDriver'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteDispatchRouteById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'DeleteOrganizationAddress'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'FetchAllDispatchRoutes'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'FetchAllRouteJobUpdates'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetAllAssetCurrentLocations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetAllAssets'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetAllDeactivatedDrivers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetAssetLocation'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetAssetReefer'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDeactivatedDriverById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDispatchRouteById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDispatchRouteHistory'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDispatchRoutesByDriverId'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDispatchRoutesByVehicleId'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDriverById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDriverDocumentTypesByOrgId'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDriverDocumentsByOrgId'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDriverSafetyScore'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetDvirs'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetDrivers'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetDriversHosDailyLogs'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetDriversSummary'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetHosAuthenticationLogs'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetHosLogs'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetHosLogsSummary'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetLocations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetMaintenanceList'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetTrips'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetFleetVehicle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrganizationAddress'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrganizationAddresses'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetOrganizationContact'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetVehicleHarshEvent'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetVehicleLocations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetVehicleSafetyScore'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetVehicleStats'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'GetVehiclesLocations'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ListContacts'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ListFleet'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'PatchFleetVehicle'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'ReactivateDriverById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateDispatchRouteById'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateOrganizationAddress'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(
    Req0,
    State = #state{
        operation_id = 'UpdateVehicles'
    }
) ->
    Headers = [],
    {Result, Req} = validate_headers(Headers, Req0),
    {Result, Req, State};

valid_content_headers(Req, State) ->
    {false, Req, State}.

-spec content_types_provided(Req :: cowboy_req:req(), State :: state()) ->
    {
        Value :: [{binary(), ProvideResource :: atom()}],
        Req :: cowboy_req:req(),
        State :: state()
    }.

content_types_provided(Req, State) ->
    {[
        {<<"application/json">>, handle_request_json}
    ], Req, State}.

-spec malformed_request(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: false, Req :: cowboy_req:req(), State :: state()}.

malformed_request(Req, State) ->
    {false, Req, State}.

-spec allow_missing_post(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: false, Req :: cowboy_req:req(), State :: state()}.

allow_missing_post(Req, State) ->
    {false, Req, State}.

-spec delete_resource(Req :: cowboy_req:req(), State :: state()) ->
    processed_response().

delete_resource(Req, State) ->
    handle_request_json(Req, State).

-spec known_content_type(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: true, Req :: cowboy_req:req(), State :: state()}.

known_content_type(Req, State) ->
    {true, Req, State}.

-spec valid_entity_length(Req :: cowboy_req:req(), State :: state()) ->
    {Value :: true, Req :: cowboy_req:req(), State :: state()}.

valid_entity_length(Req, State) ->
    %% @TODO check the length
    {true, Req, State}.

%%%%
-type result_ok() :: {
    ok,
    {Status :: cowboy:http_status(), Headers :: cowboy:http_headers(), Body :: iodata()}
}.

-type result_error() :: {error, Reason :: any()}.

-type processed_response() :: {stop, cowboy_req:req(), state()}.

-spec process_response(result_ok() | result_error(), cowboy_req:req(), state()) ->
    processed_response().

process_response(Response, Req0, State = #state{operation_id = OperationID}) ->
    case Response of
        {ok, {Code, Headers, Body}} ->
            Req = cowboy_req:reply(Code, Headers, Body, Req0),
            {stop, Req, State};
        {error, Message} ->
            error_logger:error_msg("Unable to process request for ~p: ~p", [OperationID, Message]),

            Req = cowboy_req:reply(400, Req0),
            {stop, Req, State}
    end.

-spec handle_request_json(cowboy_req:req(), state()) -> {cowboy_req:resp_body(), cowboy_req:req(), state()}.

handle_request_json(
    Req0,
    State = #state{
        operation_id = OperationID,
        logic_handler = LogicHandler,
        validator_state = ValidatorState
    }
) ->
    case openapi_api:populate_request(OperationID, Req0, ValidatorState) of
        {ok, Populated, Req1} ->
            {Code, Headers, Body} = openapi_logic_handler:handle_request(
                LogicHandler,
                OperationID,
                Req1,
                Populated
            ),
            _ = openapi_api:validate_response(
                OperationID,
                Code,
                Body,
                ValidatorState
            ),
            PreparedBody = jsx:encode(Body),
            Response = {ok, {Code, Headers, PreparedBody}},
            process_response(Response, Req1, State);
        {error, Reason, Req1} ->
            process_response({error, Reason}, Req1, State)
    end.

validate_headers(_, Req) -> {true, Req}.
