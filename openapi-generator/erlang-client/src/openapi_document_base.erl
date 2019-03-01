-module(openapi_document_base).

-export([encode/1]).

-export_type([openapi_document_base/0]).

-type openapi_document_base() ::
    #{ 'dispatchJobId' => integer(),
       'notes' => binary()
     }.

encode(#{ 'dispatchJobId' := DispatchJobId,
          'notes' := Notes
        }) ->
    #{ 'dispatchJobId' => DispatchJobId,
       'notes' => Notes
     }.
