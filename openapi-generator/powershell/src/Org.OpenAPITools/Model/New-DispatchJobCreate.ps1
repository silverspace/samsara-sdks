function New-DispatchJobCreate {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${destinationUnderscoreaddress},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${destinationUnderscoreaddressUnderscoreid},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${destinationUnderscorelat},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${destinationUnderscorelng},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${destinationUnderscorename},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${notes},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduledUnderscorearrivalUnderscoretimeUnderscorems},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${scheduledUnderscoredepartureUnderscoretimeUnderscorems}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DispatchJobCreate' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DispatchJobCreate -ArgumentList @(
            ${destinationUnderscoreaddress},
            ${destinationUnderscoreaddressUnderscoreid},
            ${destinationUnderscorelat},
            ${destinationUnderscorelng},
            ${destinationUnderscorename},
            ${notes},
            ${scheduledUnderscorearrivalUnderscoretimeUnderscorems},
            ${scheduledUnderscoredepartureUnderscoretimeUnderscorems}
        )
    }
}
