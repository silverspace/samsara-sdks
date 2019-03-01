using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// UserTagRoleTag
    /// </summary>
    public sealed class UserTagRoleTag:  IEquatable<UserTagRoleTag>
    { 
        /// <summary>
        /// The ID of this tag.
        /// </summary>
        public long? ParentTagId { get; private set; }

        /// <summary>
        /// Name of this tag.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// The ID of this tag.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use UserTagRoleTag.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public UserTagRoleTag()
        {
        }

        private UserTagRoleTag(long? ParentTagId, string Name, long? Id)
        {
            
            this.ParentTagId = ParentTagId;
            
            this.Name = Name;
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of UserTagRoleTag.
        /// </summary>
        /// <returns>UserTagRoleTagBuilder</returns>
        public static UserTagRoleTagBuilder Builder()
        {
            return new UserTagRoleTagBuilder();
        }

        /// <summary>
        /// Returns UserTagRoleTagBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>UserTagRoleTagBuilder</returns>
        public UserTagRoleTagBuilder With()
        {
            return Builder()
                .ParentTagId(ParentTagId)
                .Name(Name)
                .Id(Id);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(UserTagRoleTag other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (UserTagRoleTag.
        /// </summary>
        /// <param name="left">Compared (UserTagRoleTag</param>
        /// <param name="right">Compared (UserTagRoleTag</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (UserTagRoleTag left, UserTagRoleTag right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (UserTagRoleTag.
        /// </summary>
        /// <param name="left">Compared (UserTagRoleTag</param>
        /// <param name="right">Compared (UserTagRoleTag</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (UserTagRoleTag left, UserTagRoleTag right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of UserTagRoleTag.
        /// </summary>
        public sealed class UserTagRoleTagBuilder
        {
            private long? _ParentTagId;
            private string _Name;
            private long? _Id;

            internal UserTagRoleTagBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for UserTagRoleTag.ParentTagId property.
            /// </summary>
            /// <param name="value">The ID of this tag.</param>
            public UserTagRoleTagBuilder ParentTagId(long? value)
            {
                _ParentTagId = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserTagRoleTag.Name property.
            /// </summary>
            /// <param name="value">Name of this tag.</param>
            public UserTagRoleTagBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for UserTagRoleTag.Id property.
            /// </summary>
            /// <param name="value">The ID of this tag.</param>
            public UserTagRoleTagBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of UserTagRoleTag.
            /// </summary>
            /// <returns>UserTagRoleTag</returns>
            public UserTagRoleTag Build()
            {
                Validate();
                return new UserTagRoleTag(
                    ParentTagId: _ParentTagId,
                    Name: _Name,
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for UserTagRoleTag and cannot be null");
                } 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for UserTagRoleTag and cannot be null");
                } 
            }
        }

        
    }
}