-module(openapi_tag_modify_add).

-export([encode/1]).

-export_type([openapi_tag_modify_add/0]).

-type openapi_tag_modify_add() ::
    #{ 'assets' => list(),
       'sensors' => list(),
       'vehicles' => list(),
       'machines' => list(),
       'drivers' => list()
     }.

encode(#{ 'assets' := Assets,
          'sensors' := Sensors,
          'vehicles' := Vehicles,
          'machines' := Machines,
          'drivers' := Drivers
        }) ->
    #{ 'assets' => Assets,
       'sensors' => Sensors,
       'vehicles' => Vehicles,
       'machines' => Machines,
       'drivers' => Drivers
     }.
