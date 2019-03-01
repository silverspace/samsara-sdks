<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class MachineHistoryResponseVibrations
{
    /**
     * @DTA\Data(field="X", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $x;
    /**
     * @DTA\Data(field="Y", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $y;
    /**
     * @DTA\Data(field="Z", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"float"})
     * @var float
     */
    public $z;
    /**
     * @DTA\Data(field="time", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $time;
}
