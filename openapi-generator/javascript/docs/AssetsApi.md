# SamsaraApi.AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](AssetsApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](AssetsApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](AssetsApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](AssetsApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


<a name="getAllAssetCurrentLocations"></a>
# **getAllAssetCurrentLocations**
> InlineResponse2001 getAllAssetCurrentLocations(accessToken, opts)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.AssetsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789 // Number | Optional group ID if the organization has multiple groups (uncommon).
};
apiInstance.getAllAssetCurrentLocations(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAssets"></a>
# **getAllAssets**
> InlineResponse200 getAllAssets(accessToken, opts)

/fleet/assets

Fetch all of the assets for the group.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.AssetsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let opts = {
  'groupId': 789 // Number | Optional group ID if the organization has multiple groups (uncommon).
};
apiInstance.getAllAssets(accessToken, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **groupId** | **Number**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetLocation"></a>
# **getAssetLocation**
> [Object] getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.AssetsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let assetId = 789; // Number | ID of the asset
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getAssetLocation(accessToken, assetId, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **assetId** | **Number**| ID of the asset | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

**[Object]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetReefer"></a>
# **getAssetReefer**
> AssetReeferResponse getAssetReefer(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```javascript
import SamsaraApi from 'samsara_api';

let apiInstance = new SamsaraApi.AssetsApi();
let accessToken = "accessToken_example"; // String | Samsara API access token.
let assetId = 789; // Number | ID of the asset
let startMs = 789; // Number | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
let endMs = 789; // Number | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
apiInstance.getAssetReefer(accessToken, assetId, startMs, endMs, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | 
 **assetId** | **Number**| ID of the asset | 
 **startMs** | **Number**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **Number**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

