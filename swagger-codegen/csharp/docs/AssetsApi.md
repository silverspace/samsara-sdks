# samsara.Api.AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllAssetCurrentLocations**](AssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**GetAllAssets**](AssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
[**GetAssetLocation**](AssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**GetAssetReefer**](AssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


<a name="getallassetcurrentlocations"></a>
# **GetAllAssetCurrentLocations**
> InlineResponse2001 GetAllAssetCurrentLocations (string accessToken, long? groupId = null)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetAllAssetCurrentLocationsExample
    {
        public void main()
        {
            var apiInstance = new AssetsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /fleet/assets/locations
                InlineResponse2001 result = apiInstance.GetAllAssetCurrentLocations(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AssetsApi.GetAllAssetCurrentLocations: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallassets"></a>
# **GetAllAssets**
> InlineResponse200 GetAllAssets (string accessToken, long? groupId = null)

/fleet/assets

Fetch all of the assets for the group.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetAllAssetsExample
    {
        public void main()
        {
            var apiInstance = new AssetsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var groupId = 789;  // long? | Optional group ID if the organization has multiple groups (uncommon). (optional) 

            try
            {
                // /fleet/assets
                InlineResponse200 result = apiInstance.GetAllAssets(accessToken, groupId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AssetsApi.GetAllAssets: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **groupId** | **long?**| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getassetlocation"></a>
# **GetAssetLocation**
> AssetLocationResponse GetAssetLocation (string accessToken, long? assetId, long? startMs, long? endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetAssetLocationExample
    {
        public void main()
        {
            var apiInstance = new AssetsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var assetId = 789;  // long? | ID of the asset
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/assets/{assetId:[0-9]+}/locations
                AssetLocationResponse result = apiInstance.GetAssetLocation(accessToken, assetId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AssetsApi.GetAssetLocation: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **assetId** | **long?**| ID of the asset | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetLocationResponse**](AssetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getassetreefer"></a>
# **GetAssetReefer**
> AssetReeferResponse GetAssetReefer (string accessToken, long? assetId, long? startMs, long? endMs)

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example
```csharp
using System;
using System.Diagnostics;
using samsara.Api;
using samsara.Client;
using samsara.Model;

namespace Example
{
    public class GetAssetReeferExample
    {
        public void main()
        {
            var apiInstance = new AssetsApi();
            var accessToken = accessToken_example;  // string | Samsara API access token.
            var assetId = 789;  // long? | ID of the asset
            var startMs = 789;  // long? | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
            var endMs = 789;  // long? | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

            try
            {
                // /fleet/assets/{assetId:[0-9]+}/reefer
                AssetReeferResponse result = apiInstance.GetAssetReefer(accessToken, assetId, startMs, endMs);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AssetsApi.GetAssetReefer: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **string**| Samsara API access token. | 
 **assetId** | **long?**| ID of the asset | 
 **startMs** | **long?**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **long?**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

