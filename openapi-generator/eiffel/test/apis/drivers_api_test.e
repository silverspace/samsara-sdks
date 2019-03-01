note
    description: "API tests for DRIVERS_API"
    date: "$Date$"
    revision: "$Revision$"


class DRIVERS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_all_deactivated_drivers
            -- /fleet/drivers/inactive
            -- 
            -- Fetch all deactivated drivers for the group. 
        local
            l_response: LIST [DRIVER]
            l_access_token: STRING_32
            l_group_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.all_deactivated_drivers(l_access_token, l_group_id)
            assert ("not_implemented", False)
        end
    
    test_create_driver
            -- /fleet/drivers/create
            -- 
            -- Create a new driver. 
        local
            l_response: DRIVER
            l_access_token: STRING_32
            l_create_driver_param: DRIVER_FOR_CREATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_create_driver_param
                      
            -- l_response := api.create_driver(l_access_token, l_create_driver_param)
            assert ("not_implemented", False)
        end
    
    test_deactivate_driver
            -- /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
            -- 
            -- Deactivate a driver with the given id. 
        local
            l_access_token: STRING_32
            l_driver_id_or_external_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id_or_external_id
                      
            -- api.deactivate_driver(l_access_token, l_driver_id_or_external_id)
            assert ("not_implemented", False)
        end
    
    test_deactivated_driver_by_id
            -- /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
            -- 
            -- Fetch deactivated driver by id. 
        local
            l_response: DRIVER
            l_access_token: STRING_32
            l_driver_id_or_external_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id_or_external_id
                      
            -- l_response := api.deactivated_driver_by_id(l_access_token, l_driver_id_or_external_id)
            assert ("not_implemented", False)
        end
    
    test_driver_by_id
            -- /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
            -- 
            -- Fetch driver by id. 
        local
            l_response: DRIVER
            l_access_token: STRING_32
            l_driver_id_or_external_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id_or_external_id
                      
            -- l_response := api.driver_by_id(l_access_token, l_driver_id_or_external_id)
            assert ("not_implemented", False)
        end
    
    test_reactivate_driver_by_id
            -- /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
            -- 
            -- Reactivate the inactive driver having id. 
        local
            l_response: DRIVER
            l_access_token: STRING_32
            l_driver_id_or_external_id: STRING_32
            l_reactivate_driver_param: INLINE_OBJECT_4
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id_or_external_id
            -- l_reactivate_driver_param
                      
            -- l_response := api.reactivate_driver_by_id(l_access_token, l_driver_id_or_external_id, l_reactivate_driver_param)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: DRIVERS_API
            -- Create an object instance of `DRIVERS_API'.
        once            
            create { DRIVERS_API } Result
        end

end
