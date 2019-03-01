import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'dvir_base_trailer_defects.jser.dart';

class DvirBaseTrailerDefects {
   /* The comment describing the type of DVIR defect */
  @Alias('comment')
  final String comment;
   /* The type of DVIR defect */
  @Alias('defectType')
  final String defectType;
  

  DvirBaseTrailerDefects(
      

{
     this.comment = null,  
     this.defectType = null 
    
    }
  );

  @override
  String toString() {
    return 'DvirBaseTrailerDefects[comment=$comment, defectType=$defectType, ]';
  }
}

@GenSerializer(nullableFields: true)
class DvirBaseTrailerDefectsSerializer extends Serializer<DvirBaseTrailerDefects> with _$DvirBaseTrailerDefectsSerializer {

}
