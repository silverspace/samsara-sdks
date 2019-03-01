#import "OAIIndustrialApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIDataInputHistoryResponse.h"
#import "OAIInlineObject17.h"
#import "OAIInlineObject18.h"
#import "OAIInlineResponse2006.h"
#import "OAIInlineResponse2007.h"
#import "OAIMachineHistoryResponse.h"


@interface OAIIndustrialApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAIIndustrialApi

NSString* kOAIIndustrialApiErrorDomain = @"OAIIndustrialApiErrorDomain";
NSInteger kOAIIndustrialApiMissingParamErrorCode = 234513;

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
/// /industrial/data
/// Fetch all of the data inputs for a group.
///  @param accessToken Samsara API access token. 
///
///  @param groupId Optional group ID if the organization has multiple groups (uncommon). (optional)
///
///  @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
///
///  @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
///
///  @returns OAIInlineResponse2006*
///
-(NSURLSessionTask*) getAllDataInputsWithAccessToken: (NSString*) accessToken
    groupId: (NSNumber*) groupId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIInlineResponse2006* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/industrial/data"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (accessToken != nil) {
        queryParams[@"access_token"] = accessToken;
    }
    if (groupId != nil) {
        queryParams[@"group_id"] = groupId;
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
                              responseType: @"OAIInlineResponse2006*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2006*)data, error);
                                }
                            }];
}

///
/// /industrial/data/{data_input_id:[0-9]+}
/// Fetch datapoints from a given data input.
///  @param accessToken Samsara API access token. 
///
///  @param dataInputId ID of the data input 
///
///  @param startMs Timestamp in unix milliseconds representing the start of the period to fetch, inclusive. Used in combination with endMs. defaults to nowMs. (optional)
///
///  @param endMs Timestamp in unix milliseconds representing the end of the period to fetch, inclusive. Used in combination with startMs. Defaults to nowMs. (optional)
///
///  @returns OAIDataInputHistoryResponse*
///
-(NSURLSessionTask*) getDataInputWithAccessToken: (NSString*) accessToken
    dataInputId: (NSNumber*) dataInputId
    startMs: (NSNumber*) startMs
    endMs: (NSNumber*) endMs
    completionHandler: (void (^)(OAIDataInputHistoryResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'dataInputId' is set
    if (dataInputId == nil) {
        NSParameterAssert(dataInputId);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"dataInputId"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/industrial/data/{data_input_id}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (dataInputId != nil) {
        pathParams[@"data_input_id"] = dataInputId;
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
                              responseType: @"OAIDataInputHistoryResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIDataInputHistoryResponse*)data, error);
                                }
                            }];
}

///
/// /machines/list
/// Get machine objects. This method returns a list of the machine objects in the Samsara Cloud and information about them.
///  @param accessToken Samsara API access token. 
///
///  @param groupParam  
///
///  @returns OAIInlineResponse2007*
///
-(NSURLSessionTask*) getMachinesWithAccessToken: (NSString*) accessToken
    groupParam: (OAIInlineObject18*) groupParam
    completionHandler: (void (^)(OAIInlineResponse2007* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'groupParam' is set
    if (groupParam == nil) {
        NSParameterAssert(groupParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"groupParam"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/machines/list"];

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
                              responseType: @"OAIInlineResponse2007*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIInlineResponse2007*)data, error);
                                }
                            }];
}

///
/// /machines/history
/// Get historical data for machine objects. This method returns a set of historical data for all machines in a group
///  @param accessToken Samsara API access token. 
///
///  @param historyParam  
///
///  @returns OAIMachineHistoryResponse*
///
-(NSURLSessionTask*) getMachinesHistoryWithAccessToken: (NSString*) accessToken
    historyParam: (OAIInlineObject17*) historyParam
    completionHandler: (void (^)(OAIMachineHistoryResponse* output, NSError* error)) handler {
    // verify the required parameter 'accessToken' is set
    if (accessToken == nil) {
        NSParameterAssert(accessToken);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"accessToken"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    // verify the required parameter 'historyParam' is set
    if (historyParam == nil) {
        NSParameterAssert(historyParam);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"historyParam"] };
            NSError* error = [NSError errorWithDomain:kOAIIndustrialApiErrorDomain code:kOAIIndustrialApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/machines/history"];

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
    bodyParam = historyParam;

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
                              responseType: @"OAIMachineHistoryResponse*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIMachineHistoryResponse*)data, error);
                                }
                            }];
}



@end
