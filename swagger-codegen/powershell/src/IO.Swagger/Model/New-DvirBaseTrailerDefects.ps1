function New-DvirBaseTrailerDefects {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${comment},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${defectType}
    )

    Process {
        'Creating object: samsara.Model.DvirBaseTrailerDefects' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName samsara.Model.DvirBaseTrailerDefects -ArgumentList @(
            ${comment},
            ${defectType}
        )
    }
}
