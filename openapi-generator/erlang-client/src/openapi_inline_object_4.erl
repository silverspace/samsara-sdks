-module(openapi_inline_object_4).

-export([encode/1]).

-export_type([openapi_inline_object_4/0]).

-type openapi_inline_object_4() ::
    #{ 'reactivate' := boolean()
     }.

encode(#{ 'reactivate' := Reactivate
        }) ->
    #{ 'reactivate' => Reactivate
     }.
