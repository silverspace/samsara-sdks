import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'user_tag_role_tag.jser.dart';

class UserTagRoleTag {
   /* The ID of this tag. */
  @Alias('parentTagId')
  final int parentTagId;
   /* Name of this tag. */
  @Alias('name')
  final String name;
   /* The ID of this tag. */
  @Alias('id')
  final int id;
  

  UserTagRoleTag(
      

{
     this.parentTagId = null,  
    
     this.name = null,  
     this.id = null 
    }
  );

  @override
  String toString() {
    return 'UserTagRoleTag[parentTagId=$parentTagId, name=$name, id=$id, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserTagRoleTagSerializer extends Serializer<UserTagRoleTag> with _$UserTagRoleTagSerializer {

}
