package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.model.DocumentBase;
import org.openapitools.model.DocumentField;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2019-03-01T05:35:27.523Z[GMT]")
public class Document   {
  
  private Long dispatchJobId;
  private String notes;
  private String documentType;
  private Long driverCreatedAtMs;
  private Long driverId;
  private List<DocumentField> fields = new ArrayList<DocumentField>();
  private Long vehicleId;

  /**
   * ID of the Samsara dispatch job for which the document is submitted
   **/
  
  @ApiModelProperty(example = "773", value = "ID of the Samsara dispatch job for which the document is submitted")
  @JsonProperty("dispatchJobId")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }
  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

  /**
   * Notes submitted with this document.
   **/
  
  @ApiModelProperty(example = "Fueled up before delivery.", value = "Notes submitted with this document.")
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

  /**
   * Descriptive name of this type of document.
   **/
  
  @ApiModelProperty(example = "Fuel Receipt", required = true, value = "Descriptive name of this type of document.")
  @JsonProperty("documentType")
  @NotNull
  public String getDocumentType() {
    return documentType;
  }
  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  /**
   * The time in Unix epoch milliseconds that the document is created.
   **/
  
  @ApiModelProperty(example = "1462881998034", required = true, value = "The time in Unix epoch milliseconds that the document is created.")
  @JsonProperty("driverCreatedAtMs")
  @NotNull
  public Long getDriverCreatedAtMs() {
    return driverCreatedAtMs;
  }
  public void setDriverCreatedAtMs(Long driverCreatedAtMs) {
    this.driverCreatedAtMs = driverCreatedAtMs;
  }

  /**
   * ID of the driver for whom the document is submitted
   **/
  
  @ApiModelProperty(example = "555", required = true, value = "ID of the driver for whom the document is submitted")
  @JsonProperty("driverId")
  @NotNull
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  /**
   * The fields associated with this document.
   **/
  
  @ApiModelProperty(example = "[{label=Photos, photoValue=[], valueType=ValueType_Photo}, {label=Gallons, numberValue=12.34, valueType=ValueType_Number}, {label=City, stringValue=San Francisco, CA, valueType=ValueType_String}]", required = true, value = "The fields associated with this document.")
  @JsonProperty("fields")
  @NotNull
  public List<DocumentField> getFields() {
    return fields;
  }
  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }

  /**
   * VehicleID of the driver at document creation.
   **/
  
  @ApiModelProperty(example = "222", value = "VehicleID of the driver at document creation.")
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Document document = (Document) o;
    return Objects.equals(dispatchJobId, document.dispatchJobId) &&
        Objects.equals(notes, document.notes) &&
        Objects.equals(documentType, document.documentType) &&
        Objects.equals(driverCreatedAtMs, document.driverCreatedAtMs) &&
        Objects.equals(driverId, document.driverId) &&
        Objects.equals(fields, document.fields) &&
        Objects.equals(vehicleId, document.vehicleId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dispatchJobId, notes, documentType, driverCreatedAtMs, driverId, fields, vehicleId);
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

