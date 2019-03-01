using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DispatchRouteHistoricalEntry
    /// </summary>
    public sealed class DispatchRouteHistoricalEntry:  IEquatable<DispatchRouteHistoricalEntry>
    { 
        /// <summary>
        /// Timestamp that the route was updated, represented as Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }

        /// <summary>
        /// Route
        /// </summary>
        public DispatchRoute Route { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DispatchRouteHistoricalEntry.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DispatchRouteHistoricalEntry()
        {
        }

        private DispatchRouteHistoricalEntry(long? ChangedAtMs, DispatchRoute Route)
        {
            
            this.ChangedAtMs = ChangedAtMs;
            
            this.Route = Route;
            
        }

        /// <summary>
        /// Returns builder of DispatchRouteHistoricalEntry.
        /// </summary>
        /// <returns>DispatchRouteHistoricalEntryBuilder</returns>
        public static DispatchRouteHistoricalEntryBuilder Builder()
        {
            return new DispatchRouteHistoricalEntryBuilder();
        }

        /// <summary>
        /// Returns DispatchRouteHistoricalEntryBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DispatchRouteHistoricalEntryBuilder</returns>
        public DispatchRouteHistoricalEntryBuilder With()
        {
            return Builder()
                .ChangedAtMs(ChangedAtMs)
                .Route(Route);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DispatchRouteHistoricalEntry other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DispatchRouteHistoricalEntry.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteHistoricalEntry</param>
        /// <param name="right">Compared (DispatchRouteHistoricalEntry</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DispatchRouteHistoricalEntry left, DispatchRouteHistoricalEntry right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DispatchRouteHistoricalEntry.
        /// </summary>
        /// <param name="left">Compared (DispatchRouteHistoricalEntry</param>
        /// <param name="right">Compared (DispatchRouteHistoricalEntry</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DispatchRouteHistoricalEntry left, DispatchRouteHistoricalEntry right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DispatchRouteHistoricalEntry.
        /// </summary>
        public sealed class DispatchRouteHistoricalEntryBuilder
        {
            private long? _ChangedAtMs;
            private DispatchRoute _Route;

            internal DispatchRouteHistoricalEntryBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DispatchRouteHistoricalEntry.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp that the route was updated, represented as Unix milliseconds since epoch.</param>
            public DispatchRouteHistoricalEntryBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for DispatchRouteHistoricalEntry.Route property.
            /// </summary>
            /// <param name="value">Route</param>
            public DispatchRouteHistoricalEntryBuilder Route(DispatchRoute value)
            {
                _Route = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DispatchRouteHistoricalEntry.
            /// </summary>
            /// <returns>DispatchRouteHistoricalEntry</returns>
            public DispatchRouteHistoricalEntry Build()
            {
                Validate();
                return new DispatchRouteHistoricalEntry(
                    ChangedAtMs: _ChangedAtMs,
                    Route: _Route
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}