using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TagMetadata
    /// </summary>
    public sealed class TagMetadata:  IEquatable<TagMetadata>
    { 
        /// <summary>
        /// The ID of this tag.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of this tag.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TagMetadata.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TagMetadata()
        {
        }

        private TagMetadata(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TagMetadata.
        /// </summary>
        /// <returns>TagMetadataBuilder</returns>
        public static TagMetadataBuilder Builder()
        {
            return new TagMetadataBuilder();
        }

        /// <summary>
        /// Returns TagMetadataBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TagMetadataBuilder</returns>
        public TagMetadataBuilder With()
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

        public bool Equals(TagMetadata other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TagMetadata.
        /// </summary>
        /// <param name="left">Compared (TagMetadata</param>
        /// <param name="right">Compared (TagMetadata</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TagMetadata left, TagMetadata right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TagMetadata.
        /// </summary>
        /// <param name="left">Compared (TagMetadata</param>
        /// <param name="right">Compared (TagMetadata</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TagMetadata left, TagMetadata right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TagMetadata.
        /// </summary>
        public sealed class TagMetadataBuilder
        {
            private long? _Id;
            private string _Name;

            internal TagMetadataBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TagMetadata.Id property.
            /// </summary>
            /// <param name="value">The ID of this tag.</param>
            public TagMetadataBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TagMetadata.Name property.
            /// </summary>
            /// <param name="value">Name of this tag.</param>
            public TagMetadataBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TagMetadata.
            /// </summary>
            /// <returns>TagMetadata</returns>
            public TagMetadata Build()
            {
                Validate();
                return new TagMetadata(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TagMetadata and cannot be null");
                } 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for TagMetadata and cannot be null");
                } 
            }
        }

        
    }
}