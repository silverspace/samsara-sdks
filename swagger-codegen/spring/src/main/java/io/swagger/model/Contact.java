package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Information about a notification contact for alerts.
 */
@ApiModel(description = "Information about a notification contact for alerts.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-01T04:20:34.312Z")

public class Contact   {
  @JsonProperty("email")
  private String email = null;

  @JsonProperty("firstName")
  private String firstName = null;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("lastName")
  private String lastName = null;

  @JsonProperty("phone")
  private String phone = null;

  public Contact email(String email) {
    this.email = email;
    return this;
  }

  /**
   * Email address of the contact
   * @return email
  **/
  @ApiModelProperty(example = "jane.jones@yahoo.com", value = "Email address of the contact")


  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * First name of the contact
   * @return firstName
  **/
  @ApiModelProperty(example = "Jane", value = "First name of the contact")


  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * ID of the contact
   * @return id
  **/
  @ApiModelProperty(example = "123", value = "ID of the contact")


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * Last name of the contact
   * @return lastName
  **/
  @ApiModelProperty(example = "Jones", value = "Last name of the contact")


  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }

  /**
   * Phone number of the contact
   * @return phone
  **/
  @ApiModelProperty(example = "111-222-3344", value = "Phone number of the contact")


  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.email, contact.email) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.id, contact.id) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.phone, contact.phone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, firstName, id, lastName, phone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
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

