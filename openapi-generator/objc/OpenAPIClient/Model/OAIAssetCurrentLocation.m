#import "OAIAssetCurrentLocation.h"

@implementation OAIAssetCurrentLocation

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"latitude": @"latitude", @"location": @"location", @"longitude": @"longitude", @"speedMilesPerHour": @"speedMilesPerHour", @"timeMs": @"timeMs" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"latitude", @"location", @"longitude", @"speedMilesPerHour", @"timeMs"];
  return [optionalProperties containsObject:propertyName];
}

@end