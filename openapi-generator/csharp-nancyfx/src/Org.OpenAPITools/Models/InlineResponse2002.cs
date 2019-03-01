using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2002
    /// </summary>
    public sealed class InlineResponse2002:  IEquatable<InlineResponse2002>
    { 
        /// <summary>
        /// Pagination
        /// </summary>
        public Pagination Pagination { get; private set; }

        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// Vehicles
        /// </summary>
        public List<Vehicle> Vehicles { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2002.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2002()
        {
        }

        private InlineResponse2002(Pagination Pagination, long? GroupId, List<Vehicle> Vehicles)
        {
            
            this.Pagination = Pagination;
            
            this.GroupId = GroupId;
            
            this.Vehicles = Vehicles;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2002.
        /// </summary>
        /// <returns>InlineResponse2002Builder</returns>
        public static InlineResponse2002Builder Builder()
        {
            return new InlineResponse2002Builder();
        }

        /// <summary>
        /// Returns InlineResponse2002Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2002Builder</returns>
        public InlineResponse2002Builder With()
        {
            return Builder()
                .Pagination(Pagination)
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

        public bool Equals(InlineResponse2002 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2002.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2002</param>
        /// <param name="right">Compared (InlineResponse2002</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2002 left, InlineResponse2002 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2002.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2002</param>
        /// <param name="right">Compared (InlineResponse2002</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2002 left, InlineResponse2002 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2002.
        /// </summary>
        public sealed class InlineResponse2002Builder
        {
            private Pagination _Pagination;
            private long? _GroupId;
            private List<Vehicle> _Vehicles;

            internal InlineResponse2002Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2002.Pagination property.
            /// </summary>
            /// <param name="value">Pagination</param>
            public InlineResponse2002Builder Pagination(Pagination value)
            {
                _Pagination = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2002.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineResponse2002Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2002.Vehicles property.
            /// </summary>
            /// <param name="value">Vehicles</param>
            public InlineResponse2002Builder Vehicles(List<Vehicle> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2002.
            /// </summary>
            /// <returns>InlineResponse2002</returns>
            public InlineResponse2002 Build()
            {
                Validate();
                return new InlineResponse2002(
                    Pagination: _Pagination,
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