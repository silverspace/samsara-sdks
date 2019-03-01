-module(openapi_tagged_address).

-export([encode/1]).

-export_type([openapi_tagged_address/0]).

-type openapi_tagged_address() ::
    #{ 'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
