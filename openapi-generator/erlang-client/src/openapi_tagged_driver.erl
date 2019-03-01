-module(openapi_tagged_driver).

-export([encode/1]).

-export_type([openapi_tagged_driver/0]).

-type openapi_tagged_driver() ::
    #{ 'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
