import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'dvir_base_next_driver_signature.jser.dart';

class DvirBaseNextDriverSignature {
   /* ID of the driver who signed the DVIR */
  @Alias('driverId')
  final int driverId;
   /* The name of the driver who signed the next DVIR on this vehicle. */
  @Alias('name')
  final String name;
   /* The time in millis when the next driver signed the DVIR on this vehicle. */
  @Alias('signedAt')
  final int signedAt;
   /* Type corresponds to driver. */
  @Alias('type')
  final String type;
   /* Email of the  driver who signed the next DVIR on this vehicle. */
  @Alias('email')
  final String email;
   /* Username of the  driver who signed the next DVIR on this vehicle. */
  @Alias('username')
  final String username;
  

  DvirBaseNextDriverSignature(
      

{
     this.driverId = null,  
     this.name = null,  
     this.signedAt = null,  
     this.type = null,  
     this.email = null,  
     this.username = null 
    
    }
  );

  @override
  String toString() {
    return 'DvirBaseNextDriverSignature[driverId=$driverId, name=$name, signedAt=$signedAt, type=$type, email=$email, username=$username, ]';
  }
}

@GenSerializer(nullableFields: true)
class DvirBaseNextDriverSignatureSerializer extends Serializer<DvirBaseNextDriverSignature> with _$DvirBaseNextDriverSignatureSerializer {

}
