function New-AddressesAddresses {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${formattedAddress},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.AddressGeofence]
        ${geofence},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${tagIds},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${contactIds}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AddressesAddresses' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AddressesAddresses -ArgumentList @(
            ${notes},
            ${formattedAddress},
            ${geofence},
            ${tagIds},
            ${name},
            ${contactIds}
        )
    }
}
