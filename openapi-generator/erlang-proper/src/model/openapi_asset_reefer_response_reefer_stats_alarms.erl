-module(openapi_asset_reefer_response_reefer_stats_alarms).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_alarms/0]).

-export([openapi_asset_reefer_response_reefer_stats_alarms/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_alarms/0]).

-type openapi_asset_reefer_response_reefer_stats_alarms() ::
  [ {'severity', integer() }
  | {'operatorAction', binary() }
  | {'description', binary() }
  | {'alarmCode', integer() }
  ].


openapi_asset_reefer_response_reefer_stats_alarms() ->
    openapi_asset_reefer_response_reefer_stats_alarms([]).

openapi_asset_reefer_response_reefer_stats_alarms(Fields) ->
  Default = [ {'severity', integer() }
            , {'operatorAction', binary() }
            , {'description', binary() }
            , {'alarmCode', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

