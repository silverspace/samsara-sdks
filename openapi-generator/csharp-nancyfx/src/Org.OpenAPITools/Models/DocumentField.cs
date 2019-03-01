using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentField
    /// </summary>
    public sealed class DocumentField:  IEquatable<DocumentField>
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
        /// Descriptive name of this field.
        /// </summary>
        public string Label { get; private set; }

        /// <summary>
        /// DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.
        /// </summary>
        public Object Value { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentField.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentField()
        {
        }

        private DocumentField(double? NumberValue, List<DocumentFieldCreatePhotoValue> PhotoValue, string StringValue, string ValueType, string Label, Object Value)
        {
            
            this.NumberValue = NumberValue;
            
            this.PhotoValue = PhotoValue;
            
            this.StringValue = StringValue;
            
            this.ValueType = ValueType;
            
            this.Label = Label;
            
            this.Value = Value;
            
        }

        /// <summary>
        /// Returns builder of DocumentField.
        /// </summary>
        /// <returns>DocumentFieldBuilder</returns>
        public static DocumentFieldBuilder Builder()
        {
            return new DocumentFieldBuilder();
        }

        /// <summary>
        /// Returns DocumentFieldBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentFieldBuilder</returns>
        public DocumentFieldBuilder With()
        {
            return Builder()
                .NumberValue(NumberValue)
                .PhotoValue(PhotoValue)
                .StringValue(StringValue)
                .ValueType(ValueType)
                .Label(Label)
                .Value(Value);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentField other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentField.
        /// </summary>
        /// <param name="left">Compared (DocumentField</param>
        /// <param name="right">Compared (DocumentField</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentField left, DocumentField right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentField.
        /// </summary>
        /// <param name="left">Compared (DocumentField</param>
        /// <param name="right">Compared (DocumentField</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentField left, DocumentField right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentField.
        /// </summary>
        public sealed class DocumentFieldBuilder
        {
            private double? _NumberValue;
            private List<DocumentFieldCreatePhotoValue> _PhotoValue;
            private string _StringValue;
            private string _ValueType;
            private string _Label;
            private Object _Value;

            internal DocumentFieldBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentField.NumberValue property.
            /// </summary>
            /// <param name="value">Value of this field if this document field has valueType: ValueType_Number.</param>
            public DocumentFieldBuilder NumberValue(double? value)
            {
                _NumberValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentField.PhotoValue property.
            /// </summary>
            /// <param name="value">Value of this field if this document field has valueType: ValueType_Photo. Array of photo objects where each object contains a URL for a photo.</param>
            public DocumentFieldBuilder PhotoValue(List<DocumentFieldCreatePhotoValue> value)
            {
                _PhotoValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentField.StringValue property.
            /// </summary>
            /// <param name="value">Value of this field if this document field has valueType: ValueType_String.</param>
            public DocumentFieldBuilder StringValue(string value)
            {
                _StringValue = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentField.ValueType property.
            /// </summary>
            /// <param name="value">Determines the type of this field and what type of value this field has. It should be either ValueType_Number, ValueType_String, or ValueType_Photo.</param>
            public DocumentFieldBuilder ValueType(string value)
            {
                _ValueType = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentField.Label property.
            /// </summary>
            /// <param name="value">Descriptive name of this field.</param>
            public DocumentFieldBuilder Label(string value)
            {
                _Label = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentField.Value property.
            /// </summary>
            /// <param name="value">DEPRECATED: Please use stringValue, numberValue, or photoValue instead. Value of this field. Depending on what kind of field it is, this may be one of the following: an array of image urls, a float, an integer, or a string.</param>
            public DocumentFieldBuilder Value(Object value)
            {
                _Value = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentField.
            /// </summary>
            /// <returns>DocumentField</returns>
            public DocumentField Build()
            {
                Validate();
                return new DocumentField(
                    NumberValue: _NumberValue,
                    PhotoValue: _PhotoValue,
                    StringValue: _StringValue,
                    ValueType: _ValueType,
                    Label: _Label,
                    Value: _Value
                );
            }

            private void Validate()
            { 
                if (_ValueType == null)
                {
                    throw new ArgumentException("ValueType is a required property for DocumentField and cannot be null");
                } 
                if (_Label == null)
                {
                    throw new ArgumentException("Label is a required property for DocumentField and cannot be null");
                } 
            }
        }

        
    }
}