part of openapi.api;

class TaggedAssetBase {
  /* The ID of the Asset being tagged. */
  int id = null;
  TaggedAssetBase();

  @override
  String toString() {
    return 'TaggedAssetBase[id=$id, ]';
  }

  TaggedAssetBase.fromJson(Map<String, dynamic> json) {
    if (json == null) return;
    if (json['id'] == null) {
      id = null;
    } else {
          id = json['id'];
    }
  }

  Map<String, dynamic> toJson() {
    return {
      'id': id
    };
  }

  static List<TaggedAssetBase> listFromJson(List<dynamic> json) {
    return json == null ? new List<TaggedAssetBase>() : json.map((value) => new TaggedAssetBase.fromJson(value)).toList();
  }

  static Map<String, TaggedAssetBase> mapFromJson(Map<String, dynamic> json) {
    var map = new Map<String, TaggedAssetBase>();
    if (json != null && json.length > 0) {
      json.forEach((String key, dynamic value) => map[key] = new TaggedAssetBase.fromJson(value));
    }
    return map;
  }
}

