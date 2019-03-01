-module(openapi_document_create).

-export([encode/1]).

-export_type([openapi_document_create/0]).

-type openapi_document_create() ::
    #{ 'dispatchJobId' => integer(),
       'notes' => binary(),
       'documentTypeUuid' := binary(),
       'fields' := list()
     }.

encode(#{ 'dispatchJobId' := DispatchJobId,
          'notes' := Notes,
          'documentTypeUuid' := DocumentTypeUuid,
          'fields' := Fields
        }) ->
    #{ 'dispatchJobId' => DispatchJobId,
       'notes' => Notes,
       'documentTypeUuid' => DocumentTypeUuid,
       'fields' => Fields
     }.
