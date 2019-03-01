-module(openapi_inline_response_200_7).

-export([encode/1]).

-export_type([openapi_inline_response_200_7/0]).

-type openapi_inline_response_200_7() ::
    #{ 'machines' => list()
     }.

encode(#{ 'machines' := Machines
        }) ->
    #{ 'machines' => Machines
     }.
