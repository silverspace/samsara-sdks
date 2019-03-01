using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineResponse2006
    /// </summary>
    public sealed class InlineResponse2006:  IEquatable<InlineResponse2006>
    { 
        /// <summary>
        /// DataInputs
        /// </summary>
        public List<DataInputHistoryResponse> DataInputs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineResponse2006.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineResponse2006()
        {
        }

        private InlineResponse2006(List<DataInputHistoryResponse> DataInputs)
        {
            
            this.DataInputs = DataInputs;
            
        }

        /// <summary>
        /// Returns builder of InlineResponse2006.
        /// </summary>
        /// <returns>InlineResponse2006Builder</returns>
        public static InlineResponse2006Builder Builder()
        {
            return new InlineResponse2006Builder();
        }

        /// <summary>
        /// Returns InlineResponse2006Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineResponse2006Builder</returns>
        public InlineResponse2006Builder With()
        {
            return Builder()
                .DataInputs(DataInputs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineResponse2006 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineResponse2006.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2006</param>
        /// <param name="right">Compared (InlineResponse2006</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineResponse2006 left, InlineResponse2006 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineResponse2006.
        /// </summary>
        /// <param name="left">Compared (InlineResponse2006</param>
        /// <param name="right">Compared (InlineResponse2006</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineResponse2006 left, InlineResponse2006 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineResponse2006.
        /// </summary>
        public sealed class InlineResponse2006Builder
        {
            private List<DataInputHistoryResponse> _DataInputs;

            internal InlineResponse2006Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineResponse2006.DataInputs property.
            /// </summary>
            /// <param name="value">DataInputs</param>
            public InlineResponse2006Builder DataInputs(List<DataInputHistoryResponse> value)
            {
                _DataInputs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineResponse2006.
            /// </summary>
            /// <returns>InlineResponse2006</returns>
            public InlineResponse2006 Build()
            {
                Validate();
                return new InlineResponse2006(
                    DataInputs: _DataInputs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}