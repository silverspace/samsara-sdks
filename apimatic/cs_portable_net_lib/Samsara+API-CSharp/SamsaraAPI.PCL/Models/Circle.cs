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
    public class Circle : BaseModel 
    {
        // These fields hold the values for the public properties.
        private double? latitude;
        private double? longitude;
        private double? radiusMeters;

        /// <summary>
        /// The latitude of the center of the circular geofence
        /// </summary>
        [JsonProperty("latitude")]
        public double? Latitude 
        { 
            get 
            {
                return this.latitude; 
            } 
            set 
            {
                this.latitude = value;
                onPropertyChanged("Latitude");
            }
        }

        /// <summary>
        /// The longitude of the center of the circular geofence
        /// </summary>
        [JsonProperty("longitude")]
        public double? Longitude 
        { 
            get 
            {
                return this.longitude; 
            } 
            set 
            {
                this.longitude = value;
                onPropertyChanged("Longitude");
            }
        }

        /// <summary>
        /// The radius of the circular geofence
        /// </summary>
        [JsonProperty("radiusMeters")]
        public double? RadiusMeters 
        { 
            get 
            {
                return this.radiusMeters; 
            } 
            set 
            {
                this.radiusMeters = value;
                onPropertyChanged("RadiusMeters");
            }
        }
    }
} 