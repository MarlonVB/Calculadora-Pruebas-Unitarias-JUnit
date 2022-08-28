# Calculadora-Pruebas-Unitarias-JUnit

Cuando se prueba un programa, se ejecuta con datos de entrada específicos y se comprueba que cumple las expectativas. Las pruebas unitarias se definen como la comprobación de uno de los módulos que componen un programa. Un caso de prueba es una clase o módulo que tiene métodos para probar una clase o módulo en particular. Así, para cada clase que se quiera probar, se define la correspondiente clase de caso de prueba. Para este ejerció hicimos uso de dos herramientas que nos facilitaran la tarea por una parte el IDE IntelliJ IDEA y por otra JUnit que es una librería desarrollada para poder probar el funcionamiento de las clases y métodos que componen nuestra aplicación, y asegurarnos de que se comportan como deben ante distintas situaciones de entrada.

## Observaciones 

Al clonar este repositorio, es menester poner a consideracion lo siguiente:
 * Este proyecto fue realizado el el IDE IntelliJ IDEA por lo que se recomienda ejecutarlo en este IDE
 * El proyecto fue configurado con Maven por lo que se uso la siguiente dependencia para impletar JUnit:
 ```
 <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
  </dependency>
  
 ````
 Esta dependencia debe ser colocada dentro del pom.xml, en la etiqueta dependencies como podemos observar en la siguiente imagen:

 [![CALIDAD-CAL.png](https://i.postimg.cc/nzgqRCtQ/CALIDAD-CAL.png)](https://postimg.cc/sQPB1fxV)
 
  > **_Nota:_** _Tomar en cuenta el formato mostrado en la imagen._
