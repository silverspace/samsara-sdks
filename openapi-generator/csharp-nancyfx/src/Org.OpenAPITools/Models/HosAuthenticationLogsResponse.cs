using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// HosAuthenticationLogsResponse
    /// </summary>
    public sealed class HosAuthenticationLogsResponse:  IEquatable<HosAuthenticationLogsResponse>
    { 
        /// <summary>
        /// AuthenticationLogs
        /// </summary>
        public List<HosAuthenticationLogsResponseAuthenticationLogs> AuthenticationLogs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use HosAuthenticationLogsResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public HosAuthenticationLogsResponse()
        {
        }

        private HosAuthenticationLogsResponse(List<HosAuthenticationLogsResponseAuthenticationLogs> AuthenticationLogs)
        {
            
            this.AuthenticationLogs = AuthenticationLogs;
            
        }

        /// <summary>
        /// Returns builder of HosAuthenticationLogsResponse.
        /// </summary>
        /// <returns>HosAuthenticationLogsResponseBuilder</returns>
        public static HosAuthenticationLogsResponseBuilder Builder()
        {
            return new HosAuthenticationLogsResponseBuilder();
        }

        /// <summary>
        /// Returns HosAuthenticationLogsResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>HosAuthenticationLogsResponseBuilder</returns>
        public HosAuthenticationLogsResponseBuilder With()
        {
            return Builder()
                .AuthenticationLogs(AuthenticationLogs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(HosAuthenticationLogsResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (HosAuthenticationLogsResponse.
        /// </summary>
        /// <param name="left">Compared (HosAuthenticationLogsResponse</param>
        /// <param name="right">Compared (HosAuthenticationLogsResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (HosAuthenticationLogsResponse left, HosAuthenticationLogsResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (HosAuthenticationLogsResponse.
        /// </summary>
        /// <param name="left">Compared (HosAuthenticationLogsResponse</param>
        /// <param name="right">Compared (HosAuthenticationLogsResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (HosAuthenticationLogsResponse left, HosAuthenticationLogsResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of HosAuthenticationLogsResponse.
        /// </summary>
        public sealed class HosAuthenticationLogsResponseBuilder
        {
            private List<HosAuthenticationLogsResponseAuthenticationLogs> _AuthenticationLogs;

            internal HosAuthenticationLogsResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for HosAuthenticationLogsResponse.AuthenticationLogs property.
            /// </summary>
            /// <param name="value">AuthenticationLogs</param>
            public HosAuthenticationLogsResponseBuilder AuthenticationLogs(List<HosAuthenticationLogsResponseAuthenticationLogs> value)
            {
                _AuthenticationLogs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of HosAuthenticationLogsResponse.
            /// </summary>
            /// <returns>HosAuthenticationLogsResponse</returns>
            public HosAuthenticationLogsResponse Build()
            {
                Validate();
                return new HosAuthenticationLogsResponse(
                    AuthenticationLogs: _AuthenticationLogs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}