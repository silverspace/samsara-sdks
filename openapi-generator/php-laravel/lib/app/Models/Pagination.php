<?php
/**
 * Pagination
 */
namespace app\Models;

/**
 * Pagination
 */
class Pagination {

    /** @var string $endCursor Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.*/
    private $endCursor;

    /** @var bool $hasNextPage True if there are more pages of results after this response.*/
    private $hasNextPage;

    /** @var bool $hasPrevPage True if there are more pages of results before this response.*/
    private $hasPrevPage;

    /** @var string $startCursor Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.*/
    private $startCursor;

}
