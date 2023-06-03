# Manga Easy Micro API Config

This repository contains the configuration files and setup instructions for the Manga Easy Micro API built with Spring Boot and Kotlin. The Manga Easy Micro API is a lightweight and scalable backend service that powers the Manga Easy application, providing seamless access to manga content.

## Prerequisites

Before setting up the Manga Easy Micro API, ensure that you have the following prerequisites:

- [Java Development Kit (JDK)](https://adoptopenjdk.net) installed
- [Kotlin](https://kotlinlang.org) installed
- [MongoDB](https://www.mongodb.com) installed and running
- [API keys](https://example.com) for any external services required (e.g., authentication, image hosting)

## Installation

To install and configure the Manga Easy Micro API, follow these steps:

1. Clone this repository to your local machine:

   ```
   git clone https://github.com/manga-easy/manga_easy_micro_api_config.git
   ```

2. Navigate to the cloned directory:

   ```
   cd manga_easy_micro_api_config
   ```

3. Configure the application properties:

   - Open the `src/main/resources/application.properties` file.
   - Update the necessary properties, such as database connection settings and API keys.

4. Build the application:

   ```
   mvn clean install
   ```

5. Run the application:

   ```
   mvn spring-boot:run
   ```

Congratulations! The Manga Easy Micro API built with Spring Boot and Kotlin is now up and running.

## Usage

Once the Manga Easy Micro API is running, it exposes various endpoints for accessing manga content. Refer to the API documentation for detailed information on available endpoints and request/response formats.

## Contributing

If you would like to contribute to the Manga Easy Micro API, please follow the guidelines outlined in the [CONTRIBUTING.md](CONTRIBUTING.md) file.

## License

The Manga Easy Micro API Config is open-source software licensed under the [MIT license](LICENSE).
