-module(openapi_asset_reefer_response_reefer_stats_set_point).

-include("openapi.hrl").

-export([openapi_asset_reefer_response_reefer_stats_set_point/0]).

-export([openapi_asset_reefer_response_reefer_stats_set_point/1]).

-export_type([openapi_asset_reefer_response_reefer_stats_set_point/0]).

-type openapi_asset_reefer_response_reefer_stats_set_point() ::
  [ {'tempInMilliC', integer() }
  | {'changedAtMs', integer() }
  ].


openapi_asset_reefer_response_reefer_stats_set_point() ->
    openapi_asset_reefer_response_reefer_stats_set_point([]).

openapi_asset_reefer_response_reefer_stats_set_point(Fields) ->
  Default = [ {'tempInMilliC', integer() }
            , {'changedAtMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

