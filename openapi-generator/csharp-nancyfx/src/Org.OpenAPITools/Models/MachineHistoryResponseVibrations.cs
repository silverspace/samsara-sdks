using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// MachineHistoryResponseVibrations
    /// </summary>
    public sealed class MachineHistoryResponseVibrations:  IEquatable<MachineHistoryResponseVibrations>
    { 
        /// <summary>
        /// X
        /// </summary>
        public double? X { get; private set; }

        /// <summary>
        /// Y
        /// </summary>
        public double? Y { get; private set; }

        /// <summary>
        /// Z
        /// </summary>
        public double? Z { get; private set; }

        /// <summary>
        /// Time
        /// </summary>
        public long? Time { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use MachineHistoryResponseVibrations.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public MachineHistoryResponseVibrations()
        {
        }

        private MachineHistoryResponseVibrations(double? X, double? Y, double? Z, long? Time)
        {
            
            this.X = X;
            
            this.Y = Y;
            
            this.Z = Z;
            
            this.Time = Time;
            
        }

        /// <summary>
        /// Returns builder of MachineHistoryResponseVibrations.
        /// </summary>
        /// <returns>MachineHistoryResponseVibrationsBuilder</returns>
        public static MachineHistoryResponseVibrationsBuilder Builder()
        {
            return new MachineHistoryResponseVibrationsBuilder();
        }

        /// <summary>
        /// Returns MachineHistoryResponseVibrationsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>MachineHistoryResponseVibrationsBuilder</returns>
        public MachineHistoryResponseVibrationsBuilder With()
        {
            return Builder()
                .X(X)
                .Y(Y)
                .Z(Z)
                .Time(Time);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(MachineHistoryResponseVibrations other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (MachineHistoryResponseVibrations.
        /// </summary>
        /// <param name="left">Compared (MachineHistoryResponseVibrations</param>
        /// <param name="right">Compared (MachineHistoryResponseVibrations</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (MachineHistoryResponseVibrations left, MachineHistoryResponseVibrations right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (MachineHistoryResponseVibrations.
        /// </summary>
        /// <param name="left">Compared (MachineHistoryResponseVibrations</param>
        /// <param name="right">Compared (MachineHistoryResponseVibrations</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (MachineHistoryResponseVibrations left, MachineHistoryResponseVibrations right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of MachineHistoryResponseVibrations.
        /// </summary>
        public sealed class MachineHistoryResponseVibrationsBuilder
        {
            private double? _X;
            private double? _Y;
            private double? _Z;
            private long? _Time;

            internal MachineHistoryResponseVibrationsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseVibrations.X property.
            /// </summary>
            /// <param name="value">X</param>
            public MachineHistoryResponseVibrationsBuilder X(double? value)
            {
                _X = value;
                return this;
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseVibrations.Y property.
            /// </summary>
            /// <param name="value">Y</param>
            public MachineHistoryResponseVibrationsBuilder Y(double? value)
            {
                _Y = value;
                return this;
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseVibrations.Z property.
            /// </summary>
            /// <param name="value">Z</param>
            public MachineHistoryResponseVibrationsBuilder Z(double? value)
            {
                _Z = value;
                return this;
            }

            /// <summary>
            /// Sets value for MachineHistoryResponseVibrations.Time property.
            /// </summary>
            /// <param name="value">Time</param>
            public MachineHistoryResponseVibrationsBuilder Time(long? value)
            {
                _Time = value;
                return this;
            }


            /// <summary>
            /// Builds instance of MachineHistoryResponseVibrations.
            /// </summary>
            /// <returns>MachineHistoryResponseVibrations</returns>
            public MachineHistoryResponseVibrations Build()
            {
                Validate();
                return new MachineHistoryResponseVibrations(
                    X: _X,
                    Y: _Y,
                    Z: _Z,
                    Time: _Time
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}