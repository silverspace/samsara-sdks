#import "SWGVehicleMaintenanceJ1939DiagnosticTroubleCodes.h"

@implementation SWGVehicleMaintenanceJ1939DiagnosticTroubleCodes

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"fmiId": @"fmiId", @"fmiText": @"fmiText", @"occurrenceCount": @"occurrenceCount", @"spnDescription": @"spnDescription", @"spnId": @"spnId", @"txId": @"txId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fmiId", @"fmiText", @"occurrenceCount", @"spnDescription", @"spnId", @"txId"];
  return [optionalProperties containsObject:propertyName];
}

@end
