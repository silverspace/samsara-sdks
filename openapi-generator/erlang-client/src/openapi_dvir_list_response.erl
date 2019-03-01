-module(openapi_dvir_list_response).

-export([encode/1]).

-export_type([openapi_dvir_list_response/0]).

-type openapi_dvir_list_response() ::
    #{ 'dvirs' => list()
     }.

encode(#{ 'dvirs' := Dvirs
        }) ->
    #{ 'dvirs' => Dvirs
     }.
