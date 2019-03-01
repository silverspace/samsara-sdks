using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AssetCable
    /// </summary>
    public sealed class AssetCable:  IEquatable<AssetCable>
    { 
        /// <summary>
        /// Asset type
        /// </summary>
        public string AssetType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AssetCable.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AssetCable()
        {
        }

        private AssetCable(string AssetType)
        {
            
            this.AssetType = AssetType;
            
        }

        /// <summary>
        /// Returns builder of AssetCable.
        /// </summary>
        /// <returns>AssetCableBuilder</returns>
        public static AssetCableBuilder Builder()
        {
            return new AssetCableBuilder();
        }

        /// <summary>
        /// Returns AssetCableBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AssetCableBuilder</returns>
        public AssetCableBuilder With()
        {
            return Builder()
                .AssetType(AssetType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AssetCable other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AssetCable.
        /// </summary>
        /// <param name="left">Compared (AssetCable</param>
        /// <param name="right">Compared (AssetCable</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AssetCable left, AssetCable right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AssetCable.
        /// </summary>
        /// <param name="left">Compared (AssetCable</param>
        /// <param name="right">Compared (AssetCable</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AssetCable left, AssetCable right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AssetCable.
        /// </summary>
        public sealed class AssetCableBuilder
        {
            private string _AssetType;

            internal AssetCableBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AssetCable.AssetType property.
            /// </summary>
            /// <param name="value">Asset type</param>
            public AssetCableBuilder AssetType(string value)
            {
                _AssetType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AssetCable.
            /// </summary>
            /// <returns>AssetCable</returns>
            public AssetCable Build()
            {
                Validate();
                return new AssetCable(
                    AssetType: _AssetType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}