using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HosLogsResponse
    /// </summary>
    public sealed class HosLogsResponse:  IEquatable<HosLogsResponse>
    { 
        /// <summary>
        /// Logs
        /// </summary>
        public List<HosLogsResponseLogs> Logs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HosLogsResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HosLogsResponse()
        {
        }

        private HosLogsResponse(List<HosLogsResponseLogs> Logs)
        {
            
            this.Logs = Logs;
            
        }

        /// <summary>
        /// Returns builder of HosLogsResponse.
        /// </summary>
        /// <returns>HosLogsResponseBuilder</returns>
        public static HosLogsResponseBuilder Builder()
        {
            return new HosLogsResponseBuilder();
        }

        /// <summary>
        /// Returns HosLogsResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HosLogsResponseBuilder</returns>
        public HosLogsResponseBuilder With()
        {
            return Builder()
                .Logs(Logs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(HosLogsResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HosLogsResponse.
        /// </summary>
        /// <param name="left">Compared (HosLogsResponse</param>
        /// <param name="right">Compared (HosLogsResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HosLogsResponse left, HosLogsResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HosLogsResponse.
        /// </summary>
        /// <param name="left">Compared (HosLogsResponse</param>
        /// <param name="right">Compared (HosLogsResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HosLogsResponse left, HosLogsResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HosLogsResponse.
        /// </summary>
        public sealed class HosLogsResponseBuilder
        {
            private List<HosLogsResponseLogs> _Logs;

            internal HosLogsResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HosLogsResponse.Logs property.
            /// </summary>
            /// <param name="value">Logs</param>
            public HosLogsResponseBuilder Logs(List<HosLogsResponseLogs> value)
            {
                _Logs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HosLogsResponse.
            /// </summary>
            /// <returns>HosLogsResponse</returns>
            public HosLogsResponse Build()
            {
                Validate();
                return new HosLogsResponse(
                    Logs: _Logs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}