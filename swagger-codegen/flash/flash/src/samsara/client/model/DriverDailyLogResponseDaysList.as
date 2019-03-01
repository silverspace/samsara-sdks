package samsara.client.model {

import io.swagger.common.ListWrapper;
import samsara.client.model.Object;

    public class DriverDailyLogResponseDaysList implements ListWrapper {
        // This declaration below of _DriverDailyLogResponse_days_obj_class is to force flash compiler to include this class
        private var _driverDailyLogResponseDays_obj_class: samsara.client.model.DriverDailyLogResponseDays = null;
        [XmlElements(name="driverDailyLogResponseDays", type="samsara.client.model.DriverDailyLogResponseDays")]
        public var driverDailyLogResponseDays: Array = new Array();

        public function getList(): Array{
            return driverDailyLogResponseDays;
        }

}

}
