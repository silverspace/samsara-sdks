#import "SWGDvirBaseMechanicOrAgentSignature.h"

@implementation SWGDvirBaseMechanicOrAgentSignature

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"driverId": @"driverId", @"email": @"email", @"mechanicUserId": @"mechanicUserId", @"name": @"name", @"signedAt": @"signedAt", @"type": @"type", @"username": @"username" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"driverId", @"email", @"mechanicUserId", @"name", @"signedAt", @"type", @"username"];
  return [optionalProperties containsObject:propertyName];
}

@end
