#import "SWGDriverBase.h"

@implementation SWGDriverBase

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.eldPcEnabled = @(NO);
    self.eldYmEnabled = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"eldAdverseWeatherExemptionEnabled": @"eldAdverseWeatherExemptionEnabled", @"eldBigDayExemptionEnabled": @"eldBigDayExemptionEnabled", @"eldDayStartHour": @"eldDayStartHour", @"eldExempt": @"eldExempt", @"eldExemptReason": @"eldExemptReason", @"eldPcEnabled": @"eldPcEnabled", @"eldYmEnabled": @"eldYmEnabled", @"externalIds": @"externalIds", @"groupId": @"groupId", @"licenseNumber": @"licenseNumber", @"licenseState": @"licenseState", @"name": @"name", @"notes": @"notes", @"phone": @"phone", @"username": @"username", @"vehicleId": @"vehicleId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"eldAdverseWeatherExemptionEnabled", @"eldBigDayExemptionEnabled", @"eldDayStartHour", @"eldExempt", @"eldExemptReason", @"eldPcEnabled", @"eldYmEnabled", @"externalIds", @"groupId", @"licenseNumber", @"licenseState", @"notes", @"phone", @"username", @"vehicleId"];
  return [optionalProperties containsObject:propertyName];
}

@end
