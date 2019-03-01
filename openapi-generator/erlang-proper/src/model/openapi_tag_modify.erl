-module(openapi_tag_modify).

-include("openapi.hrl").

-export([openapi_tag_modify/0]).

-export([openapi_tag_modify/1]).

-export_type([openapi_tag_modify/0]).

-type openapi_tag_modify() ::
  [ {'add', openapi_tag_modify_add:openapi_tag_modify_add() }
  | {'delete', openapi_tag_modify_delete:openapi_tag_modify_delete() }
  | {'name', binary() }
  | {'parentTagId', integer() }
  ].


openapi_tag_modify() ->
    openapi_tag_modify([]).

openapi_tag_modify(Fields) ->
  Default = [ {'add', openapi_tag_modify_add:openapi_tag_modify_add() }
            , {'delete', openapi_tag_modify_delete:openapi_tag_modify_delete() }
            , {'name', binary() }
            , {'parentTagId', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

