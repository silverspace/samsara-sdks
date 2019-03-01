import 'package:jaguar_serializer/jaguar_serializer.dart';

part 'pagination.jser.dart';

class Pagination {
   /* Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter. */
  @Alias('endCursor')
  final String endCursor;
   /* True if there are more pages of results after this response. */
  @Alias('hasNextPage')
  final bool hasNextPage;
   /* True if there are more pages of results before this response. */
  @Alias('hasPrevPage')
  final bool hasPrevPage;
   /* Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter. */
  @Alias('startCursor')
  final String startCursor;
  

  Pagination(
      

{
    
     this.endCursor = null,  
     this.hasNextPage = null,  
     this.hasPrevPage = null,  
     this.startCursor = null 
    }
  );

  @override
  String toString() {
    return 'Pagination[endCursor=$endCursor, hasNextPage=$hasNextPage, hasPrevPage=$hasPrevPage, startCursor=$startCursor, ]';
  }
}

@GenSerializer(nullableFields: true)
class PaginationSerializer extends Serializer<Pagination> with _$PaginationSerializer {

}
