-module(openapi_asset_reefer_response_reefer_stats_fuel_percentage).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_fuel_percentage/0]).

-export([openapi_asset_reefer_response_reefer_stats_fuel_percentage/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_fuel_percentage/0]).

-type openapi_asset_reefer_response_reefer_stats_fuel_percentage() ::
  [ {'fuelPercentage', integer() }
  | {'changedAtMs', integer() }
  ].


openapi_asset_reefer_response_reefer_stats_fuel_percentage() ->
    openapi_asset_reefer_response_reefer_stats_fuel_percentage([]).

openapi_asset_reefer_response_reefer_stats_fuel_percentage(Fields) ->
  Default = [ {'fuelPercentage', integer() }
            , {'changedAtMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

