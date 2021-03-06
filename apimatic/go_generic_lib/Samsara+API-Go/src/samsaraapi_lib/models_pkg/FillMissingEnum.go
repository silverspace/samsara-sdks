/*
 * samsaraapi_lib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

package models_pkg

import(
    "encoding/json"
)

/**
 * Type definition for FillMissingEnum enum
 */
type FillMissingEnum int

/**
 * Value collection for FillMissingEnum enum
 */
const (
    FillMissing_WITHNULL FillMissingEnum = 1 + iota
    FillMissing_WITHPREVIOUS
)

func (r FillMissingEnum) MarshalJSON() ([]byte, error) { 
    s := FillMissingEnumToValue(r)
    return json.Marshal(s) 
} 

func (r *FillMissingEnum) UnmarshalJSON(data []byte) error { 
    var s string 
    json.Unmarshal(data, &s)
    v :=  FillMissingEnumFromValue(s)
    *r = v 
    return nil 
 } 


/**
 * Converts FillMissingEnum to its string representation
 */
func FillMissingEnumToValue(fillMissingEnum FillMissingEnum) string {
    switch fillMissingEnum {
        case FillMissing_WITHNULL:
    		return "withNull"		
        case FillMissing_WITHPREVIOUS:
    		return "withPrevious"		
        default:
        	return "withNull"
    }
}

/**
 * Converts FillMissingEnum Array to its string Array representation
*/
func FillMissingEnumArrayToValue(fillMissingEnum []FillMissingEnum) []string {
    convArray := make([]string,len( fillMissingEnum))
    for i:=0; i<len(fillMissingEnum);i++ {
        convArray[i] = FillMissingEnumToValue(fillMissingEnum[i])
    }
    return convArray
}


/**
 * Converts given value to its enum representation
 */
func FillMissingEnumFromValue(value string) FillMissingEnum {
    switch value {
        case "withNull":
            return FillMissing_WITHNULL
        case "withPrevious":
            return FillMissing_WITHPREVIOUS
        default:
            return FillMissing_WITHNULL
    }
}
