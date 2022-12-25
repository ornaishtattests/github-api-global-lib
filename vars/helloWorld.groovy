def call(Map config = [:]) {
    rtServer (
        id: "ARTIFACTORY_SERVER",
        url: 'https://ornaishtat.jfrog.io/artifactory/',
        username: 'admin',
        password: 'cmVmdGtuOjAxOjAwMDAwMDAwMDA6QmUxSjlOZTV2S0RmQ0RkVHZkc2VyeG11R1hq',    
    )
}
