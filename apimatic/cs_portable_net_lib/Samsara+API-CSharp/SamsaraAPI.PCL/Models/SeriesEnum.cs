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
    public enum SeriesEnum
    {
        ENGINESTATE, //TODO: Write general description for this method
        AUXINPUT1, //TODO: Write general description for this method
        AUXINPUT2, //TODO: Write general description for this method
    }

    /// <summary>
    /// Helper for the enum type SeriesEnum
    /// </summary>
    public static class SeriesEnumHelper
    {
        //string values corresponding the enum elements
        private static List<string> stringValues = new List<string> { "engineState", "auxInput1", "auxInput2" };

        /// <summary>
        /// Converts a SeriesEnum value to a corresponding string value
        /// </summary>
        /// <param name="enumValue">The SeriesEnum value to convert</param>
        /// <returns>The representative string value</returns>
        public static string ToValue(SeriesEnum enumValue)
        {
            switch(enumValue)
            {
                //only valid enum elements can be used
                //this is necessary to avoid errors
                case SeriesEnum.ENGINESTATE:
                case SeriesEnum.AUXINPUT1:
                case SeriesEnum.AUXINPUT2:
                    return stringValues[(int)enumValue];

                //an invalid enum value was requested
                default:
                    return null;
            }
        }

        /// <summary>
        /// Convert a list of SeriesEnum values to a list of strings
        /// </summary>
        /// <param name="enumValues">The list of SeriesEnum values to convert</param>
        /// <returns>The list of representative string values</returns>
        public static List<string> ToValue(List<SeriesEnum> enumValues)
        {
            if (null == enumValues)
                return null;

            return enumValues.Select(eVal => ToValue(eVal)).ToList();
        }

        /// <summary>
        /// Converts a string value into SeriesEnum value
        /// </summary>
        /// <param name="value">The string value to parse</param>
        /// <returns>The parsed SeriesEnum value</returns>
        public static SeriesEnum ParseString(string value)
        {
            int index = stringValues.IndexOf(value);
            if(index < 0)
                throw new InvalidCastException(string.Format("Unable to cast value: {0} to type SeriesEnum", value));

            return (SeriesEnum) index;
        }
    }
} 