-module(openapi_asset).

-export([encode/1]).

-export_type([openapi_asset/0]).

-type openapi_asset() ::
    #{ 'assetSerialNumber' => binary(),
       'cable' => list(),
       'engineHours' => integer(),
       'id' := integer(),
       'name' => binary()
     }.

encode(#{ 'assetSerialNumber' := AssetSerialNumber,
          'cable' := Cable,
          'engineHours' := EngineHours,
          'id' := Id,
          'name' := Name
        }) ->
    #{ 'assetSerialNumber' => AssetSerialNumber,
       'cable' => Cable,
       'engineHours' => EngineHours,
       'id' => Id,
       'name' => Name
     }.
