#import "SWGUser.h"

@implementation SWGUser

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"authType": @"authType", @"email": @"email", @"name": @"name", @"organizationRoleId": @"organizationRoleId", @"_id": @"id", @"organizationRole": @"organizationRole", @"tagRoles": @"tagRoles" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"name", @"organizationRoleId", @"_id", @"organizationRole", @"tagRoles"];
  return [optionalProperties containsObject:propertyName];
}

@end
