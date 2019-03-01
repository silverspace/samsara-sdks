function New-DriverBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldAdverseWeatherExemptionEnabled},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldBigDayExemptionEnabled},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int32]]
        ${eldDayStartHour},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldExempt},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${eldExemptReason},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldPcEnabled},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Boolean]]
        ${eldYmEnabled},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[{String, String}]]
        ${externalIds},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${licenseNumber},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${licenseState},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${phone},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${username},
        [Parameter(Position = 15, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DriverBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DriverBase -ArgumentList @(
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
            ${vehicleId}
        )
    }
}
