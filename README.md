# Composure

A Clojure web project for learning how different Clojure libraries play
nice together.


## Libraries

- [Compojure][] - Routing library for Ring
- [Compojure-API][] - API layer on top of Compojure
- [Ring][] - HTTP API for Clojure
- [cprop][] - Application Configuration for Clojure projects
- [mount][] - Managing application state

[Compojure]: https://github.com/weavejester/compojure
[Compojure-API]: https://github.com/metosin/compojure-api
[ring]: https://github.com/ring-clojure/ring
[cprop]: https://github.com/tolitius/cprop
[mount]: https://github.com/tolitius/cprop

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

This project uses the [lein-ring][] plugin to start the browser.

To start a web server for the application and have your default web
browser open after the application has started, run:

    lein ring server

To start the application without opening the browser, run:

    lein ring server-headless

[lein-ring]: https://github.com/weavejester/lein-ring

## Tests

    lein test

## Deploying to Production

Run `lein uberjar` to create a Jar file containing all dependencies needed
to run the web application via Java.

    lein uberjar
    java -jar target/composure-<version>-standalone.jar

If you are deploying to a Java web application server such as Tomcat that
requires a WAR file, you can generate an `uberwar` instead:

    lein ring uberwar

## License

Copyright 2016 Victor Neo

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
