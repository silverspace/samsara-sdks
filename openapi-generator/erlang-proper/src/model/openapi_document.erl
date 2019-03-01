-module(openapi_document).

-include("openapi.hrl").

-export([openapi_document/0]).

-export([openapi_document/1]).

-export_type([openapi_document/0]).

-type openapi_document() ::
  [ {'dispatchJobId', integer() }
  | {'notes', binary() }
  | {'documentType', binary() }
  | {'driverCreatedAtMs', integer() }
  | {'driverId', integer() }
  | {'fields', list(openapi_document_field:openapi_document_field()) }
  | {'vehicleId', integer() }
  ].


openapi_document() ->
    openapi_document([]).

openapi_document(Fields) ->
  Default = [ {'dispatchJobId', integer() }
            , {'notes', binary() }
            , {'documentType', binary() }
            , {'driverCreatedAtMs', integer() }
            , {'driverId', integer() }
            , {'fields', list(openapi_document_field:openapi_document_field()) }
            , {'vehicleId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

