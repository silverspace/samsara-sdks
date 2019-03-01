using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject4
    /// </summary>
    public sealed class InlineObject4:  IEquatable<InlineObject4>
    { 
        /// <summary>
        /// True indicates that this driver should be reactivated.
        /// </summary>
        public bool? Reactivate { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject4.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject4()
        {
        }

        private InlineObject4(bool? Reactivate)
        {
            
            this.Reactivate = Reactivate;
            
        }

        /// <summary>
        /// Returns builder of InlineObject4.
        /// </summary>
        /// <returns>InlineObject4Builder</returns>
        public static InlineObject4Builder Builder()
        {
            return new InlineObject4Builder();
        }

        /// <summary>
        /// Returns InlineObject4Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject4Builder</returns>
        public InlineObject4Builder With()
        {
            return Builder()
                .Reactivate(Reactivate);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject4 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject4.
        /// </summary>
        /// <param name="left">Compared (InlineObject4</param>
        /// <param name="right">Compared (InlineObject4</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject4 left, InlineObject4 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject4.
        /// </summary>
        /// <param name="left">Compared (InlineObject4</param>
        /// <param name="right">Compared (InlineObject4</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject4 left, InlineObject4 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject4.
        /// </summary>
        public sealed class InlineObject4Builder
        {
            private bool? _Reactivate;

            internal InlineObject4Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject4.Reactivate property.
            /// </summary>
            /// <param name="value">True indicates that this driver should be reactivated.</param>
            public InlineObject4Builder Reactivate(bool? value)
            {
                _Reactivate = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject4.
            /// </summary>
            /// <returns>InlineObject4</returns>
            public InlineObject4 Build()
            {
                Validate();
                return new InlineObject4(
                    Reactivate: _Reactivate
                );
            }

            private void Validate()
            { 
                if (_Reactivate == null)
                {
                    throw new ArgumentException("Reactivate is a required property for InlineObject4 and cannot be null");
                } 
            }
        }

        
    }
}