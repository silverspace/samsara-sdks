# SWGAssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](SWGAssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](SWGAssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](SWGAssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](SWGAssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **getAllAssetCurrentLocations**
```objc
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(SWGInlineResponse2001* output, NSError* error)) handler;
```

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGAssetsApi*apiInstance = [[SWGAssetsApi alloc] init];

// /fleet/assets/locations
[apiInstance getAllAssetCurrentLocationsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(SWGInlineResponse2001* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAssetsApi->getAllAssetCurrentLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**SWGInlineResponse2001***](SWGInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssets**
```objc
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(SWGInlineResponse200* output, NSError* error)) handler;
```

/fleet/assets

Fetch all of the assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGAssetsApi*apiInstance = [[SWGAssetsApi alloc] init];

// /fleet/assets
[apiInstance getAllAssetsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(SWGInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAssetsApi->getAllAssets: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**SWGInlineResponse200***](SWGInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetLocation**
```objc
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGAssetLocationResponse* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @789; // ID of the asset
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGAssetsApi*apiInstance = [[SWGAssetsApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/locations
[apiInstance getAssetLocationWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGAssetLocationResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAssetsApi->getAssetLocation: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **assetId** | **NSNumber***| ID of the asset | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**SWGAssetLocationResponse***](SWGAssetLocationResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetReefer**
```objc
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(SWGAssetReeferResponse* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @789; // ID of the asset
NSNumber* startMs = @789; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @789; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

SWGAssetsApi*apiInstance = [[SWGAssetsApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/reefer
[apiInstance getAssetReeferWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(SWGAssetReeferResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGAssetsApi->getAssetReefer: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **assetId** | **NSNumber***| ID of the asset | 
 **startMs** | **NSNumber***| Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. | 
 **endMs** | **NSNumber***| Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. | 

### Return type

[**SWGAssetReeferResponse***](SWGAssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

