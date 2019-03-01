part of openapi.api;

class DocumentFieldCreatePhotoValue {
  /* Photo URL for a JPG image */
  String url = null;
  DocumentFieldCreatePhotoValue();

  @override
  String toString() {
    return 'DocumentFieldCreatePhotoValue[url=$url, ]';
  }

  DocumentFieldCreatePhotoValue.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['url'] == null) {
      url = null;
    } else {
          url = json['url'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'url': url
    };
  }

  static List<DocumentFieldCreatePhotoValue> listFromJson(List<dynamic> json) {
    return json == null ? new List<DocumentFieldCreatePhotoValue>() : json.map((value) => new DocumentFieldCreatePhotoValue.fromJson(value)).toList();
  }

  static Map<String, DocumentFieldCreatePhotoValue> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, DocumentFieldCreatePhotoValue>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new DocumentFieldCreatePhotoValue.fromJson(value));
    }
    return map;
  }
}

