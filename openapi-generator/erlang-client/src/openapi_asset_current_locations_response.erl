-module(openapi_asset_current_locations_response).

-export([encode/1]).

-export_type([openapi_asset_current_locations_response/0]).

-type openapi_asset_current_locations_response() ::
    #{ 'cable' => list(),
       'engineHours' => integer(),
       'id' := integer(),
       'location' => list(),
       'name' => binary()
     }.

encode(#{ 'cable' := Cable,
          'engineHours' := EngineHours,
          'id' := Id,
          'location' := Location,
          'name' := Name
        }) ->
    #{ 'cable' => Cable,
       'engineHours' => EngineHours,
       'id' => Id,
       'location' => Location,
       'name' => Name
     }.
