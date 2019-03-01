using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// A list of aux input values over a timerange.
    /// </summary>
    public sealed class AuxInputSeries:  IEquatable<AuxInputSeries>
    { 
        /// <summary>
        /// The name of the aux input.
        /// </summary>
        public NameEnum? Name { get; private set; }

        /// <summary>
        /// Values
        /// </summary>
        public List<AuxInput> Values { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AuxInputSeries.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AuxInputSeries()
        {
        }

        private AuxInputSeries(NameEnum? Name, List<AuxInput> Values)
        {
            
            this.Name = Name;
            
            this.Values = Values;
            
        }

        /// <summary>
        /// Returns builder of AuxInputSeries.
        /// </summary>
        /// <returns>AuxInputSeriesBuilder</returns>
        public static AuxInputSeriesBuilder Builder()
        {
            return new AuxInputSeriesBuilder();
        }

        /// <summary>
        /// Returns AuxInputSeriesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AuxInputSeriesBuilder</returns>
        public AuxInputSeriesBuilder With()
        {
            return Builder()
                .Name(Name)
                .Values(Values);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AuxInputSeries other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AuxInputSeries.
        /// </summary>
        /// <param name="left">Compared (AuxInputSeries</param>
        /// <param name="right">Compared (AuxInputSeries</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AuxInputSeries left, AuxInputSeries right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AuxInputSeries.
        /// </summary>
        /// <param name="left">Compared (AuxInputSeries</param>
        /// <param name="right">Compared (AuxInputSeries</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AuxInputSeries left, AuxInputSeries right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AuxInputSeries.
        /// </summary>
        public sealed class AuxInputSeriesBuilder
        {
            private NameEnum? _Name;
            private List<AuxInput> _Values;

            internal AuxInputSeriesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AuxInputSeries.Name property.
            /// </summary>
            /// <param name="value">The name of the aux input.</param>
            public AuxInputSeriesBuilder Name(NameEnum? value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for AuxInputSeries.Values property.
            /// </summary>
            /// <param name="value">Values</param>
            public AuxInputSeriesBuilder Values(List<AuxInput> value)
            {
                _Values = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AuxInputSeries.
            /// </summary>
            /// <returns>AuxInputSeries</returns>
            public AuxInputSeries Build()
            {
                Validate();
                return new AuxInputSeries(
                    Name: _Name,
                    Values: _Values
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for AuxInputSeries and cannot be null");
                } 
                if (_Values == null)
                {
                    throw new ArgumentException("Values is a required property for AuxInputSeries and cannot be null");
                } 
            }
        }

        
        public enum NameEnum { EmergencyLights, EmergencyAlarm, StopPaddle, PowerTakeOff, Plow, Sweeper, Salter, Boom };
    }
}