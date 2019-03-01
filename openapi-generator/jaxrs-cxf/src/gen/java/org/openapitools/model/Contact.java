package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Information about a notification contact for alerts.
 **/
@ApiModel(description="Information about a notification contact for alerts.")
public class Contact  {
  
  @ApiModelProperty(example = "jane.jones@yahoo.com", value = "Email address of the contact")
 /**
   * Email address of the contact
  **/
  private String email;

  @ApiModelProperty(example = "Jane", value = "First name of the contact")
 /**
   * First name of the contact
  **/
  private String firstName;

  @ApiModelProperty(example = "123", value = "ID of the contact")
 /**
   * ID of the contact
  **/
  private Long id;

  @ApiModelProperty(example = "Jones", value = "Last name of the contact")
 /**
   * Last name of the contact
  **/
  private String lastName;

  @ApiModelProperty(example = "111-222-3344", value = "Phone number of the contact")
 /**
   * Phone number of the contact
  **/
  private String phone;
 /**
   * Email address of the contact
   * @return email
  **/
  @JsonProperty("email")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

 /**
   * First name of the contact
   * @return firstName
  **/
  @JsonProperty("firstName")
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

 /**
   * ID of the contact
   * @return id
  **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Contact id(Long id) {
    this.id = id;
    return this;
  }

 /**
   * Last name of the contact
   * @return lastName
  **/
  @JsonProperty("lastName")
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

 /**
   * Phone number of the contact
   * @return phone
  **/
  @JsonProperty("phone")
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Contact phone(String phone) {
    this.phone = phone;
    return this;
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
  private static String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

