import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'contact.jser.dart';

class Contact {
   /* Email address of the contact */
  @Alias('email')
  final String email;
   /* First name of the contact */
  @Alias('firstName')
  final String firstName;
   /* ID of the contact */
  @Alias('id')
  final int id;
   /* Last name of the contact */
  @Alias('lastName')
  final String lastName;
   /* Phone number of the contact */
  @Alias('phone')
  final String phone;
  

  Contact(
      

{
     this.email = null,  
     this.firstName = null,  
     this.id = null,  
     this.lastName = null,  
     this.phone = null 
    
    }
  );

  @override
  String toString() {
    return 'Contact[email=$email, firstName=$firstName, id=$id, lastName=$lastName, phone=$phone, ]';
  }
}

@GenSerializer(nullableFields: true)
class ContactSerializer extends Serializer<Contact> with _$ContactSerializer {

}
