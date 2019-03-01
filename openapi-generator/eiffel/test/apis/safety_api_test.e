note
    description: "API tests for SAFETY_API"
    date: "$Date$"
    revision: "$Revision$"


class SAFETY_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_driver_safety_score
            -- /fleet/drivers/{driverId:[0-9]+}/safety/score
            -- 
            -- Fetch the safety score for the driver. 
        local
            l_response: DRIVER_SAFETY_SCORE_RESPONSE
            l_driver_id: INTEGER_64
            l_access_token: STRING_32
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_driver_id
            -- l_access_token
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.driver_safety_score(l_driver_id, l_access_token, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end
    
    test_vehicle_harsh_event
            -- /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
            -- 
            -- Fetch harsh event details for a vehicle. 
        local
            l_response: VEHICLE_HARSH_EVENT_RESPONSE
            l_vehicle_id: INTEGER_64
            l_access_token: STRING_32
            l_timestamp: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_vehicle_id
            -- l_access_token
            -- l_timestamp
                      
            -- l_response := api.vehicle_harsh_event(l_vehicle_id, l_access_token, l_timestamp)
            assert ("not_implemented", False)
        end
    
    test_vehicle_safety_score
            -- /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
            -- 
            -- Fetch the safety score for the vehicle. 
        local
            l_response: VEHICLE_SAFETY_SCORE_RESPONSE
            l_vehicle_id: INTEGER_64
            l_access_token: STRING_32
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_vehicle_id
            -- l_access_token
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.vehicle_safety_score(l_vehicle_id, l_access_token, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SAFETY_API
            -- Create an object instance of `SAFETY_API'.
        once            
            create { SAFETY_API } Result
        end

end
