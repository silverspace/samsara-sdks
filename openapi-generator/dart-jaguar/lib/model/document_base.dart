import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'document_base.jser.dart';

class DocumentBase {
   /* ID of the Samsara dispatch job for which the document is submitted */
  @Alias('dispatchJobId')
  final int dispatchJobId;
   /* Notes submitted with this document. */
  @Alias('notes')
  final String notes;
  

  DocumentBase(
      

{
     this.dispatchJobId = null,  
     this.notes = null 
    
    }
  );

  @override
  String toString() {
    return 'DocumentBase[dispatchJobId=$dispatchJobId, notes=$notes, ]';
  }
}

@GenSerializer(nullableFields: true)
class DocumentBaseSerializer extends Serializer<DocumentBase> with _$DocumentBaseSerializer {

}
