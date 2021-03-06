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
    public class User : BaseModel 
    {
        // These fields hold the values for the public properties.
        private Models.AuthTypeEnum authType;
        private string email;
        private string name;
        private string organizationRoleId;
        private long? id;
        private string organizationRole;
        private List<Models.UserTagRole> tagRoles;

        /// <summary>
        /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
        /// </summary>
        [JsonProperty("authType", ItemConverterType = typeof(StringValuedEnumConverter))]
        public Models.AuthTypeEnum AuthType 
        { 
            get 
            {
                return this.authType; 
            } 
            set 
            {
                this.authType = value;
                onPropertyChanged("AuthType");
            }
        }

        /// <summary>
        /// The email address of this user.
        /// </summary>
        [JsonProperty("email")]
        public string Email 
        { 
            get 
            {
                return this.email; 
            } 
            set 
            {
                this.email = value;
                onPropertyChanged("Email");
            }
        }

        /// <summary>
        /// The first and last name of the user.
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
        /// The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
        /// </summary>
        [JsonProperty("organizationRoleId")]
        public string OrganizationRoleId 
        { 
            get 
            {
                return this.organizationRoleId; 
            } 
            set 
            {
                this.organizationRoleId = value;
                onPropertyChanged("OrganizationRoleId");
            }
        }

        /// <summary>
        /// The ID of the User record.
        /// </summary>
        [JsonProperty("id")]
        public long? Id 
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
        /// The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
        /// </summary>
        [JsonProperty("organizationRole")]
        public string OrganizationRole 
        { 
            get 
            {
                return this.organizationRole; 
            } 
            set 
            {
                this.organizationRole = value;
                onPropertyChanged("OrganizationRole");
            }
        }

        /// <summary>
        /// The specific tags this user has access to. This will be blank for users that have full access to the organization.
        /// </summary>
        [JsonProperty("tagRoles")]
        public List<Models.UserTagRole> TagRoles 
        { 
            get 
            {
                return this.tagRoles; 
            } 
            set 
            {
                this.tagRoles = value;
                onPropertyChanged("TagRoles");
            }
        }
    }
} 