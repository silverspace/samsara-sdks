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
    public class HosAuthenticationLogsResponse : BaseModel 
    {
        // These fields hold the values for the public properties.
        private List<Models.AuthenticationLog> authenticationLogs;

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("authenticationLogs")]
        public List<Models.AuthenticationLog> AuthenticationLogs 
        { 
            get 
            {
                return this.authenticationLogs; 
            } 
            set 
            {
                this.authenticationLogs = value;
                onPropertyChanged("AuthenticationLogs");
            }
        }
    }
} 