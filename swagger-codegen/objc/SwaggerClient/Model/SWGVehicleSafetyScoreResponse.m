#import "SWGVehicleSafetyScoreResponse.h"

@implementation SWGVehicleSafetyScoreResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"crashCount": @"crashCount", @"harshAccelCount": @"harshAccelCount", @"harshBrakingCount": @"harshBrakingCount", @"harshEvents": @"harshEvents", @"harshTurningCount": @"harshTurningCount", @"safetyScore": @"safetyScore", @"safetyScoreRank": @"safetyScoreRank", @"timeOverSpeedLimitMs": @"timeOverSpeedLimitMs", @"totalDistanceDrivenMeters": @"totalDistanceDrivenMeters", @"totalHarshEventCount": @"totalHarshEventCount", @"totalTimeDrivenMs": @"totalTimeDrivenMs", @"vehicleId": @"vehicleId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"crashCount", @"harshAccelCount", @"harshBrakingCount", @"harshEvents", @"harshTurningCount", @"safetyScore", @"safetyScoreRank", @"timeOverSpeedLimitMs", @"totalDistanceDrivenMeters", @"totalHarshEventCount", @"totalTimeDrivenMs", @"vehicleId"];
  return [optionalProperties containsObject:propertyName];
}

@end
