/*
 * SamsaraAPI.PCL
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
using System;
using System.IO;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using SamsaraAPI.PCL;
using SamsaraAPI.PCL.Utilities;


namespace SamsaraAPI.PCL.Models
{
    public class HosLogsParam : BaseModel 
    {
        // These fields hold the values for the public properties.
        private long driverId;
        private long endMs;
        private long groupId;
        private long startMs;

        /// <summary>
        /// Driver ID to query.
        /// </summary>
        [JsonProperty("driverId")]
        public long DriverId 
        { 
            get 
            {
                return this.driverId; 
            } 
            set 
            {
                this.driverId = value;
                onPropertyChanged("DriverId");
            }
        }

        /// <summary>
        /// End of the time range, specified in milliseconds UNIX time.
        /// </summary>
        [JsonProperty("endMs")]
        public long EndMs 
        { 
            get 
            {
                return this.endMs; 
            } 
            set 
            {
                this.endMs = value;
                onPropertyChanged("EndMs");
            }
        }

        /// <summary>
        /// Group ID to query.
        /// </summary>
        [JsonProperty("groupId")]
        public long GroupId 
        { 
            get 
            {
                return this.groupId; 
            } 
            set 
            {
                this.groupId = value;
                onPropertyChanged("GroupId");
            }
        }

        /// <summary>
        /// Beginning of the time range, specified in milliseconds UNIX time.
        /// </summary>
        [JsonProperty("startMs")]
        public long StartMs 
        { 
            get 
            {
                return this.startMs; 
            } 
            set 
            {
                this.startMs = value;
                onPropertyChanged("StartMs");
            }
        }
    }
} 