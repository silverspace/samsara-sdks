#import "OAIHosLogsSummaryResponseDrivers.h"

@implementation OAIHosLogsSummaryResponseDrivers

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"timeUntilBreak": @"timeUntilBreak", @"vehicleName": @"vehicleName", @"drivingInViolationToday": @"drivingInViolationToday", @"driverId": @"driverId", @"cycleRemaining": @"cycleRemaining", @"driverName": @"driverName", @"dutyStatus": @"dutyStatus", @"cycleTomorrow": @"cycleTomorrow", @"shiftDriveRemaining": @"shiftDriveRemaining", @"timeInCurrentStatus": @"timeInCurrentStatus", @"drivingInViolationCycle": @"drivingInViolationCycle", @"shiftRemaining": @"shiftRemaining" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"timeUntilBreak", @"vehicleName", @"drivingInViolationToday", @"driverId", @"cycleRemaining", @"driverName", @"dutyStatus", @"cycleTomorrow", @"shiftDriveRemaining", @"timeInCurrentStatus", @"drivingInViolationCycle", @"shiftRemaining"];
  return [optionalProperties containsObject:propertyName];
}

@end
