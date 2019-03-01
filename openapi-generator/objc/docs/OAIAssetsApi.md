# OAIAssetsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllAssetCurrentLocations**](OAIAssetsApi.md#getallassetcurrentlocations) | **GET** /fleet/assets/locations | /fleet/assets/locations
[**getAllAssets**](OAIAssetsApi.md#getallassets) | **GET** /fleet/assets | /fleet/assets
[**getAssetLocation**](OAIAssetsApi.md#getassetlocation) | **GET** /fleet/assets/{asset_id}/locations | /fleet/assets/{assetId:[0-9]+}/locations
[**getAssetReefer**](OAIAssetsApi.md#getassetreefer) | **GET** /fleet/assets/{asset_id}/reefer | /fleet/assets/{assetId:[0-9]+}/reefer


# **getAllAssetCurrentLocations**
```objc
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(OAIInlineResponse2001* output, NSError* error)) handler;
```

/fleet/assets/locations

Fetch current locations of all assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAIAssetsApi*apiInstance = [[OAIAssetsApi alloc] init];

// /fleet/assets/locations
[apiInstance getAllAssetCurrentLocationsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(OAIInlineResponse2001* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssetsApi->getAllAssetCurrentLocations: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**OAIInlineResponse2001***](OAIInlineResponse2001.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllAssets**
```objc
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(OAIInlineResponse200* output, NSError* error)) handler;
```

/fleet/assets

Fetch all of the assets for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAIAssetsApi*apiInstance = [[OAIAssetsApi alloc] init];

// /fleet/assets
[apiInstance getAllAssetsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(OAIInlineResponse200* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssetsApi->getAllAssets: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**OAIInlineResponse200***](OAIInlineResponse200.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetLocation**
```objc
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/locations

Fetch the historical locations for the asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @56; // ID of the asset
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAIAssetsApi*apiInstance = [[OAIAssetsApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/locations
[apiInstance getAssetLocationWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(NSArray<NSObject*>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssetsApi->getAssetLocation: %@", error);
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

**NSArray<NSObject*>***

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAssetReefer**
```objc
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
        completionHandler: (void (^)(OAIAssetReeferResponse* output, NSError* error)) handler;
```

/fleet/assets/{assetId:[0-9]+}/reefer

Fetch the reefer-specific stats of an asset.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* assetId = @56; // ID of the asset
NSNumber* startMs = @56; // Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs.
NSNumber* endMs = @56; // Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs.

OAIAssetsApi*apiInstance = [[OAIAssetsApi alloc] init];

// /fleet/assets/{assetId:[0-9]+}/reefer
[apiInstance getAssetReeferWithAccessToken:accessToken
              assetId:assetId
              startMs:startMs
              endMs:endMs
          completionHandler: ^(OAIAssetReeferResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIAssetsApi->getAssetReefer: %@", error);
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

[**OAIAssetReeferResponse***](OAIAssetReeferResponse.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

