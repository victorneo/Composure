# Composure

A base project (but not a Leiningen template) for subsequent API based projects
using [Compojure][] and [Compojure-API][].

[Compojure]: https://github.com/weavejester/compojure
[Compojure-API]: https://github.com/metosin/compojure-api

## Prerequisites

You will need [Leiningen][] 2.0.0 or above installed.

[leiningen]: https://github.com/technomancy/leiningen

## Configuration Management

This project uses [cprop][] for configuration management. You can merge
environment variables with default configuration keys. This allows it to
fulfill the requirements of a [12-factor application][].

You can define default configuration keys within the `env` directory
for the appropriate profiles, eg. `dev` for local development and `test`
when running tests. These configuration keys are stored as a map inside
the `config.edn` file for respective profiles.

    env/
      - dev/
          - resources/
                - config.edn
      - test/
          - resources/
                - config.edn

[cprop]: https://github.com/tolitius/cprop
[12-factor application]: http://12factor.net/config

## Running

To start a web server for the application, run:

    lein ring server

## Tests

    lein tests

## Deploying to Production

Run `lein uberjar` to create a Jar file containing all dependencies needed
to run the web application via Java.

    lein uberjar
    java -jar target/composure-<version>-standalone.jar

## License

Copyright © 2016 Victor Neo
