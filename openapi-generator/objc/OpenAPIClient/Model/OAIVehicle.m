#import "OAIVehicle.h"

@implementation OAIVehicle

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"engineHours": @"engineHours", @"fuelLevelPercent": @"fuelLevelPercent", @"_id": @"id", @"name": @"name", @"note": @"note", @"odometerMeters": @"odometerMeters", @"vin": @"vin" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"engineHours", @"fuelLevelPercent", @"name", @"note", @"odometerMeters", @"vin"];
  return [optionalProperties containsObject:propertyName];
}

@end
