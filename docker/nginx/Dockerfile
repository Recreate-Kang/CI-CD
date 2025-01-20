# Nginx 컨테이너
FROM nginx:1.21.3-alpine
WORKDIR /usr/share/nginx/html

# 기존 Nginx 기본 설정 제거 후 새로운 설정 추가
RUN rm -rf ./*
COPY nginx.conf /etc/nginx/nginx.conf

# Vue 빌드 결과물 복사
COPY --from=frontend_builder /output ./

# 컨테이너 실행 시 Nginx 실행
CMD ["nginx", "-g", "daemon off;"]
