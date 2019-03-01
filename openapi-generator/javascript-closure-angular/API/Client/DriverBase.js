goog.provide('API.Client.DriverBase');

/**
 * @record
 */
API.Client.DriverBase = function() {}

/**
 * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverBase.prototype.eldAdverseWeatherExemptionEnabled;

/**
 * Flag indicating this driver may use Big Day excemptions in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverBase.prototype.eldBigDayExemptionEnabled;

/**
 * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
 * @type {!number}
 * @export
 */
API.Client.DriverBase.prototype.eldDayStartHour;

/**
 * Flag indicating this driver is exempt from the Electronic Logging Mandate.
 * @type {!boolean}
 * @export
 */
API.Client.DriverBase.prototype.eldExempt;

/**
 * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.eldExemptReason;

/**
 * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverBase.prototype.eldPcEnabled;

/**
 * Flag indicating this driver may select the Yard Move duty status in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.DriverBase.prototype.eldYmEnabled;

/**
 * Dictionary of external IDs (string key-value pairs)
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.DriverBase.prototype.externalIds;

/**
 * ID of the group if the organization has multiple groups (uncommon).
 * @type {!number}
 * @export
 */
API.Client.DriverBase.prototype.groupId;

/**
 * Driver's state issued license number.
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.licenseNumber;

/**
 * Abbreviation of state that issued driver's license.
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.licenseState;

/**
 * Driver's name.
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.name;

/**
 * Notes about the driver.
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.notes;

/**
 * Driver's phone number. Please include only digits, ex. 4157771234
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.phone;

/**
 * Driver's login username into the driver app.
 * @type {!string}
 * @export
 */
API.Client.DriverBase.prototype.username;

/**
 * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
 * @type {!number}
 * @export
 */
API.Client.DriverBase.prototype.vehicleId;

