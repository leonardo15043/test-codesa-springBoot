<p align="center"><a href="https://www.codesa.com.co/" target="_blank"><img src="https://ii.ct-stc.com/1/logos/empresas/2017/09/08/codesa-234B49A044C42368204329thumbnail.png" width="400"></a></p>


## Test Codesa - SpringBoot

### Prerrequisitos

Para construir y ejecutar la aplicación necesitas:

- [JDK 11](https://www.oracle.com/co/java/technologies/javase/jdk11-archive-downloads.html)
- [Maven 3](https://maven.apache.org)
- MYSQL, para facilitar el proceso podemos instalar [XAMPP](https://www.apachefriends.org/es/index.html)

### Proceso de instalación y configuración

#### 1 - Configuración de Base de datos

- Lo primero que debemos hacer es crear una base de datos llamada **codesa** desde phpMyadmin
- Si queremos cambiar los datos de conexión a la base de datos lo podemos hacer desde el archivo ```application.properties```

#### 2 - Ejecutar la aplicación

```mvn spring-boot:run```

#### 3 - Para cargar los roles debemos ejecutar el siguiente script

``` 
INSERT INTO `rol` (`id_rol`, `name`) VALUES
(1, 'ADMINISTRADOR'),
(2, 'AUDITOR'),
(3, 'AUXILIAR');
```
#### 4 - Logs del sistema

Los logs los podemos ver en la ruta **tmp/application.log**

#### Pruebas 

Si queremos descargar y importar los servicios en Postman, lo podemos hacer en el siguiente [link](https://www.getpostman.com/collections/20dcd4cc4c9303628c85)
