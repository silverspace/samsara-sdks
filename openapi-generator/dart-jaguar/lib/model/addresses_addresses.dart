import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/address_geofence.dart';
part 'addresses_addresses.jser.dart';

class AddressesAddresses {
   /* Notes associated with an address. */
  @Alias('notes')
  final String notes;
   /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  @Alias('formattedAddress')
  final String formattedAddress;
  
  @Alias('geofence')
  final AddressGeofence geofence;
   /* A list of tag IDs. */
  @Alias('tagIds')
  final List<int> tagIds;
   /* The name of this address/geofence */
  @Alias('name')
  final String name;
   /* A list of IDs for contact book entries. */
  @Alias('contactIds')
  final List<int> contactIds;
  

  AddressesAddresses(
      

{
     this.notes = null,  
    
     this.formattedAddress = null,  
     this.geofence = null,   this.tagIds = const [],  
    
     this.name = null,   this.contactIds = const [] 
    
    }
  );

  @override
  String toString() {
    return 'AddressesAddresses[notes=$notes, formattedAddress=$formattedAddress, geofence=$geofence, tagIds=$tagIds, name=$name, contactIds=$contactIds, ]';
  }
}

@GenSerializer(nullableFields: true)
class AddressesAddressesSerializer extends Serializer<AddressesAddresses> with _$AddressesAddressesSerializer {

}
