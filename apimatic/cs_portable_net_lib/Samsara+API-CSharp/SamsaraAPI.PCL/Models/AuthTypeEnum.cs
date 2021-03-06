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
    public enum AuthTypeEnum
    {
        ENUM_DEFAULT, //TODO: Write general description for this method
        SAML, //TODO: Write general description for this method
    }

    /// <summary>
    /// Helper for the enum type AuthTypeEnum
    /// </summary>
    public static class AuthTypeEnumHelper
    {
        //string values corresponding the enum elements
        private static List<string> stringValues = new List<string> { "default", "saml" };

        /// <summary>
        /// Converts a AuthTypeEnum value to a corresponding string value
        /// </summary>
        /// <param name="enumValue">The AuthTypeEnum value to convert</param>
        /// <returns>The representative string value</returns>
        public static string ToValue(AuthTypeEnum enumValue)
        {
            switch(enumValue)
            {
                //only valid enum elements can be used
                //this is necessary to avoid errors
                case AuthTypeEnum.ENUM_DEFAULT:
                case AuthTypeEnum.SAML:
                    return stringValues[(int)enumValue];

                //an invalid enum value was requested
                default:
                    return null;
            }
        }

        /// <summary>
        /// Convert a list of AuthTypeEnum values to a list of strings
        /// </summary>
        /// <param name="enumValues">The list of AuthTypeEnum values to convert</param>
        /// <returns>The list of representative string values</returns>
        public static List<string> ToValue(List<AuthTypeEnum> enumValues)
        {
            if (null == enumValues)
                return null;

            return enumValues.Select(eVal => ToValue(eVal)).ToList();
        }

        /// <summary>
        /// Converts a string value into AuthTypeEnum value
        /// </summary>
        /// <param name="value">The string value to parse</param>
        /// <returns>The parsed AuthTypeEnum value</returns>
        public static AuthTypeEnum ParseString(string value)
        {
            int index = stringValues.IndexOf(value);
            if(index < 0)
                throw new InvalidCastException(string.Format("Unable to cast value: {0} to type AuthTypeEnum", value));

            return (AuthTypeEnum) index;
        }
    }
} 