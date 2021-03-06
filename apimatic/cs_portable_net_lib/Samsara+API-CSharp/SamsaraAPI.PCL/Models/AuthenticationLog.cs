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
    public class AuthenticationLog : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string actionType;
        private string address;
        private string addressName;
        private string city;
        private long? happenedAtMs;
        private string state;

        /// <summary>
        /// The log type - one of 'signin' or 'signout'
        /// </summary>
        [JsonProperty("actionType")]
        public string ActionType 
        { 
            get 
            {
                return this.actionType; 
            } 
            set 
            {
                this.actionType = value;
                onPropertyChanged("ActionType");
            }
        }

        /// <summary>
        /// Address at which the log was recorded, if applicable.
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
        /// Address name from the group address book at which the log was recorded, if applicable.
        /// </summary>
        [JsonProperty("addressName")]
        public string AddressName 
        { 
            get 
            {
                return this.addressName; 
            } 
            set 
            {
                this.addressName = value;
                onPropertyChanged("AddressName");
            }
        }

        /// <summary>
        /// City in which the log was recorded, if applicable.
        /// </summary>
        [JsonProperty("city")]
        public string City 
        { 
            get 
            {
                return this.city; 
            } 
            set 
            {
                this.city = value;
                onPropertyChanged("City");
            }
        }

        /// <summary>
        /// The time at which the event was recorded in UNIX milliseconds.
        /// </summary>
        [JsonProperty("happenedAtMs")]
        public long? HappenedAtMs 
        { 
            get 
            {
                return this.happenedAtMs; 
            } 
            set 
            {
                this.happenedAtMs = value;
                onPropertyChanged("HappenedAtMs");
            }
        }

        /// <summary>
        /// State in which the log was recorded, if applicable.
        /// </summary>
        [JsonProperty("state")]
        public string State 
        { 
            get 
            {
                return this.state; 
            } 
            set 
            {
                this.state = value;
                onPropertyChanged("State");
            }
        }
    }
} 