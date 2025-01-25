# GitLab Runner 공식 이미지 사용
FROM gitlab/gitlab-runner:latest
# GitLab Runner 설정 파일 복사
COPY config.toml /etc/gitlab-runner/config.toml
# GitLab Runner 실행
ENTRYPOINT ["/usr/bin/gitlab-runner"]
CMD ["run", "--working-directory=/home/gitlab-runner"]
# docker build -t my-gitlab-runner .
