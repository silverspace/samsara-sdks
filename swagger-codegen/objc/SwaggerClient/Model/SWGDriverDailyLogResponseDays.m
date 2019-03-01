#import "SWGDriverDailyLogResponseDays.h"

@implementation SWGDriverDailyLogResponseDays

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"activeHours": @"activeHours", @"activeMs": @"activeMs", @"certified": @"certified", @"certifiedAtMs": @"certifiedAtMs", @"distanceMiles": @"distanceMiles", @"endMs": @"endMs", @"startMs": @"startMs", @"trailerIds": @"trailerIds", @"vehicleIds": @"vehicleIds" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"activeHours", @"activeMs", @"certified", @"certifiedAtMs", @"distanceMiles", @"endMs", @"startMs", @"trailerIds", @"vehicleIds"];
  return [optionalProperties containsObject:propertyName];
}

@end
