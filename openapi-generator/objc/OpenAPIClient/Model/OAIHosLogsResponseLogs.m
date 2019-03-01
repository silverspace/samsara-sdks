#import "OAIHosLogsResponseLogs.h"

@implementation OAIHosLogsResponseLogs

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"locLng": @"locLng", @"logStartMs": @"logStartMs", @"driverId": @"driverId", @"statusType": @"statusType", @"locCity": @"locCity", @"groupId": @"groupId", @"locName": @"locName", @"locLat": @"locLat", @"remark": @"remark", @"locState": @"locState", @"vehicleId": @"vehicleId", @"codriverIds": @"codriverIds" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"locLng", @"logStartMs", @"driverId", @"statusType", @"locCity", @"groupId", @"locName", @"locLat", @"remark", @"locState", @"vehicleId", @"codriverIds"];
  return [optionalProperties containsObject:propertyName];
}

@end
