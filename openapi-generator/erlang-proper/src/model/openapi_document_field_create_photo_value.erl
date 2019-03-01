-module(openapi_document_field_create_photo_value).

-include("openapi.hrl").

-export([openapi_document_field_create_photo_value/0]).

-export([openapi_document_field_create_photo_value/1]).

-export_type([openapi_document_field_create_photo_value/0]).

-type openapi_document_field_create_photo_value() ::
  [ {'url', binary() }
  ].


openapi_document_field_create_photo_value() ->
    openapi_document_field_create_photo_value([]).

openapi_document_field_create_photo_value(Fields) ->
  Default = [ {'url', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

