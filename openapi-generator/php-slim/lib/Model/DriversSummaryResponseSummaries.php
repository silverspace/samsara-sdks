<?php
/**
 * DriversSummaryResponseSummaries
 *
 * PHP version 7
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */

/**
 * NOTE: This class is auto generated by the openapi generator program.
 * https://github.com/openapitools/openapi-generator
 */
namespace OpenAPIServer\Model;

/**
 * DriversSummaryResponseSummaries
 *
 * @package OpenAPIServer\Model
 * @author  OpenAPI Generator team
 * @link    https://github.com/openapitools/openapi-generator
 */
class DriversSummaryResponseSummaries
{
    
    /** @var int $driverId ID of the driver.*/
    private $driverId;
    
    /** @var double $distanceMiles Distance driven in miles, rounded to two decimal places.*/
    private $distanceMiles;
    
    /** @var int $driveMs Duration in milliseconds that driver was driving during the requested time range*/
    private $driveMs;
    
    /** @var int $activeMs Duration in milliseconds that driver was on duty or driving during the requested time range*/
    private $activeMs;
    
    /** @var string $driverUsername Username of the driver.*/
    private $driverUsername;
    
    /** @var int $groupId Group of the driver.*/
    private $groupId;
    
    /** @var string $driverName Name of the driver.*/
    private $driverName;
    
    /** @var int $onDutyMs Duration in milliseconds that driver was on duty during the requested time range*/
    private $onDutyMs;
}
