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
    public class DispatchJobCreate : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string destinationAddress;
        private long? destinationAddressId;
        private double? destinationLat;
        private double? destinationLng;
        private string destinationName;
        private string notes;
        private long scheduledArrivalTimeMs;
        private long? scheduledDepartureTimeMs;

        /// <summary>
        /// The address of the job destination, as it would be recognized if provided to maps.google.com. Optional if a valid destination address ID is provided.
        /// </summary>
        [JsonProperty("destination_address")]
        public string DestinationAddress 
        { 
            get 
            {
                return this.destinationAddress; 
            } 
            set 
            {
                this.destinationAddress = value;
                onPropertyChanged("DestinationAddress");
            }
        }

        /// <summary>
        /// ID of the job destination associated with an address book entry. Optional if valid values are provided for destination address or latitude/longitude. If a valid destination address ID is provided, address/latitude/longitude will be used from the address book entry. Name of the address book entry will only be used if the destination name is not provided.
        /// </summary>
        [JsonProperty("destination_address_id")]
        public long? DestinationAddressId 
        { 
            get 
            {
                return this.destinationAddressId; 
            } 
            set 
            {
                this.destinationAddressId = value;
                onPropertyChanged("DestinationAddressId");
            }
        }

        /// <summary>
        /// Latitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        [JsonProperty("destination_lat")]
        public double? DestinationLat 
        { 
            get 
            {
                return this.destinationLat; 
            } 
            set 
            {
                this.destinationLat = value;
                onPropertyChanged("DestinationLat");
            }
        }

        /// <summary>
        /// Longitude of the destination in decimal degrees. Optional if a valid destination address ID is provided.
        /// </summary>
        [JsonProperty("destination_lng")]
        public double? DestinationLng 
        { 
            get 
            {
                return this.destinationLng; 
            } 
            set 
            {
                this.destinationLng = value;
                onPropertyChanged("DestinationLng");
            }
        }

        /// <summary>
        /// The name of the job destination. If provided, it will take precedence over the name of the address book entry.
        /// </summary>
        [JsonProperty("destination_name")]
        public string DestinationName 
        { 
            get 
            {
                return this.destinationName; 
            } 
            set 
            {
                this.destinationName = value;
                onPropertyChanged("DestinationName");
            }
        }

        /// <summary>
        /// Notes regarding the details of this job.
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
        /// The time at which the assigned driver is scheduled to arrive at the job destination.
        /// </summary>
        [JsonProperty("scheduled_arrival_time_ms")]
        public long ScheduledArrivalTimeMs 
        { 
            get 
            {
                return this.scheduledArrivalTimeMs; 
            } 
            set 
            {
                this.scheduledArrivalTimeMs = value;
                onPropertyChanged("ScheduledArrivalTimeMs");
            }
        }

        /// <summary>
        /// The time at which the assigned driver is scheduled to depart from the job destination.
        /// </summary>
        [JsonProperty("scheduled_departure_time_ms")]
        public long? ScheduledDepartureTimeMs 
        { 
            get 
            {
                return this.scheduledDepartureTimeMs; 
            } 
            set 
            {
                this.scheduledDepartureTimeMs = value;
                onPropertyChanged("ScheduledDepartureTimeMs");
            }
        }
    }
} 