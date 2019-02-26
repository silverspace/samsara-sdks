<?php
/*
 * SamsaraAPILib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */

namespace SamsaraAPILib\Models;

use JsonSerializable;

/**
 *Information about a notification contact for alerts.
 */
class Contact implements JsonSerializable
{
    /**
     * Email address of the contact
     * @var string|null $email public property
     */
    public $email;

    /**
     * First name of the contact
     * @var string|null $firstName public property
     */
    public $firstName;

    /**
     * ID of the contact
     * @var integer|null $id public property
     */
    public $id;

    /**
     * Last name of the contact
     * @var string|null $lastName public property
     */
    public $lastName;

    /**
     * Phone number of the contact
     * @var string|null $phone public property
     */
    public $phone;

    /**
     * Constructor to set initial or default values of member properties
     * @param string  $email     Initialization value for $this->email
     * @param string  $firstName Initialization value for $this->firstName
     * @param integer $id        Initialization value for $this->id
     * @param string  $lastName  Initialization value for $this->lastName
     * @param string  $phone     Initialization value for $this->phone
     */
    public function __construct()
    {
        if (5 == func_num_args()) {
            $this->email     = func_get_arg(0);
            $this->firstName = func_get_arg(1);
            $this->id        = func_get_arg(2);
            $this->lastName  = func_get_arg(3);
            $this->phone     = func_get_arg(4);
        }
    }


    /**
     * Encode this object to JSON
     */
    public function jsonSerialize()
    {
        $json = array();
        $json['email']     = $this->email;
        $json['firstName'] = $this->firstName;
        $json['id']        = $this->id;
        $json['lastName']  = $this->lastName;
        $json['phone']     = $this->phone;

        return $json;
    }
}