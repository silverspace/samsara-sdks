-module(openapi_tag_create).

-include("openapi.hrl").

-export([openapi_tag_create/0]).

-export([openapi_tag_create/1]).

-export_type([openapi_tag_create/0]).

-type openapi_tag_create() ::
  [ {'assets', list(openapi_tagged_asset_base:openapi_tagged_asset_base()) }
  | {'drivers', list(openapi_tagged_driver_base:openapi_tagged_driver_base()) }
  | {'machines', list(openapi_tagged_machine_base:openapi_tagged_machine_base()) }
  | {'name', binary() }
  | {'parentTagId', integer() }
  | {'sensors', list(openapi_tagged_sensor_base:openapi_tagged_sensor_base()) }
  | {'vehicles', list(openapi_tagged_vehicle_base:openapi_tagged_vehicle_base()) }
  ].


openapi_tag_create() ->
    openapi_tag_create([]).

openapi_tag_create(Fields) ->
  Default = [ {'assets', list(openapi_tagged_asset_base:openapi_tagged_asset_base()) }
            , {'drivers', list(openapi_tagged_driver_base:openapi_tagged_driver_base()) }
            , {'machines', list(openapi_tagged_machine_base:openapi_tagged_machine_base()) }
            , {'name', binary() }
            , {'parentTagId', integer() }
            , {'sensors', list(openapi_tagged_sensor_base:openapi_tagged_sensor_base()) }
            , {'vehicles', list(openapi_tagged_vehicle_base:openapi_tagged_vehicle_base()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

