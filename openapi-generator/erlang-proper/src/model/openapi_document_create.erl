-module(openapi_document_create).

-include("openapi.hrl").

-export([openapi_document_create/0]).

-export([openapi_document_create/1]).

-export_type([openapi_document_create/0]).

-type openapi_document_create() ::
  [ {'dispatchJobId', integer() }
  | {'notes', binary() }
  | {'documentTypeUuid', binary() }
  | {'fields', list(openapi_document_field:openapi_document_field()) }
  ].


openapi_document_create() ->
    openapi_document_create([]).

openapi_document_create(Fields) ->
  Default = [ {'dispatchJobId', integer() }
            , {'notes', binary() }
            , {'documentTypeUuid', binary() }
            , {'fields', list(openapi_document_field:openapi_document_field()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

