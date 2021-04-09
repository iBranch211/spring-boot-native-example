# Spring Boot Native Example
> Spring Boot Native Rest Api Example
>
<img src="https://github.com/susimsek/spring-boot-native-example/blob/main/images/spring-boot-native-example.png" alt="Spring Boot Native Rest Api Example" width="100%" height="100%"/> 

## Prerequisites

* Java 11
* Maven 3.3+
* Docker 19.03+
* Docker Compose 1.25+

## Installation

```sh
./mvnw spring-boot:build-image
```


```sh
docker-compose up -d 
```

## Installation Using Vagrant

<img src="https://github.com/susimsek/spring-boot-native-example/blob/main/images/vagrant-installation.png" alt="Spring Boot Vagrant Installation" width="100%" height="100%"/> 

### Prerequisites

* Vagrant 2.2+
* Virtualbox or Hyperv

```sh
vagrant up
```

```sh
vagrant ssh
```

```sh
cd vagrant/setup
```

```sh
sudo chmod u+x *.sh
```

```sh
./install-prereqs.sh
```

```sh
exit
```

```sh
vagrant ssh
```

```sh
./mvnw spring-boot:build-image
```

```sh
docker-compose up -d
```

## Used Technologies

* Spring Boot 2.4.4
* Spring Native
* Spring Boot Web
* Spring Boot Actuator  
* Lombok
* Spring Boot Test


