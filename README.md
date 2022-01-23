# AWS Elastic Beanstalk 와 Github Action 으로 서버 배포하기

## 동기

- 자동으로 AWS Resource 를 결정해주는 Elastic Beanstalk 를 이용하여 클라우드 리소스를 관리하고 github Action 을 통해 Code push 가 일어나면 자동 배포한다.

## 목표

- Elastic Beanstalk 를 사용하여 서버 리소스를 관리한다.
- Github Action 을 이용하여 자동 배포를 달성한다.
- m1 브랜치에서 master 브랜치로 merge 될 때 자동 배포된다.

## 기술 및 방법

- 기술
  - 애플리케이션 서버 : Spring Boot 2.x.x
  - AWS : `AWS Elastic Beanstalk`, `AWS IAM`
  - CD : Github Action
- 방법
  - Spring Boot Application 을 생성한다.
  - Elastic Beanstalk 에서 Cloud Resource 를 관리한다.
  - 자동 배포를 위해 Github Action 을 설정한다.
