import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/addresses_addresses.dart';
part 'inline_object.jser.dart';

class InlineObject {
  
  @Alias('addresses')
  final List<AddressesAddresses> addresses;
  

  InlineObject(
      

{
    
     this.addresses = const [] 
    }
  );

  @override
  String toString() {
    return 'InlineObject[addresses=$addresses, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObjectSerializer extends Serializer<InlineObject> with _$InlineObjectSerializer {

}
