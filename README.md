# gsu-dle/KalturaGeneratedAPIClientsJava

This is the Readme for the Kaltura Java API Client Library. You should read this before building and testing the client. This library replaces the deprecated KalturaClient library.

**Note:** You should not make pull requests to the repo as the client libs are auto generated upon every Core release. Instead, please submit pulls to:

https://github.com/kaltura/clients-generator

Source code is under sources/java

## Package Contents
- Kaltura Java Client Library API (`src/main/java/com`)
- JUnit tests (`src/test/java/com`)

## Depencencies

The API depends on these libraries:
- JSON in Java: http://json.org/
- Gson JSON library: https://github.com/google/gson
- OkHttp: http://square.github.io/okhttp/
- OkIO: https://github.com/square/okio
- Log4j: https://logging.apache.org/log4j
- Apache Commons Codec 1.4: http://commons.apache.org/proper/commons-codec/
- JUnit 3.8.2 (optional): http://junit.org

## Building from source using Maven

Use the following command to build the API without running unit tests:
```bash
mvn -Dmaven.test.skip=true package
```

After running the command you will find 3 Jar files in the "target" directory.
- `target/KalturaApiClient-X.X.X.jar` contains the compiled client library
- `target/KalturaApiClient-X.X.X-sources.jar` contains the source code
- `target/KalturaApiClient-X.X.X-javadoc.jar` contains the Javadoc documentation for the library

## Testing the API client library using Maven

Copy `src/test/resources/test.template.properties` file to `src/test/resources/test.properties` and edit it, enter valid data to `partnerId`, `adminSecret`, and `serviceUrl` variables.

Use the following command to both build the API and run unit tests:
```bash
mvn package
```

The same Jar files will be created as above.  The results of the unit tests will be stored in the file `target/surefire-reports/com.kaltura.client.test.KalturaTestSuite.txt`

## Building from source using Eclipse

To build the API:
- Setup the project in eclipse.
- Build the project

## HTTP Proxy Support

The following methods are supported:

0. After initialising an object of the `Configuration` class, invoke the below methods:
```java
config.setProxy("proxy.host");
config.setProxyPort(int_port);
```

1. Set the following Java properties:
   - `http_proxy`
   - `http_proxy_port`

2. Export the following ENV vars:
   - `http_proxy`
   - `http_proxy_port`

### Order of precedence
- If proxy set on the client object, it will be used, otherwise:
- If Java properties are set and are valid, they will be used, otherwise:
- If `ENV` vars are set and are valid, they will be used

## Testing the API client library using Eclipse

To run the JUnit test suite that accompanies this source:
- Copy `src/test/resources/test.template.properties` file to `src/test/resources/test.properties` and edit it, enter valid data to `partnerId`, `adminSecret`, and `serviceUrl` variables.
- Compile the client library.
- Right click the `KalturaTestSuite.java` file and choose `Debug As > JUnit Test`.

## Setup log4j logging in Eclipse

The launch settings are saved in the following files:
- `KalturaTestSuite.launch` (the JUnit tests)
- `KalturaMainTest.launch` (A main test class for quickly testing the build)

There is a `log4j.properties` file under `src/main/resources`. Edit it to set the log level as desired, defaults are:
```
log4j.category.ClientBase.class=DEBUG
log4j.logger.com.kaltura=ERROR
```

