<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class InlineObject4
{
    /**
     * True indicates that this driver should be reactivated.
     * @DTA\Data(field="reactivate")
     * @DTA\Validator(name="Type", options={"type":"bool"})
     * @var bool
     */
    public $reactivate;
}
