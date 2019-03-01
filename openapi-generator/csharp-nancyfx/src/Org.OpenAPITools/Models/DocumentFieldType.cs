using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentFieldType
    /// </summary>
    public sealed class DocumentFieldType:  IEquatable<DocumentFieldType>
    { 
        /// <summary>
        /// Descriptive name of this field type.
        /// </summary>
        public string Label { get; private set; }

        /// <summary>
        /// NumberValueTypeMetadata
        /// </summary>
        public DocumentFieldTypeNumberValueTypeMetadata NumberValueTypeMetadata { get; private set; }

        /// <summary>
        /// The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
        /// </summary>
        public string ValueType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentFieldType.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentFieldType()
        {
        }

        private DocumentFieldType(string Label, DocumentFieldTypeNumberValueTypeMetadata NumberValueTypeMetadata, string ValueType)
        {
            
            this.Label = Label;
            
            this.NumberValueTypeMetadata = NumberValueTypeMetadata;
            
            this.ValueType = ValueType;
            
        }

        /// <summary>
        /// Returns builder of DocumentFieldType.
        /// </summary>
        /// <returns>DocumentFieldTypeBuilder</returns>
        public static DocumentFieldTypeBuilder Builder()
        {
            return new DocumentFieldTypeBuilder();
        }

        /// <summary>
        /// Returns DocumentFieldTypeBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentFieldTypeBuilder</returns>
        public DocumentFieldTypeBuilder With()
        {
            return Builder()
                .Label(Label)
                .NumberValueTypeMetadata(NumberValueTypeMetadata)
                .ValueType(ValueType);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentFieldType other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentFieldType.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldType</param>
        /// <param name="right">Compared (DocumentFieldType</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentFieldType left, DocumentFieldType right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentFieldType.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldType</param>
        /// <param name="right">Compared (DocumentFieldType</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentFieldType left, DocumentFieldType right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentFieldType.
        /// </summary>
        public sealed class DocumentFieldTypeBuilder
        {
            private string _Label;
            private DocumentFieldTypeNumberValueTypeMetadata _NumberValueTypeMetadata;
            private string _ValueType;

            internal DocumentFieldTypeBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentFieldType.Label property.
            /// </summary>
            /// <param name="value">Descriptive name of this field type.</param>
            public DocumentFieldTypeBuilder Label(string value)
            {
                _Label = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentFieldType.NumberValueTypeMetadata property.
            /// </summary>
            /// <param name="value">NumberValueTypeMetadata</param>
            public DocumentFieldTypeBuilder NumberValueTypeMetadata(DocumentFieldTypeNumberValueTypeMetadata value)
            {
                _NumberValueTypeMetadata = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentFieldType.ValueType property.
            /// </summary>
            /// <param name="value">The kind of value that can be submitted for this fieldType. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.</param>
            public DocumentFieldTypeBuilder ValueType(string value)
            {
                _ValueType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentFieldType.
            /// </summary>
            /// <returns>DocumentFieldType</returns>
            public DocumentFieldType Build()
            {
                Validate();
                return new DocumentFieldType(
                    Label: _Label,
                    NumberValueTypeMetadata: _NumberValueTypeMetadata,
                    ValueType: _ValueType
                );
            }

            private void Validate()
            { 
                if (_Label == null)
                {
                    throw new ArgumentException("Label is a required property for DocumentFieldType and cannot be null");
                } 
                if (_ValueType == null)
                {
                    throw new ArgumentException("ValueType is a required property for DocumentFieldType and cannot be null");
                } 
            }
        }

        
    }
}