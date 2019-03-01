import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/address_geofence.dart';
part 'inline_object1.jser.dart';

class InlineObject1 {
   /* A list of IDs for contact book entries. */
  @Alias('contactIds')
  final List<int> contactIds;
   /* The full address associated with this address/geofence, as it might be recognized by maps.google.com */
  @Alias('formattedAddress')
  final String formattedAddress;
  
  @Alias('geofence')
  final AddressGeofence geofence;
   /* The name of this address/geofence */
  @Alias('name')
  final String name;
   /* Notes associated with an address. */
  @Alias('notes')
  final String notes;
   /* A list of tag IDs. */
  @Alias('tagIds')
  final List<int> tagIds;
  

  InlineObject1(
      

{
     this.contactIds = const [],  
     this.formattedAddress = null,  
     this.geofence = null,  
     this.name = null,  
     this.notes = null,  
     this.tagIds = const [] 
    
    }
  );

  @override
  String toString() {
    return 'InlineObject1[contactIds=$contactIds, formattedAddress=$formattedAddress, geofence=$geofence, name=$name, notes=$notes, tagIds=$tagIds, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject1Serializer extends Serializer<InlineObject1> with _$InlineObject1Serializer {

}
