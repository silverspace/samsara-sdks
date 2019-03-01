note
    description: "API tests for TAGS_API"
    date: "$Date$"
    revision: "$Revision$"


class TAGS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_all_tags
            -- /tags
            -- 
            -- Fetch all of the tags for a group. 
        local
            l_response: INLINE_RESPONSE_200_9
            l_access_token: STRING_32
            l_group_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.all_tags(l_access_token, l_group_id)
            assert ("not_implemented", False)
        end
    
    test_create_tag
            -- /tags
            -- 
            -- Create a new tag for the group. 
        local
            l_response: TAG
            l_access_token: STRING_32
            l_tag_create_params: TAG_CREATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_tag_create_params
                      
            -- l_response := api.create_tag(l_access_token, l_tag_create_params)
            assert ("not_implemented", False)
        end
    
    test_delete_tag_by_id
            -- /tags/{tag_id:[0-9]+}
            -- 
            -- Permanently deletes a tag. 
        local
            l_access_token: STRING_32
            l_tag_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_tag_id
                      
            -- api.delete_tag_by_id(l_access_token, l_tag_id)
            assert ("not_implemented", False)
        end
    
    test_modify_tag_by_id
            -- /tags/{tag_id:[0-9]+}
            -- 
            -- Add or delete specific members from a tag, or modify the name of a tag. 
        local
            l_response: TAG
            l_access_token: STRING_32
            l_tag_id: INTEGER_64
            l_tag_modify_params: TAG_MODIFY
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_tag_id
            -- l_tag_modify_params
                      
            -- l_response := api.modify_tag_by_id(l_access_token, l_tag_id, l_tag_modify_params)
            assert ("not_implemented", False)
        end
    
    test_tag_by_id
            -- /tags/{tag_id:[0-9]+}
            -- 
            -- Fetch a tag by id. 
        local
            l_response: TAG
            l_access_token: STRING_32
            l_tag_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_tag_id
                      
            -- l_response := api.tag_by_id(l_access_token, l_tag_id)
            assert ("not_implemented", False)
        end
    
    test_update_tag_by_id
            -- /tags/{tag_id:[0-9]+}
            -- 
            -- Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint. 
        local
            l_response: TAG
            l_access_token: STRING_32
            l_tag_id: INTEGER_64
            l_update_tag_params: TAG_UPDATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_tag_id
            -- l_update_tag_params
                      
            -- l_response := api.update_tag_by_id(l_access_token, l_tag_id, l_update_tag_params)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: TAGS_API
            -- Create an object instance of `TAGS_API'.
        once            
            create { TAGS_API } Result
        end

end
