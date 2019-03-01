using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedAsset
    /// </summary>
    public sealed class TaggedAsset:  IEquatable<TaggedAsset>
    { 
        /// <summary>
        /// The ID of the Asset being tagged.
        /// </summary>
        public long? Id { get; private set; }

        /// <summary>
        /// Name of the Asset being tagged.
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedAsset.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedAsset()
        {
        }

        private TaggedAsset(long? Id, string Name)
        {
            
            this.Id = Id;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of TaggedAsset.
        /// </summary>
        /// <returns>TaggedAssetBuilder</returns>
        public static TaggedAssetBuilder Builder()
        {
            return new TaggedAssetBuilder();
        }

        /// <summary>
        /// Returns TaggedAssetBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedAssetBuilder</returns>
        public TaggedAssetBuilder With()
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

        public bool Equals(TaggedAsset other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedAsset.
        /// </summary>
        /// <param name="left">Compared (TaggedAsset</param>
        /// <param name="right">Compared (TaggedAsset</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedAsset left, TaggedAsset right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedAsset.
        /// </summary>
        /// <param name="left">Compared (TaggedAsset</param>
        /// <param name="right">Compared (TaggedAsset</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedAsset left, TaggedAsset right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedAsset.
        /// </summary>
        public sealed class TaggedAssetBuilder
        {
            private long? _Id;
            private string _Name;

            internal TaggedAssetBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedAsset.Id property.
            /// </summary>
            /// <param name="value">The ID of the Asset being tagged.</param>
            public TaggedAssetBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }

            /// <summary>
            /// Sets value for TaggedAsset.Name property.
            /// </summary>
            /// <param name="value">Name of the Asset being tagged.</param>
            public TaggedAssetBuilder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedAsset.
            /// </summary>
            /// <returns>TaggedAsset</returns>
            public TaggedAsset Build()
            {
                Validate();
                return new TaggedAsset(
                    Id: _Id,
                    Name: _Name
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedAsset and cannot be null");
                } 
            }
        }

        
    }
}