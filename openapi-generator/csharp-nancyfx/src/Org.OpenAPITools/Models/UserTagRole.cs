using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// UserTagRole
    /// </summary>
    public sealed class UserTagRole:  IEquatable<UserTagRole>
    { 
        /// <summary>
        /// The name of the role the user has been granted on this tag.
        /// </summary>
        public string Role { get; private set; }

        /// <summary>
        /// The id of the role the user has been granted on this tag.
        /// </summary>
        public string RoleId { get; private set; }

        /// <summary>
        /// Tag
        /// </summary>
        public UserTagRoleTag Tag { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserTagRole.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserTagRole()
        {
        }

        private UserTagRole(string Role, string RoleId, UserTagRoleTag Tag)
        {
            
            this.Role = Role;
            
            this.RoleId = RoleId;
            
            this.Tag = Tag;
            
        }

        /// <summary>
        /// Returns builder of UserTagRole.
        /// </summary>
        /// <returns>UserTagRoleBuilder</returns>
        public static UserTagRoleBuilder Builder()
        {
            return new UserTagRoleBuilder();
        }

        /// <summary>
        /// Returns UserTagRoleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserTagRoleBuilder</returns>
        public UserTagRoleBuilder With()
        {
            return Builder()
                .Role(Role)
                .RoleId(RoleId)
                .Tag(Tag);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UserTagRole other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserTagRole.
        /// </summary>
        /// <param name="left">Compared (UserTagRole</param>
        /// <param name="right">Compared (UserTagRole</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserTagRole left, UserTagRole right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserTagRole.
        /// </summary>
        /// <param name="left">Compared (UserTagRole</param>
        /// <param name="right">Compared (UserTagRole</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserTagRole left, UserTagRole right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserTagRole.
        /// </summary>
        public sealed class UserTagRoleBuilder
        {
            private string _Role;
            private string _RoleId;
            private UserTagRoleTag _Tag;

            internal UserTagRoleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserTagRole.Role property.
            /// </summary>
            /// <param name="value">The name of the role the user has been granted on this tag.</param>
            public UserTagRoleBuilder Role(string value)
            {
                _Role = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserTagRole.RoleId property.
            /// </summary>
            /// <param name="value">The id of the role the user has been granted on this tag.</param>
            public UserTagRoleBuilder RoleId(string value)
            {
                _RoleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserTagRole.Tag property.
            /// </summary>
            /// <param name="value">Tag</param>
            public UserTagRoleBuilder Tag(UserTagRoleTag value)
            {
                _Tag = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserTagRole.
            /// </summary>
            /// <returns>UserTagRole</returns>
            public UserTagRole Build()
            {
                Validate();
                return new UserTagRole(
                    Role: _Role,
                    RoleId: _RoleId,
                    Tag: _Tag
                );
            }

            private void Validate()
            { 
                if (_RoleId == null)
                {
                    throw new ArgumentException("RoleId is a required property for UserTagRole and cannot be null");
                } 
                if (_Tag == null)
                {
                    throw new ArgumentException("Tag is a required property for UserTagRole and cannot be null");
                } 
            }
        }

        
    }
}