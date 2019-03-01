import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'dvir_base_author_signature.jser.dart';

class DvirBaseAuthorSignature {
   /* ID of the mechanic who signed the DVIR. Will not be returned if driverId is returned. */
  @Alias('mechanicUserId')
  final int mechanicUserId;
   /* ID of the driver who signed the DVIR. Will not be returned if mechanicUserId is returned. */
  @Alias('driverId')
  final int driverId;
   /* The name of the driver or mechanic who signed the DVIR. */
  @Alias('name')
  final String name;
   /* The time in millis when the DVIR was signed */
  @Alias('signedAt')
  final int signedAt;
   /* Type corresponds to whether the signature corresponds to driver|mechanic. */
  @Alias('type')
  final String type;
   /* Email of the  driver|mechanic who signed the DVIR. */
  @Alias('email')
  final String email;
   /* Username of the  driver|mechanic who signed the DVIR. */
  @Alias('username')
  final String username;
  

  DvirBaseAuthorSignature(
      

{
     this.mechanicUserId = null,  
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
    return 'DvirBaseAuthorSignature[mechanicUserId=$mechanicUserId, driverId=$driverId, name=$name, signedAt=$signedAt, type=$type, email=$email, username=$username, ]';
  }
}

@GenSerializer(nullableFields: true)
class DvirBaseAuthorSignatureSerializer extends Serializer<DvirBaseAuthorSignature> with _$DvirBaseAuthorSignatureSerializer {

}
