note
    description: "API tests for INDUSTRIAL_API"
    date: "$Date$"
    revision: "$Revision$"


class INDUSTRIAL_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_all_data_inputs
            -- /industrial/data
            -- 
            -- Fetch all of the data inputs for a group. 
        local
            l_response: INLINE_RESPONSE_200_6
            l_access_token: STRING_32
            l_group_id: INTEGER_64
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.all_data_inputs(l_access_token, l_group_id, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end
    
    test_data_input
            -- /industrial/data/{data_input_id:[0-9]+}
            -- 
            -- Fetch datapoints from a given data input. 
        local
            l_response: DATA_INPUT_HISTORY_RESPONSE
            l_access_token: STRING_32
            l_data_input_id: INTEGER_64
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_data_input_id
                      
            -- l_response := api.data_input(l_access_token, l_data_input_id, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end
    
    test_machines
            -- /machines/list
            -- 
            -- Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them. 
        local
            l_response: INLINE_RESPONSE_200_7
            l_access_token: STRING_32
            l_group_param: INLINE_OBJECT_18
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_group_param
                      
            -- l_response := api.machines(l_access_token, l_group_param)
            assert ("not_implemented", False)
        end
    
    test_machines_history
            -- /machines/history
            -- 
            -- Get historical data for machine objects. This method returns a set of historical data for all machines in a group 
        local
            l_response: MACHINE_HISTORY_RESPONSE
            l_access_token: STRING_32
            l_history_param: INLINE_OBJECT_17
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_history_param
                      
            -- l_response := api.machines_history(l_access_token, l_history_param)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: INDUSTRIAL_API
            -- Create an object instance of `INDUSTRIAL_API'.
        once            
            create { INDUSTRIAL_API } Result
        end

end
