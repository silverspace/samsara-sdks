-module(openapi_asset_current_location).

-include("openapi.hrl").

-export([openapi_asset_current_location/0]).

-export([openapi_asset_current_location/1]).

-export_type([openapi_asset_current_location/0]).

-type openapi_asset_current_location() ::
  [ {'latitude', float() }
  | {'location', binary() }
  | {'longitude', float() }
  | {'speedMilesPerHour', float() }
  | {'timeMs', integer() }
  ].


openapi_asset_current_location() ->
    openapi_asset_current_location([]).

openapi_asset_current_location(Fields) ->
  Default = [ {'latitude', float() }
            , {'location', binary() }
            , {'longitude', float() }
            , {'speedMilesPerHour', float() }
            , {'timeMs', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

