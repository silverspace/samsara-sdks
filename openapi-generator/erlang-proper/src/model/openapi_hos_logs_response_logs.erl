-module(openapi_hos_logs_response_logs).

-include("openapi.hrl").

-export([openapi_hos_logs_response_logs/0]).

-export([openapi_hos_logs_response_logs/1]).

-export_type([openapi_hos_logs_response_logs/0]).

-type openapi_hos_logs_response_logs() ::
  [ {'locLng', float() }
  | {'logStartMs', integer() }
  | {'driverId', integer() }
  | {'statusType', binary() }
  | {'locCity', binary() }
  | {'groupId', integer() }
  | {'locName', binary() }
  | {'locLat', float() }
  | {'remark', binary() }
  | {'locState', binary() }
  | {'vehicleId', integer() }
  | {'codriverIds', list(integer()) }
  ].


openapi_hos_logs_response_logs() ->
    openapi_hos_logs_response_logs([]).

openapi_hos_logs_response_logs(Fields) ->
  Default = [ {'locLng', float() }
            , {'logStartMs', integer() }
            , {'driverId', integer() }
            , {'statusType', binary() }
            , {'locCity', binary() }
            , {'groupId', integer() }
            , {'locName', binary() }
            , {'locLat', float() }
            , {'remark', binary() }
            , {'locState', binary() }
            , {'vehicleId', integer() }
            , {'codriverIds', list(integer()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

