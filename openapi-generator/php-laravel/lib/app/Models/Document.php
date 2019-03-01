<?php
/**
 * Document
 */
namespace app\Models;

/**
 * Document
 */
class Document {

    /** @var int $dispatchJobId ID of the Samsara dispatch job for which the document is submitted*/
    private $dispatchJobId;

    /** @var string $notes Notes submitted with this document.*/
    private $notes;

    /** @var string $documentType Descriptive name of this type of document.*/
    private $documentType;

    /** @var int $driverCreatedAtMs The time in Unix epoch milliseconds that the document is created.*/
    private $driverCreatedAtMs;

    /** @var int $driverId ID of the driver for whom the document is submitted*/
    private $driverId;

    /** @var \app\Models\DocumentField[] $fields The fields associated with this document.*/
    private $fields;

    /** @var int $vehicleId VehicleID of the driver at document creation.*/
    private $vehicleId;

}
