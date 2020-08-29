# AREP - LAB 4

## Getting Started

### Pre-requisites

You need to have installed on your PC:

- JDK 1.8
- Maven 
- Git

### Installing

Open a command prompt on the folder that you are going to save this project and copy:

```
git clone https://github.com/CarlosGomez380/arep-lab4.git
```

![](https://github.com/CarlosGomez380/arep-lab1/blob/master/img/clone.PNG)

Once finish this process, open the project on the terminal with 

```
cd arep-lab4
```

And copy:

```
mvn clean install
```



## Deployment

To deploy this project open the folder of this project and a command prompt on this location and copy:

```
java -cp target/classes co.edu.escuelaing.sparkd.microSpring.MicroSpringBoot co.edu.escuelaing.sparkd.componentTests.HelloController
```



Open your browser and type:

```
http://localhost:36000/Apps/pi
```




## Documentation JavaDoc

To see the javadoc generated copy:

```
mvn javadoc:javadoc
```

This document will be located in /target/site

## Built With

- [Maven](https://maven.apache.org/) - Dependency Management

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details
