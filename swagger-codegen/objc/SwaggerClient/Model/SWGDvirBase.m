#import "SWGDvirBase.h"

@implementation SWGDvirBase

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"authorSignature": @"authorSignature", @"defectsCorrected": @"defectsCorrected", @"defectsNeedNotBeCorrected": @"defectsNeedNotBeCorrected", @"_id": @"id", @"inspectionType": @"inspectionType", @"mechanicNotes": @"mechanicNotes", @"mechanicOrAgentSignature": @"mechanicOrAgentSignature", @"nextDriverSignature": @"nextDriverSignature", @"odometerMiles": @"odometerMiles", @"timeMs": @"timeMs", @"trailerDefects": @"trailerDefects", @"trailerId": @"trailerId", @"trailerName": @"trailerName", @"vehicle": @"vehicle", @"vehicleCondition": @"vehicleCondition", @"vehicleDefects": @"vehicleDefects" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"authorSignature", @"defectsCorrected", @"defectsNeedNotBeCorrected", @"_id", @"inspectionType", @"mechanicNotes", @"mechanicOrAgentSignature", @"nextDriverSignature", @"odometerMiles", @"timeMs", @"trailerDefects", @"trailerId", @"trailerName", @"vehicle", @"vehicleCondition", @"vehicleDefects"];
  return [optionalProperties containsObject:propertyName];
}

@end
