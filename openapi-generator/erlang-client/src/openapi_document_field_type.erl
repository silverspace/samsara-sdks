-module(openapi_document_field_type).

-export([encode/1]).

-export_type([openapi_document_field_type/0]).

-type openapi_document_field_type() ::
    #{ 'label' := binary(),
       'numberValueTypeMetadata' => openapi_document_field_type_number_value_type_metadata:openapi_document_field_type_number_value_type_metadata(),
       'valueType' := binary()
     }.

encode(#{ 'label' := Label,
          'numberValueTypeMetadata' := NumberValueTypeMetadata,
          'valueType' := ValueType
        }) ->
    #{ 'label' => Label,
       'numberValueTypeMetadata' => NumberValueTypeMetadata,
       'valueType' => ValueType
     }.
