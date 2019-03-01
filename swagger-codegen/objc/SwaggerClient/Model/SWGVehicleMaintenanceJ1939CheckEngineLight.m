#import "SWGVehicleMaintenanceJ1939CheckEngineLight.h"

@implementation SWGVehicleMaintenanceJ1939CheckEngineLight

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"emissionsIsOn": @"emissionsIsOn", @"protectIsOn": @"protectIsOn", @"stopIsOn": @"stopIsOn", @"warningIsOn": @"warningIsOn" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"emissionsIsOn", @"protectIsOn", @"stopIsOn", @"warningIsOn"];
  return [optionalProperties containsObject:propertyName];
}

@end
