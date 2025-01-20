# 1. 빌드 환경 설정
FROM openjdk:17-jdk-alpine AS builder
WORKDIR /app

# 2. 소스 코드 복사 후 Gradle 빌드 실행
COPY . .
WORKDIR /app
RUN chmod +x ./gradlew
RUN ./gradlew build --no-daemon

# 3. 실행 환경 설정
FROM openjdk:17-jdk-alpine
WORKDIR /app
COPY --from=builder /app/build/libs/ttabong-0.0.1-SNAPSHOT.jar app.jar

# 4. 실행 명령어
ENTRYPOINT ["java", "-jar", "app.jar"]
