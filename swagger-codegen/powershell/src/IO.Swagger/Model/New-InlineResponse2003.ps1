function New-InlineResponse2003 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupId},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.VehicleLocation[]]]
        ${vehicles}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2003' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2003 -ArgumentList @(
            ${groupId},
            ${vehicles}
        )
    }
}
