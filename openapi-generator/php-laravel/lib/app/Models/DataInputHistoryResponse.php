<?php
/**
 * DataInputHistoryResponse
 */
namespace app\Models;

/**
 * DataInputHistoryResponse
 */
class DataInputHistoryResponse {

    /** @var int $id The ID of this data input*/
    private $id;

    /** @var string $name Name of this data input*/
    private $name;

    /** @var \app\Models\DataInputHistoryResponsePoints[] $points Data points from this data input*/
    private $points;

}
