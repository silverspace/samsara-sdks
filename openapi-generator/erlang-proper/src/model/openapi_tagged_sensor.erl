-module(openapi_tagged_sensor).

-include("openapi.hrl").

-export([openapi_tagged_sensor/0]).

-export([openapi_tagged_sensor/1]).

-export_type([openapi_tagged_sensor/0]).

-type openapi_tagged_sensor() ::
  [ {'id', integer() }
  | {'name', binary() }
  ].


openapi_tagged_sensor() ->
    openapi_tagged_sensor([]).

openapi_tagged_sensor(Fields) ->
  Default = [ {'id', integer() }
            , {'name', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

