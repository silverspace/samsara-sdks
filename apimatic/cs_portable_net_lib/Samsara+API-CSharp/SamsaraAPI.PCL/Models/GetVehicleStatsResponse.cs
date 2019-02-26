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
    public class GetVehicleStatsResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private Models.Pagination pagination;
        private List<Models.VehicleStat> vehicleStats;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("pagination")]
        public Models.Pagination Pagination 
        { 
            get 
            {
                return this.pagination; 
            } 
            set 
            {
                this.pagination = value;
                onPropertyChanged("Pagination");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("vehicleStats")]
        public List<Models.VehicleStat> VehicleStats 
        { 
            get 
            {
                return this.vehicleStats; 
            } 
            set 
            {
                this.vehicleStats = value;
                onPropertyChanged("VehicleStats");
            }
        }
    }
} 