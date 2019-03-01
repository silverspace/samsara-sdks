<?php
declare(strict_types=1);

namespace App\DTO;

use Articus\DataTransfer\Annotation as DTA;

/**
 */
class TagModify
{
    /**
     * @DTA\Data(field="add", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TagModifyAdd::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\TagModifyAdd::class})
     * @var \App\DTO\TagModifyAdd
     */
    public $add;
    /**
     * @DTA\Data(field="delete", nullable=true)
     * @DTA\Strategy(name="Object", options={"type":\App\DTO\TagModifyDelete::class})
     * @DTA\Validator(name="Dictionary", options={"type":\App\DTO\TagModifyDelete::class})
     * @var \App\DTO\TagModifyDelete
     */
    public $delete;
    /**
     * Updated name of this tag.
     * @DTA\Data(field="name", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"string"})
     * @var string
     */
    public $name;
    /**
     * If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.
     * @DTA\Data(field="parentTagId", nullable=true)
     * @DTA\Validator(name="Type", options={"type":"int"})
     * @var int
     */
    public $parent_tag_id;
}
