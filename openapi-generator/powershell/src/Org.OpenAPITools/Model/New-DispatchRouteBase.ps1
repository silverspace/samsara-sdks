function New-DispatchRouteBase {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${actualUnderscoreendUnderscorems},
        [Parameter(Position = 1, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${actualUnderscorestartUnderscorems},
        [Parameter(Position = 2, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${driverUnderscoreid},
        [Parameter(Position = 3, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${groupUnderscoreid},
        [Parameter(Position = 4, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${name},
        [Parameter(Position = 5, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduledUnderscoreendUnderscorems},
        [Parameter(Position = 6, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${scheduledUnderscoremeters},
        [Parameter(Position = 7, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${scheduledUnderscorestartUnderscorems},
        [Parameter(Position = 8, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startUnderscorelocationUnderscoreaddress},
        [Parameter(Position = 9, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${startUnderscorelocationUnderscoreaddressUnderscoreid},
        [Parameter(Position = 10, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${startUnderscorelocationUnderscorelat},
        [Parameter(Position = 11, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Double]]
        ${startUnderscorelocationUnderscorelng},
        [Parameter(Position = 12, ValueFromPipelineByPropertyName = $true)]
        [String]
        ${startUnderscorelocationUnderscorename},
        [Parameter(Position = 13, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${trailerUnderscoreid},
        [Parameter(Position = 14, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Int64]]
        ${vehicleUnderscoreid}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.DispatchRouteBase' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.DispatchRouteBase -ArgumentList @(
            ${actualUnderscoreendUnderscorems},
            ${actualUnderscorestartUnderscorems},
            ${driverUnderscoreid},
            ${groupUnderscoreid},
            ${name},
            ${scheduledUnderscoreendUnderscorems},
            ${scheduledUnderscoremeters},
            ${scheduledUnderscorestartUnderscorems},
            ${startUnderscorelocationUnderscoreaddress},
            ${startUnderscorelocationUnderscoreaddressUnderscoreid},
            ${startUnderscorelocationUnderscorelat},
            ${startUnderscorelocationUnderscorelng},
            ${startUnderscorelocationUnderscorename},
            ${trailerUnderscoreid},
            ${vehicleUnderscoreid}
        )
    }
}
