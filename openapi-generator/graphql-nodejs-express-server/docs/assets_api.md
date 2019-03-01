# assets_api

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllAssetCurrentLocations**](assets_api.md#GetAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](assets_api.md#GetAllAssets) | **GET** /fleet/assets | /fleet/assets
[**GetAssetLocation**](assets_api.md#GetAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](assets_api.md#GetAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


<a name="GetAllAssetCurrentLocations"></a>
# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations(accessToken, groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.
<a name="GetAllAssets"></a>
# **GetAllAssets**
> InlineResponse200 GetAllAssets(accessToken, groupId)

/fleet/assets

Fetch all of the assets for the group.
<a name="GetAssetLocation"></a>
# **GetAssetLocation**
> TodoObjectMapping GetAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.
<a name="GetAssetReefer"></a>
# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.
