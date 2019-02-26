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
    public class AddressParam : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string address;
        private long groupId;
        private string name;
        private int radius;

        /// <summary>
        /// The address of the entry to add, as it would be recognized if provided to maps.google.com.
        /// </summary>
        [JsonProperty("address")]
        public string Address 
        { 
            get 
            {
                return this.address; 
            } 
            set 
            {
                this.address = value;
                onPropertyChanged("Address");
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
        /// Name of the location to add to the address book.
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
        /// Radius in meters of the address (used for matching vehicle trip stops to this location).
        /// </summary>
        [JsonProperty("radius")]
        public int Radius 
        { 
            get 
            {
                return this.radius; 
            } 
            set 
            {
                this.radius = value;
                onPropertyChanged("Radius");
            }
        }
    }
} 