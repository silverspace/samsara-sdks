goog.provide('API.Client.Driver');

/**
 * @record
 */
API.Client.Driver = function() {}

/**
 * Flag indicating this driver may use Adverse Weather exemptions in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.Driver.prototype.eldAdverseWeatherExemptionEnabled;

/**
 * Flag indicating this driver may use Big Day excemptions in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.Driver.prototype.eldBigDayExemptionEnabled;

/**
 * 0 indicating midnight-to-midnight ELD driving hours, 12 to indicate noon-to-noon driving hours.
 * @type {!number}
 * @export
 */
API.Client.Driver.prototype.eldDayStartHour;

/**
 * Flag indicating this driver is exempt from the Electronic Logging Mandate.
 * @type {!boolean}
 * @export
 */
API.Client.Driver.prototype.eldExempt;

/**
 * Reason that this driver is exempt from the Electronic Logging Mandate (see eldExempt).
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.eldExemptReason;

/**
 * Flag indicating this driver may select the Personal Conveyance duty status in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.Driver.prototype.eldPcEnabled;

/**
 * Flag indicating this driver may select the Yard Move duty status in ELD logs.
 * @type {!boolean}
 * @export
 */
API.Client.Driver.prototype.eldYmEnabled;

/**
 * Dictionary of external IDs (string key-value pairs)
 * @type {!Object<!string, string>}
 * @export
 */
API.Client.Driver.prototype.externalIds;

/**
 * ID of the group if the organization has multiple groups (uncommon).
 * @type {!number}
 * @export
 */
API.Client.Driver.prototype.groupId;

/**
 * Driver's state issued license number.
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.licenseNumber;

/**
 * Abbreviation of state that issued driver's license.
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.licenseState;

/**
 * Driver's name.
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.name;

/**
 * Notes about the driver.
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.notes;

/**
 * Driver's phone number. Please include only digits, ex. 4157771234
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.phone;

/**
 * Driver's login username into the driver app.
 * @type {!string}
 * @export
 */
API.Client.Driver.prototype.username;

/**
 * ID of the vehicle assigned to the driver for static vehicle assignments. (uncommon).
 * @type {!number}
 * @export
 */
API.Client.Driver.prototype.vehicleId;

/**
 * ID of the driver.
 * @type {!number}
 * @export
 */
API.Client.Driver.prototype.id;

/**
 * True if the driver account has been deactivated.
 * @type {!boolean}
 * @export
 */
API.Client.Driver.prototype.isDeactivated;

/**
 * @type {!Array<!API.Client.TagMetadata>}
 * @export
 */
API.Client.Driver.prototype.tags;

