using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject19
    /// </summary>
    public sealed class InlineObject19:  IEquatable<InlineObject19>
    { 
        /// <summary>
        /// Group ID to query.
        /// </summary>
        public long? GroupId { get; private set; }

        /// <summary>
        /// List of sensor IDs to query.
        /// </summary>
        public List<long?> Sensors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject19.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject19()
        {
        }

        private InlineObject19(long? GroupId, List<long?> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of InlineObject19.
        /// </summary>
        /// <returns>InlineObject19Builder</returns>
        public static InlineObject19Builder Builder()
        {
            return new InlineObject19Builder();
        }

        /// <summary>
        /// Returns InlineObject19Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject19Builder</returns>
        public InlineObject19Builder With()
        {
            return Builder()
                .GroupId(GroupId)
                .Sensors(Sensors);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject19 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject19.
        /// </summary>
        /// <param name="left">Compared (InlineObject19</param>
        /// <param name="right">Compared (InlineObject19</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject19 left, InlineObject19 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject19.
        /// </summary>
        /// <param name="left">Compared (InlineObject19</param>
        /// <param name="right">Compared (InlineObject19</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject19 left, InlineObject19 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject19.
        /// </summary>
        public sealed class InlineObject19Builder
        {
            private long? _GroupId;
            private List<long?> _Sensors;

            internal InlineObject19Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject19.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject19Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject19.Sensors property.
            /// </summary>
            /// <param name="value">List of sensor IDs to query.</param>
            public InlineObject19Builder Sensors(List<long?> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject19.
            /// </summary>
            /// <returns>InlineObject19</returns>
            public InlineObject19 Build()
            {
                Validate();
                return new InlineObject19(
                    GroupId: _GroupId,
                    Sensors: _Sensors
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject19 and cannot be null");
                } 
                if (_Sensors == null)
                {
                    throw new ArgumentException("Sensors is a required property for InlineObject19 and cannot be null");
                } 
            }
        }

        
    }
}