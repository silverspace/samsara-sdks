import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'hos_authentication_logs_response_authentication_logs.jser.dart';

class HosAuthenticationLogsResponseAuthenticationLogs {
   /* The log type - one of 'signin' or 'signout' */
  @Alias('actionType')
  final String actionType;
   /* Address at which the log was recorded, if applicable. */
  @Alias('address')
  final String address;
   /* City in which the log was recorded, if applicable. */
  @Alias('city')
  final String city;
   /* The time at which the event was recorded in UNIX milliseconds. */
  @Alias('happenedAtMs')
  final int happenedAtMs;
   /* Address name from the group address book at which the log was recorded, if applicable. */
  @Alias('addressName')
  final String addressName;
   /* State in which the log was recorded, if applicable. */
  @Alias('state')
  final String state;
  

  HosAuthenticationLogsResponseAuthenticationLogs(
      

{
     this.actionType = null,  
     this.address = null,  
     this.city = null,  
     this.happenedAtMs = null,  
     this.addressName = null,  
     this.state = null 
    
    }
  );

  @override
  String toString() {
    return 'HosAuthenticationLogsResponseAuthenticationLogs[actionType=$actionType, address=$address, city=$city, happenedAtMs=$happenedAtMs, addressName=$addressName, state=$state, ]';
  }
}

@GenSerializer(nullableFields: true)
class HosAuthenticationLogsResponseAuthenticationLogsSerializer extends Serializer<HosAuthenticationLogsResponseAuthenticationLogs> with _$HosAuthenticationLogsResponseAuthenticationLogsSerializer {

}
