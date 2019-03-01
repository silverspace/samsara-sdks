function New-InlineObject7 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${driverId},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${endMs},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${groupId},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int32]
        ${startMs}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.InlineObject7' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.InlineObject7 -ArgumentList @(
            ${driverId},
            ${endMs},
            ${groupId},
            ${startMs}
        )
    }
}
