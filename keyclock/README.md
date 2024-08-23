
## Secure Bank implemented using Spring Boot, OAuth.

A brief description of what this project does and who it's for


## Acknowledgements

 - [OAuth articles](https://fusionauth.io/articles/oauth/modern-guide-to-oauth)

 - [OAuth Playground](https://www.oauth.com/playground/)

## Tech Stack

**Client:** Angular

**Server:** Java, Spring Boot

## Installation

### Steps

1. Clone the repository:
    ```bash
    git clone https://github.com/SasikumarG-dev/OAuth.git
    ```
2. Navigate to the project directory:
    ```bash
    cd secure-bank
    ```
3. Build the project using Maven:
    ```bash
    mvn clean install
    ```
4. Set up the database:
    - Create a MySql database and update the database connection settings in the `application.properties` or `application.yml` file.
    ```
    spring:
        datasource:
            url: jdbc:mysql://localhost:3306/bank
            username: root
            password: 1234
    ```
5. Run the application:
    ```bash
    mvn spring-boot:run
    ```
## Environment Variables

To run this project, you will need to add the following environment variables to your .env file

`JDK 17`

`MySql`

`Maven`


