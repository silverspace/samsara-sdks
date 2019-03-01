using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools.v1.Models
{
    /// <summary>
    /// DocumentBase
    /// </summary>
    public sealed class DocumentBase:  IEquatable<DocumentBase>
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
        /// Empty constructor required by some serializers.
        /// Use DocumentBase.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public DocumentBase()
        {
        }

        private DocumentBase(long? DispatchJobId, string Notes)
        {
            
            this.DispatchJobId = DispatchJobId;
            
            this.Notes = Notes;
            
        }

        /// <summary>
        /// Returns builder of DocumentBase.
        /// </summary>
        /// <returns>DocumentBaseBuilder</returns>
        public static DocumentBaseBuilder Builder()
        {
            return new DocumentBaseBuilder();
        }

        /// <summary>
        /// Returns DocumentBaseBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>DocumentBaseBuilder</returns>
        public DocumentBaseBuilder With()
        {
            return Builder()
                .DispatchJobId(DispatchJobId)
                .Notes(Notes);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(DocumentBase other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (DocumentBase.
        /// </summary>
        /// <param name="left">Compared (DocumentBase</param>
        /// <param name="right">Compared (DocumentBase</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (DocumentBase left, DocumentBase right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (DocumentBase.
        /// </summary>
        /// <param name="left">Compared (DocumentBase</param>
        /// <param name="right">Compared (DocumentBase</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (DocumentBase left, DocumentBase right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of DocumentBase.
        /// </summary>
        public sealed class DocumentBaseBuilder
        {
            private long? _DispatchJobId;
            private string _Notes;

            internal DocumentBaseBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for DocumentBase.DispatchJobId property.
            /// </summary>
            /// <param name="value">ID of the Samsara dispatch job for which the document is submitted</param>
            public DocumentBaseBuilder DispatchJobId(long? value)
            {
                _DispatchJobId = value;
                return this;
            }

            /// <summary>
            /// Sets value for DocumentBase.Notes property.
            /// </summary>
            /// <param name="value">Notes submitted with this document.</param>
            public DocumentBaseBuilder Notes(string value)
            {
                _Notes = value;
                return this;
            }


            /// <summary>
            /// Builds instance of DocumentBase.
            /// </summary>
            /// <returns>DocumentBase</returns>
            public DocumentBase Build()
            {
                Validate();
                return new DocumentBase(
                    DispatchJobId: _DispatchJobId,
                    Notes: _Notes
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}