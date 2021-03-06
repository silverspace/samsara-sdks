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
    public class AssetCurrentLocationsResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private List<Models.Cable> cable;
        private int? engineHours;
        private long id;
        private List<Models.AssetCurrentLocation> location;
        private string name;

        /// <summary>
        /// The cable connected to the asset
        /// </summary>
        [JsonProperty("cable")]
        public List<Models.Cable> Cable 
        { 
            get 
            {
                return this.cable; 
            } 
            set 
            {
                this.cable = value;
                onPropertyChanged("Cable");
            }
        }

        /// <summary>
        /// Engine hours
        /// </summary>
        [JsonProperty("engineHours")]
        public int? EngineHours 
        { 
            get 
            {
                return this.engineHours; 
            } 
            set 
            {
                this.engineHours = value;
                onPropertyChanged("EngineHours");
            }
        }

        /// <summary>
        /// Asset ID
        /// </summary>
        [JsonProperty("id")]
        public long Id 
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
        /// Current location of an asset
        /// </summary>
        [JsonProperty("location")]
        public List<Models.AssetCurrentLocation> Location 
        { 
            get 
            {
                return this.location; 
            } 
            set 
            {
                this.location = value;
                onPropertyChanged("Location");
            }
        }

        /// <summary>
        /// Asset name
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
    }
} 