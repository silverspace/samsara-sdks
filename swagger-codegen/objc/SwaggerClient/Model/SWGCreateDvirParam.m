#import "SWGCreateDvirParam.h"

@implementation SWGCreateDvirParam

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"inspectionType": @"inspectionType", @"mechanicNotes": @"mechanicNotes", @"odometerMiles": @"odometerMiles", @"previousDefectsCorrected": @"previousDefectsCorrected", @"previousDefectsIgnored": @"previousDefectsIgnored", @"safe": @"safe", @"trailerId": @"trailerId", @"userEmail": @"userEmail", @"vehicleId": @"vehicleId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"mechanicNotes", @"odometerMiles", @"previousDefectsCorrected", @"previousDefectsIgnored", @"trailerId", @"vehicleId"];
  return [optionalProperties containsObject:propertyName];
}

@end
