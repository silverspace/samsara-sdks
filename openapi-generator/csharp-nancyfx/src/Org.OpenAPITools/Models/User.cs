using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// User
    /// </summary>
    public sealed class User:  IEquatable<User>
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
        /// The ID of the User record.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.
        /// </summary>
        public string OrganizationRole { get; private set; }

        /// <summary>
        /// The specific tags this user has access to. This will be blank for users that have full access to the organization.
        /// </summary>
        public List<UserTagRole> TagRoles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use User.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public User()
        {
        }

        private User(AuthTypeEnum? AuthType, string Email, string Name, string OrganizationRoleId, long? Id, string OrganizationRole, List<UserTagRole> TagRoles)
        {
            
            this.AuthType = AuthType;
            
            this.Email = Email;
            
            this.Name = Name;
            
            this.OrganizationRoleId = OrganizationRoleId;
            
            this.Id = Id;
            
            this.OrganizationRole = OrganizationRole;
            
            this.TagRoles = TagRoles;
            
        }

        /// <summary>
        /// Returns builder of User.
        /// </summary>
        /// <returns>UserBuilder</returns>
        public static UserBuilder Builder()
        {
            return new UserBuilder();
        }

        /// <summary>
        /// Returns UserBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserBuilder</returns>
        public UserBuilder With()
        {
            return Builder()
                .AuthType(AuthType)
                .Email(Email)
                .Name(Name)
                .OrganizationRoleId(OrganizationRoleId)
                .Id(Id)
                .OrganizationRole(OrganizationRole)
                .TagRoles(TagRoles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(User other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (User.
        /// </summary>
        /// <param name="left">Compared (User</param>
        /// <param name="right">Compared (User</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (User left, User right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (User.
        /// </summary>
        /// <param name="left">Compared (User</param>
        /// <param name="right">Compared (User</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (User left, User right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of User.
        /// </summary>
        public sealed class UserBuilder
        {
            private AuthTypeEnum? _AuthType;
            private string _Email;
            private string _Name;
            private string _OrganizationRoleId;
            private long? _Id;
            private string _OrganizationRole;
            private List<UserTagRole> _TagRoles;

            internal UserBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for User.AuthType property.
            /// </summary>
            /// <param name="value">The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration.</param>
            public UserBuilder AuthType(AuthTypeEnum? value)
            {
                _AuthType = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Email property.
            /// </summary>
            /// <param name="value">The email address of this user.</param>
            public UserBuilder Email(string value)
            {
                _Email = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Name property.
            /// </summary>
            /// <param name="value">The first and last name of the user.</param>
            public UserBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.OrganizationRoleId property.
            /// </summary>
            /// <param name="value">The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.</param>
            public UserBuilder OrganizationRoleId(string value)
            {
                _OrganizationRoleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.Id property.
            /// </summary>
            /// <param name="value">The ID of the User record.</param>
            public UserBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.OrganizationRole property.
            /// </summary>
            /// <param name="value">The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags.</param>
            public UserBuilder OrganizationRole(string value)
            {
                _OrganizationRole = value;
                return this;
            }

            /// <summary>
            /// Sets value for User.TagRoles property.
            /// </summary>
            /// <param name="value">The specific tags this user has access to. This will be blank for users that have full access to the organization.</param>
            public UserBuilder TagRoles(List<UserTagRole> value)
            {
                _TagRoles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of User.
            /// </summary>
            /// <returns>User</returns>
            public User Build()
            {
                Validate();
                return new User(
                    AuthType: _AuthType,
                    Email: _Email,
                    Name: _Name,
                    OrganizationRoleId: _OrganizationRoleId,
                    Id: _Id,
                    OrganizationRole: _OrganizationRole,
                    TagRoles: _TagRoles
                );
            }

            private void Validate()
            { 
                if (_AuthType == null)
                {
                    throw new ArgumentException("AuthType is a required property for User and cannot be null");
                } 
                if (_Email == null)
                {
                    throw new ArgumentException("Email is a required property for User and cannot be null");
                } 
            }
        }

        
        public enum AuthTypeEnum { Default, Saml };
    }
}