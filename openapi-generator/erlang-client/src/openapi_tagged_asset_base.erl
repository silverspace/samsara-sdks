-module(openapi_tagged_asset_base).

-export([encode/1]).

-export_type([openapi_tagged_asset_base/0]).

-type openapi_tagged_asset_base() ::
    #{ 'id' := integer()
     }.

encode(#{ 'id' := Id
        }) ->
    #{ 'id' => Id
     }.
