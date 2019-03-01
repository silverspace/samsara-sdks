#import "OAIVehicleMaintenanceJ1939DiagnosticTroubleCodes.h"

@implementation OAIVehicleMaintenanceJ1939DiagnosticTroubleCodes

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"spnDescription": @"spnDescription", @"fmiText": @"fmiText", @"spnId": @"spnId", @"occurrenceCount": @"occurrenceCount", @"txId": @"txId", @"fmiId": @"fmiId" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"spnDescription", @"fmiText", @"spnId", @"occurrenceCount", @"txId", @"fmiId"];
  return [optionalProperties containsObject:propertyName];
}

@end
