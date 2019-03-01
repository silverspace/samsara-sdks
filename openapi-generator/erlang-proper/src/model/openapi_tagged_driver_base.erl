-module(openapi_tagged_driver_base).

-include("openapi.hrl").

-export([openapi_tagged_driver_base/0]).

-export([openapi_tagged_driver_base/1]).

-export_type([openapi_tagged_driver_base/0]).

-type openapi_tagged_driver_base() ::
  [ {'id', integer() }
  ].


openapi_tagged_driver_base() ->
    openapi_tagged_driver_base([]).

openapi_tagged_driver_base(Fields) ->
  Default = [ {'id', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

