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
    public class AssetReeferResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string assetType;
        private int? id;
        private string name;
        private Models.ReeferStats reeferStats;

        /// <summary>
        /// Asset type
        /// </summary>
        [JsonProperty("assetType")]
        public string AssetType 
        { 
            get 
            {
                return this.assetType; 
            } 
            set 
            {
                this.assetType = value;
                onPropertyChanged("AssetType");
            }
        }

        /// <summary>
        /// Asset ID
        /// </summary>
        [JsonProperty("id")]
        public int? Id 
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

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("reeferStats")]
        public Models.ReeferStats ReeferStats 
        { 
            get 
            {
                return this.reeferStats; 
            } 
            set 
            {
                this.reeferStats = value;
                onPropertyChanged("ReeferStats");
            }
        }
    }
} 