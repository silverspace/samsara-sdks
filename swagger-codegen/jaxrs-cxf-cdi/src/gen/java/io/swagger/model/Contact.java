package io.swagger.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;

/**
 * Information about a notification contact for alerts.
 **/

import io.swagger.annotations.*;
import java.util.Objects;

import javax.xml.bind.annotation.*;

@ApiModel(description = "Information about a notification contact for alerts.")

public class Contact   {
  
  private String email = null;
  private String firstName = null;
  private Long id = null;
  private String lastName = null;
  private String phone = null;

  /**
   * Email address of the contact
   **/
  public Contact email(String email) {
    this.email = email;
    return this;
  }

  
  @ApiModelProperty(example = "jane.jones@yahoo.com", value = "Email address of the contact")
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }

  /**
   * First name of the contact
   **/
  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  
  @ApiModelProperty(example = "Jane", value = "First name of the contact")
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  /**
   * ID of the contact
   **/
  public Contact id(Long id) {
    this.id = id;
    return this;
  }

  
  @ApiModelProperty(example = "123", value = "ID of the contact")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Last name of the contact
   **/
  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  
  @ApiModelProperty(example = "Jones", value = "Last name of the contact")
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  /**
   * Phone number of the contact
   **/
  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }

  
  @ApiModelProperty(example = "111-222-3344", value = "Phone number of the contact")
  @JsonProperty("phone")
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
    return Objects.equals(email, contact.email) &&
        Objects.equals(firstName, contact.firstName) &&
        Objects.equals(id, contact.id) &&
        Objects.equals(lastName, contact.lastName) &&
        Objects.equals(phone, contact.phone);
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

