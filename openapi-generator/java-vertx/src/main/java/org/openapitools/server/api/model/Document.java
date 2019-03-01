package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.server.api.model.DocumentBase;
import org.openapitools.server.api.model.DocumentField;

@JsonInclude(JsonInclude.Include.NON_NULL) 
public class Document   {
  
  private Long dispatchJobId;
  private String notes;
  private String documentType;
  private Long driverCreatedAtMs;
  private Long driverId;
  private List<DocumentField> fields = new ArrayList<>();
  private Long vehicleId;

  public Document () {

  }

  public Document (Long dispatchJobId, String notes, String documentType, Long driverCreatedAtMs, Long driverId, List<DocumentField> fields, Long vehicleId) {
    this.dispatchJobId = dispatchJobId;
    this.notes = notes;
    this.documentType = documentType;
    this.driverCreatedAtMs = driverCreatedAtMs;
    this.driverId = driverId;
    this.fields = fields;
    this.vehicleId = vehicleId;
  }

    
  @JsonProperty("dispatchJobId")
  public Long getDispatchJobId() {
    return dispatchJobId;
  }
  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

    
  @JsonProperty("notes")
  public String getNotes() {
    return notes;
  }
  public void setNotes(String notes) {
    this.notes = notes;
  }

    
  @JsonProperty("documentType")
  public String getDocumentType() {
    return documentType;
  }
  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

    
  @JsonProperty("driverCreatedAtMs")
  public Long getDriverCreatedAtMs() {
    return driverCreatedAtMs;
  }
  public void setDriverCreatedAtMs(Long driverCreatedAtMs) {
    this.driverCreatedAtMs = driverCreatedAtMs;
  }

    
  @JsonProperty("driverId")
  public Long getDriverId() {
    return driverId;
  }
  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

    
  @JsonProperty("fields")
  public List<DocumentField> getFields() {
    return fields;
  }
  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }

    
  @JsonProperty("vehicleId")
  public Long getVehicleId() {
    return vehicleId;
  }
  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }


  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}
