-module(openapi_inline_object_5).

-export([encode/1]).

-export_type([openapi_inline_object_5/0]).

-type openapi_inline_object_5() ::
    #{ 'endMs' := integer(),
       'orgId' := integer(),
       'startMs' := integer()
     }.

encode(#{ 'endMs' := EndMs,
          'orgId' := OrgId,
          'startMs' := StartMs
        }) ->
    #{ 'endMs' => EndMs,
       'orgId' => OrgId,
       'startMs' => StartMs
     }.
