<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class DocumentFieldCreatePhotoValue
{
    /**
     * Photo URL for a JPG image
     * @DTA\Data(field="url", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $url;
}
