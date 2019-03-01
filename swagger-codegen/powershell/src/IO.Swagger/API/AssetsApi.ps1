function Invoke-AssetsApiGetAllAssetCurrentLocations {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId}
    )

    Process {
        'Calling method: AssetsApi-GetAllAssetCurrentLocations' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AssetsApi.GetAllAssetCurrentLocations(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-AssetsApiGetAllAssets {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $false)]
        [Int64]
        ${groupId}
    )

    Process {
        'Calling method: AssetsApi-GetAllAssets' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AssetsApi.GetAllAssets(
            ${accessToken},
            ${groupId}
        )
    }
}

function Invoke-AssetsApiGetAssetLocation {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${assetId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: AssetsApi-GetAssetLocation' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AssetsApi.GetAssetLocation(
            ${accessToken},
            ${assetId},
            ${startMs},
            ${endMs}
        )
    }
}

function Invoke-AssetsApiGetAssetReefer {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [String]
        ${accessToken},
        [Parameter(Position = 1, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${assetId},
        [Parameter(Position = 2, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${startMs},
        [Parameter(Position = 3, ValueFromPipeline = $true, ValueFromPipelineByPropertyName = $true, Mandatory = $true)]
        [Int64]
        ${endMs}
    )

    Process {
        'Calling method: AssetsApi-GetAssetReefer' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        $Script:AssetsApi.GetAssetReefer(
            ${accessToken},
            ${assetId},
            ${startMs},
            ${endMs}
        )
    }
}

