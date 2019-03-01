-module(openapi_dvir_base_vehicle).

-include("openapi.hrl").

-export([openapi_dvir_base_vehicle/0]).

-export([openapi_dvir_base_vehicle/1]).

-export_type([openapi_dvir_base_vehicle/0]).

-type openapi_dvir_base_vehicle() ::
  [ {'name', binary() }
  | {'id', integer() }
  ].


openapi_dvir_base_vehicle() ->
    openapi_dvir_base_vehicle([]).

openapi_dvir_base_vehicle(Fields) ->
  Default = [ {'name', binary() }
            , {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

