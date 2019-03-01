-module(openapi_document_field_type).

-include("openapi.hrl").

-export([openapi_document_field_type/0]).

-export([openapi_document_field_type/1]).

-export_type([openapi_document_field_type/0]).

-type openapi_document_field_type() ::
  [ {'label', binary() }
  | {'numberValueTypeMetadata', openapi_document_field_type_number_value_type_metadata:openapi_document_field_type_number_value_type_metadata() }
  | {'valueType', binary() }
  ].


openapi_document_field_type() ->
    openapi_document_field_type([]).

openapi_document_field_type(Fields) ->
  Default = [ {'label', binary() }
            , {'numberValueTypeMetadata', openapi_document_field_type_number_value_type_metadata:openapi_document_field_type_number_value_type_metadata() }
            , {'valueType', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

