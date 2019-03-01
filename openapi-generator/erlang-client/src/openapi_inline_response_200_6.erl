-module(openapi_inline_response_200_6).

-export([encode/1]).

-export_type([openapi_inline_response_200_6/0]).

-type openapi_inline_response_200_6() ::
    #{ 'dataInputs' => list()
     }.

encode(#{ 'dataInputs' := DataInputs
        }) ->
    #{ 'dataInputs' => DataInputs
     }.
