![image](https://github.com/21asphyxia/GatherGrid/assets/71402078/ab5f9146-d23b-4357-978c-7aff66afbc3b)
# Project Startup Guide
## GatherGrid
[Presentation](https://docs.google.com/presentation/d/1LhppDBj6BLlZ_dubAl7rhY5PF64PSxqh/edit?usp=sharing&ouid=110829709193933141919&rtpof=true&sd=true)

## Table of Contents

- [Prerequisites](#prerequisites)
- [Getting Started](#getting-started)
  - [Cloning the Repository](#cloning-the-repository)
  - [Building the Project](#building-the-project)
  - [Configuring Tomcat](#configuring-tomcat)
- [Running the Application](#running-the-application)

---

## Prerequisites

Before you get started, make sure you have the following prerequisites installed on your system:

- [Java Development Kit (JDK)](https://www.oracle.com/java/technologies/javase-downloads.html) 8 or later.
- [Apache Maven](https://maven.apache.org/download.cgi) 3.x.
- [Apache Tomcat](http://tomcat.apache.org/download-10.cgi) 10.x.

## Getting Started

### Cloning the Repository

1. Clone this repository to your local machine using Git:

   ```shell
   git clone https://github.com/21asphyxia/GatherGrid.git
   ```
   
### Building the Project

1. Navigate to the project's root directory:
   
  ```shell
  cd GatherGrid/
  ```
2. Build the project using Maven:

  ```shell
  mvn clean install
  ```

This will compile the source code, run tests, and package the application into a WAR file.

### Configuring Tomcat

1. Download and install Apache Tomcat 10 on your system if you haven't already.

### Running the Application

1. Copy the generated WAR file (usually located in the target directory) to the Tomcat webapps directory:
  
  ```shell
  cp target/your-project.war <Tomcat Installation Directory>/webapps/
  ```
2. Start Tomcat:
   ```shell
   <Tomcat Installation Directory>/bin/startup.sh  # on Unix-like systems
   <Tomcat Installation Directory>\bin\startup.bat  # on Windows
   ```
3. Access your application in a web browser:

  ```shell
  http://localhost:8080/your-project
  ```

---
