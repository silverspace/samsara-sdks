using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchRouteHistory
    /// </summary>
    public sealed class DispatchRouteHistory:  IEquatable<DispatchRouteHistory>
    { 
        /// <summary>
        /// History of the route&#39;s state changes.
        /// </summary>
        public List<DispatchRouteHistoricalEntry> History { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DispatchRouteHistory.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchRouteHistory()
        {
        }

        private DispatchRouteHistory(List<DispatchRouteHistoricalEntry> History)
        {
            
            this.History = History;
            
        }

        /// <summary>
        /// Returns builder of DispatchRouteHistory.
        /// </summary>
        /// <returns>DispatchRouteHistoryBuilder</returns>
        public static DispatchRouteHistoryBuilder Builder()
        {
            return new DispatchRouteHistoryBuilder();
        }

        /// <summary>
        /// Returns DispatchRouteHistoryBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchRouteHistoryBuilder</returns>
        public DispatchRouteHistoryBuilder With()
        {
            return Builder()
                .History(History);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DispatchRouteHistory other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchRouteHistory.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteHistory</param>
        /// <param name="right">Compared (DispatchRouteHistory</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchRouteHistory left, DispatchRouteHistory right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchRouteHistory.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteHistory</param>
        /// <param name="right">Compared (DispatchRouteHistory</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchRouteHistory left, DispatchRouteHistory right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchRouteHistory.
        /// </summary>
        public sealed class DispatchRouteHistoryBuilder
        {
            private List<DispatchRouteHistoricalEntry> _History;

            internal DispatchRouteHistoryBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchRouteHistory.History property.
            /// </summary>
            /// <param name="value">History of the route&#39;s state changes.</param>
            public DispatchRouteHistoryBuilder History(List<DispatchRouteHistoricalEntry> value)
            {
                _History = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchRouteHistory.
            /// </summary>
            /// <returns>DispatchRouteHistory</returns>
            public DispatchRouteHistory Build()
            {
                Validate();
                return new DispatchRouteHistory(
                    History: _History
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}