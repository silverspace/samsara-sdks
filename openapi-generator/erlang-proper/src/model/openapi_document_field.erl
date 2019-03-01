-module(openapi_document_field).

-include("openapi.hrl").

-export([openapi_document_field/0]).

-export([openapi_document_field/1]).

-export_type([openapi_document_field/0]).

-type openapi_document_field() ::
  [ {'numberValue', float() }
  | {'photoValue', list(openapi_document_field_create_photo_value:openapi_document_field_create_photo_value()) }
  | {'stringValue', binary() }
  | {'valueType', binary() }
  | {'label', binary() }
  | {'value', map() }
  ].


openapi_document_field() ->
    openapi_document_field([]).

openapi_document_field(Fields) ->
  Default = [ {'numberValue', float() }
            , {'photoValue', list(openapi_document_field_create_photo_value:openapi_document_field_create_photo_value()) }
            , {'stringValue', binary() }
            , {'valueType', binary() }
            , {'label', binary() }
            , {'value', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

