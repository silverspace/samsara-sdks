import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tag_metadata.dart';
import 'package:openapi/model/contact.dart';
import 'package:openapi/model/address_geofence.dart';
part 'address.jser.dart';

class Address {
  
  @Alias('contacts')
  final List<Contact> contacts;
   /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  @Alias('formattedAddress')
  final String formattedAddress;
  
  @Alias('geofence')
  final AddressGeofence geofence;
   /* ID of the address */
  @Alias('id')
  final int id;
   /* Name of the address or geofence */
  @Alias('name')
  final String name;
   /* Notes associated with an address. */
  @Alias('notes')
  final String notes;
  
  @Alias('tags')
  final List<TagMetadata> tags;
  

  Address(
      

{
     this.contacts = const [],  
     this.formattedAddress = null,  
     this.geofence = null,  
     this.id = null,  
     this.name = null,  
     this.notes = null,  
     this.tags = const [] 
    
    }
  );

  @override
  String toString() {
    return 'Address[contacts=$contacts, formattedAddress=$formattedAddress, geofence=$geofence, id=$id, name=$name, notes=$notes, tags=$tags, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddressSerializer extends Serializer<Address> with _$AddressSerializer {

}
