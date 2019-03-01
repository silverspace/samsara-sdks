-module(openapi_tag_modify).

-export([encode/1]).

-export_type([openapi_tag_modify/0]).

-type openapi_tag_modify() ::
    #{ 'add' => openapi_tag_modify_add:openapi_tag_modify_add(),
       'delete' => openapi_tag_modify_delete:openapi_tag_modify_delete(),
       'name' => binary(),
       'parentTagId' => integer()
     }.

encode(#{ 'add' := Add,
          'delete' := Delete,
          'name' := Name,
          'parentTagId' := ParentTagId
        }) ->
    #{ 'add' => Add,
       'delete' => Delete,
       'name' => Name,
       'parentTagId' => ParentTagId
     }.
