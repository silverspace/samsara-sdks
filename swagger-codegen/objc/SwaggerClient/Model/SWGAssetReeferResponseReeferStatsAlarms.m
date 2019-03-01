#import "SWGAssetReeferResponseReeferStatsAlarms.h"

@implementation SWGAssetReeferResponseReeferStatsAlarms

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
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"alarmCode": @"alarmCode", @"_description": @"description", @"operatorAction": @"operatorAction", @"severity": @"severity" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"alarmCode", @"_description", @"operatorAction", @"severity"];
  return [optionalProperties containsObject:propertyName];
}

@end
