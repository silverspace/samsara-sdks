package org.openapitools.client.model {

import org.openapitools.client.model.HosAuthenticationLogsResponseAuthenticationLogs;

    [XmlRootNode(name="HosAuthenticationLogsResponse")]
    public class HosAuthenticationLogsResponse {
                // This declaration below of _authenticationLogs_obj_class is to force flash compiler to include this class
        private var _authenticationLogs_obj_class: Array = null;
        [XmlElementWrapper(name="authenticationLogs")]
        [XmlElements(name="authenticationLogs", type="Array")]
                public var authenticationLogs: Array = new Array();

    public function toString(): String {
        var str: String = "HosAuthenticationLogsResponse: ";
        str += " (authenticationLogs: " + authenticationLogs + ")";
        return str;
    }

}

}
