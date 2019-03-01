-module(openapi_inline_response_200_5).

-export([encode/1]).

-export_type([openapi_inline_response_200_5/0]).

-type openapi_inline_response_200_5() ::
    #{ 'pagination' => openapi_pagination:openapi_pagination(),
       'vehicleStats' := list()
     }.

encode(#{ 'pagination' := Pagination,
          'vehicleStats' := VehicleStats
        }) ->
    #{ 'pagination' => Pagination,
       'vehicleStats' => VehicleStats
     }.
