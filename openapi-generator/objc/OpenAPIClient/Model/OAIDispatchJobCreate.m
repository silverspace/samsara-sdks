#import "OAIDispatchJobCreate.h"

@implementation OAIDispatchJobCreate

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"destinationAddress": @"destination_address", @"destinationAddressId": @"destination_address_id", @"destinationLat": @"destination_lat", @"destinationLng": @"destination_lng", @"destinationName": @"destination_name", @"notes": @"notes", @"scheduledArrivalTimeMs": @"scheduled_arrival_time_ms", @"scheduledDepartureTimeMs": @"scheduled_departure_time_ms" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"destinationAddress", @"destinationAddressId", @"destinationLat", @"destinationLng", @"destinationName", @"notes", @"scheduledDepartureTimeMs"];
  return [optionalProperties containsObject:propertyName];
}

@end
