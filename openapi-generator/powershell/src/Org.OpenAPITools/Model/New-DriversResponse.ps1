function New-DriversResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.Driver[]]]
        ${drivers}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DriversResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DriversResponse -ArgumentList @(
            ${drivers}
        )
    }
}
