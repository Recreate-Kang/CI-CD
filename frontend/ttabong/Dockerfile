# React 빌드 컨테이너 (Node.js 18 사용)
FROM node:18 AS builder

# 작업 디렉토리 설정
WORKDIR /app

# 패키지 설치를 위해 package.json, package-lock.json 복사
COPY package.json package-lock.json ./
RUN npm install

# 전체 소스 코드 복사
COPY . .

# React/Vite 빌드 실행
RUN npm run build

# 빌드 결과물을 저장할 디렉토리 생성 후 복사
RUN mkdir -p /output && cp -r dist /output/

# 최종 실행 명령어 (실제 실행 시에는 Nginx 등을 사용할 것이므로 불필요)
CMD ["sh", "-c", "echo 'React build completed'"]