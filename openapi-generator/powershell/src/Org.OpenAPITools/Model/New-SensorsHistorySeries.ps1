function New-SensorsHistorySeries {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${field},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${widgetId}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.SensorsHistorySeries' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.SensorsHistorySeries -ArgumentList @(
            ${field},
            ${widgetId}
        )
    }
}
