#import "OAIVehicleLocation.h"

@implementation OAIVehicleLocation

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"heading": @"heading", @"_id": @"id", @"latitude": @"latitude", @"location": @"location", @"longitude": @"longitude", @"name": @"name", @"odometerMeters": @"odometerMeters", @"onTrip": @"onTrip", @"speed": @"speed", @"time": @"time", @"vin": @"vin" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"heading", @"latitude", @"location", @"longitude", @"name", @"odometerMeters", @"onTrip", @"speed", @"time", @"vin"];
  return [optionalProperties containsObject:propertyName];
}

@end
