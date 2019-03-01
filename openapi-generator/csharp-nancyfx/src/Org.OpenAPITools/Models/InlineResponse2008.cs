using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2008
    /// </summary>
    public sealed class InlineResponse2008:  IEquatable<InlineResponse2008>
    { 
        /// <summary>
        /// Sensors
        /// </summary>
        public List<Sensor> Sensors { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2008.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2008()
        {
        }

        private InlineResponse2008(List<Sensor> Sensors)
        {
            
            this.Sensors = Sensors;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2008.
        /// </summary>
        /// <returns>InlineResponse2008Builder</returns>
        public static InlineResponse2008Builder Builder()
        {
            return new InlineResponse2008Builder();
        }

        /// <summary>
        /// Returns InlineResponse2008Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2008Builder</returns>
        public InlineResponse2008Builder With()
        {
            return Builder()
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

        public bool Equals(InlineResponse2008 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2008.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2008</param>
        /// <param name="right">Compared (InlineResponse2008</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2008 left, InlineResponse2008 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2008.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2008</param>
        /// <param name="right">Compared (InlineResponse2008</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2008 left, InlineResponse2008 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2008.
        /// </summary>
        public sealed class InlineResponse2008Builder
        {
            private List<Sensor> _Sensors;

            internal InlineResponse2008Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2008.Sensors property.
            /// </summary>
            /// <param name="value">Sensors</param>
            public InlineResponse2008Builder Sensors(List<Sensor> value)
            {
                _Sensors = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2008.
            /// </summary>
            /// <returns>InlineResponse2008</returns>
            public InlineResponse2008 Build()
            {
                Validate();
                return new InlineResponse2008(
                    Sensors: _Sensors
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}