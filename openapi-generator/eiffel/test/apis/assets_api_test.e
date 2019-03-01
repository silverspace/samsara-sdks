note
    description: "API tests for ASSETS_API"
    date: "$Date$"
    revision: "$Revision$"


class ASSETS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines

    
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

feature {NONE} -- Implementation

    api: ASSETS_API
            -- Create an object instance of `ASSETS_API'.
        once            
            create { ASSETS_API } Result
        end

end
