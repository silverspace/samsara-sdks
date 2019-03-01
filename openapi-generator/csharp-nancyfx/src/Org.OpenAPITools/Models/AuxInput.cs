using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Digital value of an aux input.
    /// </summary>
    public sealed class AuxInput:  IEquatable<AuxInput>
    { 
        /// <summary>
        /// Timestamp in Unix epoch milliseconds.
        /// </summary>
        public Object TimeMs { get; private set; }

        /// <summary>
        /// Boolean representing the digital value of the aux input.
        /// </summary>
        public bool? Value { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AuxInput.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AuxInput()
        {
        }

        private AuxInput(Object TimeMs, bool? Value)
        {
            
            this.TimeMs = TimeMs;
            
            this.Value = Value;
            
        }

        /// <summary>
        /// Returns builder of AuxInput.
        /// </summary>
        /// <returns>AuxInputBuilder</returns>
        public static AuxInputBuilder Builder()
        {
            return new AuxInputBuilder();
        }

        /// <summary>
        /// Returns AuxInputBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AuxInputBuilder</returns>
        public AuxInputBuilder With()
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

        public bool Equals(AuxInput other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AuxInput.
        /// </summary>
        /// <param name="left">Compared (AuxInput</param>
        /// <param name="right">Compared (AuxInput</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AuxInput left, AuxInput right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AuxInput.
        /// </summary>
        /// <param name="left">Compared (AuxInput</param>
        /// <param name="right">Compared (AuxInput</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AuxInput left, AuxInput right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AuxInput.
        /// </summary>
        public sealed class AuxInputBuilder
        {
            private Object _TimeMs;
            private bool? _Value;

            internal AuxInputBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AuxInput.TimeMs property.
            /// </summary>
            /// <param name="value">Timestamp in Unix epoch milliseconds.</param>
            public AuxInputBuilder TimeMs(Object value)
            {
                _TimeMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for AuxInput.Value property.
            /// </summary>
            /// <param name="value">Boolean representing the digital value of the aux input.</param>
            public AuxInputBuilder Value(bool? value)
            {
                _Value = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AuxInput.
            /// </summary>
            /// <returns>AuxInput</returns>
            public AuxInput Build()
            {
                Validate();
                return new AuxInput(
                    TimeMs: _TimeMs,
                    Value: _Value
                );
            }

            private void Validate()
            { 
                if (_TimeMs == null)
                {
                    throw new ArgumentException("TimeMs is a required property for AuxInput and cannot be null");
                } 
                if (_Value == null)
                {
                    throw new ArgumentException("Value is a required property for AuxInput and cannot be null");
                } 
            }
        }

        
    }
}