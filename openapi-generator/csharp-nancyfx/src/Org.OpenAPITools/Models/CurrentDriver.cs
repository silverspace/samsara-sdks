using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// CurrentDriver
    /// </summary>
    public sealed class CurrentDriver:  IEquatable<CurrentDriver>
    { 

        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use CurrentDriver.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public CurrentDriver()
        {
        }

        private CurrentDriver()
        {
            
        }

        /// <summary>
        /// Returns builder of CurrentDriver.
        /// </summary>
        /// <returns>CurrentDriverBuilder</returns>
        public static CurrentDriverBuilder Builder()
        {
            return new CurrentDriverBuilder();
        }

        /// <summary>
        /// Returns CurrentDriverBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>CurrentDriverBuilder</returns>
        public CurrentDriverBuilder With()
        {
            return Builder()
;
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(CurrentDriver other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (CurrentDriver.
        /// </summary>
        /// <param name="left">Compared (CurrentDriver</param>
        /// <param name="right">Compared (CurrentDriver</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (CurrentDriver left, CurrentDriver right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (CurrentDriver.
        /// </summary>
        /// <param name="left">Compared (CurrentDriver</param>
        /// <param name="right">Compared (CurrentDriver</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (CurrentDriver left, CurrentDriver right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of CurrentDriver.
        /// </summary>
        public sealed class CurrentDriverBuilder
        {

            internal CurrentDriverBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }


            /// <summary>
            /// Builds instance of CurrentDriver.
            /// </summary>
            /// <returns>CurrentDriver</returns>
            public CurrentDriver Build()
            {
                Validate();
                return new CurrentDriver(
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}