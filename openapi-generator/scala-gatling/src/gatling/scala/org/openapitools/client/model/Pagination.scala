
package org.openapitools.client.model


case class Pagination (
    /* Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request's 'starting_after' query parameter. */
    _endCursor: String,
    /* True if there are more pages of results after this response. */
    _hasNextPage: Boolean,
    /* True if there are more pages of results before this response. */
    _hasPrevPage: Boolean,
    /* Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request's 'ending_before' query parameter. */
    _startCursor: String
)
object Pagination {
    def toStringBody(var_endCursor: Object, var_hasNextPage: Object, var_hasPrevPage: Object, var_startCursor: Object) =
        s"""
        | {
        | "endCursor":$var_endCursor,"hasNextPage":$var_hasNextPage,"hasPrevPage":$var_hasPrevPage,"startCursor":$var_startCursor
        | }
        """.stripMargin
}
