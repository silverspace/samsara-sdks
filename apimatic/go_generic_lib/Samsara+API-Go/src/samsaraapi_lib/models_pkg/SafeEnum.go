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
 * Type definition for SafeEnum enum
 */
type SafeEnum int

/**
 * Value collection for SafeEnum enum
 */
const (
    Safe_SAFE SafeEnum = 1 + iota
    Safe_UNSAFE
)

func (r SafeEnum) MarshalJSON() ([]byte, error) { 
    s := SafeEnumToValue(r)
    return json.Marshal(s) 
} 

func (r *SafeEnum) UnmarshalJSON(data []byte) error { 
    var s string 
    json.Unmarshal(data, &s)
    v :=  SafeEnumFromValue(s)
    *r = v 
    return nil 
 } 


/**
 * Converts SafeEnum to its string representation
 */
func SafeEnumToValue(safeEnum SafeEnum) string {
    switch safeEnum {
        case Safe_SAFE:
    		return "safe"		
        case Safe_UNSAFE:
    		return "unsafe"		
        default:
        	return "safe"
    }
}

/**
 * Converts SafeEnum Array to its string Array representation
*/
func SafeEnumArrayToValue(safeEnum []SafeEnum) []string {
    convArray := make([]string,len( safeEnum))
    for i:=0; i<len(safeEnum);i++ {
        convArray[i] = SafeEnumToValue(safeEnum[i])
    }
    return convArray
}


/**
 * Converts given value to its enum representation
 */
func SafeEnumFromValue(value string) SafeEnum {
    switch value {
        case "safe":
            return Safe_SAFE
        case "unsafe":
            return Safe_UNSAFE
        default:
            return Safe_SAFE
    }
}