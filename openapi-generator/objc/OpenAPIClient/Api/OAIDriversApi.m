#import "OAIDriversApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIDriver.h"
#import "OAIDriverForCreate.h"
#import "OAIInlineObject4.h"


@interface OAIDriversApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIDriversApi

NSString* kOAIDriversApiErrorDomain = @"OAIDriversApiErrorDomain";
NSInteger kOAIDriversApiMissingParamErrorCode = 234513;

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
/// /fleet/drivers/create
/// Create a new driver.
///  @param accessToken Samsara API access token. 
///
///  @param createDriverParam Driver creation body 
///
///  @returns OAIDriver*
///
-(NSURLSessionTask*) createDriverWithAccessToken: (NSString*) accessToken
    createDriverParam: (OAIDriverForCreate*) createDriverParam
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDriverParam' is set
    if (createDriverParam == nil) {
        NSParameterAssert(createDriverParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDriverParam"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/create"];

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
    bodyParam = createDriverParam;

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
                              responseType: @"OAIDriver*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriver*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Deactivate a driver with the given id.
///  @param accessToken Samsara API access token. 
///
///  @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
///
///  @returns void
///
-(NSURLSessionTask*) deactivateDriverWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driver_id_or_external_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverIdOrExternalId != nil) {
        pathParams[@"driver_id_or_external_id"] = driverIdOrExternalId;
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
/// /fleet/drivers/inactive
/// Fetch all deactivated drivers for the group.
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @returns NSArray<OAIDriver>*
///
-(NSURLSessionTask*) getAllDeactivatedDriversWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(NSArray<OAIDriver>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/inactive"];

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
                              responseType: @"NSArray<OAIDriver>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIDriver>*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Fetch deactivated driver by id.
///  @param accessToken Samsara API access token. 
///
///  @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
///
///  @returns OAIDriver*
///
-(NSURLSessionTask*) getDeactivatedDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/inactive/{driver_id_or_external_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverIdOrExternalId != nil) {
        pathParams[@"driver_id_or_external_id"] = driverIdOrExternalId;
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
                              responseType: @"OAIDriver*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriver*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Fetch driver by id.
///  @param accessToken Samsara API access token. 
///
///  @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
///
///  @returns OAIDriver*
///
-(NSURLSessionTask*) getDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driver_id_or_external_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverIdOrExternalId != nil) {
        pathParams[@"driver_id_or_external_id"] = driverIdOrExternalId;
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
                              responseType: @"OAIDriver*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriver*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/inactive/{driver_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Reactivate the inactive driver having id.
///  @param accessToken Samsara API access token. 
///
///  @param driverIdOrExternalId ID of the driver.  This must be either the numeric ID generated by Samsara or the external ID of the driver.  External IDs are customer specified key-value pairs. 
///
///  @param reactivateDriverParam  
///
///  @returns OAIDriver*
///
-(NSURLSessionTask*) reactivateDriverByIdWithAccessToken: (NSString*) accessToken
    driverIdOrExternalId: (NSString*) driverIdOrExternalId
    reactivateDriverParam: (OAIInlineObject4*) reactivateDriverParam
    completionHandler: (void (^)(OAIDriver* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'reactivateDriverParam' is set
    if (reactivateDriverParam == nil) {
        NSParameterAssert(reactivateDriverParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"reactivateDriverParam"] };
            NSError* error = [NSError errorWithDomain:kOAIDriversApiErrorDomain code:kOAIDriversApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/inactive/{driver_id_or_external_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverIdOrExternalId != nil) {
        pathParams[@"driver_id_or_external_id"] = driverIdOrExternalId;
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
    bodyParam = reactivateDriverParam;

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
                              responseType: @"OAIDriver*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriver*)data, error);
                                }
                            }];
}



@end
