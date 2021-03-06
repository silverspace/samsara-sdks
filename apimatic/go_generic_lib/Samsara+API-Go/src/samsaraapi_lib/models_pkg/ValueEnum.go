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
 * Type definition for ValueEnum enum
 */
type ValueEnum int

/**
 * Value collection for ValueEnum enum
 */
const (
    Value_RUNNING ValueEnum = 1 + iota
    Value_OFF
    Value_IDLE
)

func (r ValueEnum) MarshalJSON() ([]byte, error) { 
    s := ValueEnumToValue(r)
    return json.Marshal(s) 
} 

func (r *ValueEnum) UnmarshalJSON(data []byte) error { 
    var s string 
    json.Unmarshal(data, &s)
    v :=  ValueEnumFromValue(s)
    *r = v 
    return nil 
 } 


/**
 * Converts ValueEnum to its string representation
 */
func ValueEnumToValue(valueEnum ValueEnum) string {
    switch valueEnum {
        case Value_RUNNING:
    		return "Running"		
        case Value_OFF:
    		return "Off"		
        case Value_IDLE:
    		return "Idle"		
        default:
        	return "Running"
    }
}

/**
 * Converts ValueEnum Array to its string Array representation
*/
func ValueEnumArrayToValue(valueEnum []ValueEnum) []string {
    convArray := make([]string,len( valueEnum))
    for i:=0; i<len(valueEnum);i++ {
        convArray[i] = ValueEnumToValue(valueEnum[i])
    }
    return convArray
}


/**
 * Converts given value to its enum representation
 */
func ValueEnumFromValue(value string) ValueEnum {
    switch value {
        case "Running":
            return Value_RUNNING
        case "Off":
            return Value_OFF
        case "Idle":
            return Value_IDLE
        default:
            return Value_RUNNING
    }
}
