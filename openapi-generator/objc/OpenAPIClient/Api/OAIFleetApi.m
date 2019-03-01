#import "OAIFleetApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIAddress.h"
#import "OAIAllRouteJobUpdates.h"
#import "OAIAssetReeferResponse.h"
#import "OAIContact.h"
#import "OAIDispatchRoute.h"
#import "OAIDispatchRouteCreate.h"
#import "OAIDispatchRouteHistory.h"
#import "OAIDocument.h"
#import "OAIDocumentCreate.h"
#import "OAIDocumentType.h"
#import "OAIDriver.h"
#import "OAIDriverDailyLogResponse.h"
#import "OAIDriverForCreate.h"
#import "OAIDriverSafetyScoreResponse.h"
#import "OAIDriversResponse.h"
#import "OAIDriversSummaryResponse.h"
#import "OAIDvirBase.h"
#import "OAIDvirListResponse.h"
#import "OAIFleetVehicleLocation.h"
#import "OAIFleetVehicleResponse.h"
#import "OAIHosAuthenticationLogsResponse.h"
#import "OAIHosLogsResponse.h"
#import "OAIHosLogsSummaryResponse.h"
#import "OAIInlineObject.h"
#import "OAIInlineObject1.h"
#import "OAIInlineObject10.h"
#import "OAIInlineObject11.h"
#import "OAIInlineObject12.h"
#import "OAIInlineObject13.h"
#import "OAIInlineObject14.h"
#import "OAIInlineObject15.h"
#import "OAIInlineObject16.h"
#import "OAIInlineObject2.h"
#import "OAIInlineObject3.h"
#import "OAIInlineObject4.h"
#import "OAIInlineObject5.h"
#import "OAIInlineObject6.h"
#import "OAIInlineObject7.h"
#import "OAIInlineObject8.h"
#import "OAIInlineObject9.h"
#import "OAIInlineResponse200.h"
#import "OAIInlineResponse2001.h"
#import "OAIInlineResponse2002.h"
#import "OAIInlineResponse2003.h"
#import "OAIInlineResponse2004.h"
#import "OAIInlineResponse2005.h"
#import "OAITripResponse.h"
#import "OAIVehicleHarshEventResponse.h"
#import "OAIVehicleSafetyScoreResponse.h"


@interface OAIFleetApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIFleetApi

