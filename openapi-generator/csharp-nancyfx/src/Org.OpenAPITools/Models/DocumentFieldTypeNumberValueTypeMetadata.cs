using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Additional metadata information for a number field type. Only defined when a field type has valueType: ValueType_Number.
    /// </summary>
    public sealed class DocumentFieldTypeNumberValueTypeMetadata:  IEquatable<DocumentFieldTypeNumberValueTypeMetadata>
    { 
        /// <summary>
        /// Number of decimal places that values for this field type can have.
        /// </summary>
        public long? NumDecimalPlaces { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentFieldTypeNumberValueTypeMetadata.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentFieldTypeNumberValueTypeMetadata()
        {
        }

        private DocumentFieldTypeNumberValueTypeMetadata(long? NumDecimalPlaces)
        {
            
            this.NumDecimalPlaces = NumDecimalPlaces;
            
        }

        /// <summary>
        /// Returns builder of DocumentFieldTypeNumberValueTypeMetadata.
        /// </summary>
        /// <returns>DocumentFieldTypeNumberValueTypeMetadataBuilder</returns>
        public static DocumentFieldTypeNumberValueTypeMetadataBuilder Builder()
        {
            return new DocumentFieldTypeNumberValueTypeMetadataBuilder();
        }

        /// <summary>
        /// Returns DocumentFieldTypeNumberValueTypeMetadataBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentFieldTypeNumberValueTypeMetadataBuilder</returns>
        public DocumentFieldTypeNumberValueTypeMetadataBuilder With()
        {
            return Builder()
                .NumDecimalPlaces(NumDecimalPlaces);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentFieldTypeNumberValueTypeMetadata other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentFieldTypeNumberValueTypeMetadata.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldTypeNumberValueTypeMetadata</param>
        /// <param name="right">Compared (DocumentFieldTypeNumberValueTypeMetadata</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentFieldTypeNumberValueTypeMetadata left, DocumentFieldTypeNumberValueTypeMetadata right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentFieldTypeNumberValueTypeMetadata.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldTypeNumberValueTypeMetadata</param>
        /// <param name="right">Compared (DocumentFieldTypeNumberValueTypeMetadata</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentFieldTypeNumberValueTypeMetadata left, DocumentFieldTypeNumberValueTypeMetadata right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentFieldTypeNumberValueTypeMetadata.
        /// </summary>
        public sealed class DocumentFieldTypeNumberValueTypeMetadataBuilder
        {
            private long? _NumDecimalPlaces;

            internal DocumentFieldTypeNumberValueTypeMetadataBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentFieldTypeNumberValueTypeMetadata.NumDecimalPlaces property.
            /// </summary>
            /// <param name="value">Number of decimal places that values for this field type can have.</param>
            public DocumentFieldTypeNumberValueTypeMetadataBuilder NumDecimalPlaces(long? value)
            {
                _NumDecimalPlaces = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentFieldTypeNumberValueTypeMetadata.
            /// </summary>
            /// <returns>DocumentFieldTypeNumberValueTypeMetadata</returns>
            public DocumentFieldTypeNumberValueTypeMetadata Build()
            {
                Validate();
                return new DocumentFieldTypeNumberValueTypeMetadata(
                    NumDecimalPlaces: _NumDecimalPlaces
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}