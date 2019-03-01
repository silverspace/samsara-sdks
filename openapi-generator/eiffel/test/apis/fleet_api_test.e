note
    description: "API tests for FLEET_API"
    date: "$Date$"
    revision: "$Revision$"


class FLEET_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
    test_add_fleet_address
            -- /fleet/add_address
            -- 
            -- This method adds an address book entry to the specified group. 
        local
            l_access_token: STRING_32
            l_address_param: INLINE_OBJECT_2
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_address_param
                      
            -- api.add_fleet_address(l_access_token, l_address_param)
            assert ("not_implemented", False)
        end
    
    test_add_organization_addresses
            -- /addresses
            -- 
            -- Add one or more addresses to the organization 
        local
            l_response: LIST [ADDRESS]
            l_access_token: STRING_32
            l_addresses: INLINE_OBJECT
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_addresses
                      
            -- l_response := api.add_organization_addresses(l_access_token, l_addresses)
            assert ("not_implemented", False)
        end
    
    test_all_asset_current_locations
            -- /fleet/assets/locations
            -- 
            -- Fetch current locations of all assets for the group. 
        local
            l_response: INLINE_RESPONSE_200_1
            l_access_token: STRING_32
            l_group_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.all_asset_current_locations(l_access_token, l_group_id)
            assert ("not_implemented", False)
        end
    
    test_all_assets
            -- /fleet/assets
            -- 
            -- Fetch all of the assets for the group. 
        local
            l_response: INLINE_RESPONSE_200
            l_access_token: STRING_32
            l_group_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.all_assets(l_access_token, l_group_id)
            assert ("not_implemented", False)
        end
    
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
    
    test_asset_location
            -- /fleet/assets/{assetId:[0-9]+}/locations
            -- 
            -- Fetch the historical locations for the asset. 
        local
            l_response: LIST [ANY]
            l_access_token: STRING_32
            l_asset_id: INTEGER_64
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_asset_id
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.asset_location(l_access_token, l_asset_id, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end
    
    test_asset_reefer
            -- /fleet/assets/{assetId:[0-9]+}/reefer
            -- 
            -- Fetch the reefer-specific stats of an asset. 
        local
            l_response: ASSET_REEFER_RESPONSE
            l_access_token: STRING_32
            l_asset_id: INTEGER_64
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_asset_id
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.asset_reefer(l_access_token, l_asset_id, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end
    
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
    
    test_create_driver_document
            -- /fleet/drivers/{driver_id:[0-9]+}/documents
            -- 
            -- Create a driver document for the given driver. 
        local
            l_response: DOCUMENT
            l_access_token: STRING_32
            l_driver_id: INTEGER_64
            l_create_document_params: DOCUMENT_CREATE
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id
            -- l_create_document_params
                      
            -- l_response := api.create_driver_document(l_access_token, l_driver_id, l_create_document_params)
            assert ("not_implemented", False)
        end
    
    test_create_dvir
            -- /fleet/maintenance/dvirs
            -- 
            -- Create a new dvir, marking a vehicle or trailer safe or unsafe. 
        local
            l_response: DVIR_BASE
            l_access_token: STRING_32
            l_create_dvir_param: INLINE_OBJECT_12
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_create_dvir_param
                      
            -- l_response := api.create_dvir(l_access_token, l_create_dvir_param)
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
    
    test_delete_organization_address
            -- /addresses/{addressId}
            -- 
            -- Delete an address. 
        local
            l_access_token: STRING_32
            l_address_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_address_id
                      
            -- api.delete_organization_address(l_access_token, l_address_id)
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
    
    test_driver_document_types_by_org_id
            -- /fleet/drivers/document_types
            -- 
            -- Fetch all of the document types. 
        local
            l_response: LIST [DOCUMENT_TYPE]
        do
            -- TODO: Initialize required params.
                      
            -- l_response := api.driver_document_types_by_org_id
            assert ("not_implemented", False)
        end
    
    test_driver_documents_by_org_id
            -- /fleet/drivers/documents
            -- 
            -- Fetch all of the documents. 
        local
            l_response: LIST [DOCUMENT]
            l_access_token: STRING_32
            l_end_ms: INTEGER_64
            l_duration_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.driver_documents_by_org_id(l_access_token, l_end_ms, l_duration_ms)
            assert ("not_implemented", False)
        end
    
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
    
    test_dvirs
            -- /fleet/maintenance/dvirs
            -- 
            -- Get DVIRs for the org within provided time constraints 
        local
            l_response: DVIR_LIST_RESPONSE
            l_access_token: STRING_32
            l_end_ms: INTEGER_32
            l_duration_ms: INTEGER_32
            l_group_id: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_end_ms
            -- l_duration_ms
                      
            -- l_response := api.dvirs(l_access_token, l_end_ms, l_duration_ms, l_group_id)
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
    
    test_fleet_drivers
            -- /fleet/drivers
            -- 
            -- Get all the drivers for the specified group. 
        local
            l_response: DRIVERS_RESPONSE
            l_access_token: STRING_32
            l_group_drivers_param: INLINE_OBJECT_3
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_group_drivers_param
                      
            -- l_response := api.fleet_drivers(l_access_token, l_group_drivers_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_drivers_hos_daily_logs
            -- /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
            -- 
            -- Get summarized daily HOS charts for a specified driver. 
        local
            l_response: DRIVER_DAILY_LOG_RESPONSE
            l_access_token: STRING_32
            l_driver_id: INTEGER_64
            l_hos_logs_param: INLINE_OBJECT_6
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_driver_id
            -- l_hos_logs_param
                      
            -- l_response := api.fleet_drivers_hos_daily_logs(l_access_token, l_driver_id, l_hos_logs_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_drivers_summary
            -- /fleet/drivers/summary
            -- 
            -- Get the distance and time each driver in an organization has driven in a given time period. 
        local
            l_response: DRIVERS_SUMMARY_RESPONSE
            l_access_token: STRING_32
            l_drivers_summary_param: INLINE_OBJECT_5
            l_snap_to_day_bounds: BOOLEAN
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_drivers_summary_param
                      
            -- l_response := api.fleet_drivers_summary(l_access_token, l_drivers_summary_param, l_snap_to_day_bounds)
            assert ("not_implemented", False)
        end
    
    test_fleet_hos_authentication_logs
            -- /fleet/hos_authentication_logs
            -- 
            -- Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information. 
        local
            l_response: HOS_AUTHENTICATION_LOGS_RESPONSE
            l_access_token: STRING_32
            l_hos_authentication_logs_param: INLINE_OBJECT_7
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_hos_authentication_logs_param
                      
            -- l_response := api.fleet_hos_authentication_logs(l_access_token, l_hos_authentication_logs_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_hos_logs
            -- /fleet/hos_logs
            -- 
            -- Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period. 
        local
            l_response: HOS_LOGS_RESPONSE
            l_access_token: STRING_32
            l_hos_logs_param: INLINE_OBJECT_8
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_hos_logs_param
                      
            -- l_response := api.fleet_hos_logs(l_access_token, l_hos_logs_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_hos_logs_summary
            -- /fleet/hos_logs_summary
            -- 
            -- Get the current HOS status for all drivers in the group. 
        local
            l_response: HOS_LOGS_SUMMARY_RESPONSE
            l_access_token: STRING_32
            l_hos_logs_param: INLINE_OBJECT_9
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_hos_logs_param
                      
            -- l_response := api.fleet_hos_logs_summary(l_access_token, l_hos_logs_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_locations
            -- /fleet/locations
            -- 
            -- Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group. 
        local
            l_response: INLINE_RESPONSE_200_3
            l_access_token: STRING_32
            l_group_param: INLINE_OBJECT_11
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_group_param
                      
            -- l_response := api.fleet_locations(l_access_token, l_group_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_maintenance_list
            -- /fleet/maintenance/list
            -- 
            -- Get list of the vehicles with any engine faults or check light data. 
        local
            l_response: INLINE_RESPONSE_200_4
            l_access_token: STRING_32
            l_group_param: INLINE_OBJECT_13
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_group_param
                      
            -- l_response := api.fleet_maintenance_list(l_access_token, l_group_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_trips
            -- /fleet/trips
            -- 
            -- Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range. 
        local
            l_response: TRIP_RESPONSE
            l_access_token: STRING_32
            l_trips_param: INLINE_OBJECT_15
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_trips_param
                      
            -- l_response := api.fleet_trips(l_access_token, l_trips_param)
            assert ("not_implemented", False)
        end
    
    test_fleet_vehicle
            -- /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
            -- 
            -- Gets a specific vehicle. 
        local
            l_response: FLEET_VEHICLE_RESPONSE
            l_access_token: STRING_32
            l_vehicle_id_or_external_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_vehicle_id_or_external_id
                      
            -- l_response := api.fleet_vehicle(l_access_token, l_vehicle_id_or_external_id)
            assert ("not_implemented", False)
        end
    
    test_list_contacts
            -- /contacts
            -- 
            -- Fetch all contacts for the organization. 
        local
            l_response: LIST [CONTACT]
            l_access_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.list_contacts(l_access_token)
            assert ("not_implemented", False)
        end
    
    test_list_fleet
            -- /fleet/list
            -- 
            -- Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them. 
        local
            l_response: INLINE_RESPONSE_200_2
            l_access_token: STRING_32
            l_group_param: INLINE_OBJECT_10
            l_starting_after: STRING_32
            l_ending_before: STRING_32
            l_limit: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_group_param
                      
            -- l_response := api.list_fleet(l_access_token, l_group_param, l_starting_after, l_ending_before, l_limit)
            assert ("not_implemented", False)
        end
    
    test_organization_address
            -- /addresses/{addressId}
            -- 
            -- Fetch an address by its id. 
        local
            l_response: ADDRESS
            l_access_token: STRING_32
            l_address_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_address_id
                      
            -- l_response := api.organization_address(l_access_token, l_address_id)
            assert ("not_implemented", False)
        end
    
    test_organization_addresses
            -- /addresses
            -- 
            -- Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries. 
        local
            l_response: LIST [ADDRESS]
            l_access_token: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
                      
            -- l_response := api.organization_addresses(l_access_token)
            assert ("not_implemented", False)
        end
    
    test_organization_contact
            -- /contacts/{contact_id}
            -- 
            -- Fetch a contact by its id. 
        local
            l_response: CONTACT
            l_access_token: STRING_32
            l_contact_id: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_contact_id
                      
            -- l_response := api.organization_contact(l_access_token, l_contact_id)
            assert ("not_implemented", False)
        end
    
    test_patch_fleet_vehicle
            -- /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
            -- 
            -- Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396. 
        local
            l_response: FLEET_VEHICLE_RESPONSE
            l_access_token: STRING_32
            l_vehicle_id_or_external_id: STRING_32
            l_data: INLINE_OBJECT_16
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_vehicle_id_or_external_id
            -- l_data
                      
            -- l_response := api.patch_fleet_vehicle(l_access_token, l_vehicle_id_or_external_id, l_data)
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
    
    test_update_organization_address
            -- /addresses/{addressId}
            -- 
            -- Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string. 
        local
            l_access_token: STRING_32
            l_address_id: INTEGER_64
            l_address: INLINE_OBJECT_1
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_address_id
            -- l_address
                      
            -- api.update_organization_address(l_access_token, l_address_id, l_address)
            assert ("not_implemented", False)
        end
    
    test_update_vehicles
            -- /fleet/set_data
            -- 
            -- This method enables the mutation of metadata for vehicles in the Samsara Cloud. 
        local
            l_access_token: STRING_32
            l_vehicle_update_param: INLINE_OBJECT_14
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_vehicle_update_param
                      
            -- api.update_vehicles(l_access_token, l_vehicle_update_param)
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
    
    test_vehicle_locations
            -- /fleet/vehicles/{vehicle_id:[0-9]+}/locations
            -- 
            -- Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour. 
        local
            l_response: LIST [FLEET_VEHICLE_LOCATION]
            l_access_token: STRING_32
            l_vehicle_id: INTEGER_64
            l_start_ms: INTEGER_64
            l_end_ms: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_vehicle_id
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.vehicle_locations(l_access_token, l_vehicle_id, l_start_ms, l_end_ms)
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
    
    test_vehicle_stats
            -- /fleet/vehicles/stats
            -- 
            -- Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time. 
        local
            l_response: INLINE_RESPONSE_200_5
            l_access_token: STRING_32
            l_start_ms: INTEGER_32
            l_end_ms: INTEGER_32
            l_series: STRING_32
            l_tag_ids: STRING_32
            l_starting_after: STRING_32
            l_ending_before: STRING_32
            l_limit: INTEGER_64
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.vehicle_stats(l_access_token, l_start_ms, l_end_ms, l_series, l_tag_ids, l_starting_after, l_ending_before, l_limit)
            assert ("not_implemented", False)
        end
    
    test_vehicles_locations
            -- /fleet/vehicles/locations
            -- 
            -- Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes. 
        local
            l_response: LIST [ANY]
            l_access_token: STRING_32
            l_start_ms: INTEGER_32
            l_end_ms: INTEGER_32
        do
            -- TODO: Initialize required params.
            -- l_access_token
            -- l_start_ms
            -- l_end_ms
                      
            -- l_response := api.vehicles_locations(l_access_token, l_start_ms, l_end_ms)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: FLEET_API
            -- Create an object instance of `FLEET_API'.
        once            
            create { FLEET_API } Result
        end

end
