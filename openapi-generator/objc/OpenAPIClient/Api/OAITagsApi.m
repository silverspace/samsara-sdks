#import "OAITagsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIInlineResponse2009.h"
#import "OAITag.h"
#import "OAITagCreate.h"
#import "OAITagModify.h"
#import "OAITagUpdate.h"


@interface OAITagsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAITagsApi

NSString* kOAITagsApiErrorDomain = @"OAITagsApiErrorDomain";
NSInteger kOAITagsApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// /tags
/// Create a new tag for the group.
///  @param accessToken Samsara API access token. 
///
///  @param tagCreateParams  
///
///  @returns OAITag*
///
-(NSURLSessionTask*) createTagWithAccessToken: (NSString*) accessToken
    tagCreateParams: (OAITagCreate*) tagCreateParams
    completionHandler: (void (^)(OAITag* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'tagCreateParams' is set
    if (tagCreateParams == nil) {
        NSParameterAssert(tagCreateParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tagCreateParams"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/tags"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = tagCreateParams;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAITag*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITag*)data, error);
                                }
                            }];
}

///
/// /tags/{tag_id:[0-9]+}
/// Permanently deletes a tag.
///  @param accessToken Samsara API access token. 
///
///  @param tagId ID of the tag. 
///
///  @returns void
///
-(NSURLSessionTask*) deleteTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'tagId' is set
    if (tagId == nil) {
        NSParameterAssert(tagId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tagId"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/tags/{tag_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (tagId != nil) {
        pathParams[@"tag_id"] = tagId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// /tags
/// Fetch all of the tags for a group.
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @returns OAIInlineResponse2009*
///
-(NSURLSessionTask*) getAllTagsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIInlineResponse2009* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/tags"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (groupId != nil) {
        queryParams[@"group_id"] = groupId;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAIInlineResponse2009*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2009*)data, error);
                                }
                            }];
}

///
/// /tags/{tag_id:[0-9]+}
/// Fetch a tag by id.
///  @param accessToken Samsara API access token. 
///
///  @param tagId ID of the tag. 
///
///  @returns OAITag*
///
-(NSURLSessionTask*) getTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    completionHandler: (void (^)(OAITag* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'tagId' is set
    if (tagId == nil) {
        NSParameterAssert(tagId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tagId"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/tags/{tag_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (tagId != nil) {
        pathParams[@"tag_id"] = tagId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAITag*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITag*)data, error);
                                }
                            }];
}

///
/// /tags/{tag_id:[0-9]+}
/// Add or delete specific members from a tag, or modify the name of a tag.
///  @param accessToken Samsara API access token. 
///
///  @param tagId ID of the tag. 
///
///  @param tagModifyParams  
///
///  @returns OAITag*
///
-(NSURLSessionTask*) modifyTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    tagModifyParams: (OAITagModify*) tagModifyParams
    completionHandler: (void (^)(OAITag* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'tagId' is set
    if (tagId == nil) {
        NSParameterAssert(tagId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tagId"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'tagModifyParams' is set
    if (tagModifyParams == nil) {
        NSParameterAssert(tagModifyParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tagModifyParams"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/tags/{tag_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (tagId != nil) {
        pathParams[@"tag_id"] = tagId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = tagModifyParams;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PATCH"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAITag*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITag*)data, error);
                                }
                            }];
}

///
/// /tags/{tag_id:[0-9]+}
/// Update a tag with a new name and new members. This API call would replace all old members of a tag with new members specified in the request body. To modify only a few devices associated with a tag use the PATCH endpoint.
///  @param accessToken Samsara API access token. 
///
///  @param tagId ID of the tag. 
///
///  @param updateTagParams  
///
///  @returns OAITag*
///
-(NSURLSessionTask*) updateTagByIdWithAccessToken: (NSString*) accessToken
    tagId: (NSNumber*) tagId
    updateTagParams: (OAITagUpdate*) updateTagParams
    completionHandler: (void (^)(OAITag* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'tagId' is set
    if (tagId == nil) {
        NSParameterAssert(tagId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tagId"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'updateTagParams' is set
    if (updateTagParams == nil) {
        NSParameterAssert(updateTagParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateTagParams"] };
            NSError* error = [NSError errorWithDomain:kOAITagsApiErrorDomain code:kOAITagsApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/tags/{tag_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (tagId != nil) {
        pathParams[@"tag_id"] = tagId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = updateTagParams;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAITag*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITag*)data, error);
                                }
                            }];
}



@end
