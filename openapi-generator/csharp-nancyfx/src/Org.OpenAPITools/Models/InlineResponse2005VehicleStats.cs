using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2005VehicleStats
    /// </summary>
    public sealed class InlineResponse2005VehicleStats:  IEquatable<InlineResponse2005VehicleStats>
    { 
        /// <summary>
        /// EngineState
        /// </summary>
        public List<EngineState> EngineState { get; private set; }

        /// <summary>
        /// AuxInput2
        /// </summary>
        public AuxInputSeries AuxInput2 { get; private set; }

        /// <summary>
        /// ID of the vehicle.
        /// </summary>
        public long? VehicleId { get; private set; }

        /// <summary>
        /// AuxInput1
        /// </summary>
        public AuxInputSeries AuxInput1 { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2005VehicleStats.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2005VehicleStats()
        {
        }

        private InlineResponse2005VehicleStats(List<EngineState> EngineState, AuxInputSeries AuxInput2, long? VehicleId, AuxInputSeries AuxInput1)
        {
            
            this.EngineState = EngineState;
            
            this.AuxInput2 = AuxInput2;
            
            this.VehicleId = VehicleId;
            
            this.AuxInput1 = AuxInput1;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2005VehicleStats.
        /// </summary>
        /// <returns>InlineResponse2005VehicleStatsBuilder</returns>
        public static InlineResponse2005VehicleStatsBuilder Builder()
        {
            return new InlineResponse2005VehicleStatsBuilder();
        }

        /// <summary>
        /// Returns InlineResponse2005VehicleStatsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2005VehicleStatsBuilder</returns>
        public InlineResponse2005VehicleStatsBuilder With()
        {
            return Builder()
                .EngineState(EngineState)
                .AuxInput2(AuxInput2)
                .VehicleId(VehicleId)
                .AuxInput1(AuxInput1);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2005VehicleStats other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2005VehicleStats.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2005VehicleStats</param>
        /// <param name="right">Compared (InlineResponse2005VehicleStats</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2005VehicleStats left, InlineResponse2005VehicleStats right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2005VehicleStats.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2005VehicleStats</param>
        /// <param name="right">Compared (InlineResponse2005VehicleStats</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2005VehicleStats left, InlineResponse2005VehicleStats right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2005VehicleStats.
        /// </summary>
        public sealed class InlineResponse2005VehicleStatsBuilder
        {
            private List<EngineState> _EngineState;
            private AuxInputSeries _AuxInput2;
            private long? _VehicleId;
            private AuxInputSeries _AuxInput1;

            internal InlineResponse2005VehicleStatsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2005VehicleStats.EngineState property.
            /// </summary>
            /// <param name="value">EngineState</param>
            public InlineResponse2005VehicleStatsBuilder EngineState(List<EngineState> value)
            {
                _EngineState = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2005VehicleStats.AuxInput2 property.
            /// </summary>
            /// <param name="value">AuxInput2</param>
            public InlineResponse2005VehicleStatsBuilder AuxInput2(AuxInputSeries value)
            {
                _AuxInput2 = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2005VehicleStats.VehicleId property.
            /// </summary>
            /// <param name="value">ID of the vehicle.</param>
            public InlineResponse2005VehicleStatsBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineResponse2005VehicleStats.AuxInput1 property.
            /// </summary>
            /// <param name="value">AuxInput1</param>
            public InlineResponse2005VehicleStatsBuilder AuxInput1(AuxInputSeries value)
            {
                _AuxInput1 = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2005VehicleStats.
            /// </summary>
            /// <returns>InlineResponse2005VehicleStats</returns>
            public InlineResponse2005VehicleStats Build()
            {
                Validate();
                return new InlineResponse2005VehicleStats(
                    EngineState: _EngineState,
                    AuxInput2: _AuxInput2,
                    VehicleId: _VehicleId,
                    AuxInput1: _AuxInput1
                );
            }

            private void Validate()
            { 
                if (_VehicleId == null)
                {
                    throw new ArgumentException("VehicleId is a required property for InlineResponse2005VehicleStats and cannot be null");
                } 
            }
        }

        
    }
}