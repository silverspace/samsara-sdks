using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentCreate
    /// </summary>
    public sealed class DocumentCreate:  IEquatable<DocumentCreate>
    { 
        /// <summary>
        /// ID of the Samsara dispatch job for which the document is submitted
        /// </summary>
        public long? DispatchJobId { get; private set; }

        /// <summary>
        /// Notes submitted with this document.
        /// </summary>
        public string Notes { get; private set; }

        /// <summary>
        /// Universally unique identifier for the document type this document is being created for.
        /// </summary>
        public string DocumentTypeUuid { get; private set; }

        /// <summary>
        /// List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.
        /// </summary>
        public List<DocumentField> Fields { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use DocumentCreate.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentCreate()
        {
        }

        private DocumentCreate(long? DispatchJobId, string Notes, string DocumentTypeUuid, List<DocumentField> Fields)
        {
            
            this.DispatchJobId = DispatchJobId;
            
            this.Notes = Notes;
            
            this.DocumentTypeUuid = DocumentTypeUuid;
            
            this.Fields = Fields;
            
        }

        /// <summary>
        /// Returns builder of DocumentCreate.
        /// </summary>
        /// <returns>DocumentCreateBuilder</returns>
        public static DocumentCreateBuilder Builder()
        {
            return new DocumentCreateBuilder();
        }

        /// <summary>
        /// Returns DocumentCreateBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentCreateBuilder</returns>
        public DocumentCreateBuilder With()
        {
            return Builder()
                .DispatchJobId(DispatchJobId)
                .Notes(Notes)
                .DocumentTypeUuid(DocumentTypeUuid)
                .Fields(Fields);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentCreate other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentCreate.
        /// </summary>
        /// <param name="left">Compared (DocumentCreate</param>
        /// <param name="right">Compared (DocumentCreate</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentCreate left, DocumentCreate right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentCreate.
        /// </summary>
        /// <param name="left">Compared (DocumentCreate</param>
        /// <param name="right">Compared (DocumentCreate</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentCreate left, DocumentCreate right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentCreate.
        /// </summary>
        public sealed class DocumentCreateBuilder
        {
            private long? _DispatchJobId;
            private string _Notes;
            private string _DocumentTypeUuid;
            private List<DocumentField> _Fields;

            internal DocumentCreateBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentCreate.DispatchJobId property.
            /// </summary>
            /// <param name="value">ID of the Samsara dispatch job for which the document is submitted</param>
            public DocumentCreateBuilder DispatchJobId(long? value)
            {
                _DispatchJobId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentCreate.Notes property.
            /// </summary>
            /// <param name="value">Notes submitted with this document.</param>
            public DocumentCreateBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentCreate.DocumentTypeUuid property.
            /// </summary>
            /// <param name="value">Universally unique identifier for the document type this document is being created for.</param>
            public DocumentCreateBuilder DocumentTypeUuid(string value)
            {
                _DocumentTypeUuid = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentCreate.Fields property.
            /// </summary>
            /// <param name="value">List of fields should match the document type’s list of field types in the correct order. In other words, a field&#39;s valueType and value (i.e. only one of: stringValue, numberValue, or photoValue) at index _i_ should match with the document field type’s valueType at index _i_.</param>
            public DocumentCreateBuilder Fields(List<DocumentField> value)
            {
                _Fields = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentCreate.
            /// </summary>
            /// <returns>DocumentCreate</returns>
            public DocumentCreate Build()
            {
                Validate();
                return new DocumentCreate(
                    DispatchJobId: _DispatchJobId,
                    Notes: _Notes,
                    DocumentTypeUuid: _DocumentTypeUuid,
                    Fields: _Fields
                );
            }

            private void Validate()
            { 
                if (_DocumentTypeUuid == null)
                {
                    throw new ArgumentException("DocumentTypeUuid is a required property for DocumentCreate and cannot be null");
                } 
                if (_Fields == null)
                {
                    throw new ArgumentException("Fields is a required property for DocumentCreate and cannot be null");
                } 
            }
        }

        
    }
}