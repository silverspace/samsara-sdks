package org.openapitools.client.model {

import org.openapitools.client.model.DriverBase;
import org.openapitools.client.model.TagMetadata;

    [XmlRootNode(name="Driver")]
    public class Driver {
        /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
        [XmlElement(name="eldAdverseWeatherExemptionEnabled")]
        public var eldAdverseWeatherExemptionEnabled: Boolean = false;
        /* Flag indicating this driver may use Big Day excemptions in ELD logs. */
        [XmlElement(name="eldBigDayExemptionEnabled")]
        public var eldBigDayExemptionEnabled: Boolean = false;
        /* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
        [XmlElement(name="eldDayStartHour")]
        public var eldDayStartHour: Number = 0;
        /* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
        [XmlElement(name="eldExempt")]
        public var eldExempt: Boolean = false;
        /* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
        [XmlElement(name="eldExemptReason")]
        public var eldExemptReason: String = null;
        /* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
        [XmlElement(name="eldPcEnabled")]
        public var eldPcEnabled: Boolean = false;
        /* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
        [XmlElement(name="eldYmEnabled")]
        public var eldYmEnabled: Boolean = false;
        /* Dictionary of external IDs (string key-value pairs) */
        // This declaration below of _externalIds_obj_class is to force flash compiler to include this class
        private var _externalIds_obj_class: Dictionary = null;
        [XmlElementWrapper(name="externalIds")]
        [XmlElements(name="externalIds", type="Dictionary")]
                public var externalIds: Dictionary = new Dictionary();
        /* ID of the group if the organization has multiple groups (uncommon). */
        [XmlElement(name="groupId")]
        public var groupId: Number = 0;
        /* Driver&#39;s state issued license number. */
        [XmlElement(name="licenseNumber")]
        public var licenseNumber: String = null;
        /* Abbreviation of state that issued driver&#39;s license. */
        [XmlElement(name="licenseState")]
        public var licenseState: String = null;
        /* Driver&#39;s name. */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Notes about the driver. */
        [XmlElement(name="notes")]
        public var notes: String = null;
        /* Driver&#39;s phone number. Please include only digits, ex. 4157771234 */
        [XmlElement(name="phone")]
        public var phone: String = null;
        /* Driver&#39;s login username into the driver app. */
        [XmlElement(name="username")]
        public var username: String = null;
        /* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
        [XmlElement(name="vehicleId")]
        public var vehicleId: Number = 0;
        /* ID of the driver. */
        [XmlElement(name="id")]
        public var id: Number = 0;
        /* True if the driver account has been deactivated. */
        [XmlElement(name="isDeactivated")]
        public var isDeactivated: Boolean = false;
                // This declaration below of _tags_obj_class is to force flash compiler to include this class
        private var _tags_obj_class: Array = null;
        [XmlElementWrapper(name="tags")]
        [XmlElements(name="tags", type="Array")]
                public var tags: Array = new Array();

    public function toString(): String {
        var str: String = "Driver: ";
        str += " (eldAdverseWeatherExemptionEnabled: " + eldAdverseWeatherExemptionEnabled + ")";
        str += " (eldBigDayExemptionEnabled: " + eldBigDayExemptionEnabled + ")";
        str += " (eldDayStartHour: " + eldDayStartHour + ")";
        str += " (eldExempt: " + eldExempt + ")";
        str += " (eldExemptReason: " + eldExemptReason + ")";
        str += " (eldPcEnabled: " + eldPcEnabled + ")";
        str += " (eldYmEnabled: " + eldYmEnabled + ")";
        str += " (externalIds: " + externalIds + ")";
        str += " (groupId: " + groupId + ")";
        str += " (licenseNumber: " + licenseNumber + ")";
        str += " (licenseState: " + licenseState + ")";
        str += " (name: " + name + ")";
        str += " (notes: " + notes + ")";
        str += " (phone: " + phone + ")";
        str += " (username: " + username + ")";
        str += " (vehicleId: " + vehicleId + ")";
        str += " (id: " + id + ")";
        str += " (isDeactivated: " + isDeactivated + ")";
        str += " (tags: " + tags + ")";
        return str;
    }

}

}
