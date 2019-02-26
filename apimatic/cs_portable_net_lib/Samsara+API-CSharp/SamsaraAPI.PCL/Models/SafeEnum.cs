/*
 * SamsaraAPI.PCL
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
using System;
using System.Linq;
using System.Collections.Generic;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SamsaraAPI.PCL;
using SamsaraAPI.PCL.Utilities;

namespace SamsaraAPI.PCL.Models
{
    [JsonConverter(typeof(StringValuedEnumConverter))]
    public enum SafeEnum
    {
        SAFE, //TODO: Write general description for this method
        ENUM_UNSAFE, //TODO: Write general description for this method
    }

    /// <summary>
    /// Helper for the enum type SafeEnum
    /// </summary>
    public static class SafeEnumHelper
    {
        //string values corresponding the enum elements
        private static List<string> stringValues = new List<string> { "safe", "unsafe" };

        /// <summary>
        /// Converts a SafeEnum value to a corresponding string value
        /// </summary>
        /// <param name="enumValue">The SafeEnum value to convert</param>
        /// <returns>The representative string value</returns>
        public static string ToValue(SafeEnum enumValue)
        {
            switch(enumValue)
            {
                //only valid enum elements can be used
                //this is necessary to avoid errors
                case SafeEnum.SAFE:
                case SafeEnum.ENUM_UNSAFE:
                    return stringValues[(int)enumValue];

                //an invalid enum value was requested
                default:
                    return null;
            }
        }

        /// <summary>
        /// Convert a list of SafeEnum values to a list of strings
        /// </summary>
        /// <param name="enumValues">The list of SafeEnum values to convert</param>
        /// <returns>The list of representative string values</returns>
        public static List<string> ToValue(List<SafeEnum> enumValues)
        {
            if (null == enumValues)
                return null;

            return enumValues.Select(eVal => ToValue(eVal)).ToList();
        }

        /// <summary>
        /// Converts a string value into SafeEnum value
        /// </summary>
        /// <param name="value">The string value to parse</param>
        /// <returns>The parsed SafeEnum value</returns>
        public static SafeEnum ParseString(string value)
        {
            int index = stringValues.IndexOf(value);
            if(index < 0)
                throw new InvalidCastException(string.Format("Unable to cast value: {0} to type SafeEnum", value));

            return (SafeEnum) index;
        }
    }
} 