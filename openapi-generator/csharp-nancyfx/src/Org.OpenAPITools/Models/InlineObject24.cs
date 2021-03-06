using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject24
    /// </summary>
    public sealed class InlineObject24:  IEquatable<InlineObject24>
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
        /// Use InlineObject24.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject24()
        {
        }

        private InlineObject24(long? GroupId, List<long?> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of InlineObject24.
        /// </summary>
        /// <returns>InlineObject24Builder</returns>
        public static InlineObject24Builder Builder()
        {
            return new InlineObject24Builder();
        }

        /// <summary>
        /// Returns InlineObject24Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject24Builder</returns>
        public InlineObject24Builder With()
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

        public bool Equals(InlineObject24 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject24.
        /// </summary>
        /// <param name="left">Compared (InlineObject24</param>
        /// <param name="right">Compared (InlineObject24</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject24 left, InlineObject24 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject24.
        /// </summary>
        /// <param name="left">Compared (InlineObject24</param>
        /// <param name="right">Compared (InlineObject24</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject24 left, InlineObject24 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject24.
        /// </summary>
        public sealed class InlineObject24Builder
        {
            private long? _GroupId;
            private List<long?> _Sensors;

            internal InlineObject24Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject24.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject24Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject24.Sensors property.
            /// </summary>
            /// <param name="value">List of sensor IDs to query.</param>
            public InlineObject24Builder Sensors(List<long?> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject24.
            /// </summary>
            /// <returns>InlineObject24</returns>
            public InlineObject24 Build()
            {
                Validate();
                return new InlineObject24(
                    GroupId: _GroupId,
                    Sensors: _Sensors
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject24 and cannot be null");
                } 
                if (_Sensors == null)
                {
                    throw new ArgumentException("Sensors is a required property for InlineObject24 and cannot be null");
                } 
            }
        }

        
    }
}