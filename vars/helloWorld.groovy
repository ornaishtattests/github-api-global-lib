def call(Map config = [:]) {
    rtServer (
        id: "ARTIFACTORY_SERVER",
        url: 'https://ornaishtat.jfrog.io/artifactory/',
        username: 'admin',
        password: $TOKEN,    
    )
}
