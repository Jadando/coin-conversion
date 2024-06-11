# Currency Converter

A simple Java-based currency converter application that uses the ExchangeRate-API to convert USD to BRL.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Configuration](#configuration)
- [Dependencies](#dependencies)
- [Contact](#contact)

## Features

- Fetches real-time exchange rates from ExchangeRate-API
- Converts USD to BRL

## Installation

1. **Clone the repository:**

    ```sh
    git clone https://github.com/Jadando/coin-conversion.git
    cd currency-converter
    ```

2. **Set up your development environment:**

    Ensure you have Java and Maven installed. You can download Java from [here](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) and Maven from [here](https://maven.apache.org/install.html).

3. **Build the project:**

    ```sh
    mvn clean install
    ```

## Usage

1. **Run the application:**

    ```sh
    mvn exec:java -Dexec.mainClass="com.example.CurrencyConverter"
    ```

2. **Follow the prompts:**

    The application will prompt you to enter the amount in USD, and it will display the converted amount in BRL.

## Configuration

To use the ExchangeRate-API, you need an API key. You can get one by signing up [here](https://www.exchangerate-api.com/).

1. **Set your API key:**

    Open `CurrencyConverter.java` and set your API key in the `API_KEY` variable:

    ```java
    private static final String API_KEY = "your_api_key_here";
    ```

## Dependencies

- Java 11 or higher
- [Maven](https://maven.apache.org/)
- [Gson](https://github.com/google/gson) for JSON parsing

    These dependencies are managed via Maven. The `pom.xml` file includes all necessary dependencies.

## Contact

Created by [Your Name](https://github.com/yourusername) - feel free to contact me!