NSString* kOAIFleetApiErrorDomain = @"OAIFleetApiErrorDomain";
NSInteger kOAIFleetApiMissingParamErrorCode = 234513;

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
/// /fleet/add_address
/// This method adds an address book entry to the specified group.
///  @param accessToken Samsara API access token. 
///
///  @param addressParam  
///
///  @returns void
///
-(NSURLSessionTask*) addFleetAddressWithAccessToken: (NSString*) accessToken
    addressParam: (OAIInlineObject2*) addressParam
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'addressParam' is set
    if (addressParam == nil) {
        NSParameterAssert(addressParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/add_address"];

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
    bodyParam = addressParam;

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// /addresses
/// Add one or more addresses to the organization
///  @param accessToken Samsara API access token. 
///
///  @param addresses  
///
///  @returns NSArray<OAIAddress>*
///
-(NSURLSessionTask*) addOrganizationAddressesWithAccessToken: (NSString*) accessToken
    addresses: (OAIInlineObject*) addresses
    completionHandler: (void (^)(NSArray<OAIAddress>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'addresses' is set
    if (addresses == nil) {
        NSParameterAssert(addresses);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addresses"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/addresses"];

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
    bodyParam = addresses;

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
                              responseType: @"NSArray<OAIAddress>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIAddress>*)data, error);
                                }
                            }];
}

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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == nil) {
        NSParameterAssert(createDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDriverParam' is set
    if (createDriverParam == nil) {
        NSParameterAssert(createDriverParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDriverParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == nil) {
        NSParameterAssert(createDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
/// /fleet/drivers/{driver_id:[0-9]+}/documents
/// Create a driver document for the given driver.
///  @param accessToken Samsara API access token. 
///
///  @param driverId ID of the driver for whom the document is created. 
///
///  @param createDocumentParams To create a document for a given document type, the document type's uuid needs to be passed in to documentTypeUuid. The list of fields passed in should match the document type’s list of field types in the correct order. In other words, a field's valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_. 
///
///  @returns OAIDocument*
///
-(NSURLSessionTask*) createDriverDocumentWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    createDocumentParams: (OAIDocumentCreate*) createDocumentParams
    completionHandler: (void (^)(OAIDocument* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDocumentParams' is set
    if (createDocumentParams == nil) {
        NSParameterAssert(createDocumentParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDocumentParams"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driver_id}/documents"];

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
    bodyParam = createDocumentParams;

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
                              responseType: @"OAIDocument*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDocument*)data, error);
                                }
                            }];
}

///
/// /fleet/maintenance/dvirs
/// Create a new dvir, marking a vehicle or trailer safe or unsafe.
///  @param accessToken Samsara API access token. 
///
///  @param createDvirParam  
///
///  @returns OAIDvirBase*
///
-(NSURLSessionTask*) createDvirWithAccessToken: (NSString*) accessToken
    createDvirParam: (OAIInlineObject12*) createDvirParam
    completionHandler: (void (^)(OAIDvirBase* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDvirParam' is set
    if (createDvirParam == nil) {
        NSParameterAssert(createDvirParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDvirParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/maintenance/dvirs"];

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
    bodyParam = createDvirParam;

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
                              responseType: @"OAIDvirBase*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDvirBase*)data, error);
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'createDispatchRouteParams' is set
    if (createDispatchRouteParams == nil) {
        NSParameterAssert(createDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"createDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
/// /addresses/{addressId}
/// Delete an address.
///  @param accessToken Samsara API access token. 
///
///  @param addressId ID of the address/geofence 
///
///  @returns void
///
-(NSURLSessionTask*) deleteOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'addressId' is set
    if (addressId == nil) {
        NSParameterAssert(addressId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/addresses/{addressId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (addressId != nil) {
        pathParams[@"addressId"] = addressId;
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
/// /fleet/assets/locations
/// Fetch current locations of all assets for the group.
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @returns OAIInlineResponse2001*
///
-(NSURLSessionTask*) getAllAssetCurrentLocationsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIInlineResponse2001* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/assets/locations"];

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
                              responseType: @"OAIInlineResponse2001*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2001*)data, error);
                                }
                            }];
}

///
/// /fleet/assets
/// Fetch all of the assets for the group.
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @returns OAIInlineResponse200*
///
-(NSURLSessionTask*) getAllAssetsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIInlineResponse200* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/assets"];

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
                              responseType: @"OAIInlineResponse200*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse200*)data, error);
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
/// /fleet/assets/{assetId:[0-9]+}/locations
/// Fetch the historical locations for the asset.
///  @param accessToken Samsara API access token. 
///
///  @param assetId ID of the asset 
///
///  @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
///
///  @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
///
///  @returns NSArray<NSObject*>*
///
-(NSURLSessionTask*) getAssetLocationWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetId' is set
    if (assetId == nil) {
        NSParameterAssert(assetId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/assets/{asset_id}/locations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assetId != nil) {
        pathParams[@"asset_id"] = assetId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
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
                              responseType: @"NSArray<NSObject*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSObject*>*)data, error);
                                }
                            }];
}

///
/// /fleet/assets/{assetId:[0-9]+}/reefer
/// Fetch the reefer-specific stats of an asset.
///  @param accessToken Samsara API access token. 
///
///  @param assetId ID of the asset 
///
///  @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
///
///  @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
///
///  @returns OAIAssetReeferResponse*
///
-(NSURLSessionTask*) getAssetReeferWithAccessToken: (NSString*) accessToken
    assetId: (NSNumber*) assetId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIAssetReeferResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'assetId' is set
    if (assetId == nil) {
        NSParameterAssert(assetId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"assetId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/assets/{asset_id}/reefer"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (assetId != nil) {
        pathParams[@"asset_id"] = assetId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
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
                              responseType: @"OAIAssetReeferResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAssetReeferResponse*)data, error);
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
/// /fleet/drivers/document_types
/// Fetch all of the document types.
///  @returns NSArray<OAIDocumentType>*
///
-(NSURLSessionTask*) getDriverDocumentTypesByOrgIdWithCompletionHandler: 
    (void (^)(NSArray<OAIDocumentType>* output, NSError* error)) handler {
    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/document_types"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
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
                              responseType: @"NSArray<OAIDocumentType>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIDocumentType>*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/documents
/// Fetch all of the documents.
///  @param accessToken Samsara API access token. 
///
///  @param endMs Time in unix milliseconds that represents the oldest documents to return. Used in combination with durationMs. Defaults to now. (optional)
///
///  @param durationMs Time in milliseconds that represents the duration before endMs to query. Defaults to 24 hours. (optional)
///
///  @returns NSArray<OAIDocument>*
///
-(NSURLSessionTask*) getDriverDocumentsByOrgIdWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    completionHandler: (void (^)(NSArray<OAIDocument>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/documents"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
    }
    if (durationMs != nil) {
        queryParams[@"durationMs"] = durationMs;
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
                              responseType: @"NSArray<OAIDocument>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIDocument>*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/{driverId:[0-9]+}/safety/score
/// Fetch the safety score for the driver.
///  @param driverId ID of the driver 
///
///  @param accessToken Samsara API access token. 
///
///  @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
///
///  @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
///
///  @returns OAIDriverSafetyScoreResponse*
///
-(NSURLSessionTask*) getDriverSafetyScoreWithDriverId: (NSNumber*) driverId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIDriverSafetyScoreResponse* output, NSError* error)) handler {
    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driverId}/safety/score"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (driverId != nil) {
        pathParams[@"driverId"] = driverId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
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
                              responseType: @"OAIDriverSafetyScoreResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriverSafetyScoreResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/maintenance/dvirs
/// Get DVIRs for the org within provided time constraints
///  @param accessToken Samsara API access token. 
///
///  @param endMs time in millis until the last dvir log. 
///
///  @param durationMs time in millis which corresponds to the duration before the end_ms. 
///
///  @param groupId Group ID to query. (optional)
///
///  @returns OAIDvirListResponse*
///
-(NSURLSessionTask*) getDvirsWithAccessToken: (NSString*) accessToken
    endMs: (NSNumber*) endMs
    durationMs: (NSNumber*) durationMs
    groupId: (NSNumber*) groupId
    completionHandler: (void (^)(OAIDvirListResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'durationMs' is set
    if (durationMs == nil) {
        NSParameterAssert(durationMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"durationMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/maintenance/dvirs"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (endMs != nil) {
        queryParams[@"end_ms"] = endMs;
    }
    if (durationMs != nil) {
        queryParams[@"duration_ms"] = durationMs;
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
                              responseType: @"OAIDvirListResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDvirListResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers
/// Get all the drivers for the specified group.
///  @param accessToken Samsara API access token. 
///
///  @param groupDriversParam  
///
///  @returns OAIDriversResponse*
///
-(NSURLSessionTask*) getFleetDriversWithAccessToken: (NSString*) accessToken
    groupDriversParam: (OAIInlineObject3*) groupDriversParam
    completionHandler: (void (^)(OAIDriversResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupDriversParam' is set
    if (groupDriversParam == nil) {
        NSParameterAssert(groupDriversParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupDriversParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers"];

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
    bodyParam = groupDriversParam;

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
                              responseType: @"OAIDriversResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriversResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/{driver_id:[0-9]+}/hos_daily_logs
/// Get summarized daily HOS charts for a specified driver.
///  @param accessToken Samsara API access token. 
///
///  @param driverId ID of the driver with HOS logs. 
///
///  @param hosLogsParam  
///
///  @returns OAIDriverDailyLogResponse*
///
-(NSURLSessionTask*) getFleetDriversHosDailyLogsWithAccessToken: (NSString*) accessToken
    driverId: (NSNumber*) driverId
    hosLogsParam: (OAIInlineObject6*) hosLogsParam
    completionHandler: (void (^)(OAIDriverDailyLogResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverId' is set
    if (driverId == nil) {
        NSParameterAssert(driverId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == nil) {
        NSParameterAssert(hosLogsParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"hosLogsParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/{driver_id}/hos_daily_logs"];

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
    bodyParam = hosLogsParam;

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
                              responseType: @"OAIDriverDailyLogResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriverDailyLogResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/drivers/summary
/// Get the distance and time each driver in an organization has driven in a given time period.
///  @param accessToken Samsara API access token. 
///
///  @param driversSummaryParam  
///
///  @param snapToDayBounds Snap query result to HOS day boundaries. (optional)
///
///  @returns OAIDriversSummaryResponse*
///
-(NSURLSessionTask*) getFleetDriversSummaryWithAccessToken: (NSString*) accessToken
    driversSummaryParam: (OAIInlineObject5*) driversSummaryParam
    snapToDayBounds: (NSNumber*) snapToDayBounds
    completionHandler: (void (^)(OAIDriversSummaryResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driversSummaryParam' is set
    if (driversSummaryParam == nil) {
        NSParameterAssert(driversSummaryParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driversSummaryParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/drivers/summary"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (snapToDayBounds != nil) {
        queryParams[@"snap_to_day_bounds"] = [snapToDayBounds isEqual:@(YES)] ? @"true" : @"false";
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
    bodyParam = driversSummaryParam;

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
                              responseType: @"OAIDriversSummaryResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDriversSummaryResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/hos_authentication_logs
/// Get the HOS (hours of service) signin and signout logs for the specified driver. Only signout logs include location information.
///  @param accessToken Samsara API access token. 
///
///  @param hosAuthenticationLogsParam  
///
///  @returns OAIHosAuthenticationLogsResponse*
///
-(NSURLSessionTask*) getFleetHosAuthenticationLogsWithAccessToken: (NSString*) accessToken
    hosAuthenticationLogsParam: (OAIInlineObject7*) hosAuthenticationLogsParam
    completionHandler: (void (^)(OAIHosAuthenticationLogsResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'hosAuthenticationLogsParam' is set
    if (hosAuthenticationLogsParam == nil) {
        NSParameterAssert(hosAuthenticationLogsParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"hosAuthenticationLogsParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/hos_authentication_logs"];

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
    bodyParam = hosAuthenticationLogsParam;

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
                              responseType: @"OAIHosAuthenticationLogsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIHosAuthenticationLogsResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/hos_logs
/// Get the HOS (hours of service) logs for the specified driver. This method returns all the HOS statuses that the driver was in during this time period.
///  @param accessToken Samsara API access token. 
///
///  @param hosLogsParam  
///
///  @returns OAIHosLogsResponse*
///
-(NSURLSessionTask*) getFleetHosLogsWithAccessToken: (NSString*) accessToken
    hosLogsParam: (OAIInlineObject8*) hosLogsParam
    completionHandler: (void (^)(OAIHosLogsResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == nil) {
        NSParameterAssert(hosLogsParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"hosLogsParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/hos_logs"];

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
    bodyParam = hosLogsParam;

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
                              responseType: @"OAIHosLogsResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIHosLogsResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/hos_logs_summary
/// Get the current HOS status for all drivers in the group.
///  @param accessToken Samsara API access token. 
///
///  @param hosLogsParam  
///
///  @returns OAIHosLogsSummaryResponse*
///
-(NSURLSessionTask*) getFleetHosLogsSummaryWithAccessToken: (NSString*) accessToken
    hosLogsParam: (OAIInlineObject9*) hosLogsParam
    completionHandler: (void (^)(OAIHosLogsSummaryResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'hosLogsParam' is set
    if (hosLogsParam == nil) {
        NSParameterAssert(hosLogsParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"hosLogsParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/hos_logs_summary"];

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
    bodyParam = hosLogsParam;

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
                              responseType: @"OAIHosLogsSummaryResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIHosLogsSummaryResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/locations
/// Get current location of vehicles in a group. This method returns the current location in latitude and longitude of all vehicles in a requested group.
///  @param accessToken Samsara API access token. 
///
///  @param groupParam  
///
///  @returns OAIInlineResponse2003*
///
-(NSURLSessionTask*) getFleetLocationsWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject11*) groupParam
    completionHandler: (void (^)(OAIInlineResponse2003* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupParam' is set
    if (groupParam == nil) {
        NSParameterAssert(groupParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/locations"];

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
    bodyParam = groupParam;

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
                              responseType: @"OAIInlineResponse2003*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2003*)data, error);
                                }
                            }];
}

///
/// /fleet/maintenance/list
/// Get list of the vehicles with any engine faults or check light data.
///  @param accessToken Samsara API access token. 
///
///  @param groupParam  
///
///  @returns OAIInlineResponse2004*
///
-(NSURLSessionTask*) getFleetMaintenanceListWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject13*) groupParam
    completionHandler: (void (^)(OAIInlineResponse2004* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupParam' is set
    if (groupParam == nil) {
        NSParameterAssert(groupParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/maintenance/list"];

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
    bodyParam = groupParam;

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
                              responseType: @"OAIInlineResponse2004*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2004*)data, error);
                                }
                            }];
}

///
/// /fleet/trips
/// Get historical trips data for specified vehicle. This method returns a set of historical trips data for the specified vehicle in the specified time range.
///  @param accessToken Samsara API access token. 
///
///  @param tripsParam  
///
///  @returns OAITripResponse*
///
-(NSURLSessionTask*) getFleetTripsWithAccessToken: (NSString*) accessToken
    tripsParam: (OAIInlineObject15*) tripsParam
    completionHandler: (void (^)(OAITripResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'tripsParam' is set
    if (tripsParam == nil) {
        NSParameterAssert(tripsParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"tripsParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/trips"];

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
    bodyParam = tripsParam;

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
                              responseType: @"OAITripResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAITripResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Gets a specific vehicle.
///  @param accessToken Samsara API access token. 
///
///  @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
///
///  @returns OAIFleetVehicleResponse*
///
-(NSURLSessionTask*) getFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    completionHandler: (void (^)(OAIFleetVehicleResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleIdOrExternalId' is set
    if (vehicleIdOrExternalId == nil) {
        NSParameterAssert(vehicleIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicle_id_or_external_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleIdOrExternalId != nil) {
        pathParams[@"vehicle_id_or_external_id"] = vehicleIdOrExternalId;
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
                              responseType: @"OAIFleetVehicleResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFleetVehicleResponse*)data, error);
                                }
                            }];
}

///
/// /addresses/{addressId}
/// Fetch an address by its id.
///  @param accessToken Samsara API access token. 
///
///  @param addressId ID of the address/geofence 
///
///  @returns OAIAddress*
///
-(NSURLSessionTask*) getOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    completionHandler: (void (^)(OAIAddress* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'addressId' is set
    if (addressId == nil) {
        NSParameterAssert(addressId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/addresses/{addressId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (addressId != nil) {
        pathParams[@"addressId"] = addressId;
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
                              responseType: @"OAIAddress*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIAddress*)data, error);
                                }
                            }];
}

///
/// /addresses
/// Fetch all addresses/geofences for the organization. An address contains either a circle or polygon geofence describing the address boundaries.
///  @param accessToken Samsara API access token. 
///
///  @returns NSArray<OAIAddress>*
///
-(NSURLSessionTask*) getOrganizationAddressesWithAccessToken: (NSString*) accessToken
    completionHandler: (void (^)(NSArray<OAIAddress>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/addresses"];

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
                              responseType: @"NSArray<OAIAddress>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIAddress>*)data, error);
                                }
                            }];
}

///
/// /contacts/{contact_id}
/// Fetch a contact by its id.
///  @param accessToken Samsara API access token. 
///
///  @param contactId ID of the contact 
///
///  @returns OAIContact*
///
-(NSURLSessionTask*) getOrganizationContactWithAccessToken: (NSString*) accessToken
    contactId: (NSNumber*) contactId
    completionHandler: (void (^)(OAIContact* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'contactId' is set
    if (contactId == nil) {
        NSParameterAssert(contactId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"contactId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/contacts/{contact_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (contactId != nil) {
        pathParams[@"contact_id"] = contactId;
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
                              responseType: @"OAIContact*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIContact*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicleId:[0-9]+}/safety/harsh_event
/// Fetch harsh event details for a vehicle.
///  @param vehicleId ID of the vehicle 
///
///  @param accessToken Samsara API access token. 
///
///  @param timestamp Timestamp in milliseconds representing the timestamp of a harsh event. 
///
///  @returns OAIVehicleHarshEventResponse*
///
-(NSURLSessionTask*) getVehicleHarshEventWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    timestamp: (NSNumber*) timestamp
    completionHandler: (void (^)(OAIVehicleHarshEventResponse* output, NSError* error)) handler {
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'timestamp' is set
    if (timestamp == nil) {
        NSParameterAssert(timestamp);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"timestamp"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicleId}/safety/harsh_event"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleId != nil) {
        pathParams[@"vehicleId"] = vehicleId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (timestamp != nil) {
        queryParams[@"timestamp"] = timestamp;
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
                              responseType: @"OAIVehicleHarshEventResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVehicleHarshEventResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicle_id:[0-9]+}/locations
/// Fetch locations for a given vehicle between a start/end time. The maximum query duration is one hour.
///  @param accessToken Samsara API access token. 
///
///  @param vehicleId ID of the vehicle with the associated routes. 
///
///  @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 1 hour) 
///
///  @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 1 hour) 
///
///  @returns NSArray<OAIFleetVehicleLocation>*
///
-(NSURLSessionTask*) getVehicleLocationsWithAccessToken: (NSString*) accessToken
    vehicleId: (NSNumber*) vehicleId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(NSArray<OAIFleetVehicleLocation>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicle_id}/locations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleId != nil) {
        pathParams[@"vehicle_id"] = vehicleId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
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
                              responseType: @"NSArray<OAIFleetVehicleLocation>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIFleetVehicleLocation>*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicleId:[0-9]+}/safety/score
/// Fetch the safety score for the vehicle.
///  @param vehicleId ID of the vehicle 
///
///  @param accessToken Samsara API access token. 
///
///  @param startMs Timestamp in milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. 
///
///  @param endMs Timestamp in milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. 
///
///  @returns OAIVehicleSafetyScoreResponse*
///
-(NSURLSessionTask*) getVehicleSafetyScoreWithVehicleId: (NSNumber*) vehicleId
    accessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIVehicleSafetyScoreResponse* output, NSError* error)) handler {
    // verify the required parameter 'vehicleId' is set
    if (vehicleId == nil) {
        NSParameterAssert(vehicleId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicleId}/safety/score"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleId != nil) {
        pathParams[@"vehicleId"] = vehicleId;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
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
                              responseType: @"OAIVehicleSafetyScoreResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIVehicleSafetyScoreResponse*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/stats
/// Fetch engine state and aux input data for all vehicles in the group between a start/end time. Data returned may be affected by device connectivity and processing time.
///  @param accessToken Samsara API access token. 
///
///  @param startMs Time in Unix epoch milliseconds for the start of the query. 
///
///  @param endMs Time in Unix epoch milliseconds for the end of the query. 
///
///  @param series Comma-separated list of stat types. Options are engineState, auxInput1, and auxInput2. If this parameter is excluded, all 3 stat types will be returned. Example: series=engineState,auxInput2 (optional)
///
///  @param tagIds Comma-separated list of tag ids. Example: tagIds=1,2,3 (optional)
///
///  @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
///
///  @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
///
///  @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)
///
///  @returns OAIInlineResponse2005*
///
-(NSURLSessionTask*) getVehicleStatsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    series: (NSString*) series
    tagIds: (NSString*) tagIds
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIInlineResponse2005* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/stats"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
    }
    if (series != nil) {
        queryParams[@"series"] = series;
    }
    if (tagIds != nil) {
        queryParams[@"tagIds"] = tagIds;
    }
    if (startingAfter != nil) {
        queryParams[@"startingAfter"] = startingAfter;
    }
    if (endingBefore != nil) {
        queryParams[@"endingBefore"] = endingBefore;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
                              responseType: @"OAIInlineResponse2005*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2005*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/locations
/// Fetch locations for a given vehicle between a start/end time. The maximum query duration is 30 minutes.
///  @param accessToken Samsara API access token. 
///
///  @param startMs Time in Unix epoch milliseconds for the start of the query (cannot exceed 30 minutes) 
///
///  @param endMs Time in Unix epoch milliseconds for the end of the query (cannot exceed 30 minutes) 
///
///  @returns NSArray<NSObject*>*
///
-(NSURLSessionTask*) getVehiclesLocationsWithAccessToken: (NSString*) accessToken
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(NSArray<NSObject*>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/locations"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startMs != nil) {
        queryParams[@"startMs"] = startMs;
    }
    if (endMs != nil) {
        queryParams[@"endMs"] = endMs;
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
                              responseType: @"NSArray<NSObject*>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<NSObject*>*)data, error);
                                }
                            }];
}

///
/// /contacts
/// Fetch all contacts for the organization.
///  @param accessToken Samsara API access token. 
///
///  @returns NSArray<OAIContact>*
///
-(NSURLSessionTask*) listContactsWithAccessToken: (NSString*) accessToken
    completionHandler: (void (^)(NSArray<OAIContact>* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/contacts"];

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
                              responseType: @"NSArray<OAIContact>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAIContact>*)data, error);
                                }
                            }];
}

///
/// /fleet/list
/// Get list of the vehicles. This method returns a list of the vehicles in the Samsara Cloud and information about them.
///  @param accessToken Samsara API access token. 
///
///  @param groupParam  
///
///  @param startingAfter Pagination parameter indicating the cursor position to continue returning results after. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'endingBefore' parameter. (optional)
///
///  @param endingBefore Pagination parameter indicating the cursor position to return results before. Used in conjunction with the 'limit' parameter. Mutually exclusive with 'startingAfter' parameter. (optional)
///
///  @param limit Pagination parameter indicating the number of results to return in this request. Used in conjunction with either 'startingAfter' or 'endingBefore'. (optional)
///
///  @returns OAIInlineResponse2002*
///
-(NSURLSessionTask*) listFleetWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject10*) groupParam
    startingAfter: (NSString*) startingAfter
    endingBefore: (NSString*) endingBefore
    limit: (NSNumber*) limit
    completionHandler: (void (^)(OAIInlineResponse2002* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupParam' is set
    if (groupParam == nil) {
        NSParameterAssert(groupParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/list"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (startingAfter != nil) {
        queryParams[@"startingAfter"] = startingAfter;
    }
    if (endingBefore != nil) {
        queryParams[@"endingBefore"] = endingBefore;
    }
    if (limit != nil) {
        queryParams[@"limit"] = limit;
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
    bodyParam = groupParam;

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
                              responseType: @"OAIInlineResponse2002*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2002*)data, error);
                                }
                            }];
}

///
/// /fleet/vehicles/{vehicle_id:[0-9]+ | external_id:[a-zA-Z0-9]+}
/// Updates the specified vehicle using JSON merge patch format. See IETF RFC 7396: https://tools.ietf.org/html/rfc7396.
///  @param accessToken Samsara API access token. 
///
///  @param vehicleIdOrExternalId ID of the vehicle.  This must be either the numeric ID generated by Samsara or the external ID of the vehicle.  External IDs are customer specified key-value pairs. 
///
///  @param data  
///
///  @returns OAIFleetVehicleResponse*
///
-(NSURLSessionTask*) patchFleetVehicleWithAccessToken: (NSString*) accessToken
    vehicleIdOrExternalId: (NSString*) vehicleIdOrExternalId
    data: (OAIInlineObject16*) data
    completionHandler: (void (^)(OAIFleetVehicleResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleIdOrExternalId' is set
    if (vehicleIdOrExternalId == nil) {
        NSParameterAssert(vehicleIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'data' is set
    if (data == nil) {
        NSParameterAssert(data);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"data"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/vehicles/{vehicle_id_or_external_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (vehicleIdOrExternalId != nil) {
        pathParams[@"vehicle_id_or_external_id"] = vehicleIdOrExternalId;
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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json", @"application/merge-patch+json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = data;

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
                              responseType: @"OAIFleetVehicleResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIFleetVehicleResponse*)data, error);
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'driverIdOrExternalId' is set
    if (driverIdOrExternalId == nil) {
        NSParameterAssert(driverIdOrExternalId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"driverIdOrExternalId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'reactivateDriverParam' is set
    if (reactivateDriverParam == nil) {
        NSParameterAssert(reactivateDriverParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"reactivateDriverParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'routeId' is set
    if (routeId == nil) {
        NSParameterAssert(routeId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"routeId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'updateDispatchRouteParams' is set
    if (updateDispatchRouteParams == nil) {
        NSParameterAssert(updateDispatchRouteParams);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"updateDispatchRouteParams"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
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

///
/// /addresses/{addressId}
/// Update the name, formatted address, geofence, notes, or tag and contact Ids for an address. The set of tags or contacts associated with this address will be updated to exactly match the list of IDs passed in. To remove all tags or contacts from an address, pass an empty list; to remove notes, pass an empty string.
///  @param accessToken Samsara API access token. 
///
///  @param addressId ID of the address/geofence 
///
///  @param address  
///
///  @returns void
///
-(NSURLSessionTask*) updateOrganizationAddressWithAccessToken: (NSString*) accessToken
    addressId: (NSNumber*) addressId
    address: (OAIInlineObject1*) address
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'addressId' is set
    if (addressId == nil) {
        NSParameterAssert(addressId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"addressId"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'address' is set
    if (address == nil) {
        NSParameterAssert(address);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"address"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/addresses/{addressId}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (addressId != nil) {
        pathParams[@"addressId"] = addressId;
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
    bodyParam = address;

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// /fleet/set_data
/// This method enables the mutation of metadata for vehicles in the Samsara Cloud.
///  @param accessToken Samsara API access token. 
///
///  @param vehicleUpdateParam  
///
///  @returns void
///
-(NSURLSessionTask*) updateVehiclesWithAccessToken: (NSString*) accessToken
    vehicleUpdateParam: (OAIInlineObject14*) vehicleUpdateParam
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'vehicleUpdateParam' is set
    if (vehicleUpdateParam == nil) {
        NSParameterAssert(vehicleUpdateParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"vehicleUpdateParam"] };
            NSError* error = [NSError errorWithDomain:kOAIFleetApiErrorDomain code:kOAIFleetApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/fleet/set_data"];

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
    bodyParam = vehicleUpdateParam;

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}



@end
