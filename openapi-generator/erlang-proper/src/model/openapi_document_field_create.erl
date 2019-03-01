-module(openapi_document_field_create).

-include("openapi.hrl").

-export([openapi_document_field_create/0]).

-export([openapi_document_field_create/1]).

-export_type([openapi_document_field_create/0]).

-type openapi_document_field_create() ::
  [ {'numberValue', float() }
  | {'photoValue', list(openapi_document_field_create_photo_value:openapi_document_field_create_photo_value()) }
  | {'stringValue', binary() }
  | {'valueType', binary() }
  ].


openapi_document_field_create() ->
    openapi_document_field_create([]).

openapi_document_field_create(Fields) ->
  Default = [ {'numberValue', float() }
            , {'photoValue', list(openapi_document_field_create_photo_value:openapi_document_field_create_photo_value()) }
            , {'stringValue', binary() }
            , {'valueType', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

