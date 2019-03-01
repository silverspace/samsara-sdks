using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// AllRouteJobUpdates
    /// </summary>
    public sealed class AllRouteJobUpdates:  IEquatable<AllRouteJobUpdates>
    { 
        /// <summary>
        /// JobUpdates
        /// </summary>
        public List<JobUpdateObject> JobUpdates { get; private set; }

        /// <summary>
        /// Sequence ID of the last update returned in the response
        /// </summary>
        public string SequenceId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AllRouteJobUpdates.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AllRouteJobUpdates()
        {
        }

        private AllRouteJobUpdates(List<JobUpdateObject> JobUpdates, string SequenceId)
        {
            
            this.JobUpdates = JobUpdates;
            
            this.SequenceId = SequenceId;
            
        }

        /// <summary>
        /// Returns builder of AllRouteJobUpdates.
        /// </summary>
        /// <returns>AllRouteJobUpdatesBuilder</returns>
        public static AllRouteJobUpdatesBuilder Builder()
        {
            return new AllRouteJobUpdatesBuilder();
        }

        /// <summary>
        /// Returns AllRouteJobUpdatesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AllRouteJobUpdatesBuilder</returns>
        public AllRouteJobUpdatesBuilder With()
        {
            return Builder()
                .JobUpdates(JobUpdates)
                .SequenceId(SequenceId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(AllRouteJobUpdates other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AllRouteJobUpdates.
        /// </summary>
        /// <param name="left">Compared (AllRouteJobUpdates</param>
        /// <param name="right">Compared (AllRouteJobUpdates</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AllRouteJobUpdates left, AllRouteJobUpdates right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AllRouteJobUpdates.
        /// </summary>
        /// <param name="left">Compared (AllRouteJobUpdates</param>
        /// <param name="right">Compared (AllRouteJobUpdates</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AllRouteJobUpdates left, AllRouteJobUpdates right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AllRouteJobUpdates.
        /// </summary>
        public sealed class AllRouteJobUpdatesBuilder
        {
            private List<JobUpdateObject> _JobUpdates;
            private string _SequenceId;

            internal AllRouteJobUpdatesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AllRouteJobUpdates.JobUpdates property.
            /// </summary>
            /// <param name="value">JobUpdates</param>
            public AllRouteJobUpdatesBuilder JobUpdates(List<JobUpdateObject> value)
            {
                _JobUpdates = value;
                return this;
            }

            /// <summary>
            /// Sets value for AllRouteJobUpdates.SequenceId property.
            /// </summary>
            /// <param name="value">Sequence ID of the last update returned in the response</param>
            public AllRouteJobUpdatesBuilder SequenceId(string value)
            {
                _SequenceId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AllRouteJobUpdates.
            /// </summary>
            /// <returns>AllRouteJobUpdates</returns>
            public AllRouteJobUpdates Build()
            {
                Validate();
                return new AllRouteJobUpdates(
                    JobUpdates: _JobUpdates,
                    SequenceId: _SequenceId
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}