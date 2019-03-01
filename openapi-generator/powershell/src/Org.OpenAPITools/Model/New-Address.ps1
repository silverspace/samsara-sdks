function New-Address {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.Contact[]]]
        ${contacts},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${formattedAddress},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AddressGeofence]]
        ${geofence},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${id},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.TagMetadata[]]]
        ${tags}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.Address' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.Address -ArgumentList @(
            ${contacts},
            ${formattedAddress},
            ${geofence},
            ${id},
            ${name},
            ${notes},
            ${tags}
        )
    }
}
