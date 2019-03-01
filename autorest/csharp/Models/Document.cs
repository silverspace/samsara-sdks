// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    public partial class Document : DocumentBase
    {
        /// <summary>
        /// Initializes a new instance of the Document class.
        /// </summary>
        public Document()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the Document class.
        /// </summary>
        /// <param name="documentType">Descriptive name of this type of
        /// document.</param>
        /// <param name="driverCreatedAtMs">The time in Unix epoch milliseconds
        /// that the document is created.</param>
        /// <param name="driverId">ID of the driver for whom the document is
        /// submitted</param>
        /// <param name="fields">The fields associated with this
        /// document.</param>
        /// <param name="dispatchJobId">ID of the Samsara dispatch job for
        /// which the document is submitted</param>
        /// <param name="notes">Notes submitted with this document.</param>
        /// <param name="vehicleId">VehicleID of the driver at document
        /// creation.</param>
        public Document(string documentType, long driverCreatedAtMs, long driverId, IList<DocumentField> fields, long? dispatchJobId = default(long?), string notes = default(string), long? vehicleId = default(long?))
            : base(dispatchJobId, notes)
        {
            DocumentType = documentType;
            DriverCreatedAtMs = driverCreatedAtMs;
            DriverId = driverId;
            Fields = fields;
            VehicleId = vehicleId;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets descriptive name of this type of document.
        /// </summary>
        [JsonProperty(PropertyName = "documentType")]
        public string DocumentType { get; set; }

        /// <summary>
        /// Gets or sets the time in Unix epoch milliseconds that the document
        /// is created.
        /// </summary>
        [JsonProperty(PropertyName = "driverCreatedAtMs")]
        public long DriverCreatedAtMs { get; set; }

        /// <summary>
        /// Gets or sets ID of the driver for whom the document is submitted
        /// </summary>
        [JsonProperty(PropertyName = "driverId")]
        public long DriverId { get; set; }

        /// <summary>
        /// Gets or sets the fields associated with this document.
        /// </summary>
        [JsonProperty(PropertyName = "fields")]
        public IList<DocumentField> Fields { get; set; }

        /// <summary>
        /// Gets or sets vehicleID of the driver at document creation.
        /// </summary>
        [JsonProperty(PropertyName = "vehicleId")]
        public long? VehicleId { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (DocumentType == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "DocumentType");
            }
            if (Fields == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Fields");
            }
            if (Fields != null)
            {
                foreach (var element in Fields)
                {
                    if (element != null)
                    {
                        element.Validate();
                    }
                }
            }
        }
    }
}
