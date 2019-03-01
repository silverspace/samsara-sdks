import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'driver_base.jser.dart';

class DriverBase {
   /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
  @Alias('eldAdverseWeatherExemptionEnabled')
  final bool eldAdverseWeatherExemptionEnabled;
   /* Flag indicating this driver may use Big Day excemptions in ELD logs. */
  @Alias('eldBigDayExemptionEnabled')
  final bool eldBigDayExemptionEnabled;
   /* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
  @Alias('eldDayStartHour')
  final int eldDayStartHour;
   /* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
  @Alias('eldExempt')
  final bool eldExempt;
   /* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
  @Alias('eldExemptReason')
  final String eldExemptReason;
   /* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
  @Alias('eldPcEnabled')
  final bool eldPcEnabled;
   /* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
  @Alias('eldYmEnabled')
  final bool eldYmEnabled;
   /* Dictionary of external IDs (string key-value pairs) */
  @Alias('externalIds')
  final Map<String, String> externalIds;
   /* ID of the group if the organization has multiple groups (uncommon). */
  @Alias('groupId')
  final int groupId;
   /* Driver's state issued license number. */
  @Alias('licenseNumber')
  final String licenseNumber;
   /* Abbreviation of state that issued driver's license. */
  @Alias('licenseState')
  final String licenseState;
   /* Driver's name. */
  @Alias('name')
  final String name;
   /* Notes about the driver. */
  @Alias('notes')
  final String notes;
   /* Driver's phone number. Please include only digits, ex. 4157771234 */
  @Alias('phone')
  final String phone;
   /* Driver's login username into the driver app. */
  @Alias('username')
  final String username;
   /* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
  @Alias('vehicleId')
  final int vehicleId;
  

  DriverBase(
      

{
     this.eldAdverseWeatherExemptionEnabled = null,  
     this.eldBigDayExemptionEnabled = null,  
     this.eldDayStartHour = null,  
     this.eldExempt = null,  
     this.eldExemptReason = null,  
     this.eldPcEnabled = false,  
     this.eldYmEnabled = false,  
     this.externalIds = const {},  
     this.groupId = null,  
     this.licenseNumber = null,  
     this.licenseState = null,  
    
     this.name = null,   this.notes = null,  
     this.phone = null,  
     this.username = null,  
     this.vehicleId = null 
    
    }
  );

  @override
  String toString() {
    return 'DriverBase[eldAdverseWeatherExemptionEnabled=$eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled=$eldBigDayExemptionEnabled, eldDayStartHour=$eldDayStartHour, eldExempt=$eldExempt, eldExemptReason=$eldExemptReason, eldPcEnabled=$eldPcEnabled, eldYmEnabled=$eldYmEnabled, externalIds=$externalIds, groupId=$groupId, licenseNumber=$licenseNumber, licenseState=$licenseState, name=$name, notes=$notes, phone=$phone, username=$username, vehicleId=$vehicleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class DriverBaseSerializer extends Serializer<DriverBase> with _$DriverBaseSerializer {

}
