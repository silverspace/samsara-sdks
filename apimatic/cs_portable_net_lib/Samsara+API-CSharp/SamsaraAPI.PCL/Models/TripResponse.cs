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
    public class TripResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private List<Models.Trip> trips;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("trips")]
        public List<Models.Trip> Trips 
        { 
            get 
            {
                return this.trips; 
            } 
            set 
            {
                this.trips = value;
                onPropertyChanged("Trips");
            }
        }
    }
} 