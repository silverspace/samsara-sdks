-module(openapi_tagged_machine).

-export([encode/1]).

-export_type([openapi_tagged_machine/0]).

-type openapi_tagged_machine() ::
    #{ 'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
