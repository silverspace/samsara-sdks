# OAIUsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](OAIUsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**getUserById**](OAIUsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**listUserRoles**](OAIUsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
[**listUsers**](OAIUsersApi.md#listusers) | **GET** /users | /users


# **deleteUserById**
```objc
-(NSURLSessionTask*) deleteUserByIdWithAccessToken: (NSString*) accessToken
    userId: (NSNumber*) userId
        completionHandler: (void (^)(NSError* error)) handler;
```

/users/{userId:[0-9]+}

Remove a user from the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* userId = @56; // ID of the user.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// /users/{userId:[0-9]+}
[apiInstance deleteUserByIdWithAccessToken:accessToken
              userId:userId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->deleteUserById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **userId** | **NSNumber***| ID of the user. | 

### Return type

void (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserById**
```objc
-(NSURLSessionTask*) getUserByIdWithAccessToken: (NSString*) accessToken
    userId: (NSNumber*) userId
        completionHandler: (void (^)(OAIUser* output, NSError* error)) handler;
```

/users/{userId:[0-9]+}

Get a user.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* userId = @56; // ID of the user.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// /users/{userId:[0-9]+}
[apiInstance getUserByIdWithAccessToken:accessToken
              userId:userId
          completionHandler: ^(OAIUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->getUserById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **userId** | **NSNumber***| ID of the user. | 

### Return type

[**OAIUser***](OAIUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUserRoles**
```objc
-(NSURLSessionTask*) listUserRolesWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<OAIUserRole>* output, NSError* error)) handler;
```

/user_roles

Get all roles in the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// /user_roles
[apiInstance listUserRolesWithAccessToken:accessToken
          completionHandler: ^(NSArray<OAIUserRole>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->listUserRoles: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<OAIUserRole>***](OAIUserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUsers**
```objc
-(NSURLSessionTask*) listUsersWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<OAIUser>* output, NSError* error)) handler;
```

/users

List all users in the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

OAIUsersApi*apiInstance = [[OAIUsersApi alloc] init];

// /users
[apiInstance listUsersWithAccessToken:accessToken
          completionHandler: ^(NSArray<OAIUser>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIUsersApi->listUsers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<OAIUser>***](OAIUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

