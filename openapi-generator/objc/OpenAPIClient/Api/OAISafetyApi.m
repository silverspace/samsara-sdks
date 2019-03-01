#import "OAISafetyApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIDriverSafetyScoreResponse.h"
#import "OAIVehicleHarshEventResponse.h"
#import "OAIVehicleSafetyScoreResponse.h"


@interface OAISafetyApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAISafetyApi

NSString* kOAISafetyApiErrorDomain = @"OAISafetyApiErrorDomain";
NSInteger kOAISafetyApiMissingParamErrorCode = 234513;

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
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'timestamp' is set
    if (timestamp == nil) {
        NSParameterAssert(timestamp);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"timestamp"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
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
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'startMs' is set
    if (startMs == nil) {
        NSParameterAssert(startMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"startMs"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'endMs' is set
    if (endMs == nil) {
        NSParameterAssert(endMs);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"endMs"] };
            NSError* error = [NSError errorWithDomain:kOAISafetyApiErrorDomain code:kOAISafetyApiMissingParamErrorCode userInfo:userInfo];
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



@end
