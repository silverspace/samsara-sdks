import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'user_role.jser.dart';

class UserRole {
  
  @Alias('id')
  final String id;
  
  @Alias('name')
  final String name;
  

  UserRole(
      

{
     this.id = null,  
     this.name = null 
    
    }
  );

  @override
  String toString() {
    return 'UserRole[id=$id, name=$name, ]';
  }
}

@GenSerializer(nullableFields: true)
class UserRoleSerializer extends Serializer<UserRole> with _$UserRoleSerializer {

}
