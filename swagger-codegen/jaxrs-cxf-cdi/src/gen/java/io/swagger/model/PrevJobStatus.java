package io.swagger.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The previous state of the dispatch job.
 **/
@XmlType(name="")
@XmlEnum(.class)
public enum  {

    @XmlEnumValue("JobState_Unassigned") UNASSIGNED(.valueOf("JobState_Unassigned")), @XmlEnumValue("JobState_Scheduled") SCHEDULED(.valueOf("JobState_Scheduled")), @XmlEnumValue("JobState_EnRoute") ENROUTE(.valueOf("JobState_EnRoute")), @XmlEnumValue("JobState_Arrived") ARRIVED(.valueOf("JobState_Arrived")), @XmlEnumValue("JobState_Completed") COMPLETED(.valueOf("JobState_Completed")), @XmlEnumValue("JobState_Skipped") SKIPPED(.valueOf("JobState_Skipped"));


    private  value;

     ( v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static  fromValue(String v) {
        for (PrevJobStatus b : PrevJobStatus.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        return null;
    }
}


