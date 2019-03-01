-module(openapi_tag).

-include("openapi.hrl").

-export([openapi_tag/0]).

-export([openapi_tag/1]).

-export_type([openapi_tag/0]).

-type openapi_tag() ::
  [ {'addresses', list(openapi_tagged_address:openapi_tagged_address()) }
  | {'assets', list(openapi_tagged_asset:openapi_tagged_asset()) }
  | {'drivers', list(openapi_tagged_driver:openapi_tagged_driver()) }
  | {'groupId', integer() }
  | {'id', integer() }
  | {'machines', list(openapi_tagged_machine:openapi_tagged_machine()) }
  | {'name', binary() }
  | {'parentTagId', integer() }
  | {'sensors', list(openapi_tagged_sensor:openapi_tagged_sensor()) }
  | {'vehicles', list(openapi_tagged_vehicle:openapi_tagged_vehicle()) }
  ].


openapi_tag() ->
    openapi_tag([]).

openapi_tag(Fields) ->
  Default = [ {'addresses', list(openapi_tagged_address:openapi_tagged_address()) }
            , {'assets', list(openapi_tagged_asset:openapi_tagged_asset()) }
            , {'drivers', list(openapi_tagged_driver:openapi_tagged_driver()) }
            , {'groupId', integer() }
            , {'id', integer() }
            , {'machines', list(openapi_tagged_machine:openapi_tagged_machine()) }
            , {'name', binary() }
            , {'parentTagId', integer() }
            , {'sensors', list(openapi_tagged_sensor:openapi_tagged_sensor()) }
            , {'vehicles', list(openapi_tagged_vehicle:openapi_tagged_vehicle()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

