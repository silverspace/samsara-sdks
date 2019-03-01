function New-SensorHistoryResponse {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.SensorHistoryResponseResults[]]]
        ${results}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SensorHistoryResponse' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SensorHistoryResponse -ArgumentList @(
            ${results}
        )
    }
}
