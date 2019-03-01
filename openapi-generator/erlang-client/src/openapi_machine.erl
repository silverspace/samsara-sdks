-module(openapi_machine).

-export([encode/1]).

-export_type([openapi_machine/0]).

-type openapi_machine() ::
    #{ 'id' := integer(),
       'name' => binary(),
       'notes' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name,
          'notes' := Notes
        }) ->
    #{ 'id' => Id,
       'name' => Name,
       'notes' => Notes
     }.
