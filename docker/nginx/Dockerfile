# 1️⃣ Node.js를 이용해 React/Vite 빌드
FROM node:18 AS builder
WORKDIR /app

# 패키지 파일 복사 후 의존성 설치
COPY ../frontend/ttabong/package.json ../frontend/ttabong/package-lock.json ./
RUN npm install

# 전체 소스 코드 복사 및 빌드 실행
COPY ../frontend/ttabong ./
RUN npm run build

# 2️⃣ Nginx를 이용해 정적 파일 서빙
FROM nginx:1.21.3-alpine
WORKDIR /usr/share/nginx/html

# 기존 Nginx 기본 설정 제거 후 정적 파일 복사
RUN rm -rf ./*
COPY --from=builder /app/dist .  # 🔥 React/Vite 빌드 결과물을 Nginx 루트로 복사

# Nginx 설정 파일 복사
COPY ./nginx.conf /etc/nginx/nginx.conf

# 컨테이너 실행 시 Nginx 실행
CMD ["nginx", "-g", "daemon off;"]
