#region Import functions

'API', 'Model', 'Private' | Get-ChildItem -Path {
    Join-Path $PSScriptRoot $_
} -Filter '*.ps1' | ForEach-Object {
    Write-Verbose "Importing file: $($_.BaseName)"
    try {
        . $_.FullName
    } catch {
        Write-Verbose "Can't import function!"
    }
}

#endregion


#region Initialize APIs

'Creating object: samsara.Api.AssetsApi' | Write-Verbose
$Script:AssetsApi= New-Object -TypeName samsara.Api.AssetsApi -ArgumentList @($null)

'Creating object: samsara.Api.DriversApi' | Write-Verbose
$Script:DriversApi= New-Object -TypeName samsara.Api.DriversApi -ArgumentList @($null)

'Creating object: samsara.Api.FleetApi' | Write-Verbose
$Script:FleetApi= New-Object -TypeName samsara.Api.FleetApi -ArgumentList @($null)

'Creating object: samsara.Api.IndustrialApi' | Write-Verbose
$Script:IndustrialApi= New-Object -TypeName samsara.Api.IndustrialApi -ArgumentList @($null)

'Creating object: samsara.Api.RoutesApi' | Write-Verbose
$Script:RoutesApi= New-Object -TypeName samsara.Api.RoutesApi -ArgumentList @($null)

'Creating object: samsara.Api.SafetyApi' | Write-Verbose
$Script:SafetyApi= New-Object -TypeName samsara.Api.SafetyApi -ArgumentList @($null)

'Creating object: samsara.Api.SensorsApi' | Write-Verbose
$Script:SensorsApi= New-Object -TypeName samsara.Api.SensorsApi -ArgumentList @($null)

'Creating object: samsara.Api.TagsApi' | Write-Verbose
$Script:TagsApi= New-Object -TypeName samsara.Api.TagsApi -ArgumentList @($null)

'Creating object: samsara.Api.UsersApi' | Write-Verbose
$Script:UsersApi= New-Object -TypeName samsara.Api.UsersApi -ArgumentList @($null)


#endregion
