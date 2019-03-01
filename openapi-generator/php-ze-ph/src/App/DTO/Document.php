<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class Document
{
    /**
     * ID of the Samsara dispatch job for which the document is submitted
     * @DTA\Data(field="dispatchJobId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $dispatch_job_id;
    /**
     * Notes submitted with this document.
     * @DTA\Data(field="notes", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $notes;
    /**
     * Descriptive name of this type of document.
     * @DTA\Data(field="documentType")
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $document_type;
    /**
     * The time in Unix epoch milliseconds that the document is created.
     * @DTA\Data(field="driverCreatedAtMs")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_created_at_ms;
    /**
     * ID of the driver for whom the document is submitted
     * @DTA\Data(field="driverId")
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $driver_id;
    /**
     * The fields associated with this document.
     * @DTA\Data(field="fields")
     * TODO check validator and strategy are correct and can handle container item type
     * @DTA\Strategy(name="ObjectArray", options={"type":\App\DTO\DocumentField::class})
     * @DTA\Validator(name="Collection", options={"validators":{
     *     {"name":"Dictionary", "options":{"type":\App\DTO\DocumentField::class}}
     * }})
     * @var \App\DTO\DocumentField[]
     */
    public $fields;
    /**
     * VehicleID of the driver at document creation.
     * @DTA\Data(field="vehicleId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $vehicle_id;
}
