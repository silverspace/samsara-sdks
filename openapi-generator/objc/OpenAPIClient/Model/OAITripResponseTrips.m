#import "OAITripResponseTrips.h"

@implementation OAITripResponseTrips

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"endOdometer": @"endOdometer", @"distanceMeters": @"distanceMeters", @"endMs": @"endMs", @"startMs": @"startMs", @"fuelConsumedMl": @"fuelConsumedMl", @"startAddress": @"startAddress", @"startCoordinates": @"startCoordinates", @"endCoordinates": @"endCoordinates", @"startOdometer": @"startOdometer", @"driverId": @"driverId", @"startLocation": @"startLocation", @"tollMeters": @"tollMeters", @"endAddress": @"endAddress", @"endLocation": @"endLocation" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"endOdometer", @"distanceMeters", @"endMs", @"startMs", @"fuelConsumedMl", @"startAddress", @"startCoordinates", @"endCoordinates", @"startOdometer", @"driverId", @"startLocation", @"tollMeters", @"endAddress", @"endLocation"];
  return [optionalProperties containsObject:propertyName];
}

@end
