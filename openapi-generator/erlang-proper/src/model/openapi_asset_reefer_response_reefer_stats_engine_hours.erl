-module(openapi_asset_reefer_response_reefer_stats_engine_hours).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_engine_hours/0]).

-export([openapi_asset_reefer_response_reefer_stats_engine_hours/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_engine_hours/0]).

-type openapi_asset_reefer_response_reefer_stats_engine_hours() ::
  [ {'engineHours', integer() }
  | {'changedAtMs', integer() }
  ].


openapi_asset_reefer_response_reefer_stats_engine_hours() ->
    openapi_asset_reefer_response_reefer_stats_engine_hours([]).

openapi_asset_reefer_response_reefer_stats_engine_hours(Fields) ->
  Default = [ {'engineHours', integer() }
            , {'changedAtMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

