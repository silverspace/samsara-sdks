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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    val result : InlineResponse2001 = apiInstance.getAllAssetCurrentLocations(accessToken, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAllAssetCurrentLocations")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAllAssetCurrentLocations")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val groupId : kotlin.Long = 789 // kotlin.Long | Optional group ID if the organization has multiple groups (uncommon).
try {
    val result : InlineResponse200 = apiInstance.getAllAssets(accessToken, groupId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAllAssets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAllAssets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **groupId** | **kotlin.Long**| Optional group ID if the organization has multiple groups (uncommon). | [optional] [default to null]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAssetLocation"></a>
# **getAssetLocation**
> kotlin.Array&lt;kotlin.Any&gt; getAssetLocation(accessToken, assetId, startMs, endMs)

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val assetId : kotlin.Long = 789 // kotlin.Long | ID of the asset
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : kotlin.Array<kotlin.Any> = apiInstance.getAssetLocation(accessToken, assetId, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetLocation")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetLocation")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **assetId** | **kotlin.Long**| ID of the asset | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**kotlin.Array&lt;kotlin.Any&gt;**](kotlin.Any.md)

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
```kotlin
// Import classes:
//import org.openapitools.client.infrastructure.*
//import org.openapitools.client.models.*

val apiInstance = AssetsApi()
val accessToken : kotlin.String = accessToken_example // kotlin.String | Samsara API access token.
val assetId : kotlin.Long = 789 // kotlin.Long | ID of the asset
val startMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
val endMs : kotlin.Long = 789 // kotlin.Long | Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.
try {
    val result : AssetReeferResponse = apiInstance.getAssetReefer(accessToken, assetId, startMs, endMs)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AssetsApi#getAssetReefer")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AssetsApi#getAssetReefer")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **kotlin.String**| Samsara API access token. | [default to null]
 **assetId** | **kotlin.Long**| ID of the asset | [default to null]
 **startMs** | **kotlin.Long**| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | [default to null]
 **endMs** | **kotlin.Long**| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | [default to null]

### Return type

[**AssetReeferResponse**](AssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

