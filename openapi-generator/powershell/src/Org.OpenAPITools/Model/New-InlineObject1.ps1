function New-InlineObject1 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${contactIds},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${formattedAddress},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.AddressGeofence]]
        ${geofence},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${name},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64[]]]
        ${tagIds}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject1' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject1 -ArgumentList @(
            ${contactIds},
            ${formattedAddress},
            ${geofence},
            ${name},
            ${notes},
            ${tagIds}
        )
    }
}
