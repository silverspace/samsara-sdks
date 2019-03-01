#import "OAIDriversSummaryResponseSummaries.h"

@implementation OAIDriversSummaryResponseSummaries

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"driverId": @"driverId", @"distanceMiles": @"distanceMiles", @"driveMs": @"driveMs", @"activeMs": @"activeMs", @"driverUsername": @"driverUsername", @"groupId": @"groupId", @"driverName": @"driverName", @"onDutyMs": @"onDutyMs" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"driverId", @"distanceMiles", @"driveMs", @"activeMs", @"driverUsername", @"groupId", @"driverName", @"onDutyMs"];
  return [optionalProperties containsObject:propertyName];
}

@end
