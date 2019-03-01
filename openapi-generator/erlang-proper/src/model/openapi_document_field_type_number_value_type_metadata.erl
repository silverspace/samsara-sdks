-module(openapi_document_field_type_number_value_type_metadata).

-include("openapi.hrl").

-export([openapi_document_field_type_number_value_type_metadata/0]).

-export([openapi_document_field_type_number_value_type_metadata/1]).

-export_type([openapi_document_field_type_number_value_type_metadata/0]).

-type openapi_document_field_type_number_value_type_metadata() ::
  [ {'numDecimalPlaces', integer() }
  ].


openapi_document_field_type_number_value_type_metadata() ->
    openapi_document_field_type_number_value_type_metadata([]).

openapi_document_field_type_number_value_type_metadata(Fields) ->
  Default = [ {'numDecimalPlaces', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

