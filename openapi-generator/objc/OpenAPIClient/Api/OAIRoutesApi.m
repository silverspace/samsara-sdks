#import "OAIRoutesApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAllRouteJobUpdates.h"
#import "OAIDispatchRoute.h"
#import "OAIDispatchRouteCreate.h"
#import "OAIDispatchRouteHistory.h"


@interface OAIRoutesApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIRoutesApi

NSString* kOAIRoutesApiErrorDomain = @"OAIRoutesApiErrorDomain";
NSInteger kOAIRoutesApiMissingParamErrorCode = 234513;

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
/// /fleet/dispatch/routes
/// Create a new dispatch route.
///  @param accessToken Samsara API access token. 
///
///  @param createDispatchRouteParams  
///
///  @returns OAIDispatchRoute*
///
-(NSURLSessionTask*) createDispatchRouteWithAccessToken: (NSString*) accessToken
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == nil) {
        NSParameterAssert(createDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes"];

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
    bodyParam = createDispatchRouteParams;

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
                              responseType: @"OAIDispatchRoute*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDispatchRoute*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
/// Create a new dispatch route for the driver with driver_id.
///  @param accessToken Samsara API access token. 
///
///  @param driverId ID of the driver with the associated routes. 
///
///  @param createDispatchRouteParams  
///
///  @returns OAIDispatchRoute*
///
-(NSURLSessionTask*) createDriverDispatchRouteWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == nil) {
        NSParameterAssert(createDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driver_id}/dispatch/routes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverId != nil) {
        pathParams[@"driver_id"] = driverId;
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
    bodyParam = createDispatchRouteParams;

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
                              responseType: @"OAIDispatchRoute*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDispatchRoute*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
/// Create a new dispatch route for the vehicle with vehicle_id.
///  @param accessToken Samsara API access token. 
///
///  @param vehicleId ID of the vehicle with the associated routes. 
///
///  @param createDispatchRouteParams  
///
///  @returns OAIDispatchRoute*
///
-(NSURLSessionTask*) createVehicleDispatchRouteWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    createDispatchRouteParams: (OAIDispatchRouteCreate*) createDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == nil) {
        NSParameterAssert(createDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicle_id}/dispatch/routes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleId != nil) {
        pathParams[@"vehicle_id"] = vehicleId;
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
    bodyParam = createDispatchRouteParams;

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
                              responseType: @"OAIDispatchRoute*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDispatchRoute*)data, error);
                                }
                            }];
}

///
/// /fleet/dispatch/routes/{route_id:[0-9]+}/
/// Delete a dispatch route and its associated jobs.
///  @param accessToken Samsara API access token. 
///
///  @param routeId ID of the dispatch route. 
///
///  @returns void
///
-(NSURLSessionTask*) deleteDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes/{route_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (routeId != nil) {
        pathParams[@"route_id"] = routeId;
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
/// /fleet/dispatch/routes
/// Fetch all of the dispatch routes for the group.
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
///
///  @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
///
///  @returns NSArray<OAIDispatchRoute>*
///
-(NSURLSessionTask*) fetchAllDispatchRoutesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (groupId != nil) {
        queryParams[@"group_id"] = groupId;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (duration != nil) {
        queryParams[@"duration"] = duration;
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
                              responseType: @"NSArray<OAIDispatchRoute>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIDispatchRoute>*)data, error);
                                }
                            }];
}

///
/// /fleet/dispatch/routes/job_updates
/// Fetch all updates to a job including route data in the last 24 hours or subsequent to an sequence ID
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @param sequenceId Sequence ID from the response payload of the last request. Defaults to fetching updates from last 24 hours. (optional)
///
///  @param include Optionally set include=route to include route object in response payload. (optional)
///
///  @returns OAIAllRouteJobUpdates*
///
-(NSURLSessionTask*) fetchAllRouteJobUpdatesWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    sequenceId: (NSString*) sequenceId
    include: (NSString*) include
    completionHandler: (void (^)(OAIAllRouteJobUpdates* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes/job_updates"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (groupId != nil) {
        queryParams[@"group_id"] = groupId;
    }
    if (sequenceId != nil) {
        queryParams[@"sequence_id"] = sequenceId;
    }
    if (include != nil) {
        queryParams[@"include"] = include;
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
                              responseType: @"OAIAllRouteJobUpdates*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAllRouteJobUpdates*)data, error);
                                }
                            }];
}

