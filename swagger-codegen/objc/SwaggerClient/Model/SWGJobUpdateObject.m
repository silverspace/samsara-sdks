#import "SWGJobUpdateObject.h"

@implementation SWGJobUpdateObject

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"changedAtMs": @"changed_at_ms", @"jobId": @"job_id", @"jobState": @"job_state", @"prevJobState": @"prev_job_state", @"route": @"route", @"routeId": @"route_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"changedAtMs", @"jobId", @"jobState", @"prevJobState", @"route", @"routeId"];
  return [optionalProperties containsObject:propertyName];
}

@end
