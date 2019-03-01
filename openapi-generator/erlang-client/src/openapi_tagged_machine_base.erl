-module(openapi_tagged_machine_base).

-export([encode/1]).

-export_type([openapi_tagged_machine_base/0]).

-type openapi_tagged_machine_base() ::
    #{ 'id' := integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
