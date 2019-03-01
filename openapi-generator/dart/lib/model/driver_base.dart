part of openapi.api;

class DriverBase {
  /* Flag indicating this driver may use Adverse Weather exemptions in ELD logs. */
  bool eldAdverseWeatherExemptionEnabled = null;
  /* Flag indicating this driver may use Big Day excemptions in ELD logs. */
  bool eldBigDayExemptionEnabled = null;
  /* 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours. */
  int eldDayStartHour = null;
  /* Flag indicating this driver is exempt from the Electronic Logging Mandate. */
  bool eldExempt = null;
  /* Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt). */
  String eldExemptReason = null;
  /* Flag indicating this driver may select the Personal Conveyance duty status in ELD logs. */
  bool eldPcEnabled = false;
  /* Flag indicating this driver may select the Yard Move duty status in ELD logs. */
  bool eldYmEnabled = false;
  /* Dictionary of external IDs (string key-value pairs) */
  Map<String, String> externalIds = {};
  /* ID of the group if the organization has multiple groups (uncommon). */
  int groupId = null;
  /* Driver's state issued license number. */
  String licenseNumber = null;
  /* Abbreviation of state that issued driver's license. */
  String licenseState = null;
  /* Driver's name. */
  String name = null;
  /* Notes about the driver. */
  String notes = null;
  /* Driver's phone number. Please include only digits, ex. 4157771234 */
  String phone = null;
  /* Driver's login username into the driver app. */
  String username = null;
  /* ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon). */
  int vehicleId = null;
  DriverBase();

  @override
  String toString() {
    return 'DriverBase[eldAdverseWeatherExemptionEnabled=$eldAdverseWeatherExemptionEnabled, eldBigDayExemptionEnabled=$eldBigDayExemptionEnabled, eldDayStartHour=$eldDayStartHour, eldExempt=$eldExempt, eldExemptReason=$eldExemptReason, eldPcEnabled=$eldPcEnabled, eldYmEnabled=$eldYmEnabled, externalIds=$externalIds, groupId=$groupId, licenseNumber=$licenseNumber, licenseState=$licenseState, name=$name, notes=$notes, phone=$phone, username=$username, vehicleId=$vehicleId, ]';
  }

  DriverBase.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['eldAdverseWeatherExemptionEnabled'] == null) {
      eldAdverseWeatherExemptionEnabled = null;
    } else {
          eldAdverseWeatherExemptionEnabled = json['eldAdverseWeatherExemptionEnabled'];
    }
    if (json['eldBigDayExemptionEnabled'] == null) {
      eldBigDayExemptionEnabled = null;
    } else {
          eldBigDayExemptionEnabled = json['eldBigDayExemptionEnabled'];
    }
    if (json['eldDayStartHour'] == null) {
      eldDayStartHour = null;
    } else {
          eldDayStartHour = json['eldDayStartHour'];
    }
    if (json['eldExempt'] == null) {
      eldExempt = null;
    } else {
          eldExempt = json['eldExempt'];
    }
    if (json['eldExemptReason'] == null) {
      eldExemptReason = null;
    } else {
          eldExemptReason = json['eldExemptReason'];
    }
    if (json['eldPcEnabled'] == null) {
      eldPcEnabled = null;
    } else {
          eldPcEnabled = json['eldPcEnabled'];
    }
    if (json['eldYmEnabled'] == null) {
      eldYmEnabled = null;
    } else {
          eldYmEnabled = json['eldYmEnabled'];
    }
    if (json['externalIds'] == null) {
      externalIds = null;
    } else {
          externalIds = (json['externalIds'] as Map).cast<String, String>();
    }
    if (json['groupId'] == null) {
      groupId = null;
    } else {
          groupId = json['groupId'];
    }
    if (json['licenseNumber'] == null) {
      licenseNumber = null;
    } else {
          licenseNumber = json['licenseNumber'];
    }
    if (json['licenseState'] == null) {
      licenseState = null;
    } else {
          licenseState = json['licenseState'];
    }
    if (json['name'] == null) {
      name = null;
    } else {
          name = json['name'];
    }
    if (json['notes'] == null) {
      notes = null;
    } else {
          notes = json['notes'];
    }
    if (json['phone'] == null) {
      phone = null;
    } else {
          phone = json['phone'];
    }
    if (json['username'] == null) {
      username = null;
    } else {
          username = json['username'];
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'eldAdverseWeatherExemptionEnabled': eldAdverseWeatherExemptionEnabled,
      'eldBigDayExemptionEnabled': eldBigDayExemptionEnabled,
      'eldDayStartHour': eldDayStartHour,
      'eldExempt': eldExempt,
      'eldExemptReason': eldExemptReason,
      'eldPcEnabled': eldPcEnabled,
      'eldYmEnabled': eldYmEnabled,
      'externalIds': externalIds,
      'groupId': groupId,
      'licenseNumber': licenseNumber,
      'licenseState': licenseState,
      'name': name,
      'notes': notes,
      'phone': phone,
      'username': username,
      'vehicleId': vehicleId
    };
  }

  static List<DriverBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<DriverBase>() : json.map((value) => new DriverBase.fromJson(value)).toList();
  }

  static Map<String, DriverBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DriverBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DriverBase.fromJson(value));
    }
    return map;
  }
}

