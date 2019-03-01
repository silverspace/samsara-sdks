-module(openapi_document_field).

-export([encode/1]).

-export_type([openapi_document_field/0]).

-type openapi_document_field() ::
    #{ 'numberValue' => float(),
       'photoValue' => list(),
       'stringValue' => binary(),
       'valueType' := binary(),
       'label' := binary(),
       'value' => maps:map()
     }.

encode(#{ 'numberValue' := NumberValue,
          'photoValue' := PhotoValue,
          'stringValue' := StringValue,
          'valueType' := ValueType,
          'label' := Label,
          'value' := Value
        }) ->
    #{ 'numberValue' => NumberValue,
       'photoValue' => PhotoValue,
       'stringValue' => StringValue,
       'valueType' => ValueType,
       'label' => Label,
       'value' => Value
     }.
