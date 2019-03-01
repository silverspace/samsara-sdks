#import "SWGAssetReeferResponse.h"

@implementation SWGAssetReeferResponse

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"assetType": @"assetType", @"_id": @"id", @"name": @"name", @"reeferStats": @"reeferStats" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"assetType", @"_id", @"name", @"reeferStats"];
  return [optionalProperties containsObject:propertyName];
}

@end
