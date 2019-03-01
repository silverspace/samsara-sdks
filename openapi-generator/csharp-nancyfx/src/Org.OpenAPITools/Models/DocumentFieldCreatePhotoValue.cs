using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentFieldCreatePhotoValue
    /// </summary>
    public sealed class DocumentFieldCreatePhotoValue:  IEquatable<DocumentFieldCreatePhotoValue>
    { 
        /// <summary>
        /// Photo URL for a JPG image
        /// </summary>
        public string Url { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentFieldCreatePhotoValue.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentFieldCreatePhotoValue()
        {
        }

        private DocumentFieldCreatePhotoValue(string Url)
        {
            
            this.Url = Url;
            
        }

        /// <summary>
        /// Returns builder of DocumentFieldCreatePhotoValue.
        /// </summary>
        /// <returns>DocumentFieldCreatePhotoValueBuilder</returns>
        public static DocumentFieldCreatePhotoValueBuilder Builder()
        {
            return new DocumentFieldCreatePhotoValueBuilder();
        }

        /// <summary>
        /// Returns DocumentFieldCreatePhotoValueBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentFieldCreatePhotoValueBuilder</returns>
        public DocumentFieldCreatePhotoValueBuilder With()
        {
            return Builder()
                .Url(Url);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentFieldCreatePhotoValue other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentFieldCreatePhotoValue.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldCreatePhotoValue</param>
        /// <param name="right">Compared (DocumentFieldCreatePhotoValue</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentFieldCreatePhotoValue left, DocumentFieldCreatePhotoValue right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentFieldCreatePhotoValue.
        /// </summary>
        /// <param name="left">Compared (DocumentFieldCreatePhotoValue</param>
        /// <param name="right">Compared (DocumentFieldCreatePhotoValue</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentFieldCreatePhotoValue left, DocumentFieldCreatePhotoValue right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentFieldCreatePhotoValue.
        /// </summary>
        public sealed class DocumentFieldCreatePhotoValueBuilder
        {
            private string _Url;

            internal DocumentFieldCreatePhotoValueBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentFieldCreatePhotoValue.Url property.
            /// </summary>
            /// <param name="value">Photo URL for a JPG image</param>
            public DocumentFieldCreatePhotoValueBuilder Url(string value)
            {
                _Url = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentFieldCreatePhotoValue.
            /// </summary>
            /// <returns>DocumentFieldCreatePhotoValue</returns>
            public DocumentFieldCreatePhotoValue Build()
            {
                Validate();
                return new DocumentFieldCreatePhotoValue(
                    Url: _Url
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}