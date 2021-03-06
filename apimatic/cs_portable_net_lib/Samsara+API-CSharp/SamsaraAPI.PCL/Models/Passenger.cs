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
    public class Passenger : BaseModel 
    {
        // These fields hold the values for the public properties.
        private Models.CheckEngineLight1 checkEngineLight;
        private List<Models.DiagnosticTroubleCode1> diagnosticTroubleCodes;

        /// <summary>
        /// Passenger vehicle check engine light.
        /// </summary>
        [JsonProperty("checkEngineLight")]
        public Models.CheckEngineLight1 CheckEngineLight 
        { 
            get 
            {
                return this.checkEngineLight; 
            } 
            set 
            {
                this.checkEngineLight = value;
                onPropertyChanged("CheckEngineLight");
            }
        }

        /// <summary>
        /// Passenger vehicle DTCs.
        /// </summary>
        [JsonProperty("diagnosticTroubleCodes")]
        public List<Models.DiagnosticTroubleCode1> DiagnosticTroubleCodes 
        { 
            get 
            {
                return this.diagnosticTroubleCodes; 
            } 
            set 
            {
                this.diagnosticTroubleCodes = value;
                onPropertyChanged("DiagnosticTroubleCodes");
            }
        }
    }
} 