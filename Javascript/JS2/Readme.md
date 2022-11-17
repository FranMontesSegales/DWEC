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

![prueba1](https://user-images.githubusercontent.com/95092587/202337421-f797d518-22d2-4026-8241-89b8447b057f.png)


Criterio 2:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “cú”,
Entonces aparecerá la tabla con la capital “Moscú” y su país únicamente.


![prueba2](https://user-images.githubusercontent.com/95092587/202337431-834f4a4b-218f-4e6d-b68d-2283a1c33751.png)

Criterio 3:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “cu”,
Entonces aparecerá la tabla sin valores.

![prueba3](https://user-images.githubusercontent.com/95092587/202337437-7aac7b7a-ec12-48d7-8252-ea8823143e8e.png)


Criterio 4:
Dado que tenemos una tabla con las capitales y países,
Cuando introducimos en el buscador “Alemania”,
Entonces aparecerá en la tabla.
![prueba4](https://user-images.githubusercontent.com/95092587/202337456-9f162c97-1eaa-4682-8f91-816bbd160323.png)


![GifPrueba](https://user-images.githubusercontent.com/95092587/202335906-d834c0c0-ee8b-4481-9096-78369913e461.gif)
