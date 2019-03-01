function New-InlineObject21 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${fillMissing},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Org.OpenAPITools.Model.SensorsHistorySeries[]]
        ${series},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${startMs},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${stepMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject21' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject21 -ArgumentList @(
            ${endMs},
            ${fillMissing},
            ${groupId},
            ${series},
            ${startMs},
            ${stepMs}
        )
    }
}
