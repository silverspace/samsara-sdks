#import "OAIInlineResponse2005VehicleStats.h"

@implementation OAIInlineResponse2005VehicleStats

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"engineState": @"engineState", @"auxInput2": @"auxInput2", @"vehicleId": @"vehicleId", @"auxInput1": @"auxInput1" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"engineState", @"auxInput2", @"auxInput1"];
  return [optionalProperties containsObject:propertyName];
}

@end
