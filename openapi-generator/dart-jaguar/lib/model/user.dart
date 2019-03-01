import 'package:jaguar_serializer/jaguar_serializer.dart';

import 'package:openapi/model/user_base.dart';
import 'package:openapi/model/user_tag_role.dart';
part 'user.jser.dart';

class User {
   /* The authentication type the user uses to authenticate. To use SAML this organization must have a configured SAML integration. */
  @Alias('authType')
  final String authType;
  //enum authTypeEnum {  default,  saml,  }; /* The email address of this user. */
  @Alias('email')
  final String email;
   /* The first and last name of the user. */
  @Alias('name')
  final String name;
   /* The id of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
  @Alias('organizationRoleId')
  final String organizationRoleId;
   /* The ID of the User record. */
  @Alias('id')
  final int id;
   /* The name of the role the user is assigned to at the organization level. This will be blank for users that only have access to specific tags. */
  @Alias('organizationRole')
  final String organizationRole;
   /* The specific tags this user has access to. This will be blank for users that have full access to the organization. */
  @Alias('tagRoles')
  final List<UserTagRole> tagRoles;
  

  User(
      

{
    
     this.authType = null,  
     this.email = null,   this.name = null,  
     this.organizationRoleId = null,  
     this.id = null,  
     this.organizationRole = null,  
     this.tagRoles = const [] 
    
    }
  );

  @override
  String toString() {
    return 'User[authType=$authType, email=$email, name=$name, organizationRoleId=$organizationRoleId, id=$id, organizationRole=$organizationRole, tagRoles=$tagRoles, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserSerializer extends Serializer<User> with _$UserSerializer {

}
