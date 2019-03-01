# OAITagsApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTag**](OAITagsApi.md#createtag) | **POST** /tags | /tags
[**deleteTagById**](OAITagsApi.md#deletetagbyid) | **DELETE** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**getAllTags**](OAITagsApi.md#getalltags) | **GET** /tags | /tags
[**getTagById**](OAITagsApi.md#gettagbyid) | **GET** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**modifyTagById**](OAITagsApi.md#modifytagbyid) | **PATCH** /tags/{tag_id} | /tags/{tag_id:[0-9]+}
[**updateTagById**](OAITagsApi.md#updatetagbyid) | **PUT** /tags/{tag_id} | /tags/{tag_id:[0-9]+}


# **createTag**
```objc
-(NSURLSessionTask*) createTagWithAccessToken: (NSString*) accessToken
    tagCreateParams: (OAITagCreate*) tagCreateParams
        completionHandler: (void (^)(OAITag* output, NSError* error)) handler;
```

/tags

Create a new tag for the group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
OAITagCreate* tagCreateParams = [[OAITagCreate alloc] init]; // 

OAITagsApi*apiInstance = [[OAITagsApi alloc] init];

// /tags
[apiInstance createTagWithAccessToken:accessToken
              tagCreateParams:tagCreateParams
          completionHandler: ^(OAITag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITagsApi->createTag: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagCreateParams** | [**OAITagCreate***](OAITagCreate.md)|  | 

### Return type

[**OAITag***](OAITag.md)

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
NSNumber* tagId = @56; // ID of the tag.

OAITagsApi*apiInstance = [[OAITagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance deleteTagByIdWithAccessToken:accessToken
              tagId:tagId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAITagsApi->deleteTagById: %@", error);
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

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getAllTags**
```objc
-(NSURLSessionTask*) getAllTagsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
        completionHandler: (void (^)(OAIInlineResponse2009* output, NSError* error)) handler;
```

/tags

Fetch all of the tags for a group.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* groupId = @56; // Optional group ID if the organization has multiple groups (uncommon). (optional)

OAITagsApi*apiInstance = [[OAITagsApi alloc] init];

// /tags
[apiInstance getAllTagsWithAccessToken:accessToken
              groupId:groupId
          completionHandler: ^(OAIInlineResponse2009* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITagsApi->getAllTags: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **groupId** | **NSNumber***| Optional group ID if the organization has multiple groups (uncommon). | [optional] 

### Return type

[**OAIInlineResponse2009***](OAIInlineResponse2009.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getTagById**
```objc
-(NSURLSessionTask*) getTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
        completionHandler: (void (^)(OAITag* output, NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Fetch a tag by id.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @56; // ID of the tag.

OAITagsApi*apiInstance = [[OAITagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance getTagByIdWithAccessToken:accessToken
              tagId:tagId
          completionHandler: ^(OAITag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITagsApi->getTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 

### Return type

[**OAITag***](OAITag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modifyTagById**
```objc
-(NSURLSessionTask*) modifyTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    tagModifyParams: (OAITagModify*) tagModifyParams
        completionHandler: (void (^)(OAITag* output, NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Add or delete specific members from a tag, or modify the name of a tag.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @56; // ID of the tag.
OAITagModify* tagModifyParams = [[OAITagModify alloc] init]; // 

OAITagsApi*apiInstance = [[OAITagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance modifyTagByIdWithAccessToken:accessToken
              tagId:tagId
              tagModifyParams:tagModifyParams
          completionHandler: ^(OAITag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITagsApi->modifyTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 
 **tagModifyParams** | [**OAITagModify***](OAITagModify.md)|  | 

### Return type

[**OAITag***](OAITag.md)

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
    updateTagParams: (OAITagUpdate*) updateTagParams
        completionHandler: (void (^)(OAITag* output, NSError* error)) handler;
```

/tags/{tag_id:[0-9]+}

Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* tagId = @56; // ID of the tag.
OAITagUpdate* updateTagParams = [[OAITagUpdate alloc] init]; // 

OAITagsApi*apiInstance = [[OAITagsApi alloc] init];

// /tags/{tag_id:[0-9]+}
[apiInstance updateTagByIdWithAccessToken:accessToken
              tagId:tagId
              updateTagParams:updateTagParams
          completionHandler: ^(OAITag* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITagsApi->updateTagById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **tagId** | **NSNumber***| ID of the tag. | 
 **updateTagParams** | [**OAITagUpdate***](OAITagUpdate.md)|  | 

### Return type

[**OAITag***](OAITag.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

