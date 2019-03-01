// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Microsoft.Rest;
    using Newtonsoft.Json;
    using System.Linq;

    public partial class DocumentFieldType
    {
        /// <summary>
        /// Initializes a new instance of the DocumentFieldType class.
        /// </summary>
        public DocumentFieldType()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the DocumentFieldType class.
        /// </summary>
        /// <param name="label">Descriptive name of this field type.</param>
        /// <param name="valueType">The kind of value that can be submitted for
        /// this fieldType. It should be either ValueType_Number,
        /// ValueType_String, or ValueType_Photo.</param>
        /// <param name="numberValueTypeMetadata">Additional metadata
        /// information for a number field type. Only defined when a field type
        /// has valueType: ValueType_Number.</param>
        public DocumentFieldType(string label, string valueType, DocumentFieldTypeNumberValueTypeMetadata numberValueTypeMetadata = default(DocumentFieldTypeNumberValueTypeMetadata))
        {
            Label = label;
            NumberValueTypeMetadata = numberValueTypeMetadata;
            ValueType = valueType;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets descriptive name of this field type.
        /// </summary>
        [JsonProperty(PropertyName = "label")]
        public string Label { get; set; }

        /// <summary>
        /// Gets or sets additional metadata information for a number field
        /// type. Only defined when a field type has valueType:
        /// ValueType_Number.
        /// </summary>
        [JsonProperty(PropertyName = "numberValueTypeMetadata")]
        public DocumentFieldTypeNumberValueTypeMetadata NumberValueTypeMetadata { get; set; }

        /// <summary>
        /// Gets or sets the kind of value that can be submitted for this
        /// fieldType. It should be either ValueType_Number, ValueType_String,
        /// or ValueType_Photo.
        /// </summary>
        [JsonProperty(PropertyName = "valueType")]
        public string ValueType { get; set; }

        /// <summary>
        /// Validate the object.
        /// </summary>
        /// <exception cref="ValidationException">
        /// Thrown if validation fails
        /// </exception>
        public virtual void Validate()
        {
            if (Label == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "Label");
            }
            if (ValueType == null)
            {
                throw new ValidationException(ValidationRules.CannotBeNull, "ValueType");
            }
        }
    }
}