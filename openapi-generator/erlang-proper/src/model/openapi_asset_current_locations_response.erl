-module(openapi_asset_current_locations_response).

-include("openapi.hrl").

-export([openapi_asset_current_locations_response/0]).

-export([openapi_asset_current_locations_response/1]).

-export_type([openapi_asset_current_locations_response/0]).

-type openapi_asset_current_locations_response() ::
  [ {'cable', list(openapi_asset_cable:openapi_asset_cable()) }
  | {'engineHours', integer() }
  | {'id', integer() }
  | {'location', list(openapi_asset_current_location:openapi_asset_current_location()) }
  | {'name', binary() }
  ].


openapi_asset_current_locations_response() ->
    openapi_asset_current_locations_response([]).

openapi_asset_current_locations_response(Fields) ->
  Default = [ {'cable', list(openapi_asset_cable:openapi_asset_cable()) }
            , {'engineHours', integer() }
            , {'id', integer() }
            , {'location', list(openapi_asset_current_location:openapi_asset_current_location()) }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

