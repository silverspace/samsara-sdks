import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'user_base.jser.dart';

class UserBase {
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
  

  UserBase(
      

{
    
     this.authType = null,  
     this.email = null,   this.name = null,  
     this.organizationRoleId = null 
    
    }
  );

  @override
  String toString() {
    return 'UserBase[authType=$authType, email=$email, name=$name, organizationRoleId=$organizationRoleId, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserBaseSerializer extends Serializer<UserBase> with _$UserBaseSerializer {

}
