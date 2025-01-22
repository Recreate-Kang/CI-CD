# 2️⃣ Nginx 실행 단계
FROM nginx:1.21.3-alpine

# 작업 디렉토리 설정
WORKDIR /usr/share/nginx/html

# 기존 Nginx 기본 설정 제거
RUN rm -rf ./*

# 새로운 Nginx 설정 추가
COPY ./nginx.conf /etc/nginx/nginx.conf

# React 빌드 결과물 복사
COPY --from=frontend_builder /output ./   
#  🔥 React 빌드 결과를 Nginx 루트로 복사

# 컨테이너 실행 시 Nginx 실행
CMD ["nginx", "-g", "daemon off;"]