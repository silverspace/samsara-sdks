-module(openapi_dvir_list_response).

-include("openapi.hrl").

-export([openapi_dvir_list_response/0]).

-export([openapi_dvir_list_response/1]).

-export_type([openapi_dvir_list_response/0]).

-type openapi_dvir_list_response() ::
  [ {'dvirs', list(openapi_dvir_base:openapi_dvir_base()) }
  ].


openapi_dvir_list_response() ->
    openapi_dvir_list_response([]).

openapi_dvir_list_response(Fields) ->
  Default = [ {'dvirs', list(openapi_dvir_base:openapi_dvir_base()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

