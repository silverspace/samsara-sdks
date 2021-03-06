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
    public class Alarm1 : BaseModel 
    {
        // These fields hold the values for the public properties.
        private long? alarmCode;
        private string description;
        private string operatorAction;
        private long? severity;

        /// <summary>
        /// ID of the alarm
        /// </summary>
        [JsonProperty("alarmCode")]
        public long? AlarmCode 
        { 
            get 
            {
                return this.alarmCode; 
            } 
            set 
            {
                this.alarmCode = value;
                onPropertyChanged("AlarmCode");
            }
        }

        /// <summary>
        /// Description of the alarm
        /// </summary>
        [JsonProperty("description")]
        public string Description 
        { 
            get 
            {
                return this.description; 
            } 
            set 
            {
                this.description = value;
                onPropertyChanged("Description");
            }
        }

        /// <summary>
        /// Recommended operator action
        /// </summary>
        [JsonProperty("operatorAction")]
        public string OperatorAction 
        { 
            get 
            {
                return this.operatorAction; 
            } 
            set 
            {
                this.operatorAction = value;
                onPropertyChanged("OperatorAction");
            }
        }

        /// <summary>
        /// Severity of the alarm: 1: OK to run, 2: Check as specified, 3: Take immediate action
        /// </summary>
        [JsonProperty("severity")]
        public long? Severity 
        { 
            get 
            {
                return this.severity; 
            } 
            set 
            {
                this.severity = value;
                onPropertyChanged("Severity");
            }
        }
    }
} 