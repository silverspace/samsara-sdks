-module(openapi_dvir_base_trailer_defects).

-export([encode/1]).

-export_type([openapi_dvir_base_trailer_defects/0]).

-type openapi_dvir_base_trailer_defects() ::
    #{ 'comment' => binary(),
       'defectType' => binary()
     }.

encode(#{ 'comment' := Comment,
          'defectType' := DefectType
        }) ->
    #{ 'comment' => Comment,
       'defectType' => DefectType
     }.
