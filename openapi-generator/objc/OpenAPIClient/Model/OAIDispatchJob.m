#import "OAIDispatchJob.h"

@implementation OAIDispatchJob

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"destinationAddress": @"destination_address", @"destinationAddressId": @"destination_address_id", @"destinationLat": @"destination_lat", @"destinationLng": @"destination_lng", @"destinationName": @"destination_name", @"notes": @"notes", @"scheduledArrivalTimeMs": @"scheduled_arrival_time_ms", @"scheduledDepartureTimeMs": @"scheduled_departure_time_ms", @"arrivedAtMs": @"arrived_at_ms", @"completedAtMs": @"completed_at_ms", @"dispatchRouteId": @"dispatch_route_id", @"driverId": @"driver_id", @"enRouteAtMs": @"en_route_at_ms", @"estimatedArrivalMs": @"estimated_arrival_ms", @"fleetViewerUrl": @"fleet_viewer_url", @"groupId": @"group_id", @"_id": @"id", @"jobState": @"job_state", @"skippedAtMs": @"skipped_at_ms", @"vehicleId": @"vehicle_id" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"destinationAddress", @"destinationAddressId", @"destinationLat", @"destinationLng", @"destinationName", @"notes", @"scheduledDepartureTimeMs", @"arrivedAtMs", @"completedAtMs", @"driverId", @"enRouteAtMs", @"estimatedArrivalMs", @"fleetViewerUrl", @"skippedAtMs", @"vehicleId"];
  return [optionalProperties containsObject:propertyName];
}

@end
