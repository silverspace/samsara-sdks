using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DvirBaseTrailerDefects
    /// </summary>
    public sealed class DvirBaseTrailerDefects:  IEquatable<DvirBaseTrailerDefects>
    { 
        /// <summary>
        /// The comment describing the type of DVIR defect
        /// </summary>
        public string Comment { get; private set; }

        /// <summary>
        /// The type of DVIR defect
        /// </summary>
        public string DefectType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DvirBaseTrailerDefects.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DvirBaseTrailerDefects()
        {
        }

        private DvirBaseTrailerDefects(string Comment, string DefectType)
        {
            
            this.Comment = Comment;
            
            this.DefectType = DefectType;
            
        }

        /// <summary>
        /// Returns builder of DvirBaseTrailerDefects.
        /// </summary>
        /// <returns>DvirBaseTrailerDefectsBuilder</returns>
        public static DvirBaseTrailerDefectsBuilder Builder()
        {
            return new DvirBaseTrailerDefectsBuilder();
        }

        /// <summary>
        /// Returns DvirBaseTrailerDefectsBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DvirBaseTrailerDefectsBuilder</returns>
        public DvirBaseTrailerDefectsBuilder With()
        {
            return Builder()
                .Comment(Comment)
                .DefectType(DefectType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DvirBaseTrailerDefects other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DvirBaseTrailerDefects.
        /// </summary>
        /// <param name="left">Compared (DvirBaseTrailerDefects</param>
        /// <param name="right">Compared (DvirBaseTrailerDefects</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DvirBaseTrailerDefects left, DvirBaseTrailerDefects right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DvirBaseTrailerDefects.
        /// </summary>
        /// <param name="left">Compared (DvirBaseTrailerDefects</param>
        /// <param name="right">Compared (DvirBaseTrailerDefects</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DvirBaseTrailerDefects left, DvirBaseTrailerDefects right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DvirBaseTrailerDefects.
        /// </summary>
        public sealed class DvirBaseTrailerDefectsBuilder
        {
            private string _Comment;
            private string _DefectType;

            internal DvirBaseTrailerDefectsBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DvirBaseTrailerDefects.Comment property.
            /// </summary>
            /// <param name="value">The comment describing the type of DVIR defect</param>
            public DvirBaseTrailerDefectsBuilder Comment(string value)
            {
                _Comment = value;
                return this;
            }

            /// <summary>
            /// Sets value for DvirBaseTrailerDefects.DefectType property.
            /// </summary>
            /// <param name="value">The type of DVIR defect</param>
            public DvirBaseTrailerDefectsBuilder DefectType(string value)
            {
                _DefectType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DvirBaseTrailerDefects.
            /// </summary>
            /// <returns>DvirBaseTrailerDefects</returns>
            public DvirBaseTrailerDefects Build()
            {
                Validate();
                return new DvirBaseTrailerDefects(
                    Comment: _Comment,
                    DefectType: _DefectType
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}