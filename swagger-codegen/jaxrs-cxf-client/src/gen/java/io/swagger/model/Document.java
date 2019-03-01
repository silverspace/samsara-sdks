package io.swagger.model;

import io.swagger.model.DocumentBase;
import io.swagger.model.DocumentField;
import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Document  {
  
  @ApiModelProperty(example = "773", value = "ID of the Samsara dispatch job for which the document is submitted")
 /**
   * ID of the Samsara dispatch job for which the document is submitted
  **/
  private Long dispatchJobId = null;

  @ApiModelProperty(example = "Fueled up before delivery.", value = "Notes submitted with this document.")
 /**
   * Notes submitted with this document.
  **/
  private String notes = null;

  @ApiModelProperty(example = "Fuel Receipt", required = true, value = "Descriptive name of this type of document.")
 /**
   * Descriptive name of this type of document.
  **/
  private String documentType = null;

  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the document is created.")
 /**
   * The time in Unix epoch milliseconds that the document is created.
  **/
  private Long driverCreatedAtMs = null;

  @ApiModelProperty(example = "555", required = true, value = "ID of the driver for whom the document is submitted")
 /**
   * ID of the driver for whom the document is submitted
  **/
  private Long driverId = null;

  @ApiModelProperty(example = "[{\"label\":\"Photos\",\"photoValue\":[],\"valueType\":\"ValueType_Photo\"},{\"label\":\"Gallons\",\"numberValue\":12.34,\"valueType\":\"ValueType_Number\"},{\"label\":\"City\",\"stringValue\":\"San Francisco, CA\",\"valueType\":\"ValueType_String\"}]", required = true, value = "The fields associated with this document.")
 /**
   * The fields associated with this document.
  **/
  private List<DocumentField> fields = new ArrayList<DocumentField>();

  @ApiModelProperty(example = "222", value = "VehicleID of the driver at document creation.")
 /**
   * VehicleID of the driver at document creation.
  **/
  private Long vehicleId = null;
 /**
   * ID of the Samsara dispatch job for which the document is submitted
   * @return dispatchJobId
  **/
  @JsonProperty("dispatchJobId")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }

  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

  public Document dispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
    return this;
  }

 /**
   * Notes submitted with this document.
   * @return notes
  **/
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Document notes(String notes) {
    this.notes = notes;
    return this;
  }

 /**
   * Descriptive name of this type of document.
   * @return documentType
  **/
  @JsonProperty("documentType")
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Document documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

 /**
   * The time in Unix epoch milliseconds that the document is created.
   * @return driverCreatedAtMs
  **/
  @JsonProperty("driverCreatedAtMs")
  public Long getDriverCreatedAtMs() {
    return driverCreatedAtMs;
  }

  public void setDriverCreatedAtMs(Long driverCreatedAtMs) {
    this.driverCreatedAtMs = driverCreatedAtMs;
  }

  public Document driverCreatedAtMs(Long driverCreatedAtMs) {
    this.driverCreatedAtMs = driverCreatedAtMs;
    return this;
  }

 /**
   * ID of the driver for whom the document is submitted
   * @return driverId
  **/
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public Document driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

 /**
   * The fields associated with this document.
   * @return fields
  **/
  @JsonProperty("fields")
  public List<DocumentField> getFields() {
    return fields;
  }

  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }

  public Document fields(List<DocumentField> fields) {
    this.fields = fields;
    return this;
  }

  public Document addFieldsItem(DocumentField fieldsItem) {
    this.fields.add(fieldsItem);
    return this;
  }

 /**
   * VehicleID of the driver at document creation.
   * @return vehicleId
  **/
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public Document vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Document {\n");
    
    sb.append("    dispatchJobId: ").append(toIndentedString(dispatchJobId)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
    sb.append("    driverCreatedAtMs: ").append(toIndentedString(driverCreatedAtMs)).append("\n");
    sb.append("    driverId: ").append(toIndentedString(driverId)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

