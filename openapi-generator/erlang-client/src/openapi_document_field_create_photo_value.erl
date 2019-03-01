-module(openapi_document_field_create_photo_value).

-export([encode/1]).

-export_type([openapi_document_field_create_photo_value/0]).

-type openapi_document_field_create_photo_value() ::
    #{ 'url' => binary()
     }.

encode(#{ 'url' := Url
        }) ->
    #{ 'url' => Url
     }.
