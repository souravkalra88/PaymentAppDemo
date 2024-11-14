```
podman build -t springboot-app -f docker/DockerFile .

podman run -p 8080:8080 --name my-springboot-app springboot-app
```
![image](https://github.com/user-attachments/assets/e1fbcdb3-7f41-4938-9925-060df7b3e702)
