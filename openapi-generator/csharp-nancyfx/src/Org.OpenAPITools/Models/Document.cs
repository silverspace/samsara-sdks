using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// Document
    /// </summary>
    public sealed class Document:  IEquatable<Document>
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
        /// Descriptive name of this type of document.
        /// </summary>
        public string DocumentType { get; private set; }

        /// <summary>
        /// The time in Unix epoch milliseconds that the document is created.
        /// </summary>
        public long? DriverCreatedAtMs { get; private set; }

        /// <summary>
        /// ID of the driver for whom the document is submitted
        /// </summary>
        public long? DriverId { get; private set; }

        /// <summary>
        /// The fields associated with this document.
        /// </summary>
        public List<DocumentField> Fields { get; private set; }

        /// <summary>
        /// VehicleID of the driver at document creation.
        /// </summary>
        public long? VehicleId { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use Document.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public Document()
        {
        }

        private Document(long? DispatchJobId, string Notes, string DocumentType, long? DriverCreatedAtMs, long? DriverId, List<DocumentField> Fields, long? VehicleId)
        {
            
            this.DispatchJobId = DispatchJobId;
            
            this.Notes = Notes;
            
            this.DocumentType = DocumentType;
            
            this.DriverCreatedAtMs = DriverCreatedAtMs;
            
            this.DriverId = DriverId;
            
            this.Fields = Fields;
            
            this.VehicleId = VehicleId;
            
        }

        /// <summary>
        /// Returns builder of Document.
        /// </summary>
        /// <returns>DocumentBuilder</returns>
        public static DocumentBuilder Builder()
        {
            return new DocumentBuilder();
        }

        /// <summary>
        /// Returns DocumentBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentBuilder</returns>
        public DocumentBuilder With()
        {
            return Builder()
                .DispatchJobId(DispatchJobId)
                .Notes(Notes)
                .DocumentType(DocumentType)
                .DriverCreatedAtMs(DriverCreatedAtMs)
                .DriverId(DriverId)
                .Fields(Fields)
                .VehicleId(VehicleId);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(Document other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (Document.
        /// </summary>
        /// <param name="left">Compared (Document</param>
        /// <param name="right">Compared (Document</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (Document left, Document right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (Document.
        /// </summary>
        /// <param name="left">Compared (Document</param>
        /// <param name="right">Compared (Document</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (Document left, Document right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of Document.
        /// </summary>
        public sealed class DocumentBuilder
        {
            private long? _DispatchJobId;
            private string _Notes;
            private string _DocumentType;
            private long? _DriverCreatedAtMs;
            private long? _DriverId;
            private List<DocumentField> _Fields;
            private long? _VehicleId;

            internal DocumentBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for Document.DispatchJobId property.
            /// </summary>
            /// <param name="value">ID of the Samsara dispatch job for which the document is submitted</param>
            public DocumentBuilder DispatchJobId(long? value)
            {
                _DispatchJobId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Document.Notes property.
            /// </summary>
            /// <param name="value">Notes submitted with this document.</param>
            public DocumentBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }

            /// <summary>
            /// Sets value for Document.DocumentType property.
            /// </summary>
            /// <param name="value">Descriptive name of this type of document.</param>
            public DocumentBuilder DocumentType(string value)
            {
                _DocumentType = value;
                return this;
            }

            /// <summary>
            /// Sets value for Document.DriverCreatedAtMs property.
            /// </summary>
            /// <param name="value">The time in Unix epoch milliseconds that the document is created.</param>
            public DocumentBuilder DriverCreatedAtMs(long? value)
            {
                _DriverCreatedAtMs = value;
                return this;
            }

            /// <summary>
            /// Sets value for Document.DriverId property.
            /// </summary>
            /// <param name="value">ID of the driver for whom the document is submitted</param>
            public DocumentBuilder DriverId(long? value)
            {
                _DriverId = value;
                return this;
            }

            /// <summary>
            /// Sets value for Document.Fields property.
            /// </summary>
            /// <param name="value">The fields associated with this document.</param>
            public DocumentBuilder Fields(List<DocumentField> value)
            {
                _Fields = value;
                return this;
            }

            /// <summary>
            /// Sets value for Document.VehicleId property.
            /// </summary>
            /// <param name="value">VehicleID of the driver at document creation.</param>
            public DocumentBuilder VehicleId(long? value)
            {
                _VehicleId = value;
                return this;
            }


            /// <summary>
            /// Builds instance of Document.
            /// </summary>
            /// <returns>Document</returns>
            public Document Build()
            {
                Validate();
                return new Document(
                    DispatchJobId: _DispatchJobId,
                    Notes: _Notes,
                    DocumentType: _DocumentType,
                    DriverCreatedAtMs: _DriverCreatedAtMs,
                    DriverId: _DriverId,
                    Fields: _Fields,
                    VehicleId: _VehicleId
                );
            }

            private void Validate()
            { 
                if (_DocumentType == null)
                {
                    throw new ArgumentException("DocumentType is a required property for Document and cannot be null");
                } 
                if (_DriverCreatedAtMs == null)
                {
                    throw new ArgumentException("DriverCreatedAtMs is a required property for Document and cannot be null");
                } 
                if (_DriverId == null)
                {
                    throw new ArgumentException("DriverId is a required property for Document and cannot be null");
                } 
                if (_Fields == null)
                {
                    throw new ArgumentException("Fields is a required property for Document and cannot be null");
                } 
            }
        }

        
    }
}