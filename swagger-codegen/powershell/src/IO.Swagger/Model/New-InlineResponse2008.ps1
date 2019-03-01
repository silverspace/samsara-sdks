function New-InlineResponse2008 {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[samsara.Model.Sensor[]]]
        ${sensors}
    )

    Process {
        'Creating object: samsara.Model.InlineResponse2008' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.InlineResponse2008 -ArgumentList @(
            ${sensors}
        )
    }
}
