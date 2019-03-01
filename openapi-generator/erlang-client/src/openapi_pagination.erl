-module(openapi_pagination).

-export([encode/1]).

-export_type([openapi_pagination/0]).

-type openapi_pagination() ::
    #{ 'endCursor' := binary(),
       'hasNextPage' := boolean(),
       'hasPrevPage' := boolean(),
       'startCursor' := binary()
     }.

encode(#{ 'endCursor' := EndCursor,
          'hasNextPage' := HasNextPage,
          'hasPrevPage' := HasPrevPage,
          'startCursor' := StartCursor
        }) ->
    #{ 'endCursor' => EndCursor,
       'hasNextPage' => HasNextPage,
       'hasPrevPage' => HasPrevPage,
       'startCursor' => StartCursor
     }.
