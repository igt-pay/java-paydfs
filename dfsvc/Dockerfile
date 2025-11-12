# ---- build stage (optional if you already have a fat jar) ----
FROM eclipse-temurin:21-jdk AS build
WORKDIR /workspace
# Example: build the fat jar (optional if you already have one)
 COPY mvnw ./
 COPY .mvn .mvn
 COPY pom.xml .
 COPY src src
 RUN ./mvnw -q -DskipTests package

# ---- run stage ----
FROM eclipse-temurin:21-jre

# Create a non-root user and group
RUN groupadd --system igtpay && useradd --system --create-home --gid igtpay igtpay

WORKDIR /app

# Copy the fat JAR (either from local target or build stage)
COPY target/*.jar /app/app.jar

# Change ownership to the igtpay user
RUN chown -R igtpay:igtpay /app

# Switch to the non-root user
USER igtpay

EXPOSE 8080

ENTRYPOINT ["java", "-Xmx1g", "-XX:+UseZGC", "-jar", "/app/app.jar"]
