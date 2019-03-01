-module(openapi_tag_modify_delete).

-include("openapi.hrl").

-export([openapi_tag_modify_delete/0]).

-export([openapi_tag_modify_delete/1]).

-export_type([openapi_tag_modify_delete/0]).

-type openapi_tag_modify_delete() ::
  [ {'assets', list(openapi_tagged_asset_base:openapi_tagged_asset_base()) }
  | {'sensors', list(openapi_tagged_sensor_base:openapi_tagged_sensor_base()) }
  | {'vehicles', list(openapi_tagged_vehicle_base:openapi_tagged_vehicle_base()) }
  | {'machines', list(openapi_tagged_machine_base:openapi_tagged_machine_base()) }
  | {'drivers', list(openapi_tagged_driver_base:openapi_tagged_driver_base()) }
  ].


openapi_tag_modify_delete() ->
    openapi_tag_modify_delete([]).

openapi_tag_modify_delete(Fields) ->
  Default = [ {'assets', list(openapi_tagged_asset_base:openapi_tagged_asset_base()) }
            , {'sensors', list(openapi_tagged_sensor_base:openapi_tagged_sensor_base()) }
            , {'vehicles', list(openapi_tagged_vehicle_base:openapi_tagged_vehicle_base()) }
            , {'machines', list(openapi_tagged_machine_base:openapi_tagged_machine_base()) }
            , {'drivers', list(openapi_tagged_driver_base:openapi_tagged_driver_base()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

