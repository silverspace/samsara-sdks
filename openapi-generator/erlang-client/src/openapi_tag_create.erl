-module(openapi_tag_create).

-export([encode/1]).

-export_type([openapi_tag_create/0]).

-type openapi_tag_create() ::
    #{ 'assets' => list(),
       'drivers' => list(),
       'machines' => list(),
       'name' := binary(),
       'parentTagId' => integer(),
       'sensors' => list(),
       'vehicles' => list()
     }.

encode(#{ 'assets' := Assets,
          'drivers' := Drivers,
          'machines' := Machines,
          'name' := Name,
          'parentTagId' := ParentTagId,
          'sensors' := Sensors,
          'vehicles' := Vehicles
        }) ->
    #{ 'assets' => Assets,
       'drivers' => Drivers,
       'machines' => Machines,
       'name' => Name,
       'parentTagId' => ParentTagId,
       'sensors' => Sensors,
       'vehicles' => Vehicles
     }.
