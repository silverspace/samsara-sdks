<?php
/**
 * TagModify
 */
namespace app\Models;

/**
 * TagModify
 */
class TagModify {

    /** @var \app\Models\TagModifyAdd $add */
    private $add;

    /** @var \app\Models\TagModifyDelete $delete */
    private $delete;

    /** @var string $name Updated name of this tag.*/
    private $name;

    /** @var int $parentTagId If this tag is part a hierarchical tag tree as a child tag, the parentTagId is the ID of this tag&#39;s parent tag.*/
    private $parentTagId;

}
