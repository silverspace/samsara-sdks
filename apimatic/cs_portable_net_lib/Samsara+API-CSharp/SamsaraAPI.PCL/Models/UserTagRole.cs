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
    public class UserTagRole : BaseModel 
    {
        // These fields hold the values for the public properties.
        private string role;
        private string roleId;
        private Models.Tag1 tag;

        /// <summary>
        /// The name of the role the user has been granted on this tag.
        /// </summary>
        [JsonProperty("role")]
        public string Role 
        { 
            get 
            {
                return this.role; 
            } 
            set 
            {
                this.role = value;
                onPropertyChanged("Role");
            }
        }

        /// <summary>
        /// The id of the role the user has been granted on this tag.
        /// </summary>
        [JsonProperty("roleId")]
        public string RoleId 
        { 
            get 
            {
                return this.roleId; 
            } 
            set 
            {
                this.roleId = value;
                onPropertyChanged("RoleId");
            }
        }

        /// <summary>
        /// TODO: Write general description for this method
        /// </summary>
        [JsonProperty("tag")]
        public Models.Tag1 Tag 
        { 
            get 
            {
                return this.tag; 
            } 
            set 
            {
                this.tag = value;
                onPropertyChanged("Tag");
            }
        }
    }
} 