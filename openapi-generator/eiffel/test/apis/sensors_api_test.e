note
    description: "API tests for SENSORS_API"
    date: "$Date$"
    revision: "$Revision$"


class SENSORS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_sensors
            -- /sensors/list
            -- 
            -- Get sensor objects. This method returns a list of the sensor objects in the Samsara Cloud and information about them. 
        local
            l_response: INLINE_RESPONSE_200_8
            l_access_token: STRING_32
            l_group_param: INLINE_OBJECT_23
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_group_param
                      
            -- l_response := api.sensors(l_access_token, l_group_param)
            assert ("not_implemented", False)
        end
    
    test_sensors_cargo
            -- /sensors/cargo
            -- 
            -- Get cargo monitor status (empty / full) for requested sensors. 
        local
            l_response: CARGO_RESPONSE
            l_access_token: STRING_32
            l_sensor_param: INLINE_OBJECT_19
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_sensor_param
                      
            -- l_response := api.sensors_cargo(l_access_token, l_sensor_param)
            assert ("not_implemented", False)
        end
    
    test_sensors_door
            -- /sensors/door
            -- 
            -- Get door monitor status (closed / open) for requested sensors. 
        local
            l_response: DOOR_RESPONSE
            l_access_token: STRING_32
            l_sensor_param: INLINE_OBJECT_20
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_sensor_param
                      
            -- l_response := api.sensors_door(l_access_token, l_sensor_param)
            assert ("not_implemented", False)
        end
    
    test_sensors_history
            -- /sensors/history
            -- 
            -- Get historical data for specified sensors. This method returns a set of historical data for the specified sensors in the specified time range and at the specified time resolution. 
        local
            l_response: SENSOR_HISTORY_RESPONSE
            l_access_token: STRING_32
            l_history_param: INLINE_OBJECT_21
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_history_param
                      
            -- l_response := api.sensors_history(l_access_token, l_history_param)
            assert ("not_implemented", False)
        end
    
    test_sensors_humidity
            -- /sensors/humidity
            -- 
            -- Get humidity for requested sensors. This method returns the current relative humidity for the requested sensors. 
        local
            l_response: HUMIDITY_RESPONSE
            l_access_token: STRING_32
            l_sensor_param: INLINE_OBJECT_22
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_sensor_param
                      
            -- l_response := api.sensors_humidity(l_access_token, l_sensor_param)
            assert ("not_implemented", False)
        end
    
    test_sensors_temperature
            -- /sensors/temperature
            -- 
            -- Get temperature for requested sensors. This method returns the current ambient temperature (and probe temperature if applicable) for the requested sensors. 
        local
            l_response: TEMPERATURE_RESPONSE
            l_access_token: STRING_32
            l_sensor_param: INLINE_OBJECT_24
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_sensor_param
                      
            -- l_response := api.sensors_temperature(l_access_token, l_sensor_param)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: SENSORS_API
            -- Create an object instance of `SENSORS_API'.
        once            
            create { SENSORS_API } Result
        end

end
