using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DriversSummaryResponse
    /// </summary>
    public sealed class DriversSummaryResponse:  IEquatable<DriversSummaryResponse>
    { 
        /// <summary>
        /// Summaries
        /// </summary>
        public List<DriversSummaryResponseSummaries> Summaries { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DriversSummaryResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DriversSummaryResponse()
        {
        }

        private DriversSummaryResponse(List<DriversSummaryResponseSummaries> Summaries)
        {
            
            this.Summaries = Summaries;
            
        }

        /// <summary>
        /// Returns builder of DriversSummaryResponse.
        /// </summary>
        /// <returns>DriversSummaryResponseBuilder</returns>
        public static DriversSummaryResponseBuilder Builder()
        {
            return new DriversSummaryResponseBuilder();
        }

        /// <summary>
        /// Returns DriversSummaryResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DriversSummaryResponseBuilder</returns>
        public DriversSummaryResponseBuilder With()
        {
            return Builder()
                .Summaries(Summaries);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DriversSummaryResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DriversSummaryResponse.
        /// </summary>
        /// <param name="left">Compared (DriversSummaryResponse</param>
        /// <param name="right">Compared (DriversSummaryResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DriversSummaryResponse left, DriversSummaryResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DriversSummaryResponse.
        /// </summary>
        /// <param name="left">Compared (DriversSummaryResponse</param>
        /// <param name="right">Compared (DriversSummaryResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DriversSummaryResponse left, DriversSummaryResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DriversSummaryResponse.
        /// </summary>
        public sealed class DriversSummaryResponseBuilder
        {
            private List<DriversSummaryResponseSummaries> _Summaries;

            internal DriversSummaryResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DriversSummaryResponse.Summaries property.
            /// </summary>
            /// <param name="value">Summaries</param>
            public DriversSummaryResponseBuilder Summaries(List<DriversSummaryResponseSummaries> value)
            {
                _Summaries = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DriversSummaryResponse.
            /// </summary>
            /// <returns>DriversSummaryResponse</returns>
            public DriversSummaryResponse Build()
            {
                Validate();
                return new DriversSummaryResponse(
                    Summaries: _Summaries
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}