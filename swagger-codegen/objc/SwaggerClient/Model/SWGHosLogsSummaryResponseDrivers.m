#import "SWGHosLogsSummaryResponseDrivers.h"

@implementation SWGHosLogsSummaryResponseDrivers

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"cycleRemaining": @"cycleRemaining", @"cycleTomorrow": @"cycleTomorrow", @"driverId": @"driverId", @"driverName": @"driverName", @"drivingInViolationCycle": @"drivingInViolationCycle", @"drivingInViolationToday": @"drivingInViolationToday", @"dutyStatus": @"dutyStatus", @"shiftDriveRemaining": @"shiftDriveRemaining", @"shiftRemaining": @"shiftRemaining", @"timeInCurrentStatus": @"timeInCurrentStatus", @"timeUntilBreak": @"timeUntilBreak", @"vehicleName": @"vehicleName" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"cycleRemaining", @"cycleTomorrow", @"driverId", @"driverName", @"drivingInViolationCycle", @"drivingInViolationToday", @"dutyStatus", @"shiftDriveRemaining", @"shiftRemaining", @"timeInCurrentStatus", @"timeUntilBreak", @"vehicleName"];
  return [optionalProperties containsObject:propertyName];
}

@end
