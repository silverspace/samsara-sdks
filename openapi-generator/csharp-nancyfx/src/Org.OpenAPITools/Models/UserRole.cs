using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// UserRole
    /// </summary>
    public sealed class UserRole:  IEquatable<UserRole>
    { 
        /// <summary>
        /// Id
        /// </summary>
        public string Id { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserRole.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserRole()
        {
        }

        private UserRole(string Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of UserRole.
        /// </summary>
        /// <returns>UserRoleBuilder</returns>
        public static UserRoleBuilder Builder()
        {
            return new UserRoleBuilder();
        }

        /// <summary>
        /// Returns UserRoleBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserRoleBuilder</returns>
        public UserRoleBuilder With()
        {
            return Builder()
                .Id(Id)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UserRole other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserRole.
        /// </summary>
        /// <param name="left">Compared (UserRole</param>
        /// <param name="right">Compared (UserRole</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserRole left, UserRole right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserRole.
        /// </summary>
        /// <param name="left">Compared (UserRole</param>
        /// <param name="right">Compared (UserRole</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserRole left, UserRole right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserRole.
        /// </summary>
        public sealed class UserRoleBuilder
        {
            private string _Id;
            private string _Name;

            internal UserRoleBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserRole.Id property.
            /// </summary>
            /// <param name="value">Id</param>
            public UserRoleBuilder Id(string value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserRole.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public UserRoleBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserRole.
            /// </summary>
            /// <returns>UserRole</returns>
            public UserRole Build()
            {
                Validate();
                return new UserRole(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}