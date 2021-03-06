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
    public class NumberValueTypeMetadata : BaseModel 
    {
        // These fields hold the values for the public properties.
        private long? numDecimalPlaces;

        /// <summary>
        /// Number of decimal places that values for this field type can have.
        /// </summary>
        [JsonProperty("numDecimalPlaces")]
        public long? NumDecimalPlaces 
        { 
            get 
            {
                return this.numDecimalPlaces; 
            } 
            set 
            {
                this.numDecimalPlaces = value;
                onPropertyChanged("NumDecimalPlaces");
            }
        }
    }
} 