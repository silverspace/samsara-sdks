package apimodels;

import apimodels.DriverBase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * DriverForCreate
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class DriverForCreate   {
  @JsonProperty("eldAdverseWeatherExemptionEnabled")
  private Boolean eldAdverseWeatherExemptionEnabled;

  @JsonProperty("eldBigDayExemptionEnabled")
  private Boolean eldBigDayExemptionEnabled;

  @JsonProperty("eldDayStartHour")
  private Integer eldDayStartHour;

  @JsonProperty("eldExempt")
  private Boolean eldExempt;

  @JsonProperty("eldExemptReason")
  private String eldExemptReason;

  @JsonProperty("eldPcEnabled")
  private Boolean eldPcEnabled = false;

  @JsonProperty("eldYmEnabled")
  private Boolean eldYmEnabled = false;

  @JsonProperty("externalIds")
  private Map<String, String> externalIds = null;

  @JsonProperty("groupId")
  private Long groupId;

  @JsonProperty("licenseNumber")
  private String licenseNumber;

  @JsonProperty("licenseState")
  private String licenseState;

  @JsonProperty("name")
  private String name;

  @JsonProperty("notes")
  private String notes;

  @JsonProperty("phone")
  private String phone;

  @JsonProperty("username")
  private String username;

  @JsonProperty("vehicleId")
  private Long vehicleId;

  @JsonProperty("password")
  private String password;

  @JsonProperty("tagIds")
  private List<Long> tagIds = null;

  public DriverForCreate eldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
   * @return eldAdverseWeatherExemptionEnabled
  **/
    public Boolean getEldAdverseWeatherExemptionEnabled() {
    return eldAdverseWeatherExemptionEnabled;
  }

  public void setEldAdverseWeatherExemptionEnabled(Boolean eldAdverseWeatherExemptionEnabled) {
    this.eldAdverseWeatherExemptionEnabled = eldAdverseWeatherExemptionEnabled;
  }

  public DriverForCreate eldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may use Big Day excemptions in ELD logs.
   * @return eldBigDayExemptionEnabled
  **/
    public Boolean getEldBigDayExemptionEnabled() {
    return eldBigDayExemptionEnabled;
  }

  public void setEldBigDayExemptionEnabled(Boolean eldBigDayExemptionEnabled) {
    this.eldBigDayExemptionEnabled = eldBigDayExemptionEnabled;
  }

  public DriverForCreate eldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
    return this;
  }

   /**
   * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
   * @return eldDayStartHour
  **/
    public Integer getEldDayStartHour() {
    return eldDayStartHour;
  }

  public void setEldDayStartHour(Integer eldDayStartHour) {
    this.eldDayStartHour = eldDayStartHour;
  }

  public DriverForCreate eldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
    return this;
  }

   /**
   * Flag indicating this driver is exempt from the Electronic Logging Mandate.
   * @return eldExempt
  **/
    public Boolean getEldExempt() {
    return eldExempt;
  }

  public void setEldExempt(Boolean eldExempt) {
    this.eldExempt = eldExempt;
  }

  public DriverForCreate eldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
    return this;
  }

   /**
   * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
   * @return eldExemptReason
  **/
    public String getEldExemptReason() {
    return eldExemptReason;
  }

  public void setEldExemptReason(String eldExemptReason) {
    this.eldExemptReason = eldExemptReason;
  }

  public DriverForCreate eldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
   * @return eldPcEnabled
  **/
    public Boolean getEldPcEnabled() {
    return eldPcEnabled;
  }

  public void setEldPcEnabled(Boolean eldPcEnabled) {
    this.eldPcEnabled = eldPcEnabled;
  }

  public DriverForCreate eldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
    return this;
  }

   /**
   * Flag indicating this driver may select the Yard Move duty status in ELD logs.
   * @return eldYmEnabled
  **/
    public Boolean getEldYmEnabled() {
    return eldYmEnabled;
  }

  public void setEldYmEnabled(Boolean eldYmEnabled) {
    this.eldYmEnabled = eldYmEnabled;
  }

  public DriverForCreate externalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
    return this;
  }

  public DriverForCreate putExternalIdsItem(String key, String externalIdsItem) {
    if (this.externalIds == null) {
      this.externalIds = new HashMap<>();
    }
    this.externalIds.put(key, externalIdsItem);
    return this;
  }

   /**
   * Dictionary of external IDs (string key-value pairs)
   * @return externalIds
  **/
    public Map<String, String> getExternalIds() {
    return externalIds;
  }

  public void setExternalIds(Map<String, String> externalIds) {
    this.externalIds = externalIds;
  }

  public DriverForCreate groupId(Long groupId) {
    this.groupId = groupId;
    return this;
  }

   /**
   * ID of the group if the organization has multiple groups (uncommon).
   * @return groupId
  **/
    public Long getGroupId() {
    return groupId;
  }

  public void setGroupId(Long groupId) {
    this.groupId = groupId;
  }

  public DriverForCreate licenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
    return this;
  }

   /**
   * Driver's state issued license number.
   * @return licenseNumber
  **/
    public String getLicenseNumber() {
    return licenseNumber;
  }

  public void setLicenseNumber(String licenseNumber) {
    this.licenseNumber = licenseNumber;
  }

  public DriverForCreate licenseState(String licenseState) {
    this.licenseState = licenseState;
    return this;
  }

   /**
   * Abbreviation of state that issued driver's license.
   * @return licenseState
  **/
    public String getLicenseState() {
    return licenseState;
  }

  public void setLicenseState(String licenseState) {
    this.licenseState = licenseState;
  }

  public DriverForCreate name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Driver's name.
   * @return name
  **/
  @NotNull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DriverForCreate notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Notes about the driver.
   * @return notes
  **/
    public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public DriverForCreate phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Driver's phone number. Please include only digits, ex. 4157771234
   * @return phone
  **/
    public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public DriverForCreate username(String username) {
    this.username = username;
    return this;
  }

   /**
   * Driver's login username into the driver app.
   * @return username
  **/
    public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public DriverForCreate vehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
    return this;
  }

   /**
   * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
   * @return vehicleId
  **/
    public Long getVehicleId() {
    return vehicleId;
  }

  public void setVehicleId(Long vehicleId) {
    this.vehicleId = vehicleId;
  }

  public DriverForCreate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Driver's password for the driver app.
   * @return password
  **/
  @NotNull
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public DriverForCreate tagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
    return this;
  }

  public DriverForCreate addTagIdsItem(Long tagIdsItem) {
    if (tagIds == null) {
      tagIds = new ArrayList<>();
    }
    tagIds.add(tagIdsItem);
    return this;
  }

   /**
   * A list of tag IDs.
   * @return tagIds
  **/
    public List<Long> getTagIds() {
    return tagIds;
  }

  public void setTagIds(List<Long> tagIds) {
    this.tagIds = tagIds;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DriverForCreate driverForCreate = (DriverForCreate) o;
    return Objects.equals(eldAdverseWeatherExemptionEnabled, driverForCreate.eldAdverseWeatherExemptionEnabled) &&
        Objects.equals(eldBigDayExemptionEnabled, driverForCreate.eldBigDayExemptionEnabled) &&
        Objects.equals(eldDayStartHour, driverForCreate.eldDayStartHour) &&
        Objects.equals(eldExempt, driverForCreate.eldExempt) &&
        Objects.equals(eldExemptReason, driverForCreate.eldExemptReason) &&
        Objects.equals(eldPcEnabled, driverForCreate.eldPcEnabled) &&
        Objects.equals(eldYmEnabled, driverForCreate.eldYmEnabled) &&
        Objects.equals(externalIds, driverForCreate.externalIds) &&
        Objects.equals(groupId, driverForCreate.groupId) &&
        Objects.equals(licenseNumber, driverForCreate.licenseNumber) &&
        Objects.equals(licenseState, driverForCreate.licenseState) &&
        Objects.equals(name, driverForCreate.name) &&
        Objects.equals(notes, driverForCreate.notes) &&
        Objects.equals(phone, driverForCreate.phone) &&
        Objects.equals(username, driverForCreate.username) &&
        Objects.equals(vehicleId, driverForCreate.vehicleId) &&
        Objects.equals(password, driverForCreate.password) &&
        Objects.equals(tagIds, driverForCreate.tagIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled, eldDayStartHour, eldExempt, eldExemptReason, eldPcEnabled, eldYmEnabled, externalIds, groupId, licenseNumber, licenseState, name, notes, phone, username, vehicleId, password, tagIds);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DriverForCreate {\n");
    
    sb.append("    eldAdverseWeatherExemptionEnabled: ").append(toIndentedString(eldAdverseWeatherExemptionEnabled)).append("\n");
    sb.append("    eldBigDayExemptionEnabled: ").append(toIndentedString(eldBigDayExemptionEnabled)).append("\n");
    sb.append("    eldDayStartHour: ").append(toIndentedString(eldDayStartHour)).append("\n");
    sb.append("    eldExempt: ").append(toIndentedString(eldExempt)).append("\n");
    sb.append("    eldExemptReason: ").append(toIndentedString(eldExemptReason)).append("\n");
    sb.append("    eldPcEnabled: ").append(toIndentedString(eldPcEnabled)).append("\n");
    sb.append("    eldYmEnabled: ").append(toIndentedString(eldYmEnabled)).append("\n");
    sb.append("    externalIds: ").append(toIndentedString(externalIds)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    licenseNumber: ").append(toIndentedString(licenseNumber)).append("\n");
    sb.append("    licenseState: ").append(toIndentedString(licenseState)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    vehicleId: ").append(toIndentedString(vehicleId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    tagIds: ").append(toIndentedString(tagIds)).append("\n");
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

