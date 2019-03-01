-module(openapi_document_type).

-export([encode/1]).

-export_type([openapi_document_type/0]).

-type openapi_document_type() ::
    #{ 'fieldTypes' => list(),
       'name' := binary(),
       'orgId' := integer(),
       'uuid' := binary()
     }.

encode(#{ 'fieldTypes' := FieldTypes,
          'name' := Name,
          'orgId' := OrgId,
          'uuid' := Uuid
        }) ->
    #{ 'fieldTypes' => FieldTypes,
       'name' => Name,
       'orgId' => OrgId,
       'uuid' => Uuid
     }.
