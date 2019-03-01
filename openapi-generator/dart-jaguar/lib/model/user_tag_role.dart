import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/user_tag_role_tag.dart';
part 'user_tag_role.jser.dart';

class UserTagRole {
   /* The name of the role the user has been granted on this tag. */
  @Alias('role')
  final String role;
   /* The id of the role the user has been granted on this tag. */
  @Alias('roleId')
  final String roleId;
  
  @Alias('tag')
  final UserTagRoleTag tag;
  

  UserTagRole(
      

{
     this.role = null,  
    
     this.roleId = null,  
     this.tag = null 
    }
  );

  @override
  String toString() {
    return 'UserTagRole[role=$role, roleId=$roleId, tag=$tag, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserTagRoleSerializer extends Serializer<UserTagRole> with _$UserTagRoleSerializer {

}
