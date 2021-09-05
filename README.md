# Run by Maven

JVM arguments are quoted in `-Dspring-boot.run.jvmArguments=""`
```
./mvnw spring-boot:run -Dspring-boot.run.jvmArguments="-Dserver.port=8000"
```

# Build Executable JAR

```
./mvnw clean package
```

# Start JAR from CLI

```
# Arguments
# Change server.port, default is 8080
# -Dserver.port=8000

java -Dserver.port=8000 -jar target/dummy-web-0.0.1-SNAPSHOT.jar
```

NOTE: Following syntax is supported
```
java -jar target/dummy-web-0.0.1-SNAPSHOT.jar --server.port=8000
```