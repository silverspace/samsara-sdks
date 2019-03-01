using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2007
    /// </summary>
    public sealed class InlineResponse2007:  IEquatable<InlineResponse2007>
    { 
        /// <summary>
        /// Machines
        /// </summary>
        public List<Machine> Machines { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2007.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2007()
        {
        }

        private InlineResponse2007(List<Machine> Machines)
        {
            
            this.Machines = Machines;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2007.
        /// </summary>
        /// <returns>InlineResponse2007Builder</returns>
        public static InlineResponse2007Builder Builder()
        {
            return new InlineResponse2007Builder();
        }

        /// <summary>
        /// Returns InlineResponse2007Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2007Builder</returns>
        public InlineResponse2007Builder With()
        {
            return Builder()
                .Machines(Machines);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2007 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2007.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2007</param>
        /// <param name="right">Compared (InlineResponse2007</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2007 left, InlineResponse2007 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2007.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2007</param>
        /// <param name="right">Compared (InlineResponse2007</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2007 left, InlineResponse2007 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2007.
        /// </summary>
        public sealed class InlineResponse2007Builder
        {
            private List<Machine> _Machines;

            internal InlineResponse2007Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2007.Machines property.
            /// </summary>
            /// <param name="value">Machines</param>
            public InlineResponse2007Builder Machines(List<Machine> value)
            {
                _Machines = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2007.
            /// </summary>
            /// <returns>InlineResponse2007</returns>
            public InlineResponse2007 Build()
            {
                Validate();
                return new InlineResponse2007(
                    Machines: _Machines
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}