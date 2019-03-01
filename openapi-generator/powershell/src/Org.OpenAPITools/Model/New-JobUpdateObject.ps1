function New-JobUpdateObject {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${changedUnderscoreatUnderscorems},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${jobUnderscoreid},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.JobStatus]]
        ${jobUnderscorestate},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.PrevJobStatus]]
        ${prevUnderscorejobUnderscorestate},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.DispatchRoute]]
        ${route},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${routeUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.JobUpdateObject' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.JobUpdateObject -ArgumentList @(
            ${changedUnderscoreatUnderscorems},
            ${jobUnderscoreid},
            ${jobUnderscorestate},
            ${prevUnderscorejobUnderscorestate},
            ${route},
            ${routeUnderscoreid}
        )
    }
}
