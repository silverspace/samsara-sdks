-module(openapi_document_field_create).

-export([encode/1]).

-export_type([openapi_document_field_create/0]).

-type openapi_document_field_create() ::
    #{ 'numberValue' => float(),
       'photoValue' => list(),
       'stringValue' => binary(),
       'valueType' := binary()
     }.

encode(#{ 'numberValue' := NumberValue,
          'photoValue' := PhotoValue,
          'stringValue' := StringValue,
          'valueType' := ValueType
        }) ->
    #{ 'numberValue' => NumberValue,
       'photoValue' => PhotoValue,
       'stringValue' => StringValue,
       'valueType' => ValueType
     }.
