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
    public class GetAllDataInputsResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private List<Models.DataInputHistoryResponse> dataInputs;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("dataInputs")]
        public List<Models.DataInputHistoryResponse> DataInputs 
        { 
            get 
            {
                return this.dataInputs; 
            } 
            set 
            {
                this.dataInputs = value;
                onPropertyChanged("DataInputs");
            }
        }
    }
} 