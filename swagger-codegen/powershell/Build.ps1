function Get-FunctionsToExport {
    [CmdletBinding()]
    Param (
        [Parameter(Mandatory = $true, ValueFromPipelineByPropertyName = $true)]
        [ValidateNotNullOrEmpty()]
        [Alias('FullName')]
        $Path
    )

    Process {
        $Token = $null
        $ParserErr = $null

        $Ast = [System.Management.Automation.Language.Parser]::ParseFile(
            $Path,
            [ref]$Token,
            [ref]$ParserErr
        )

        if ($ParserErr) {
            throw $ParserErr
        } else {
            foreach ($name in 'Begin', 'Process', 'End') {
	            foreach ($Statement in $Ast."${name}Block".Statements) {
		            if (
                        [String]::IsNullOrWhiteSpace($Statement.Name) -or
                        $Statement.Extent.ToString() -notmatch
                        ('function\W+{0}' -f $Statement.Name)
                    ) {
			            continue
		            }

		            $Statement.Name
	            }
            }
        }
    }
}

$ScriptDir = Split-Path $script:MyInvocation.MyCommand.Path
$ClientPath = ("$ScriptDir\csharp\SwaggerClient" | Resolve-Path).ProviderPath
$FunctionPath = 'API', 'Model' | ForEach-Object {Join-Path "$ScriptDir\src\samsara\" $_}
$BinPath = "$ScriptDir\src\samsara\Bin"

Start-Process -FilePath "$ClientPath\build.bat" -WorkingDirectory $ClientPath -Wait -NoNewWindow

if (!(Test-Path "$ScriptDir\src\samsara\Bin" -PathType Container)) {
    New-Item "$ScriptDir\src\samsara\Bin" -ItemType Directory > $null
}

Copy-Item "$ClientPath\bin\*.dll" $BinPath

$Manifest = @{
    Path = "$ScriptDir\src\samsara\samsara.psd1"

    Author = 'Swagger Codegen Team'
    CompanyName = 'swagger.io'
    Description = 'samsara - the PowerShell module for Samsara API'

    RootModule = 'samsara.psm1'
    Guid = '{4F945D8B-FA99-41E1-A26E-B9CF7E108AE4}' # Has to be static, otherwise each new build will be considered different module

    PowerShellVersion = '3.0'

    RequiredAssemblies = Get-ChildItem "$BinPath\*.dll" | ForEach-Object {
        Join-Path $_.Directory.Name $_.Name
    }

    FunctionsToExport = $FunctionPath | Get-ChildItem -Filter *.ps1 | Get-FunctionsToExport

    VariablesToExport = @()
    AliasesToExport = @()
    CmdletsToExport = @()

    # Should we use prefix to prevent command name collisions?
    # https://www.sapien.com/blog/2016/02/15/use-prefixes-to-prevent-command-name-collision/
    #
    # Kirk Munro recommends against it:
    # https://www.sapien.com/blog/2016/02/15/use-prefixes-to-prevent-command-name-collision/#comment-20820
    #
    # If not, we'd need to generate functions name with prefix.
    #
    # DefaultCommandPrefix = 'PetStore'
}

New-ModuleManifest @Manifest
