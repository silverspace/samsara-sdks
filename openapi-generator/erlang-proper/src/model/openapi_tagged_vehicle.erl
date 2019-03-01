-module(openapi_tagged_vehicle).

-include("openapi.hrl").

-export([openapi_tagged_vehicle/0]).

-export([openapi_tagged_vehicle/1]).

-export_type([openapi_tagged_vehicle/0]).

-type openapi_tagged_vehicle() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tagged_vehicle() ->
    openapi_tagged_vehicle([]).

openapi_tagged_vehicle(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

