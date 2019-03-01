function New-Driver {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldAdverseWeatherExemptionEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldBigDayExemptionEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${eldDayStartHour},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldExempt},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${eldExemptReason},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldPcEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldYmEnabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[{String, String}]]
        ${externalIds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${licenseNumber},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${licenseState},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${phone},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${username},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${currentVehicleId}
    )

    Process {
        'Creating object: samsara.Model.Driver' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.Driver -ArgumentList @(
            ${eldAdverseWeatherExemptionEnabled},
            ${eldBigDayExemptionEnabled},
            ${eldDayStartHour},
            ${eldExempt},
            ${eldExemptReason},
            ${eldPcEnabled},
            ${eldYmEnabled},
            ${externalIds},
            ${groupId},
            ${licenseNumber},
            ${licenseState},
            ${name},
            ${notes},
            ${phone},
            ${username},
            ${vehicleId},
            ${currentVehicleId}
        )
    }
}
