part of openapi.api;

class InlineObject12 {
  /* Only type 'mechanic' is currently accepted. */
  String inspectionType = null;
  //enum inspectionTypeEnum {  mechanic,  };{
  /* Any notes from the mechanic. */
  String mechanicNotes = null;
  /* The current odometer of the vehicle. */
  int odometerMiles = null;
  /* Whether any previous defects were corrected. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  bool previousDefectsCorrected = null;
  /* Whether any previous defects were ignored. If this vehicle or trailer was previously marked unsafe, and this DVIR marks it as safe, either previousDefectsCorrected or previousDefectsIgnored must be true. */
  bool previousDefectsIgnored = null;
  /* Whether or not this vehicle or trailer is safe to drive. */
  String safe = null;
  //enum safeEnum {  safe,  unsafe,  };{
  /* Id of trailer being inspected. Either vehicleId or trailerId must be provided. */
  int trailerId = null;
  /* The Samsara login email for the person creating the DVIR. The email must correspond to a Samsara user's email. */
  String userEmail = null;
  /* Id of vehicle being inspected. Either vehicleId or trailerId must be provided. */
  int vehicleId = null;
  InlineObject12();

  @override
  String toString() {
    return 'InlineObject12[inspectionType=$inspectionType, mechanicNotes=$mechanicNotes, odometerMiles=$odometerMiles, previousDefectsCorrected=$previousDefectsCorrected, previousDefectsIgnored=$previousDefectsIgnored, safe=$safe, trailerId=$trailerId, userEmail=$userEmail, vehicleId=$vehicleId, ]';
  }

  InlineObject12.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['inspectionType'] == null) {
      inspectionType = null;
    } else {
          inspectionType = json['inspectionType'];
    }
    if (json['mechanicNotes'] == null) {
      mechanicNotes = null;
    } else {
          mechanicNotes = json['mechanicNotes'];
    }
    if (json['odometerMiles'] == null) {
      odometerMiles = null;
    } else {
          odometerMiles = json['odometerMiles'];
    }
    if (json['previousDefectsCorrected'] == null) {
      previousDefectsCorrected = null;
    } else {
          previousDefectsCorrected = json['previousDefectsCorrected'];
    }
    if (json['previousDefectsIgnored'] == null) {
      previousDefectsIgnored = null;
    } else {
          previousDefectsIgnored = json['previousDefectsIgnored'];
    }
    if (json['safe'] == null) {
      safe = null;
    } else {
          safe = json['safe'];
    }
    if (json['trailerId'] == null) {
      trailerId = null;
    } else {
          trailerId = json['trailerId'];
    }
    if (json['userEmail'] == null) {
      userEmail = null;
    } else {
          userEmail = json['userEmail'];
    }
    if (json['vehicleId'] == null) {
      vehicleId = null;
    } else {
          vehicleId = json['vehicleId'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'inspectionType': inspectionType,
      'mechanicNotes': mechanicNotes,
      'odometerMiles': odometerMiles,
      'previousDefectsCorrected': previousDefectsCorrected,
      'previousDefectsIgnored': previousDefectsIgnored,
      'safe': safe,
      'trailerId': trailerId,
      'userEmail': userEmail,
      'vehicleId': vehicleId
    };
  }

  static List<InlineObject12> listFromJson(List<dynamic> json) {
    return json == null ? new List<InlineObject12>() : json.map((value) => new InlineObject12.fromJson(value)).toList();
  }

  static Map<String, InlineObject12> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, InlineObject12>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new InlineObject12.fromJson(value));
    }
    return map;
  }
}

