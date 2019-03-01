-module(openapi_document_field_type_number_value_type_metadata).

-export([encode/1]).

-export_type([openapi_document_field_type_number_value_type_metadata/0]).

-type openapi_document_field_type_number_value_type_metadata() ::
    #{ 'numDecimalPlaces' => integer()
     }.

encode(#{ 'numDecimalPlaces' := NumDecimalPlaces
        }) ->
    #{ 'numDecimalPlaces' => NumDecimalPlaces
     }.
