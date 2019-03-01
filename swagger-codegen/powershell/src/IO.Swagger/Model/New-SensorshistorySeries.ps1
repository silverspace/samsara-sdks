function New-SensorshistorySeries {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${field},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${widgetId}
    )

    Process {
        'Creating object: samsara.Model.SensorshistorySeries' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.SensorshistorySeries -ArgumentList @(
            ${field},
            ${widgetId}
        )
    }
}