///
/// /fleet/dispatch/routes/{route_id:[0-9]+}
/// Fetch a dispatch route by id.
///  @param accessToken Samsara API access token. 
///
///  @param routeId ID of the dispatch route. 
///
///  @returns OAIDispatchRoute*
///
-(NSURLSessionTask*) getDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes/{route_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (routeId != nil) {
        pathParams[@"route_id"] = routeId;
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
                              responseType: @"OAIDispatchRoute*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDispatchRoute*)data, error);
                                }
                            }];
}

///
/// /fleet/dispatch/routes/{route_id:[0-9]+}/history
/// Fetch the history of a dispatch route.
///  @param accessToken Samsara API access token. 
///
///  @param routeId ID of the route with history. 
///
///  @param startTime Timestamp representing the start of the period to fetch, inclusive. Used in combination with end_time. Defaults to 0. (optional)
///
///  @param endTime Timestamp representing the end of the period to fetch, inclusive. Used in combination with start_time. Defaults to nowMs. (optional)
///
///  @returns OAIDispatchRouteHistory*
///
-(NSURLSessionTask*) getDispatchRouteHistoryWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    startTime: (NSNumber*) startTime
    endTime: (NSNumber*) endTime
    completionHandler: (void (^)(OAIDispatchRouteHistory* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes/{route_id}/history"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (routeId != nil) {
        pathParams[@"route_id"] = routeId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startTime != nil) {
        queryParams[@"start_time"] = startTime;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
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
                              responseType: @"OAIDispatchRouteHistory*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDispatchRouteHistory*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/{driver_id:[0-9]+}/dispatch/routes
/// Fetch all of the dispatch routes for a given driver.
///  @param accessToken Samsara API access token. 
///
///  @param driverId ID of the driver with the associated routes. 
///
///  @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
///
///  @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
///
///  @returns NSArray<OAIDispatchRoute>*
///
-(NSURLSessionTask*) getDispatchRoutesByDriverIdWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driver_id}/dispatch/routes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverId != nil) {
        pathParams[@"driver_id"] = driverId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (duration != nil) {
        queryParams[@"duration"] = duration;
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
                              responseType: @"NSArray<OAIDispatchRoute>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIDispatchRoute>*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicle_id:[0-9]+}/dispatch/routes
/// Fetch all of the dispatch routes for a given vehicle.
///  @param accessToken Samsara API access token. 
///
///  @param vehicleId ID of the vehicle with the associated routes. 
///
///  @param endTime Time in unix milliseconds that represents the oldest routes to return. Used in combination with duration. Defaults to now. (optional)
///
///  @param duration Time in milliseconds that represents the duration before end_time to query. Defaults to 24 hours. (optional)
///
///  @returns NSArray<OAIDispatchRoute>*
///
-(NSURLSessionTask*) getDispatchRoutesByVehicleIdWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    endTime: (NSNumber*) endTime
    duration: (NSNumber*) duration
    completionHandler: (void (^)(NSArray<OAIDispatchRoute>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicle_id}/dispatch/routes"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleId != nil) {
        pathParams[@"vehicle_id"] = vehicleId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (endTime != nil) {
        queryParams[@"end_time"] = endTime;
    }
    if (duration != nil) {
        queryParams[@"duration"] = duration;
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
                              responseType: @"NSArray<OAIDispatchRoute>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIDispatchRoute>*)data, error);
                                }
                            }];
}

///
/// /fleet/dispatch/routes/{route_id:[0-9]+}/
/// Update a dispatch route and its associated jobs.
///  @param accessToken Samsara API access token. 
///
///  @param routeId ID of the dispatch route. 
///
///  @param updateDispatchRouteParams  
///
///  @returns OAIDispatchRoute*
///
-(NSURLSessionTask*) updateDispatchRouteByIdWithAccessToken: (NSString*) accessToken
    routeId: (NSNumber*) routeId
    updateDispatchRouteParams: (OAIDispatchRoute*) updateDispatchRouteParams
    completionHandler: (void (^)(OAIDispatchRoute* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'updateDispatchRouteParams' is set
    if (updateDispatchRouteParams == nil) {
        NSParameterAssert(updateDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIRoutesApiErrorDomain code:kOAIRoutesApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/dispatch/routes/{route_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (routeId != nil) {
        pathParams[@"route_id"] = routeId;
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
    bodyParam = updateDispatchRouteParams;

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
                              responseType: @"OAIDispatchRoute*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDispatchRoute*)data, error);
                                }
                            }];
}



@end
