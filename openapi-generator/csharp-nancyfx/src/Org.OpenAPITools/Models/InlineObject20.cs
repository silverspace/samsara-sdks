using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject20
    /// </summary>
    public sealed class InlineObject20:  IEquatable<InlineObject20>
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
        /// Use InlineObject20.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject20()
        {
        }

        private InlineObject20(long? GroupId, List<long?> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of InlineObject20.
        /// </summary>
        /// <returns>InlineObject20Builder</returns>
        public static InlineObject20Builder Builder()
        {
            return new InlineObject20Builder();
        }

        /// <summary>
        /// Returns InlineObject20Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject20Builder</returns>
        public InlineObject20Builder With()
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

        public bool Equals(InlineObject20 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject20.
        /// </summary>
        /// <param name="left">Compared (InlineObject20</param>
        /// <param name="right">Compared (InlineObject20</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject20 left, InlineObject20 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject20.
        /// </summary>
        /// <param name="left">Compared (InlineObject20</param>
        /// <param name="right">Compared (InlineObject20</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject20 left, InlineObject20 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject20.
        /// </summary>
        public sealed class InlineObject20Builder
        {
            private long? _GroupId;
            private List<long?> _Sensors;

            internal InlineObject20Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject20.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject20Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject20.Sensors property.
            /// </summary>
            /// <param name="value">List of sensor IDs to query.</param>
            public InlineObject20Builder Sensors(List<long?> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject20.
            /// </summary>
            /// <returns>InlineObject20</returns>
            public InlineObject20 Build()
            {
                Validate();
                return new InlineObject20(
                    GroupId: _GroupId,
                    Sensors: _Sensors
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject20 and cannot be null");
                } 
                if (_Sensors == null)
                {
                    throw new ArgumentException("Sensors is a required property for InlineObject20 and cannot be null");
                } 
            }
        }

        
    }
}