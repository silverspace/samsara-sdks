#import "SWGAssetReeferResponseReeferStats.h"

@implementation SWGAssetReeferResponseReeferStats

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"alarms": @"alarms", @"engineHours": @"engineHours", @"fuelPercentage": @"fuelPercentage", @"powerStatus": @"powerStatus", @"returnAirTemp": @"returnAirTemp", @"setPoint": @"setPoint" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"alarms", @"engineHours", @"fuelPercentage", @"powerStatus", @"returnAirTemp", @"setPoint"];
  return [optionalProperties containsObject:propertyName];
}

@end
