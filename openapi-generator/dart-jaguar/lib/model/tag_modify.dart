import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/tag_modify_add.dart';
import 'package:openapi/model/tag_modify_delete.dart';
part 'tag_modify.jser.dart';

class TagModify {
  
  @Alias('add')
  final TagModifyAdd add;
  
  @Alias('delete')
  final TagModifyDelete delete;
   /* Updated name of this tag. */
  @Alias('name')
  final String name;
   /* If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag's parent tag. */
  @Alias('parentTagId')
  final int parentTagId;
  

  TagModify(
      

{
     this.add = null,  
     this.delete = null,  
     this.name = null,  
     this.parentTagId = null 
    
    }
  );

  @override
  String toString() {
    return 'TagModify[add=$add, delete=$delete, name=$name, parentTagId=$parentTagId, ]';
  }
}

@GenSerializer(nullableFields: true)
class TagModifySerializer extends Serializer<TagModify> with _$TagModifySerializer {

}
