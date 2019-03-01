using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DvirListResponse
    /// </summary>
    public sealed class DvirListResponse:  IEquatable<DvirListResponse>
    { 
        /// <summary>
        /// Dvirs
        /// </summary>
        public List<DvirBase> Dvirs { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DvirListResponse.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DvirListResponse()
        {
        }

        private DvirListResponse(List<DvirBase> Dvirs)
        {
            
            this.Dvirs = Dvirs;
            
        }

        /// <summary>
        /// Returns builder of DvirListResponse.
        /// </summary>
        /// <returns>DvirListResponseBuilder</returns>
        public static DvirListResponseBuilder Builder()
        {
            return new DvirListResponseBuilder();
        }

        /// <summary>
        /// Returns DvirListResponseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DvirListResponseBuilder</returns>
        public DvirListResponseBuilder With()
        {
            return Builder()
                .Dvirs(Dvirs);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DvirListResponse other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DvirListResponse.
        /// </summary>
        /// <param name="left">Compared (DvirListResponse</param>
        /// <param name="right">Compared (DvirListResponse</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DvirListResponse left, DvirListResponse right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DvirListResponse.
        /// </summary>
        /// <param name="left">Compared (DvirListResponse</param>
        /// <param name="right">Compared (DvirListResponse</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DvirListResponse left, DvirListResponse right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DvirListResponse.
        /// </summary>
        public sealed class DvirListResponseBuilder
        {
            private List<DvirBase> _Dvirs;

            internal DvirListResponseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DvirListResponse.Dvirs property.
            /// </summary>
            /// <param name="value">Dvirs</param>
            public DvirListResponseBuilder Dvirs(List<DvirBase> value)
            {
                _Dvirs = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DvirListResponse.
            /// </summary>
            /// <returns>DvirListResponse</returns>
            public DvirListResponse Build()
            {
                Validate();
                return new DvirListResponse(
                    Dvirs: _Dvirs
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}