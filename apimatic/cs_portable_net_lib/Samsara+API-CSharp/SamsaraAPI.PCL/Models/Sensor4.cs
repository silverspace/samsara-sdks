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
    public class Sensor4 : BaseModel 
    {
        // These fields hold the values for the public properties.
        private int? ambientTemperature;
        private long? id;
        private string name;
        private int? probeTemperature;

        /// <summary>
        /// Currently reported ambient temperature in millidegrees celsius.
        /// </summary>
        [JsonProperty("ambientTemperature")]
        public int? AmbientTemperature 
        { 
            get 
            {
                return this.ambientTemperature; 
            } 
            set 
            {
                this.ambientTemperature = value;
                onPropertyChanged("AmbientTemperature");
            }
        }

        /// <summary>
        /// ID of the sensor.
        /// </summary>
        [JsonProperty("id")]
        public long? Id 
        { 
            get 
            {
                return this.id; 
            } 
            set 
            {
                this.id = value;
                onPropertyChanged("Id");
            }
        }

        /// <summary>
        /// Name of the sensor.
        /// </summary>
        [JsonProperty("name")]
        public string Name 
        { 
            get 
            {
                return this.name; 
            } 
            set 
            {
                this.name = value;
                onPropertyChanged("Name");
            }
        }

        /// <summary>
        /// Currently reported probe temperature in millidegrees celsius. If no probe is connected, this parameter will not be reported.
        /// </summary>
        [JsonProperty("probeTemperature")]
        public int? ProbeTemperature 
        { 
            get 
            {
                return this.probeTemperature; 
            } 
            set 
            {
                this.probeTemperature = value;
                onPropertyChanged("ProbeTemperature");
            }
        }
    }
} 