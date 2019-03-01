package apimodels;

import apimodels.DocumentBase;
import apimodels.DocumentField;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Document
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Document   {
  @JsonProperty("dispatchJobId")
  private Long dispatchJobId;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("documentType")
  private String documentType;

  @JsonProperty("driverCreatedAtMs")
  private Long driverCreatedAtMs;

  @JsonProperty("driverId")
  private Long driverId;

  @JsonProperty("fields")
  private List<DocumentField> fields = new ArrayList<>();

  @JsonProperty("vehicleId")
  private Long vehicleId;

  public Document dispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
    return this;
  }

   /**
   * ID of the Samsara dispatch job for which the document is submitted
   * @return dispatchJobId
  **/
    public Long getDispatchJobId() {
    return dispatchJobId;
  }

  public void setDispatchJobId(Long dispatchJobId) {
    this.dispatchJobId = dispatchJobId;
  }

  public Document notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes submitted with this document.
   * @return notes
  **/
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public Document documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * Descriptive name of this type of document.
   * @return documentType
  **/
  @NotNull
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  public Document driverCreatedAtMs(Long driverCreatedAtMs) {
    this.driverCreatedAtMs = driverCreatedAtMs;
    return this;
  }

   /**
   * The time in Unix epoch milliseconds that the document is created.
   * @return driverCreatedAtMs
  **/
  @NotNull
  public Long getDriverCreatedAtMs() {
    return driverCreatedAtMs;
  }

  public void setDriverCreatedAtMs(Long driverCreatedAtMs) {
    this.driverCreatedAtMs = driverCreatedAtMs;
  }

  public Document driverId(Long driverId) {
    this.driverId = driverId;
    return this;
  }

   /**
   * ID of the driver for whom the document is submitted
   * @return driverId
  **/
  @NotNull
  public Long getDriverId() {
    return driverId;
  }

  public void setDriverId(Long driverId) {
    this.driverId = driverId;
  }

  public Document fields(List<DocumentField> fields) {
    this.fields = fields;
    return this;
  }

  public Document addFieldsItem(DocumentField fieldsItem) {
    fields.add(fieldsItem);
    return this;
  }

   /**
   * The fields associated with this document.
   * @return fields
  **/
  @NotNull
@Valid
  public List<DocumentField> getFields() {
    return fields;
  }

  public void setFields(List<DocumentField> fields) {
    this.fields = fields;
  }

  public Document vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * VehicleID of the driver at document creation.
   * @return vehicleId
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

