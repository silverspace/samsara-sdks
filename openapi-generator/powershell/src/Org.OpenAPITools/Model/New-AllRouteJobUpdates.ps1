function New-AllRouteJobUpdates {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.JobUpdateObject[]]]
        ${jobUnderscoreupdates},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${sequenceUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.AllRouteJobUpdates' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.AllRouteJobUpdates -ArgumentList @(
            ${jobUnderscoreupdates},
            ${sequenceUnderscoreid}
        )
    }
}
