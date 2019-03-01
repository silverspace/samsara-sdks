package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * Information about a notification contact for alerts.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2019-03-01T05:34:42.270Z[GMT]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class Contact   {
  @JsonProperty("email")
  private String email;

  @JsonProperty("firstName")
  private String firstName;

  @JsonProperty("id")
  private Long id;

  @JsonProperty("lastName")
  private String lastName;

  @JsonProperty("phone")
  private String phone;

  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address of the contact
   * @return email
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

