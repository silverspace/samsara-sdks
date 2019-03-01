-module(openapi_drivers_summary_response).

-export([encode/1]).

-export_type([openapi_drivers_summary_response/0]).

-type openapi_drivers_summary_response() ::
    #{ 'Summaries' => list()
     }.

encode(#{ 'Summaries' := Summaries
        }) ->
    #{ 'Summaries' => Summaries
     }.
