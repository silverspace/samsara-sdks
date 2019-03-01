import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'current_driver.jser.dart';

class CurrentDriver {
  

  CurrentDriver(
      


  );

  @override
  String toString() {
    return 'CurrentDriver[]';
  }
}

@GenSerializer(nullableFields: true)
class CurrentDriverSerializer extends Serializer<CurrentDriver> with _$CurrentDriverSerializer {

}
