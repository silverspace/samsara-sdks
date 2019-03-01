-module(openapi_tag_metadata).

-export([encode/1]).

-export_type([openapi_tag_metadata/0]).

-type openapi_tag_metadata() ::
    #{ 'id' := integer(),
       'name' := binary()
     }.

encode(#{ 'id' := Id,
          'name' := Name
        }) ->
    #{ 'id' => Id,
       'name' => Name
     }.
