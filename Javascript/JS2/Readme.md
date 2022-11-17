Estrrctura de carpeta para los archivs del Boletin2
## Programación Orientada a Objetos




> Tarea INTERMEDIO.



### 🔍 Análisis del problema




Se pide hacer un script de javascript que genere una tabla de paises y capitales que se pueda representar en un html a traves del navegador con filtros .


---


### 📐 Diseño de la solución




Para realizar esta tarea, crearemos un archivo html en el que diseñaremos una funcion llamada createTable en el que declarare las variables filas y columnas llamadas Rows y cols.
crearemos una tabla.
con document.create.Element, crearemos las filas y columnas "tr" y "td"
y lo meteremos en un for anidado (un for dentro de otro for). Con la linea tData.textContent; insertaremos los datos generados aleatoriamente con math.random a la tabla.
y por ultimo crearemos un script para que filtre la tabla por capitales y paises segun lo solicitado en la tarea





### 📐 Pruebas

Criterio 1:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “Berlín”,
Entonces aparecerá la tabla con esa capital y país únicamente.

Criterio 2:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “cú”,
Entonces aparecerá la tabla con la capital “Moscú” y su país únicamente.

Criterio 3:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “cu”,
Entonces aparecerá la tabla sin valores.

Criterio 4:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “Alemania”,
Entonces aparecerá la tabla sin valores.

