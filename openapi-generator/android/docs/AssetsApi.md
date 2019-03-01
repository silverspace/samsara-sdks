# AssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](AssetsApi.md#getAllAssetCurrentLocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](AssetsApi.md#getAllAssets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](AssetsApi.md#getAssetLocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](AssetsApi.md#getAssetReefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


<a name="getAllAssetCurrentLocations"></a>
# **getAllAssetCurrentLocations**
> InlineResponse2001 getAllAssetCurrentLocations(accessToken, groupId)

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.api.AssetsApi;

AssetsApi apiInstance = new AssetsApi();
String accessToken = null; // String | Samsara API access token.
Long groupId = null; // Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    InlineResponse2001 result = apiInstance.getAllAssetCurrentLocations(accessToken, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getAllAssetCurrentLocations");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllAssets"></a>
# **getAllAssets**
> InlineResponse200 getAllAssets(accessToken, groupId)

/fleet/assets

Fetch all of the assets for the group.

### Example
```java
// Import classes:
//import org.openapitools.client.api.AssetsApi;

AssetsApi apiInstance = new AssetsApi();
String accessToken = null; // String | Samsara API access token.
Long groupId = null; // Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    InlineResponse200 result = apiInstance.getAllAssets(accessToken, groupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getAllAssets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **groupId** | **Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetLocation"></a>
# **getAssetLocation**
> List&lt;Object&gt; getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```java
// Import classes:
//import org.openapitools.client.api.AssetsApi;

AssetsApi apiInstance = new AssetsApi();
String accessToken = null; // String | Samsara API access token.
Long assetId = null; // Long | ID of the asset
Long startMs = null; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = null; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    List<Object> result = apiInstance.getAssetLocation(accessToken, assetId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getAssetLocation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **assetId** | **Long**| ID of the asset | [default to null]
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

**List&lt;Object&gt;**

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
```java
// Import classes:
//import org.openapitools.client.api.AssetsApi;

AssetsApi apiInstance = new AssetsApi();
String accessToken = null; // String | Samsara API access token.
Long assetId = null; // Long | ID of the asset
Long startMs = null; // Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
Long endMs = null; // Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    AssetReeferResponse result = apiInstance.getAssetReefer(accessToken, assetId, startMs, endMs);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AssetsApi#getAssetReefer");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **String**| Samsara API access token. | [default to null]
 **assetId** | **Long**| ID of the asset | [default to null]
 **startMs** | **Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

