<?php
/**
 * DispatchRouteHistoricalEntry
 */
namespace app\Models;

/**
 * DispatchRouteHistoricalEntry
 */
class DispatchRouteHistoricalEntry {

    /** @var int $changedAtMs Timestamp that the route was updated, represented as Unix milliseconds since epoch.*/
    private $changedAtMs;

    /** @var \app\Models\DispatchRoute $route */
    private $route;

}
