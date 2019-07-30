# readinglist-cli
스프링부트 코딩공작소 5장 CLI로 그루비 시작하기

## 실행 방법
```
$ spring run .
```

안된다면,

```
$ spring run *.groovy
```

8080 포트로 실행
> localhost:8080

---

## 1. Spring cli 설치하기

## 1.1. 스프링 부트 CLI 수동으로 설치 (Windows)

[https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started-installing-spring-boot.html)

### 1.1.1. spring-boot-cli-2.1.6.RELEASE-bin.zip 다운로드 (버전은 바뀔 수 있음.)

### 1.1.2. 압축해제 한 spring-boot-cli-2.1.6.RELEASE 폴더를 원하는 위치에 이동

> ex) C:\Spring\spring-boot-cli-2.1.6.RELEASE

### 1.1.3. 환경변수 설정 (SPRING_HOME)

내 PC 우클릭 -> 속성 -> 고급 시스템 설정 -> 환경변수 -> 시스템 변수 -> [새로 만들기]

``` 
변수 이름: SPRING_HOME

변수 값: 압축해제 한 폴더 path
ex) C:\Spring\spring-boot-cli-2.1.6.RELEASE
```

### 1.1.4. 환경변수 수정(PATH)

내 PC 우클릭 -> 속성 -> 고급 시스템 설정 -> 환경변수 -> 시스템 변수 -> Path 선택 -> [편집] -> [새로 만들기]

```
%SPRING_HOME%\bin
```
[추가]

### 1.1.5. 확인 (터미널)

> \> spring --version

```
C:\Users\yjjun> spring --version
Spring CLI v2.1.6.RELEASE
```

## 1.2. Homebrew로 설치 (Mac OS)

### 1.2.1. Homebrew 설치

[https://brew.sh/index_ko](https://brew.sh/index_ko)

터미널에 붙여넣기

```
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
```

### 1.2.2. Pivotal 탭을 태핑

```
$ brew tap pivotal/tap
```

### 1.2.3. 스프링부트 CLI 설치

```
$ brew install springboot
```

### 1.2.4. 확인

```
$ spring --version
```