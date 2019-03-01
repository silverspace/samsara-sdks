-module(openapi_inline_object).

-export([encode/1]).

-export_type([openapi_inline_object/0]).

-type openapi_inline_object() ::
    #{ 'addresses' := list()
     }.

encode(#{ 'addresses' := Addresses
        }) ->
    #{ 'addresses' => Addresses
     }.
