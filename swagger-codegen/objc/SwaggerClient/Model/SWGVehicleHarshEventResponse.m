#import "SWGVehicleHarshEventResponse.h"

@implementation SWGVehicleHarshEventResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"downloadForwardVideoUrl": @"downloadForwardVideoUrl", @"downloadInwardVideoUrl": @"downloadInwardVideoUrl", @"downloadTrackedInwardVideoUrl": @"downloadTrackedInwardVideoUrl", @"harshEventType": @"harshEventType", @"incidentReportUrl": @"incidentReportUrl", @"isDistracted": @"isDistracted", @"location": @"location" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"downloadForwardVideoUrl", @"downloadInwardVideoUrl", @"downloadTrackedInwardVideoUrl", @"isDistracted", @"location"];
  return [optionalProperties containsObject:propertyName];
}

@end
