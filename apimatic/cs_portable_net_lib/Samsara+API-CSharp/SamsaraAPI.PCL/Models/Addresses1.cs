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
    public class Addresses1 : BaseModel 
    {
        // These fields hold the values for the public properties.
        private List<long> contactIds;
        private string formattedAddress;
        private Models.AddressGeofence geofence;
        private string name;
        private string notes;
        private List<long> tagIds;

        /// <summary>
        /// A list of IDs for contact book entries.
        /// </summary>
        [JsonProperty("contactIds")]
        public List<long> ContactIds 
        { 
            get 
            {
                return this.contactIds; 
            } 
            set 
            {
                this.contactIds = value;
                onPropertyChanged("ContactIds");
            }
        }

        /// <summary>
        /// The full address associated with this address/geofence, as it might be recognized by maps.google.com
        /// </summary>
        [JsonProperty("formattedAddress")]
        public string FormattedAddress 
        { 
            get 
            {
                return this.formattedAddress; 
            } 
            set 
            {
                this.formattedAddress = value;
                onPropertyChanged("FormattedAddress");
            }
        }

        /// <summary>
        /// The geofence that defines this address and its bounds. This can either be a circle, or a polygon - only one key should be provided, depending on the geofence type.
        /// </summary>
        [JsonProperty("geofence")]
        public Models.AddressGeofence Geofence 
        { 
            get 
            {
                return this.geofence; 
            } 
            set 
            {
                this.geofence = value;
                onPropertyChanged("Geofence");
            }
        }

        /// <summary>
        /// The name of this address/geofence
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
        /// Notes associated with an address.
        /// </summary>
        [JsonProperty("notes")]
        public string Notes 
        { 
            get 
            {
                return this.notes; 
            } 
            set 
            {
                this.notes = value;
                onPropertyChanged("Notes");
            }
        }

        /// <summary>
        /// A list of tag IDs.
        /// </summary>
        [JsonProperty("tagIds")]
        public List<long> TagIds 
        { 
            get 
            {
                return this.tagIds; 
            } 
            set 
            {
                this.tagIds = value;
                onPropertyChanged("TagIds");
            }
        }
    }
} 