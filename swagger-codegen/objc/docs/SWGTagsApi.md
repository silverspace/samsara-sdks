# SWGTagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](SWGTagsApi.md#createtag) | **POST** /tags | /tags
[**deleteTagById**](SWGTagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**getAllTags**](SWGTagsApi.md#getalltags) | **GET** /tags | /tags
[**getTagById**](SWGTagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modifyTagById**](SWGTagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**updateTagById**](SWGTagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **createTag**
```objc
-(NSURLSessionTask*) createTagWithAccessToken: (NSString*) accessToken
    tagCreateParams: (SWGTagCreate*) tagCreateParams
        completionHandler: (void (^)(SWGTag* output, NSError* error)) handler;
```

/tags

Create a new tag for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
SWGTagCreate* tagCreateParams = [[SWGTagCreate alloc] init]; // 

SWGTagsApi*apiInstance = [[SWGTagsApi alloc] init];

// /tags
[apiInstance createTagWithAccessToken:accessToken
              tagCreateParams:tagCreateParams
          completionHandler: ^(SWGTag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTagsApi->createTag: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagCreateParams** | [**SWGTagCreate***](SWGTagCreate.md)|  | 

### Return type

[**SWGTag***](SWGTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **deleteTagById**
```objc
-(NSURLSessionTask*) deleteTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
        completionHandler: (void (^)(NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Permanently deletes a tag.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @789; // ID of the tag.

SWGTagsApi*apiInstance = [[SWGTagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance deleteTagByIdWithAccessToken:accessToken
              tagId:tagId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGTagsApi->deleteTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllTags**
```objc
-(NSURLSessionTask*) getAllTagsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(SWGInlineResponse2009* output, NSError* error)) handler;
```

/tags

Fetch all of the tags for a group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @789; // Optional group ID if the organization has multiple groups (uncommon). (optional)

SWGTagsApi*apiInstance = [[SWGTagsApi alloc] init];

// /tags
[apiInstance getAllTagsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(SWGInlineResponse2009* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTagsApi->getAllTags: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**SWGInlineResponse2009***](SWGInlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTagById**
```objc
-(NSURLSessionTask*) getTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
        completionHandler: (void (^)(SWGTag* output, NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @789; // ID of the tag.

SWGTagsApi*apiInstance = [[SWGTagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance getTagByIdWithAccessToken:accessToken
              tagId:tagId
          completionHandler: ^(SWGTag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTagsApi->getTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 

### Return type

[**SWGTag***](SWGTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyTagById**
```objc
-(NSURLSessionTask*) modifyTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    tagModifyParams: (SWGTagModify*) tagModifyParams
        completionHandler: (void (^)(SWGTag* output, NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @789; // ID of the tag.
SWGTagModify* tagModifyParams = [[SWGTagModify alloc] init]; // 

SWGTagsApi*apiInstance = [[SWGTagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance modifyTagByIdWithAccessToken:accessToken
              tagId:tagId
              tagModifyParams:tagModifyParams
          completionHandler: ^(SWGTag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTagsApi->modifyTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 
 **tagModifyParams** | [**SWGTagModify***](SWGTagModify.md)|  | 

### Return type

[**SWGTag***](SWGTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateTagById**
```objc
-(NSURLSessionTask*) updateTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    updateTagParams: (SWGTagUpdate*) updateTagParams
        completionHandler: (void (^)(SWGTag* output, NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @789; // ID of the tag.
SWGTagUpdate* updateTagParams = [[SWGTagUpdate alloc] init]; // 

SWGTagsApi*apiInstance = [[SWGTagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance updateTagByIdWithAccessToken:accessToken
              tagId:tagId
              updateTagParams:updateTagParams
          completionHandler: ^(SWGTag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGTagsApi->updateTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 
 **updateTagParams** | [**SWGTagUpdate***](SWGTagUpdate.md)|  | 

### Return type

[**SWGTag***](SWGTag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

