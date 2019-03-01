import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'machine.jser.dart';

class Machine {
   /* ID of the machine. */
  @Alias('id')
  final int id;
   /* Name of the machine. */
  @Alias('name')
  final String name;
   /* Notes about the machine */
  @Alias('notes')
  final String notes;
  

  Machine(
      

{
    
     this.id = null,   this.name = null,  
     this.notes = null 
    
    }
  );

  @override
  String toString() {
    return 'Machine[id=$id, name=$name, notes=$notes, ]';
  }
}

@GenSerializer(nullableFields: true)
class MachineSerializer extends Serializer<Machine> with _$MachineSerializer {

}
