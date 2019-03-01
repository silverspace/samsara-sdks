-module(openapi_drivers_summary_response).

-include("openapi.hrl").

-export([openapi_drivers_summary_response/0]).

-export([openapi_drivers_summary_response/1]).

-export_type([openapi_drivers_summary_response/0]).

-type openapi_drivers_summary_response() ::
  [ {'Summaries', list(openapi_drivers_summary_response_summaries:openapi_drivers_summary_response_summaries()) }
  ].


openapi_drivers_summary_response() ->
    openapi_drivers_summary_response([]).

openapi_drivers_summary_response(Fields) ->
  Default = [ {'Summaries', list(openapi_drivers_summary_response_summaries:openapi_drivers_summary_response_summaries()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

