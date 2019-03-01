using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject14
    /// </summary>
    public sealed class InlineObject14:  IEquatable<InlineObject14>
    { 
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
        /// Use InlineObject14.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject14()
        {
        }

        private InlineObject14(long? GroupId, List<Vehicle> Vehicles)
        {
            
            this.GroupId = GroupId;
            
            this.Vehicles = Vehicles;
            
        }

        /// <summary>
        /// Returns builder of InlineObject14.
        /// </summary>
        /// <returns>InlineObject14Builder</returns>
        public static InlineObject14Builder Builder()
        {
            return new InlineObject14Builder();
        }

        /// <summary>
        /// Returns InlineObject14Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject14Builder</returns>
        public InlineObject14Builder With()
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

        public bool Equals(InlineObject14 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject14.
        /// </summary>
        /// <param name="left">Compared (InlineObject14</param>
        /// <param name="right">Compared (InlineObject14</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject14 left, InlineObject14 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject14.
        /// </summary>
        /// <param name="left">Compared (InlineObject14</param>
        /// <param name="right">Compared (InlineObject14</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject14 left, InlineObject14 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject14.
        /// </summary>
        public sealed class InlineObject14Builder
        {
            private long? _GroupId;
            private List<Vehicle> _Vehicles;

            internal InlineObject14Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject14.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject14Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject14.Vehicles property.
            /// </summary>
            /// <param name="value">Vehicles</param>
            public InlineObject14Builder Vehicles(List<Vehicle> value)
            {
                _Vehicles = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject14.
            /// </summary>
            /// <returns>InlineObject14</returns>
            public InlineObject14 Build()
            {
                Validate();
                return new InlineObject14(
                    GroupId: _GroupId,
                    Vehicles: _Vehicles
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject14 and cannot be null");
                } 
                if (_Vehicles == null)
                {
                    throw new ArgumentException("Vehicles is a required property for InlineObject14 and cannot be null");
                } 
            }
        }

        
    }
}