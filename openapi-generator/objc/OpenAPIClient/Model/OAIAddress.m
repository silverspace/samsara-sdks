#import "OAIAddress.h"

@implementation OAIAddress

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"contacts": @"contacts", @"formattedAddress": @"formattedAddress", @"geofence": @"geofence", @"_id": @"id", @"name": @"name", @"notes": @"notes", @"tags": @"tags" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"contacts", @"formattedAddress", @"geofence", @"_id", @"name", @"notes", @"tags"];
  return [optionalProperties containsObject:propertyName];
}

@end
