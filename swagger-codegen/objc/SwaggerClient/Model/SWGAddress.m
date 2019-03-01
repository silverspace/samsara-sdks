#import "SWGAddress.h"

@implementation SWGAddress

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"contactIds": @"contactIds", @"formattedAddress": @"formattedAddress", @"geofence": @"geofence", @"name": @"name", @"notes": @"notes", @"tagIds": @"tagIds" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"contactIds", @"formattedAddress", @"geofence", @"name", @"notes", @"tagIds"];
  return [optionalProperties containsObject:propertyName];
}

@end
