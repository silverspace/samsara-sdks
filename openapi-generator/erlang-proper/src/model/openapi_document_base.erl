-module(openapi_document_base).

-include("openapi.hrl").

-export([openapi_document_base/0]).

-export([openapi_document_base/1]).

-export_type([openapi_document_base/0]).

-type openapi_document_base() ::
  [ {'dispatchJobId', integer() }
  | {'notes', binary() }
  ].


openapi_document_base() ->
    openapi_document_base([]).

openapi_document_base(Fields) ->
  Default = [ {'dispatchJobId', integer() }
            , {'notes', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

