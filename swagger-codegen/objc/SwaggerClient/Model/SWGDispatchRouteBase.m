#import "SWGDispatchRouteBase.h"

@implementation SWGDispatchRouteBase

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"actualEndMs": @"actual_end_ms", @"actualStartMs": @"actual_start_ms", @"driverId": @"driver_id", @"groupId": @"group_id", @"name": @"name", @"scheduledEndMs": @"scheduled_end_ms", @"scheduledMeters": @"scheduled_meters", @"scheduledStartMs": @"scheduled_start_ms", @"startLocationAddress": @"start_location_address", @"startLocationAddressId": @"start_location_address_id", @"startLocationLat": @"start_location_lat", @"startLocationLng": @"start_location_lng", @"startLocationName": @"start_location_name", @"trailerId": @"trailer_id", @"vehicleId": @"vehicle_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"actualEndMs", @"actualStartMs", @"driverId", @"groupId", @"scheduledMeters", @"startLocationAddress", @"startLocationAddressId", @"startLocationLat", @"startLocationLng", @"startLocationName", @"trailerId", @"vehicleId"];
  return [optionalProperties containsObject:propertyName];
}

@end
