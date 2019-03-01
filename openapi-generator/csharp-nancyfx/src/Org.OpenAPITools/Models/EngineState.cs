using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// The state of the vehicle over time. State can be Running, Off, or Idle.
    /// </summary>
    public sealed class EngineState:  IEquatable<EngineState>
    { 
        /// <summary>
        /// Timestamp in Unix epoch milliseconds.
        /// </summary>
        public Object TimeMs { get; private set; }

        /// <summary>
        /// Value
        /// </summary>
        public ValueEnum? Value { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use EngineState.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public EngineState()
        {
        }

        private EngineState(Object TimeMs, ValueEnum? Value)
        {
            
            this.TimeMs = TimeMs;
            
            this.Value = Value;
            
        }

        /// <summary>
        /// Returns builder of EngineState.
        /// </summary>
        /// <returns>EngineStateBuilder</returns>
        public static EngineStateBuilder Builder()
        {
            return new EngineStateBuilder();
        }

        /// <summary>
        /// Returns EngineStateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>EngineStateBuilder</returns>
        public EngineStateBuilder With()
        {
            return Builder()
                .TimeMs(TimeMs)
                .Value(Value);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(EngineState other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (EngineState.
        /// </summary>
        /// <param name="left">Compared (EngineState</param>
        /// <param name="right">Compared (EngineState</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (EngineState left, EngineState right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (EngineState.
        /// </summary>
        /// <param name="left">Compared (EngineState</param>
        /// <param name="right">Compared (EngineState</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (EngineState left, EngineState right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of EngineState.
        /// </summary>
        public sealed class EngineStateBuilder
        {
            private Object _TimeMs;
            private ValueEnum? _Value;

            internal EngineStateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for EngineState.TimeMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix epoch milliseconds.</param>
            public EngineStateBuilder TimeMs(Object value)
            {
                _TimeMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for EngineState.Value property.
            /// </summary>
            /// <param name="value">Value</param>
            public EngineStateBuilder Value(ValueEnum? value)
            {
                _Value = value;
                return this;
            }


            /// <summary>
            /// Builds instance of EngineState.
            /// </summary>
            /// <returns>EngineState</returns>
            public EngineState Build()
            {
                Validate();
                return new EngineState(
                    TimeMs: _TimeMs,
                    Value: _Value
                );
            }

            private void Validate()
            { 
                if (_TimeMs == null)
                {
                    throw new ArgumentException("TimeMs is a required property for EngineState and cannot be null");
                } 
                if (_Value == null)
                {
                    throw new ArgumentException("Value is a required property for EngineState and cannot be null");
                } 
            }
        }

        
        public enum ValueEnum { Running, Off, Idle };
    }
}