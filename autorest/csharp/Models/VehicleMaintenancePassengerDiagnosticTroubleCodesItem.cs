// <auto-generated>
// Code generated by Microsoft (R) AutoRest Code Generator.
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Swagger.Models
{
    using Newtonsoft.Json;
    using System.Linq;

    public partial class VehicleMaintenancePassengerDiagnosticTroubleCodesItem
    {
        /// <summary>
        /// Initializes a new instance of the
        /// VehicleMaintenancePassengerDiagnosticTroubleCodesItem class.
        /// </summary>
        public VehicleMaintenancePassengerDiagnosticTroubleCodesItem()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// VehicleMaintenancePassengerDiagnosticTroubleCodesItem class.
        /// </summary>
        public VehicleMaintenancePassengerDiagnosticTroubleCodesItem(string dtcDescription = default(string), int? dtcId = default(int?), string dtcShortCode = default(string))
        {
            DtcDescription = dtcDescription;
            DtcId = dtcId;
            DtcShortCode = dtcShortCode;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "dtcDescription")]
        public string DtcDescription { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "dtcId")]
        public int? DtcId { get; set; }

        /// <summary>
        /// </summary>
        [JsonProperty(PropertyName = "dtcShortCode")]
        public string DtcShortCode { get; set; }

    }
}
