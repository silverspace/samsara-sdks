part of openapi.api;

class DvirBase {
  
  DvirBaseAuthorSignature authorSignature = null;
  /* Signifies if the defects on the vehicle corrected after the DVIR is done. */
  bool defectsCorrected = null;
  /* Signifies if the defects on this vehicle can be ignored. */
  bool defectsNeedNotBeCorrected = null;
  /* The id of this DVIR record. */
  int id = null;
  /* Inspection type of the DVIR. */
  String inspectionType = null;
  /* The mechanics notes on the DVIR. */
  String mechanicNotes = null;
  
  DvirBaseMechanicOrAgentSignature mechanicOrAgentSignature = null;
  
  DvirBaseNextDriverSignature nextDriverSignature = null;
  /* The odometer reading in miles for the vehicle when the DVIR was done. */
  int odometerMiles = null;
  /* Timestamp of this DVIR in UNIX milliseconds. */
  int timeMs = null;
  /* Defects registered for the trailer which was part of the DVIR. */
  List<DvirBaseTrailerDefects> trailerDefects = [];
  /* The id of the trailer which was part of the DVIR. */
  int trailerId = null;
  /* The name of the trailer which was part of the DVIR. */
  String trailerName = null;
  
  DvirBaseVehicle vehicle = null;
  /* The condition of vechile on which DVIR was done. */
  String vehicleCondition = null;
  /* Defects registered for the vehicle which was part of the DVIR. */
  List<DvirBaseTrailerDefects> vehicleDefects = [];
  DvirBase();

  @override
  String toString() {
    return 'DvirBase[authorSignature=$authorSignature, defectsCorrected=$defectsCorrected, defectsNeedNotBeCorrected=$defectsNeedNotBeCorrected, id=$id, inspectionType=$inspectionType, mechanicNotes=$mechanicNotes, mechanicOrAgentSignature=$mechanicOrAgentSignature, nextDriverSignature=$nextDriverSignature, odometerMiles=$odometerMiles, timeMs=$timeMs, trailerDefects=$trailerDefects, trailerId=$trailerId, trailerName=$trailerName, vehicle=$vehicle, vehicleCondition=$vehicleCondition, vehicleDefects=$vehicleDefects, ]';
  }

  DvirBase.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['authorSignature'] == null) {
      authorSignature = null;
    } else {
      authorSignature = new DvirBaseAuthorSignature.fromJson(json['authorSignature']);
    }
    if (json['defectsCorrected'] == null) {
      defectsCorrected = null;
    } else {
          defectsCorrected = json['defectsCorrected'];
    }
    if (json['defectsNeedNotBeCorrected'] == null) {
      defectsNeedNotBeCorrected = null;
    } else {
          defectsNeedNotBeCorrected = json['defectsNeedNotBeCorrected'];
    }
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
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
    if (json['mechanicOrAgentSignature'] == null) {
      mechanicOrAgentSignature = null;
    } else {
      mechanicOrAgentSignature = new DvirBaseMechanicOrAgentSignature.fromJson(json['mechanicOrAgentSignature']);
    }
    if (json['nextDriverSignature'] == null) {
      nextDriverSignature = null;
    } else {
      nextDriverSignature = new DvirBaseNextDriverSignature.fromJson(json['nextDriverSignature']);
    }
    if (json['odometerMiles'] == null) {
      odometerMiles = null;
    } else {
          odometerMiles = json['odometerMiles'];
    }
    if (json['timeMs'] == null) {
      timeMs = null;
    } else {
          timeMs = json['timeMs'];
    }
    if (json['trailerDefects'] == null) {
      trailerDefects = null;
    } else {
      trailerDefects = DvirBaseTrailerDefects.listFromJson(json['trailerDefects']);
    }
    if (json['trailerId'] == null) {
      trailerId = null;
    } else {
          trailerId = json['trailerId'];
    }
    if (json['trailerName'] == null) {
      trailerName = null;
    } else {
          trailerName = json['trailerName'];
    }
    if (json['vehicle'] == null) {
      vehicle = null;
    } else {
      vehicle = new DvirBaseVehicle.fromJson(json['vehicle']);
    }
    if (json['vehicleCondition'] == null) {
      vehicleCondition = null;
    } else {
          vehicleCondition = json['vehicleCondition'];
    }
    if (json['vehicleDefects'] == null) {
      vehicleDefects = null;
    } else {
      vehicleDefects = DvirBaseTrailerDefects.listFromJson(json['vehicleDefects']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'authorSignature': authorSignature,
      'defectsCorrected': defectsCorrected,
      'defectsNeedNotBeCorrected': defectsNeedNotBeCorrected,
      'id': id,
      'inspectionType': inspectionType,
      'mechanicNotes': mechanicNotes,
      'mechanicOrAgentSignature': mechanicOrAgentSignature,
      'nextDriverSignature': nextDriverSignature,
      'odometerMiles': odometerMiles,
      'timeMs': timeMs,
      'trailerDefects': trailerDefects,
      'trailerId': trailerId,
      'trailerName': trailerName,
      'vehicle': vehicle,
      'vehicleCondition': vehicleCondition,
      'vehicleDefects': vehicleDefects
    };
  }

  static List<DvirBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<DvirBase>() : json.map((value) => new DvirBase.fromJson(value)).toList();
  }

  static Map<String, DvirBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DvirBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DvirBase.fromJson(value));
    }
    return map;
  }
}

