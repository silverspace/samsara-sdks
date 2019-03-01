-module(openapi_dvir_base_mechanic_or_agent_signature).

-include("openapi.hrl").

-export([openapi_dvir_base_mechanic_or_agent_signature/0]).

-export([openapi_dvir_base_mechanic_or_agent_signature/1]).

-export_type([openapi_dvir_base_mechanic_or_agent_signature/0]).

-type openapi_dvir_base_mechanic_or_agent_signature() ::
  [ {'mechanicUserId', integer() }
  | {'driverId', integer() }
  | {'name', binary() }
  | {'signedAt', integer() }
  | {'type', binary() }
  | {'email', binary() }
  | {'username', binary() }
  ].


openapi_dvir_base_mechanic_or_agent_signature() ->
    openapi_dvir_base_mechanic_or_agent_signature([]).

openapi_dvir_base_mechanic_or_agent_signature(Fields) ->
  Default = [ {'mechanicUserId', integer() }
            , {'driverId', integer() }
            , {'name', binary() }
            , {'signedAt', integer() }
            , {'type', binary() }
            , {'email', binary() }
            , {'username', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

