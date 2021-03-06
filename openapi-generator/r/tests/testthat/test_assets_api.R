# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test AssetsApi")

api.instance <- AssetsApi$new()

test_that("GetAllAssetCurrentLocations", {
  # tests for GetAllAssetCurrentLocations
  # base path: https://api.samsara.com/v1
  # /fleet/assets/locations
  # Fetch current locations of all assets for the group.
  # @param character  access.token  Samsara API access token. 
  # @param integer  group.id  Optional group ID if the organization has multiple groups (uncommon).  (optional)
  # @return [InlineResponse2001]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetAllAssets", {
  # tests for GetAllAssets
  # base path: https://api.samsara.com/v1
  # /fleet/assets
  # Fetch all of the assets for the group.
  # @param character  access.token  Samsara API access token. 
  # @param integer  group.id  Optional group ID if the organization has multiple groups (uncommon).  (optional)
  # @return [InlineResponse200]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetAssetLocation", {
  # tests for GetAssetLocation
  # base path: https://api.samsara.com/v1
  # /fleet/assets/{assetId:[0-9]+}/locations
  # Fetch the historical locations for the asset.
  # @param character  access.token  Samsara API access token. 
  # @param integer  asset.id  ID of the asset 
  # @param integer  start.ms  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
  # @param integer  end.ms  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
  # @return [object]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

test_that("GetAssetReefer", {
  # tests for GetAssetReefer
  # base path: https://api.samsara.com/v1
  # /fleet/assets/{assetId:[0-9]+}/reefer
  # Fetch the reefer-specific stats of an asset.
  # @param character  access.token  Samsara API access token. 
  # @param integer  asset.id  ID of the asset 
  # @param integer  start.ms  Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
  # @param integer  end.ms  Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
  # @return [AssetReeferResponse]

  # uncomment below to test the operation
  #expect_equal(result, "EXPECTED_RESULT")
})

