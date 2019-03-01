note
    description: "API tests for ROUTES_API"
    date: "$Date$"
    revision: "$Revision$"


class ROUTES_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_create_dispatch_route
            -- /fleet/dispatch/routes
            -- 
            -- Create a new dispatch route. 
        local
            l_response: DISPATCH_ROUTE
            l_access_token: STRING_32
            l_create_dispatch_route_params: DISPATCH_ROUTE_CREATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_create_dispatch_route_params
                      
            -- l_response := api.create_dispatch_route(l_access_token, l_create_dispatch_route_params)
            assert ("not_implemented", False)
        end
    
    test_create_driver_dispatch_route
            -- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
            -- 
            -- Create a new dispatch route for the driver with driver_id. 
        local
            l_response: DISPATCH_ROUTE
            l_access_token: STRING_32
            l_driver_id: INTEGER_64
            l_create_dispatch_route_params: DISPATCH_ROUTE_CREATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id
            -- l_create_dispatch_route_params
                      
            -- l_response := api.create_driver_dispatch_route(l_access_token, l_driver_id, l_create_dispatch_route_params)
            assert ("not_implemented", False)
        end
    
    test_create_vehicle_dispatch_route
            -- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
            -- 
            -- Create a new dispatch route for the vehicle with vehicle_id. 
        local
            l_response: DISPATCH_ROUTE
            l_access_token: STRING_32
            l_vehicle_id: INTEGER_64
            l_create_dispatch_route_params: DISPATCH_ROUTE_CREATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_vehicle_id
            -- l_create_dispatch_route_params
                      
            -- l_response := api.create_vehicle_dispatch_route(l_access_token, l_vehicle_id, l_create_dispatch_route_params)
            assert ("not_implemented", False)
        end
    
    test_delete_dispatch_route_by_id
            -- /fleet/dispatch/routes/{route_id:[0-9]+}/
            -- 
            -- Delete a dispatch route and its associated jobs. 
        local
            l_access_token: STRING_32
            l_route_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_route_id
                      
            -- api.delete_dispatch_route_by_id(l_access_token, l_route_id)
            assert ("not_implemented", False)
        end
    
    test_dispatch_route_by_id
            -- /fleet/dispatch/routes/{route_id:[0-9]+}
            -- 
            -- Fetch a dispatch route by id. 
        local
            l_response: DISPATCH_ROUTE
            l_access_token: STRING_32
            l_route_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_route_id
                      
            -- l_response := api.dispatch_route_by_id(l_access_token, l_route_id)
            assert ("not_implemented", False)
        end
    
    test_dispatch_route_history
            -- /fleet/dispatch/routes/{route_id:[0-9]+}/history
            -- 
            -- Fetch the history of a dispatch route. 
        local
            l_response: DISPATCH_ROUTE_HISTORY
            l_access_token: STRING_32
            l_route_id: INTEGER_64
            l_start_time: INTEGER_64
            l_end_time: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_route_id
                      
            -- l_response := api.dispatch_route_history(l_access_token, l_route_id, l_start_time, l_end_time)
            assert ("not_implemented", False)
        end
    
    test_dispatch_routes_by_driver_id
            -- /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
            -- 
            -- Fetch all of the dispatch routes for a given driver. 
        local
            l_response: LIST [DISPATCH_ROUTE]
            l_access_token: STRING_32
            l_driver_id: INTEGER_64
            l_end_time: INTEGER_64
            l_duration: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id
                      
            -- l_response := api.dispatch_routes_by_driver_id(l_access_token, l_driver_id, l_end_time, l_duration)
            assert ("not_implemented", False)
        end
    
    test_dispatch_routes_by_vehicle_id
            -- /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
            -- 
            -- Fetch all of the dispatch routes for a given vehicle. 
        local
            l_response: LIST [DISPATCH_ROUTE]
            l_access_token: STRING_32
            l_vehicle_id: INTEGER_64
            l_end_time: INTEGER_64
            l_duration: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_vehicle_id
                      
            -- l_response := api.dispatch_routes_by_vehicle_id(l_access_token, l_vehicle_id, l_end_time, l_duration)
            assert ("not_implemented", False)
        end
    
    test_fetch_all_dispatch_routes
            -- /fleet/dispatch/routes
            -- 
            -- Fetch all of the dispatch routes for the group. 
        local
            l_response: LIST [DISPATCH_ROUTE]
            l_access_token: STRING_32
            l_group_id: INTEGER_64
            l_end_time: INTEGER_64
            l_duration: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.fetch_all_dispatch_routes(l_access_token, l_group_id, l_end_time, l_duration)
            assert ("not_implemented", False)
        end
    
    test_fetch_all_route_job_updates
            -- /fleet/dispatch/routes/job_updates
            -- 
            -- Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID 
        local
            l_response: ALL_ROUTE_JOB_UPDATES
            l_access_token: STRING_32
            l_group_id: INTEGER_64
            l_sequence_id: STRING_32
            l_include: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.fetch_all_route_job_updates(l_access_token, l_group_id, l_sequence_id, l_include)
            assert ("not_implemented", False)
        end
    
    test_update_dispatch_route_by_id
            -- /fleet/dispatch/routes/{route_id:[0-9]+}/
            -- 
            -- Update a dispatch route and its associated jobs. 
        local
            l_response: DISPATCH_ROUTE
            l_access_token: STRING_32
            l_route_id: INTEGER_64
            l_update_dispatch_route_params: DISPATCH_ROUTE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_route_id
            -- l_update_dispatch_route_params
                      
            -- l_response := api.update_dispatch_route_by_id(l_access_token, l_route_id, l_update_dispatch_route_params)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ROUTES_API
            -- Create an object instance of `ROUTES_API'.
        once            
            create { ROUTES_API } Result
        end

end
