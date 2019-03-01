function New-AddressesAddresses {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.ContactIds]]
        ${contactIds},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${formattedAddress},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [samsara.Model.AddressGeofence]
        ${geofence},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.AddressNotes]]
        ${notes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.TagIds]]
        ${tagIds}
    )

    Process {
        'Creating object: samsara.Model.AddressesAddresses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.AddressesAddresses -ArgumentList @(
            ${contactIds},
            ${formattedAddress},
            ${geofence},
            ${name},
            ${notes},
            ${tagIds}
        )
    }
}
