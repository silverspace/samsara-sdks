using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentFieldCreate
    /// </summary>
    public sealed class DocumentFieldCreate:  IEquatable<DocumentFieldCreate>
    { 
        /// <summary>
        /// Value of this field if this document field has valueType: ValueType_Number.
        /// </summary>
        public double? NumberValue { get; private set; }

        /// <summary>
        /// Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.
        /// </summary>
        public List<DocumentFieldCreatePhotoValue> PhotoValue { get; private set; }

        /// <summary>
        /// Value of this field if this document field has valueType: ValueType_String.
        /// </summary>
        public string StringValue { get; private set; }

        /// <summary>
        /// Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.
        /// </summary>
        public string ValueType { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentFieldCreate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentFieldCreate()
        {
        }

        private DocumentFieldCreate(double? NumberValue, List<DocumentFieldCreatePhotoValue> PhotoValue, string StringValue, string ValueType)
        {
            
            this.NumberValue = NumberValue;
            
            this.PhotoValue = PhotoValue;
            
            this.StringValue = StringValue;
            
            this.ValueType = ValueType;
            
        }

        /// <summary>
        /// Returns builder of DocumentFieldCreate.
        /// </summary>
        /// <returns>DocumentFieldCreateBuilder</returns>
        public static DocumentFieldCreateBuilder Builder()
        {
            return new DocumentFieldCreateBuilder();
        }

        /// <summary>
        /// Returns DocumentFieldCreateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentFieldCreateBuilder</returns>
        public DocumentFieldCreateBuilder With()
        {
            return Builder()
                .NumberValue(NumberValue)
                .PhotoValue(PhotoValue)
                .StringValue(StringValue)
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

        public bool Equals(DocumentFieldCreate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentFieldCreate.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldCreate</param>
        /// <param name="right">Compared (DocumentFieldCreate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentFieldCreate left, DocumentFieldCreate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentFieldCreate.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldCreate</param>
        /// <param name="right">Compared (DocumentFieldCreate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentFieldCreate left, DocumentFieldCreate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentFieldCreate.
        /// </summary>
        public sealed class DocumentFieldCreateBuilder
        {
            private double? _NumberValue;
            private List<DocumentFieldCreatePhotoValue> _PhotoValue;
            private string _StringValue;
            private string _ValueType;

            internal DocumentFieldCreateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentFieldCreate.NumberValue property.
            /// </summary>
            /// <param name="value">Value of this field if this document field has valueType: ValueType_Number.</param>
            public DocumentFieldCreateBuilder NumberValue(double? value)
            {
                _NumberValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentFieldCreate.PhotoValue property.
            /// </summary>
            /// <param name="value">Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.</param>
            public DocumentFieldCreateBuilder PhotoValue(List<DocumentFieldCreatePhotoValue> value)
            {
                _PhotoValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentFieldCreate.StringValue property.
            /// </summary>
            /// <param name="value">Value of this field if this document field has valueType: ValueType_String.</param>
            public DocumentFieldCreateBuilder StringValue(string value)
            {
                _StringValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentFieldCreate.ValueType property.
            /// </summary>
            /// <param name="value">Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.</param>
            public DocumentFieldCreateBuilder ValueType(string value)
            {
                _ValueType = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentFieldCreate.
            /// </summary>
            /// <returns>DocumentFieldCreate</returns>
            public DocumentFieldCreate Build()
            {
                Validate();
                return new DocumentFieldCreate(
                    NumberValue: _NumberValue,
                    PhotoValue: _PhotoValue,
                    StringValue: _StringValue,
                    ValueType: _ValueType
                );
            }

            private void Validate()
            { 
                if (_ValueType == null)
                {
                    throw new ArgumentException("ValueType is a required property for DocumentFieldCreate and cannot be null");
                } 
            }
        }

        
    }
}