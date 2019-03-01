#import "SWGHosLogsResponseLogs.h"

@implementation SWGHosLogsResponseLogs

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"codriverIds": @"codriverIds", @"driverId": @"driverId", @"groupId": @"groupId", @"locCity": @"locCity", @"locLat": @"locLat", @"locLng": @"locLng", @"locName": @"locName", @"locState": @"locState", @"logStartMs": @"logStartMs", @"remark": @"remark", @"statusType": @"statusType", @"vehicleId": @"vehicleId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"codriverIds", @"driverId", @"groupId", @"locCity", @"locLat", @"locLng", @"locName", @"locState", @"logStartMs", @"remark", @"statusType", @"vehicleId"];
  return [optionalProperties containsObject:propertyName];
}

@end
