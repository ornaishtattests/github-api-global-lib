def call(Map config = [:]) {
    rtServer (
        id: "local-artifactory"
        url: http://localhost:8082/artifactory/
        username: admin
        password: Password1!
        
    )
}
