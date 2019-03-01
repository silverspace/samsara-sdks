<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Pagination
{
    /**
     * Cursor identifier representing the last element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;starting_after&#39; query parameter.
     * @DTA\Data(field="endCursor")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $end_cursor;
    /**
     * True if there are more pages of results after this response.
     * @DTA\Data(field="hasNextPage")
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $has_next_page;
    /**
     * True if there are more pages of results before this response.
     * @DTA\Data(field="hasPrevPage")
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $has_prev_page;
    /**
     * Cursor identifier representing the first element in the response. This value should be used in conjunction with a subsequent request&#39;s &#39;ending_before&#39; query parameter.
     * @DTA\Data(field="startCursor")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $start_cursor;
}
