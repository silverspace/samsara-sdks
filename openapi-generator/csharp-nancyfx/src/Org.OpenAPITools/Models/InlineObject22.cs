using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject22
    /// </summary>
    public sealed class InlineObject22:  IEquatable<InlineObject22>
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
        /// Use InlineObject22.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject22()
        {
        }

        private InlineObject22(long? GroupId, List<long?> Sensors)
        {
            
            this.GroupId = GroupId;
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of InlineObject22.
        /// </summary>
        /// <returns>InlineObject22Builder</returns>
        public static InlineObject22Builder Builder()
        {
            return new InlineObject22Builder();
        }

        /// <summary>
        /// Returns InlineObject22Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject22Builder</returns>
        public InlineObject22Builder With()
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

        public bool Equals(InlineObject22 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject22.
        /// </summary>
        /// <param name="left">Compared (InlineObject22</param>
        /// <param name="right">Compared (InlineObject22</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject22 left, InlineObject22 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject22.
        /// </summary>
        /// <param name="left">Compared (InlineObject22</param>
        /// <param name="right">Compared (InlineObject22</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject22 left, InlineObject22 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject22.
        /// </summary>
        public sealed class InlineObject22Builder
        {
            private long? _GroupId;
            private List<long?> _Sensors;

            internal InlineObject22Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject22.GroupId property.
            /// </summary>
            /// <param name="value">Group ID to query.</param>
            public InlineObject22Builder GroupId(long? value)
            {
                _GroupId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject22.Sensors property.
            /// </summary>
            /// <param name="value">List of sensor IDs to query.</param>
            public InlineObject22Builder Sensors(List<long?> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject22.
            /// </summary>
            /// <returns>InlineObject22</returns>
            public InlineObject22 Build()
            {
                Validate();
                return new InlineObject22(
                    GroupId: _GroupId,
                    Sensors: _Sensors
                );
            }

            private void Validate()
            { 
                if (_GroupId == null)
                {
                    throw new ArgumentException("GroupId is a required property for InlineObject22 and cannot be null");
                } 
                if (_Sensors == null)
                {
                    throw new ArgumentException("Sensors is a required property for InlineObject22 and cannot be null");
                } 
            }
        }

        
    }
}