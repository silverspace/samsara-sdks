#import "SWGTripResponseTrips.h"

@implementation SWGTripResponseTrips

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"distanceMeters": @"distanceMeters", @"driverId": @"driverId", @"endAddress": @"endAddress", @"endCoordinates": @"endCoordinates", @"endLocation": @"endLocation", @"endMs": @"endMs", @"endOdometer": @"endOdometer", @"fuelConsumedMl": @"fuelConsumedMl", @"startAddress": @"startAddress", @"startCoordinates": @"startCoordinates", @"startLocation": @"startLocation", @"startMs": @"startMs", @"startOdometer": @"startOdometer", @"tollMeters": @"tollMeters" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"distanceMeters", @"driverId", @"endAddress", @"endCoordinates", @"endLocation", @"endMs", @"endOdometer", @"fuelConsumedMl", @"startAddress", @"startCoordinates", @"startLocation", @"startMs", @"startOdometer", @"tollMeters"];
  return [optionalProperties containsObject:propertyName];
}

@end
