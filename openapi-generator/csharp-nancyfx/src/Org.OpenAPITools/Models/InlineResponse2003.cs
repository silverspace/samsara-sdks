using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2003
    /// </summary>
    public sealed class InlineResponse2003:  IEquatable<InlineResponse2003>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Vehicles
        /// </summary>
        public List<VehicleLocation> Vehicles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2003.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2003()
        {
        }

        private InlineResponse2003(long? GroupId, List<VehicleLocation> Vehicles)
        {
            
            this.GroupId = GroupId;
            
            this.Vehicles = Vehicles;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2003.
        /// </summary>
        /// <returns>InlineResponse2003Builder</returns>
        public static InlineResponse2003Builder Builder()
        {
            return new InlineResponse2003Builder();
        }

        /// <summary>
        /// Returns InlineResponse2003Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2003Builder</returns>
        public InlineResponse2003Builder With()
        {
            return Builder()
                .GroupId(GroupId)
                .Vehicles(Vehicles);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2003 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2003.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2003</param>
        /// <param name="right">Compared (InlineResponse2003</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2003 left, InlineResponse2003 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2003.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2003</param>
        /// <param name="right">Compared (InlineResponse2003</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2003 left, InlineResponse2003 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2003.
        /// </summary>
        public sealed class InlineResponse2003Builder
        {
            private long? _GroupId;
            private List<VehicleLocation> _Vehicles;

            internal InlineResponse2003Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2003.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineResponse2003Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2003.Vehicles property.
            /// </summary>
            /// <param name="value">Vehicles</param>
            public InlineResponse2003Builder Vehicles(List<VehicleLocation> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2003.
            /// </summary>
            /// <returns>InlineResponse2003</returns>
            public InlineResponse2003 Build()
            {
                Validate();
                return new InlineResponse2003(
                    GroupId: _GroupId,
                    Vehicles: _Vehicles
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}