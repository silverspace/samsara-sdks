note
    description: "API tests for USERS_API"
    date: "$Date$"
    revision: "$Revision$"


class USERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_delete_user_by_id
            -- /users/{userId:[0-9]+}
            -- 
            -- Remove a user from the organization. 
        local
            l_access_token: STRING_32
            l_user_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_user_id
                      
            -- api.delete_user_by_id(l_access_token, l_user_id)
            assert ("not_implemented", False)
        end
    
    test_list_user_roles
            -- /user_roles
            -- 
            -- Get all roles in the organization. 
        local
            l_response: LIST [USER_ROLE]
            l_access_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.list_user_roles(l_access_token)
            assert ("not_implemented", False)
        end
    
    test_list_users
            -- /users
            -- 
            -- List all users in the organization. 
        local
            l_response: LIST [USER]
            l_access_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.list_users(l_access_token)
            assert ("not_implemented", False)
        end
    
    test_user_by_id
            -- /users/{userId:[0-9]+}
            -- 
            -- Get a user. 
        local
            l_response: USER
            l_access_token: STRING_32
            l_user_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_user_id
                      
            -- l_response := api.user_by_id(l_access_token, l_user_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: USERS_API
            -- Create an object instance of `USERS_API'.
        once            
            create { USERS_API } Result
        end

end
