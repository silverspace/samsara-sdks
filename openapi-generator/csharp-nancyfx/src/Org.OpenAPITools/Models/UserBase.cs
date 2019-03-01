using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// UserBase
    /// </summary>
    public sealed class UserBase:  IEquatable<UserBase>
    { 
        /// <summary>
        /// The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.
        /// </summary>
        public AuthTypeEnum? AuthType { get; private set; }

        /// <summary>
        /// The email address of this user.
        /// </summary>
        public string Email { get; private set; }

        /// <summary>
        /// The first and last name of the user.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
        /// </summary>
        public string OrganizationRoleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserBase()
        {
        }

        private UserBase(AuthTypeEnum? AuthType, string Email, string Name, string OrganizationRoleId)
        {
            
            this.AuthType = AuthType;
            
            this.Email = Email;
            
            this.Name = Name;
            
            this.OrganizationRoleId = OrganizationRoleId;
            
        }

        /// <summary>
        /// Returns builder of UserBase.
        /// </summary>
        /// <returns>UserBaseBuilder</returns>
        public static UserBaseBuilder Builder()
        {
            return new UserBaseBuilder();
        }

        /// <summary>
        /// Returns UserBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserBaseBuilder</returns>
        public UserBaseBuilder With()
        {
            return Builder()
                .AuthType(AuthType)
                .Email(Email)
                .Name(Name)
                .OrganizationRoleId(OrganizationRoleId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UserBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserBase.
        /// </summary>
        /// <param name="left">Compared (UserBase</param>
        /// <param name="right">Compared (UserBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserBase left, UserBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserBase.
        /// </summary>
        /// <param name="left">Compared (UserBase</param>
        /// <param name="right">Compared (UserBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserBase left, UserBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserBase.
        /// </summary>
        public sealed class UserBaseBuilder
        {
            private AuthTypeEnum? _AuthType;
            private string _Email;
            private string _Name;
            private string _OrganizationRoleId;

            internal UserBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserBase.AuthType property.
            /// </summary>
            /// <param name="value">The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.</param>
            public UserBaseBuilder AuthType(AuthTypeEnum? value)
            {
                _AuthType = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.Email property.
            /// </summary>
            /// <param name="value">The email address of this user.</param>
            public UserBaseBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.Name property.
            /// </summary>
            /// <param name="value">The first and last name of the user.</param>
            public UserBaseBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserBase.OrganizationRoleId property.
            /// </summary>
            /// <param name="value">The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.</param>
            public UserBaseBuilder OrganizationRoleId(string value)
            {
                _OrganizationRoleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserBase.
            /// </summary>
            /// <returns>UserBase</returns>
            public UserBase Build()
            {
                Validate();
                return new UserBase(
                    AuthType: _AuthType,
                    Email: _Email,
                    Name: _Name,
                    OrganizationRoleId: _OrganizationRoleId
                );
            }

            private void Validate()
            { 
                if (_AuthType == null)
                {
                    throw new ArgumentException("AuthType is a required property for UserBase and cannot be null");
                } 
                if (_Email == null)
                {
                    throw new ArgumentException("Email is a required property for UserBase and cannot be null");
                } 
            }
        }

        
        public enum AuthTypeEnum { Default, Saml };
    }
}