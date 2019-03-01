using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentType
    /// </summary>
    public sealed class DocumentType:  IEquatable<DocumentType>
    { 
        /// <summary>
        /// The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.
        /// </summary>
        public List<List> FieldTypes { get; private set; }

        /// <summary>
        /// Name of the document type.
        /// </summary>
        public string Name { get; private set; }

        /// <summary>
        /// ID for the organization this document belongs to.
        /// </summary>
        public long? OrgId { get; private set; }

        /// <summary>
        /// Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.
        /// </summary>
        public string Uuid { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentType.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentType()
        {
        }

        private DocumentType(List<List> FieldTypes, string Name, long? OrgId, string Uuid)
        {
            
            this.FieldTypes = FieldTypes;
            
            this.Name = Name;
            
            this.OrgId = OrgId;
            
            this.Uuid = Uuid;
            
        }

        /// <summary>
        /// Returns builder of DocumentType.
        /// </summary>
        /// <returns>DocumentTypeBuilder</returns>
        public static DocumentTypeBuilder Builder()
        {
            return new DocumentTypeBuilder();
        }

        /// <summary>
        /// Returns DocumentTypeBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentTypeBuilder</returns>
        public DocumentTypeBuilder With()
        {
            return Builder()
                .FieldTypes(FieldTypes)
                .Name(Name)
                .OrgId(OrgId)
                .Uuid(Uuid);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentType other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentType.
        /// </summary>
        /// <param name="left">Compared (DocumentType</param>
        /// <param name="right">Compared (DocumentType</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentType left, DocumentType right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentType.
        /// </summary>
        /// <param name="left">Compared (DocumentType</param>
        /// <param name="right">Compared (DocumentType</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentType left, DocumentType right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentType.
        /// </summary>
        public sealed class DocumentTypeBuilder
        {
            private List<List> _FieldTypes;
            private string _Name;
            private long? _OrgId;
            private string _Uuid;

            internal DocumentTypeBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentType.FieldTypes property.
            /// </summary>
            /// <param name="value">The field types determine the names of fields for this document type. They also determine the types of values a document submitted for this document type can have.</param>
            public DocumentTypeBuilder FieldTypes(List<List> value)
            {
                _FieldTypes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentType.Name property.
            /// </summary>
            /// <param name="value">Name of the document type.</param>
            public DocumentTypeBuilder Name(string value)
            {
                _Name = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentType.OrgId property.
            /// </summary>
            /// <param name="value">ID for the organization this document belongs to.</param>
            public DocumentTypeBuilder OrgId(long? value)
            {
                _OrgId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentType.Uuid property.
            /// </summary>
            /// <param name="value">Universally unique identifier for the document type. Can be passed in as a documentTypeUuid when creating a document for this document type.</param>
            public DocumentTypeBuilder Uuid(string value)
            {
                _Uuid = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentType.
            /// </summary>
            /// <returns>DocumentType</returns>
            public DocumentType Build()
            {
                Validate();
                return new DocumentType(
                    FieldTypes: _FieldTypes,
                    Name: _Name,
                    OrgId: _OrgId,
                    Uuid: _Uuid
                );
            }

            private void Validate()
            { 
                if (_Name == null)
                {
                    throw new ArgumentException("Name is a required property for DocumentType and cannot be null");
                } 
                if (_OrgId == null)
                {
                    throw new ArgumentException("OrgId is a required property for DocumentType and cannot be null");
                } 
                if (_Uuid == null)
                {
                    throw new ArgumentException("Uuid is a required property for DocumentType and cannot be null");
                } 
            }
        }

        
    }
}