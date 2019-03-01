using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// TaggedAssetBase
    /// </summary>
    public sealed class TaggedAssetBase:  IEquatable<TaggedAssetBase>
    { 
        /// <summary>
        /// The ID of the Asset being tagged.
        /// </summary>
        public long? Id { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use TaggedAssetBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public TaggedAssetBase()
        {
        }

        private TaggedAssetBase(long? Id)
        {
            
            this.Id = Id;
            
        }

        /// <summary>
        /// Returns builder of TaggedAssetBase.
        /// </summary>
        /// <returns>TaggedAssetBaseBuilder</returns>
        public static TaggedAssetBaseBuilder Builder()
        {
            return new TaggedAssetBaseBuilder();
        }

        /// <summary>
        /// Returns TaggedAssetBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>TaggedAssetBaseBuilder</returns>
        public TaggedAssetBaseBuilder With()
        {
            return Builder()
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

        public bool Equals(TaggedAssetBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (TaggedAssetBase.
        /// </summary>
        /// <param name="left">Compared (TaggedAssetBase</param>
        /// <param name="right">Compared (TaggedAssetBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (TaggedAssetBase left, TaggedAssetBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (TaggedAssetBase.
        /// </summary>
        /// <param name="left">Compared (TaggedAssetBase</param>
        /// <param name="right">Compared (TaggedAssetBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (TaggedAssetBase left, TaggedAssetBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of TaggedAssetBase.
        /// </summary>
        public sealed class TaggedAssetBaseBuilder
        {
            private long? _Id;

            internal TaggedAssetBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for TaggedAssetBase.Id property.
            /// </summary>
            /// <param name="value">The ID of the Asset being tagged.</param>
            public TaggedAssetBaseBuilder Id(long? value)
            {
                _Id = value;
                return this;
            }


            /// <summary>
            /// Builds instance of TaggedAssetBase.
            /// </summary>
            /// <returns>TaggedAssetBase</returns>
            public TaggedAssetBase Build()
            {
                Validate();
                return new TaggedAssetBase(
                    Id: _Id
                );
            }

            private void Validate()
            { 
                if (_Id == null)
                {
                    throw new ArgumentException("Id is a required property for TaggedAssetBase and cannot be null");
                } 
            }
        }

        
    }
}