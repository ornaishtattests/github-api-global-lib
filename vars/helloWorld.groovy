def call(Map config = [:]) {
    rtServer (
        id: "saas"
        url: http://localhost:8081/artifactory/
    )
}
