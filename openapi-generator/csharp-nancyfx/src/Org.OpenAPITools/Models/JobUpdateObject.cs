using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// JobUpdateObject
    /// </summary>
    public sealed class JobUpdateObject:  IEquatable<JobUpdateObject>
    { 
        /// <summary>
        /// Timestamp that this event was updated, represented as Unix milliseconds since epoch.
        /// </summary>
        public long? ChangedAtMs { get; private set; }

        /// <summary>
        /// ID of the Samsara job.
        /// </summary>
        public long? JobId { get; private set; }

        /// <summary>
        /// JobState
        /// </summary>
        public JobStatus JobState { get; private set; }

        /// <summary>
        /// PrevJobState
        /// </summary>
        public PrevJobStatus PrevJobState { get; private set; }

        /// <summary>
        /// Route
        /// </summary>
        public DispatchRoute Route { get; private set; }

        /// <summary>
        /// ID of the Samsara dispatch route.
        /// </summary>
        public long? RouteId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use JobUpdateObject.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public JobUpdateObject()
        {
        }

        private JobUpdateObject(long? ChangedAtMs, long? JobId, JobStatus JobState, PrevJobStatus PrevJobState, DispatchRoute Route, long? RouteId)
        {
            
            this.ChangedAtMs = ChangedAtMs;
            
            this.JobId = JobId;
            
            this.JobState = JobState;
            
            this.PrevJobState = PrevJobState;
            
            this.Route = Route;
            
            this.RouteId = RouteId;
            
        }

        /// <summary>
        /// Returns builder of JobUpdateObject.
        /// </summary>
        /// <returns>JobUpdateObjectBuilder</returns>
        public static JobUpdateObjectBuilder Builder()
        {
            return new JobUpdateObjectBuilder();
        }

        /// <summary>
        /// Returns JobUpdateObjectBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>JobUpdateObjectBuilder</returns>
        public JobUpdateObjectBuilder With()
        {
            return Builder()
                .ChangedAtMs(ChangedAtMs)
                .JobId(JobId)
                .JobState(JobState)
                .PrevJobState(PrevJobState)
                .Route(Route)
                .RouteId(RouteId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(JobUpdateObject other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (JobUpdateObject.
        /// </summary>
        /// <param name="left">Compared (JobUpdateObject</param>
        /// <param name="right">Compared (JobUpdateObject</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (JobUpdateObject left, JobUpdateObject right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (JobUpdateObject.
        /// </summary>
        /// <param name="left">Compared (JobUpdateObject</param>
        /// <param name="right">Compared (JobUpdateObject</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (JobUpdateObject left, JobUpdateObject right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of JobUpdateObject.
        /// </summary>
        public sealed class JobUpdateObjectBuilder
        {
            private long? _ChangedAtMs;
            private long? _JobId;
            private JobStatus _JobState;
            private PrevJobStatus _PrevJobState;
            private DispatchRoute _Route;
            private long? _RouteId;

            internal JobUpdateObjectBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for JobUpdateObject.ChangedAtMs property.
            /// </summary>
            /// <param name="value">Timestamp that this event was updated, represented as Unix milliseconds since epoch.</param>
            public JobUpdateObjectBuilder ChangedAtMs(long? value)
            {
                _ChangedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for JobUpdateObject.JobId property.
            /// </summary>
            /// <param name="value">ID of the Samsara job.</param>
            public JobUpdateObjectBuilder JobId(long? value)
            {
                _JobId = value;
                return this;
            }

            /// <summary>
            /// Sets value for JobUpdateObject.JobState property.
            /// </summary>
            /// <param name="value">JobState</param>
            public JobUpdateObjectBuilder JobState(JobStatus value)
            {
                _JobState = value;
                return this;
            }

            /// <summary>
            /// Sets value for JobUpdateObject.PrevJobState property.
            /// </summary>
            /// <param name="value">PrevJobState</param>
            public JobUpdateObjectBuilder PrevJobState(PrevJobStatus value)
            {
                _PrevJobState = value;
                return this;
            }

            /// <summary>
            /// Sets value for JobUpdateObject.Route property.
            /// </summary>
            /// <param name="value">Route</param>
            public JobUpdateObjectBuilder Route(DispatchRoute value)
            {
                _Route = value;
                return this;
            }

            /// <summary>
            /// Sets value for JobUpdateObject.RouteId property.
            /// </summary>
            /// <param name="value">ID of the Samsara dispatch route.</param>
            public JobUpdateObjectBuilder RouteId(long? value)
            {
                _RouteId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of JobUpdateObject.
            /// </summary>
            /// <returns>JobUpdateObject</returns>
            public JobUpdateObject Build()
            {
                Validate();
                return new JobUpdateObject(
                    ChangedAtMs: _ChangedAtMs,
                    JobId: _JobId,
                    JobState: _JobState,
                    PrevJobState: _PrevJobState,
                    Route: _Route,
                    RouteId: _RouteId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}