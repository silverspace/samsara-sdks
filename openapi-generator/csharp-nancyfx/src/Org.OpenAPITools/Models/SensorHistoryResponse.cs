using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Contains the results for a sensor history request. Each result contains a timestamp and datapoint for each requested (sensor, field) pair.
    /// </summary>
    public sealed class SensorHistoryResponse:  IEquatable<SensorHistoryResponse>
    { 
        /// <summary>
        /// Results
        /// </summary>
        public List<SensorHistoryResponseResults> Results { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use SensorHistoryResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public SensorHistoryResponse()
        {
        }

        private SensorHistoryResponse(List<SensorHistoryResponseResults> Results)
        {
            
            this.Results = Results;
            
        }

        /// <summary>
        /// Returns builder of SensorHistoryResponse.
        /// </summary>
        /// <returns>SensorHistoryResponseBuilder</returns>
        public static SensorHistoryResponseBuilder Builder()
        {
            return new SensorHistoryResponseBuilder();
        }

        /// <summary>
        /// Returns SensorHistoryResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>SensorHistoryResponseBuilder</returns>
        public SensorHistoryResponseBuilder With()
        {
            return Builder()
                .Results(Results);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(SensorHistoryResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (SensorHistoryResponse.
        /// </summary>
        /// <param name="left">Compared (SensorHistoryResponse</param>
        /// <param name="right">Compared (SensorHistoryResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (SensorHistoryResponse left, SensorHistoryResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (SensorHistoryResponse.
        /// </summary>
        /// <param name="left">Compared (SensorHistoryResponse</param>
        /// <param name="right">Compared (SensorHistoryResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (SensorHistoryResponse left, SensorHistoryResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of SensorHistoryResponse.
        /// </summary>
        public sealed class SensorHistoryResponseBuilder
        {
            private List<SensorHistoryResponseResults> _Results;

            internal SensorHistoryResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for SensorHistoryResponse.Results property.
            /// </summary>
            /// <param name="value">Results</param>
            public SensorHistoryResponseBuilder Results(List<SensorHistoryResponseResults> value)
            {
                _Results = value;
                return this;
            }


            /// <summary>
            /// Builds instance of SensorHistoryResponse.
            /// </summary>
            /// <returns>SensorHistoryResponse</returns>
            public SensorHistoryResponse Build()
            {
                Validate();
                return new SensorHistoryResponse(
                    Results: _Results
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}