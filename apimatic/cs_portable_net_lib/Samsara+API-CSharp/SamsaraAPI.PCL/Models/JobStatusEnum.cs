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
    public enum JobStatusEnum
    {
        JOBSTATE_UNASSIGNED, //TODO: Write general description for this method
        JOBSTATE_SCHEDULED, //TODO: Write general description for this method
        JOBSTATE_ENROUTE, //TODO: Write general description for this method
        JOBSTATE_ARRIVED, //TODO: Write general description for this method
        JOBSTATE_COMPLETED, //TODO: Write general description for this method
        JOBSTATE_SKIPPED, //TODO: Write general description for this method
    }

    /// <summary>
    /// Helper for the enum type JobStatusEnum
    /// </summary>
    public static class JobStatusEnumHelper
    {
        //string values corresponding the enum elements
        private static List<string> stringValues = new List<string> { "JobState_Unassigned", "JobState_Scheduled", "JobState_EnRoute", "JobState_Arrived", "JobState_Completed", "JobState_Skipped" };

        /// <summary>
        /// Converts a JobStatusEnum value to a corresponding string value
        /// </summary>
        /// <param name="enumValue">The JobStatusEnum value to convert</param>
        /// <returns>The representative string value</returns>
        public static string ToValue(JobStatusEnum enumValue)
        {
            switch(enumValue)
            {
                //only valid enum elements can be used
                //this is necessary to avoid errors
                case JobStatusEnum.JOBSTATE_UNASSIGNED:
                case JobStatusEnum.JOBSTATE_SCHEDULED:
                case JobStatusEnum.JOBSTATE_ENROUTE:
                case JobStatusEnum.JOBSTATE_ARRIVED:
                case JobStatusEnum.JOBSTATE_COMPLETED:
                case JobStatusEnum.JOBSTATE_SKIPPED:
                    return stringValues[(int)enumValue];

                //an invalid enum value was requested
                default:
                    return null;
            }
        }

        /// <summary>
        /// Convert a list of JobStatusEnum values to a list of strings
        /// </summary>
        /// <param name="enumValues">The list of JobStatusEnum values to convert</param>
        /// <returns>The list of representative string values</returns>
        public static List<string> ToValue(List<JobStatusEnum> enumValues)
        {
            if (null == enumValues)
                return null;

            return enumValues.Select(eVal => ToValue(eVal)).ToList();
        }

        /// <summary>
        /// Converts a string value into JobStatusEnum value
        /// </summary>
        /// <param name="value">The string value to parse</param>
        /// <returns>The parsed JobStatusEnum value</returns>
        public static JobStatusEnum ParseString(string value)
        {
            int index = stringValues.IndexOf(value);
            if(index < 0)
                throw new InvalidCastException(string.Format("Unable to cast value: {0} to type JobStatusEnum", value));

            return (JobStatusEnum) index;
        }
    }
} 