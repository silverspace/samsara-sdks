-module(openapi_asset).

-include("openapi.hrl").

-export([openapi_asset/0]).

-export([openapi_asset/1]).

-export_type([openapi_asset/0]).

-type openapi_asset() ::
  [ {'assetSerialNumber', binary() }
  | {'cable', list(openapi_asset_cable:openapi_asset_cable()) }
  | {'engineHours', integer() }
  | {'id', integer() }
  | {'name', binary() }
  ].


openapi_asset() ->
    openapi_asset([]).

openapi_asset(Fields) ->
  Default = [ {'assetSerialNumber', binary() }
            , {'cable', list(openapi_asset_cable:openapi_asset_cable()) }
            , {'engineHours', integer() }
            , {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

