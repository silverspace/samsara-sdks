#import "SWGTag.h"

@implementation SWGTag

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"addresses": @"addresses", @"assets": @"assets", @"drivers": @"drivers", @"groupId": @"groupId", @"_id": @"id", @"machines": @"machines", @"name": @"name", @"parentTagId": @"parentTagId", @"sensors": @"sensors", @"vehicles": @"vehicles" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"addresses", @"assets", @"drivers", @"groupId", @"machines", @"parentTagId", @"sensors", @"vehicles"];
  return [optionalProperties containsObject:propertyName];
}

@end
