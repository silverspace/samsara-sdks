using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// InlineObject16
    /// </summary>
    public sealed class InlineObject16:  IEquatable<InlineObject16>
    { 
        /// <summary>
        /// ExternalIds
        /// </summary>
        public Dictionary<string, string> ExternalIds { get; private set; }

        /// <summary>
        /// Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic
        /// </summary>
        public int? HarshAccelSetting { get; private set; }

        /// <summary>
        /// Name
        /// </summary>
        public string Name { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use InlineObject16.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public InlineObject16()
        {
        }

        private InlineObject16(Dictionary<string, string> ExternalIds, int? HarshAccelSetting, string Name)
        {
            
            this.ExternalIds = ExternalIds;
            
            this.HarshAccelSetting = HarshAccelSetting;
            
            this.Name = Name;
            
        }

        /// <summary>
        /// Returns builder of InlineObject16.
        /// </summary>
        /// <returns>InlineObject16Builder</returns>
        public static InlineObject16Builder Builder()
        {
            return new InlineObject16Builder();
        }

        /// <summary>
        /// Returns InlineObject16Builder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>InlineObject16Builder</returns>
        public InlineObject16Builder With()
        {
            return Builder()
                .ExternalIds(ExternalIds)
                .HarshAccelSetting(HarshAccelSetting)
                .Name(Name);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(InlineObject16 other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (InlineObject16.
        /// </summary>
        /// <param name="left">Compared (InlineObject16</param>
        /// <param name="right">Compared (InlineObject16</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (InlineObject16 left, InlineObject16 right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (InlineObject16.
        /// </summary>
        /// <param name="left">Compared (InlineObject16</param>
        /// <param name="right">Compared (InlineObject16</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (InlineObject16 left, InlineObject16 right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of InlineObject16.
        /// </summary>
        public sealed class InlineObject16Builder
        {
            private Dictionary<string, string> _ExternalIds;
            private int? _HarshAccelSetting;
            private string _Name;

            internal InlineObject16Builder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for InlineObject16.ExternalIds property.
            /// </summary>
            /// <param name="value">ExternalIds</param>
            public InlineObject16Builder ExternalIds(Dictionary<string, string> value)
            {
                _ExternalIds = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject16.HarshAccelSetting property.
            /// </summary>
            /// <param name="value">Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic</param>
            public InlineObject16Builder HarshAccelSetting(int? value)
            {
                _HarshAccelSetting = value;
                return this;
            }

            /// <summary>
            /// Sets value for InlineObject16.Name property.
            /// </summary>
            /// <param name="value">Name</param>
            public InlineObject16Builder Name(string value)
            {
                _Name = value;
                return this;
            }


            /// <summary>
            /// Builds instance of InlineObject16.
            /// </summary>
            /// <returns>InlineObject16</returns>
            public InlineObject16 Build()
            {
                Validate();
                return new InlineObject16(
                    ExternalIds: _ExternalIds,
                    HarshAccelSetting: _HarshAccelSetting,
                    Name: _Name
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}