-module(openapi_asset_reefer_response_reefer_stats).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats/0]).

-export([openapi_asset_reefer_response_reefer_stats/1]).

-export_type([openapi_asset_reefer_response_reefer_stats/0]).

-type openapi_asset_reefer_response_reefer_stats() ::
  [ {'fuelPercentage', list(openapi_asset_reefer_response_reefer_stats_fuel_percentage:openapi_asset_reefer_response_reefer_stats_fuel_percentage()) }
  | {'powerStatus', list(openapi_asset_reefer_response_reefer_stats_power_status:openapi_asset_reefer_response_reefer_stats_power_status()) }
  | {'engineHours', list(openapi_asset_reefer_response_reefer_stats_engine_hours:openapi_asset_reefer_response_reefer_stats_engine_hours()) }
  | {'setPoint', list(openapi_asset_reefer_response_reefer_stats_set_point:openapi_asset_reefer_response_reefer_stats_set_point()) }
  | {'returnAirTemp', list(openapi_asset_reefer_response_reefer_stats_return_air_temp:openapi_asset_reefer_response_reefer_stats_return_air_temp()) }
  | {'alarms', list(openapi_asset_reefer_response_reefer_stats_alarms_1:openapi_asset_reefer_response_reefer_stats_alarms_1()) }
  ].


openapi_asset_reefer_response_reefer_stats() ->
    openapi_asset_reefer_response_reefer_stats([]).

openapi_asset_reefer_response_reefer_stats(Fields) ->
  Default = [ {'fuelPercentage', list(openapi_asset_reefer_response_reefer_stats_fuel_percentage:openapi_asset_reefer_response_reefer_stats_fuel_percentage()) }
            , {'powerStatus', list(openapi_asset_reefer_response_reefer_stats_power_status:openapi_asset_reefer_response_reefer_stats_power_status()) }
            , {'engineHours', list(openapi_asset_reefer_response_reefer_stats_engine_hours:openapi_asset_reefer_response_reefer_stats_engine_hours()) }
            , {'setPoint', list(openapi_asset_reefer_response_reefer_stats_set_point:openapi_asset_reefer_response_reefer_stats_set_point()) }
            , {'returnAirTemp', list(openapi_asset_reefer_response_reefer_stats_return_air_temp:openapi_asset_reefer_response_reefer_stats_return_air_temp()) }
            , {'alarms', list(openapi_asset_reefer_response_reefer_stats_alarms_1:openapi_asset_reefer_response_reefer_stats_alarms_1()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

