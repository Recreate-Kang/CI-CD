# Vue 빌드 컨테이너
FROM node:18 AS builder
WORKDIR /app

# 패키지 매니저 파일 복사 및 의존성 설치
COPY . .  
RUN npm install --legacy-peer-deps --force

# Vue 프로젝트 빌드
RUN npm run build

# 빌드 결과물을 공유 폴더에 복사
RUN mkdir -p /output && cp -r dist /output/
