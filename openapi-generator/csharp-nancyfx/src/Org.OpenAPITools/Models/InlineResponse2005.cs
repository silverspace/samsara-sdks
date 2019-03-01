using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2005
    /// </summary>
    public sealed class InlineResponse2005:  IEquatable<InlineResponse2005>
    { 
        /// <summary>
        /// Pagination
        /// </summary>
        public Pagination Pagination { get; private set; }

        /// <summary>
        /// VehicleStats
        /// </summary>
        public List<InlineResponse2005VehicleStats> VehicleStats { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2005.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2005()
        {
        }

        private InlineResponse2005(Pagination Pagination, List<InlineResponse2005VehicleStats> VehicleStats)
        {
            
            this.Pagination = Pagination;
            
            this.VehicleStats = VehicleStats;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2005.
        /// </summary>
        /// <returns>InlineResponse2005Builder</returns>
        public static InlineResponse2005Builder Builder()
        {
            return new InlineResponse2005Builder();
        }

        /// <summary>
        /// Returns InlineResponse2005Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2005Builder</returns>
        public InlineResponse2005Builder With()
        {
            return Builder()
                .Pagination(Pagination)
                .VehicleStats(VehicleStats);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2005 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2005.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2005</param>
        /// <param name="right">Compared (InlineResponse2005</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2005 left, InlineResponse2005 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2005.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2005</param>
        /// <param name="right">Compared (InlineResponse2005</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2005 left, InlineResponse2005 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2005.
        /// </summary>
        public sealed class InlineResponse2005Builder
        {
            private Pagination _Pagination;
            private List<InlineResponse2005VehicleStats> _VehicleStats;

            internal InlineResponse2005Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2005.Pagination property.
            /// </summary>
            /// <param name="value">Pagination</param>
            public InlineResponse2005Builder Pagination(Pagination value)
            {
                _Pagination = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2005.VehicleStats property.
            /// </summary>
            /// <param name="value">VehicleStats</param>
            public InlineResponse2005Builder VehicleStats(List<InlineResponse2005VehicleStats> value)
            {
                _VehicleStats = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2005.
            /// </summary>
            /// <returns>InlineResponse2005</returns>
            public InlineResponse2005 Build()
            {
                Validate();
                return new InlineResponse2005(
                    Pagination: _Pagination,
                    VehicleStats: _VehicleStats
                );
            }

            private void Validate()
            { 
                if (_VehicleStats == null)
                {
                    throw new ArgumentException("VehicleStats is a required property for InlineResponse2005 and cannot be null");
                } 
            }
        }

        
    }
}