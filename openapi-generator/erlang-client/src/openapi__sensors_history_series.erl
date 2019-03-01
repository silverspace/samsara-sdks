-module(openapi__sensors_history_series).

-export([encode/1]).

-export_type([openapi__sensors_history_series/0]).

-type openapi__sensors_history_series() ::
    #{ 'field' := binary(),
       'widgetId' := integer()
     }.

encode(#{ 'field' := Field,
          'widgetId' := WidgetId
        }) ->
    #{ 'field' => Field,
       'widgetId' => WidgetId
     }.
