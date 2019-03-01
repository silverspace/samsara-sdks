part of openapi.api;

class DvirListResponse {
  
  List<DvirBase> dvirs = [];
  DvirListResponse();

  @override
  String toString() {
    return 'DvirListResponse[dvirs=$dvirs, ]';
  }

  DvirListResponse.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['dvirs'] == null) {
      dvirs = null;
    } else {
      dvirs = DvirBase.listFromJson(json['dvirs']);
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'dvirs': dvirs
    };
  }

  static List<DvirListResponse> listFromJson(List<dynamic> json) {
    return json == null ? new List<DvirListResponse>() : json.map((value) => new DvirListResponse.fromJson(value)).toList();
  }

  static Map<String, DvirListResponse> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DvirListResponse>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DvirListResponse.fromJson(value));
    }
    return map;
  }
}

