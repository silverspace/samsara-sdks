-module(openapi_dvir_base_trailer_defects).

-include("openapi.hrl").

-export([openapi_dvir_base_trailer_defects/0]).

-export([openapi_dvir_base_trailer_defects/1]).

-export_type([openapi_dvir_base_trailer_defects/0]).

-type openapi_dvir_base_trailer_defects() ::
  [ {'comment', binary() }
  | {'defectType', binary() }
  ].


openapi_dvir_base_trailer_defects() ->
    openapi_dvir_base_trailer_defects([]).

openapi_dvir_base_trailer_defects(Fields) ->
  Default = [ {'comment', binary() }
            , {'defectType', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

