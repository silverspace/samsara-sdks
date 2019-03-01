import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'inline_object16.jser.dart';

class InlineObject16 {
  
  @Alias('externalIds')
  final Map<String, String> externalIds;
   /* Harsh Event Detection Setting * 0: Passenger * 1: Light Truck * 2: Heavy * 3: Off * 4: Automatic */
  @Alias('harsh_accel_setting')
  final int harshAccelSetting;
   /* Name */
  @Alias('name')
  final String name;
  

  InlineObject16(
      

{
     this.externalIds = const {},  
     this.harshAccelSetting = null,  
     this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'InlineObject16[externalIds=$externalIds, harshAccelSetting=$harshAccelSetting, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class InlineObject16Serializer extends Serializer<InlineObject16> with _$InlineObject16Serializer {

}
