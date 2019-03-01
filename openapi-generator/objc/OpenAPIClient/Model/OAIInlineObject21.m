#import "OAIInlineObject21.h"

@implementation OAIInlineObject21

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.fillMissing = @"withNull";
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"endMs": @"endMs", @"fillMissing": @"fillMissing", @"groupId": @"groupId", @"series": @"series", @"startMs": @"startMs", @"stepMs": @"stepMs" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"fillMissing", ];
  return [optionalProperties containsObject:propertyName];
}

@end
