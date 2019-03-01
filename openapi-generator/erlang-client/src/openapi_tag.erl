-module(openapi_tag).

-export([encode/1]).

-export_type([openapi_tag/0]).

-type openapi_tag() ::
    #{ 'addresses' => list(),
       'assets' => list(),
       'drivers' => list(),
       'groupId' => integer(),
       'id' := integer(),
       'machines' => list(),
       'name' := binary(),
       'parentTagId' => integer(),
       'sensors' => list(),
       'vehicles' => list()
     }.

encode(#{ 'addresses' := Addresses,
          'assets' := Assets,
          'drivers' := Drivers,
          'groupId' := GroupId,
          'id' := Id,
          'machines' := Machines,
          'name' := Name,
          'parentTagId' := ParentTagId,
          'sensors' := Sensors,
          'vehicles' := Vehicles
        }) ->
    #{ 'addresses' => Addresses,
       'assets' => Assets,
       'drivers' => Drivers,
       'groupId' => GroupId,
       'id' => Id,
       'machines' => Machines,
       'name' => Name,
       'parentTagId' => ParentTagId,
       'sensors' => Sensors,
       'vehicles' => Vehicles
     }.
