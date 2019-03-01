-module(openapi_document_type).

-include("openapi.hrl").

-export([openapi_document_type/0]).

-export([openapi_document_type/1]).

-export_type([openapi_document_type/0]).

-type openapi_document_type() ::
  [ {'fieldTypes', list(list()) }
  | {'name', binary() }
  | {'orgId', integer() }
  | {'uuid', binary() }
  ].


openapi_document_type() ->
    openapi_document_type([]).

openapi_document_type(Fields) ->
  Default = [ {'fieldTypes', list(list()) }
            , {'name', binary() }
            , {'orgId', integer() }
            , {'uuid', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

