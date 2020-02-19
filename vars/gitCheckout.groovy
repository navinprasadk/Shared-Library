checkout([
    $class: 'GitSCM', 
    branches: [[name: '*/master']], 
    doGenerateSubmoduleConfigurations: false, 
    extensions: [], 
    submoduleCfg: [], 
    userRemoteConfigs: [[url: 'https://github.com/navinprasadk/Shared-Library.git']]
    ])