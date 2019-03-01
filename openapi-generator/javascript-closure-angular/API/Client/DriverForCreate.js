goog.provide('API.Client.DriverForCreate');

/**
 * @record
 */
API.Client.DriverForCreate = function() {}

/**
 * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverForCreate.prototype.eldAdverseWeatherExemptionEnabled;

/**
 * Flag indicating this driver may use Big Day excemptions in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverForCreate.prototype.eldBigDayExemptionEnabled;

/**
 * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
 * @type {!number}
 * @export
 */
API.Client.DriverForCreate.prototype.eldDayStartHour;

/**
 * Flag indicating this driver is exempt from the Electronic Logging Mandate.
 * @type {!boolean}
 * @export
 */
API.Client.DriverForCreate.prototype.eldExempt;

/**
 * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.eldExemptReason;

/**
 * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverForCreate.prototype.eldPcEnabled;

/**
 * Flag indicating this driver may select the Yard Move duty status in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverForCreate.prototype.eldYmEnabled;

/**
 * Dictionary of external IDs (string key-value pairs)
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.DriverForCreate.prototype.externalIds;

/**
 * ID of the group if the organization has multiple groups (uncommon).
 * @type {!number}
 * @export
 */
API.Client.DriverForCreate.prototype.groupId;

/**
 * Driver's state issued license number.
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.licenseNumber;

/**
 * Abbreviation of state that issued driver's license.
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.licenseState;

/**
 * Driver's name.
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.name;

/**
 * Notes about the driver.
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.notes;

/**
 * Driver's phone number. Please include only digits, ex. 4157771234
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.phone;

/**
 * Driver's login username into the driver app.
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.username;

/**
 * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
 * @type {!number}
 * @export
 */
API.Client.DriverForCreate.prototype.vehicleId;

/**
 * Driver's password for the driver app.
 * @type {!string}
 * @export
 */
API.Client.DriverForCreate.prototype.password;

/**
 * A list of tag IDs.
 * @type {!Array<!number>}
 * @export
 */
API.Client.DriverForCreate.prototype.tagIds;

