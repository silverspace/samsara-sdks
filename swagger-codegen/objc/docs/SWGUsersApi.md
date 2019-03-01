# SWGUsersApi

All URIs are relative to *https://api.samsara.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUserById**](SWGUsersApi.md#deleteuserbyid) | **DELETE** /users/{userId} | /users/{userId:[0-9]+}
[**getUserById**](SWGUsersApi.md#getuserbyid) | **GET** /users/{userId} | /users/{userId:[0-9]+}
[**listUserRoles**](SWGUsersApi.md#listuserroles) | **GET** /user_roles | /user_roles
[**listUsers**](SWGUsersApi.md#listusers) | **GET** /users | /users


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
NSNumber* userId = @789; // ID of the user.

SWGUsersApi*apiInstance = [[SWGUsersApi alloc] init];

// /users/{userId:[0-9]+}
[apiInstance deleteUserByIdWithAccessToken:accessToken
              userId:userId
          completionHandler: ^(NSError* error) {
                        if (error) {
                            NSLog(@"Error calling SWGUsersApi->deleteUserById: %@", error);
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

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getUserById**
```objc
-(NSURLSessionTask*) getUserByIdWithAccessToken: (NSString*) accessToken
    userId: (NSNumber*) userId
        completionHandler: (void (^)(SWGUser* output, NSError* error)) handler;
```

/users/{userId:[0-9]+}

Get a user.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.
NSNumber* userId = @789; // ID of the user.

SWGUsersApi*apiInstance = [[SWGUsersApi alloc] init];

// /users/{userId:[0-9]+}
[apiInstance getUserByIdWithAccessToken:accessToken
              userId:userId
          completionHandler: ^(SWGUser* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUsersApi->getUserById: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 
 **userId** | **NSNumber***| ID of the user. | 

### Return type

[**SWGUser***](SWGUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUserRoles**
```objc
-(NSURLSessionTask*) listUserRolesWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<SWGUserRole>* output, NSError* error)) handler;
```

/user_roles

Get all roles in the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

SWGUsersApi*apiInstance = [[SWGUsersApi alloc] init];

// /user_roles
[apiInstance listUserRolesWithAccessToken:accessToken
          completionHandler: ^(NSArray<SWGUserRole>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUsersApi->listUserRoles: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<SWGUserRole>***](SWGUserRole.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **listUsers**
```objc
-(NSURLSessionTask*) listUsersWithAccessToken: (NSString*) accessToken
        completionHandler: (void (^)(NSArray<SWGUser>* output, NSError* error)) handler;
```

/users

List all users in the organization.

### Example 
```objc

NSString* accessToken = @"accessToken_example"; // Samsara API access token.

SWGUsersApi*apiInstance = [[SWGUsersApi alloc] init];

// /users
[apiInstance listUsersWithAccessToken:accessToken
          completionHandler: ^(NSArray<SWGUser>* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling SWGUsersApi->listUsers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accessToken** | **NSString***| Samsara API access token. | 

### Return type

[**NSArray<SWGUser>***](SWGUser.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

