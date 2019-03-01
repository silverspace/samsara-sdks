import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object2.jser.dart';

class InlineObject2 {
   /* The address of the entry to add, as it would be recognized if provided to maps.google.com. */
  @Alias('address')
  final String address;
   /* Group ID to query. */
  @Alias('groupId')
  final int groupId;
   /* Name of the location to add to the address book. */
  @Alias('name')
  final String name;
   /* Radius in meters of the address (used for matching vehicle trip stops to this location). */
  @Alias('radius')
  final int radius;
  

  InlineObject2(
      

{
    
     this.address = null,  
     this.groupId = null,  
     this.name = null,  
     this.radius = null 
    }
  );

  @override
  String toString() {
    return 'InlineObject2[address=$address, groupId=$groupId, name=$name, radius=$radius, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject2Serializer extends Serializer<InlineObject2> with _$InlineObject2Serializer {

}
