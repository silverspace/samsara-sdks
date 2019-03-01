-module(openapi_inline_response_200_2).

-export([encode/1]).

-export_type([openapi_inline_response_200_2/0]).

-type openapi_inline_response_200_2() ::
    #{ 'pagination' => openapi_pagination:openapi_pagination(),
       'groupId' => integer(),
       'vehicles' => list()
     }.

encode(#{ 'pagination' := Pagination,
          'groupId' := GroupId,
          'vehicles' := Vehicles
        }) ->
    #{ 'pagination' => Pagination,
       'groupId' => GroupId,
       'vehicles' => Vehicles
     }.
