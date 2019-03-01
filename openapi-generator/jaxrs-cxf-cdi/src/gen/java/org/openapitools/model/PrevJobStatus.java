package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * The previous state of the dispatch job.
 **/
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;

@XmlType(name="")
@XmlEnum(String.class)
public enum PrevJobStatus {

    @XmlEnumValue("JobState_Unassigned") UNASSIGNED(String.valueOf("JobState_Unassigned")), @XmlEnumValue("JobState_Scheduled") SCHEDULED(String.valueOf("JobState_Scheduled")), @XmlEnumValue("JobState_EnRoute") ENROUTE(String.valueOf("JobState_EnRoute")), @XmlEnumValue("JobState_Arrived") ARRIVED(String.valueOf("JobState_Arrived")), @XmlEnumValue("JobState_Completed") COMPLETED(String.valueOf("JobState_Completed")), @XmlEnumValue("JobState_Skipped") SKIPPED(String.valueOf("JobState_Skipped"));


    private String value;

    PrevJobStatus(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static PrevJobStatus fromValue(String v) {
        for (PrevJobStatus b : PrevJobStatus.values()) {
            if (String.valueOf(b.value).equals(v)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + v + "'");
    }
}



