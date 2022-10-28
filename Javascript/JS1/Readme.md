Estrrctura de carpeta para los archivs del Boletin1
## Programación Orientada a Objetos




> Tarea AVANZADO.



### 🔍 Análisis del problema




Se pide hacer un script de javascript que genere una tabla que se pueda representar en un html a traves del navegador.


---


### 📐 Diseño de la solución




Para realizar esta tarea, crearemos un archivo html en el que diseñaremos una funcion llamada createTable en el que declarare las variables filas y columnas llamadas Rows y cols.
crearemos una tabla y le asignaremos un borde de 1 px para que se vea mejor.
con document.create.Element, crearemos las filas y columnas "tr" y "td"
y lo meteremos en un for anidado (un for dentro de otro for). Con la linea tData.textContent; insertaremos los datos generados aleatoriamente con math.random a la tabla.
y por ultimo con createTable(n, n); llamaremos al metodo y le indicaremos el numero de lineas y columnas que deseamos.





### 📐 Pruebas

Criterio 1:
Dado que tengo un método generaDatos(5, 4)
Cuando pongo los valores fila 5 y columna 4
Entonces me aparece en el html una tabla con 5 filas y 4 columnas con datos randoms.

![Criterio1](https://user-images.githubusercontent.com/95092587/198672571-3e3e7dbc-08a2-4d88-96e1-9b289af13617.gif)



Criterio 2:
Dado que tengo un método generaDatos(4, 5)
Cuando pongo los valores fila 4 y columna 5
Entonces me aparece en el html una tabla con 4 filas y 5 columnas con datos randoms.

![Criterio2](https://user-images.githubusercontent.com/95092587/198672614-1bd3faaf-28d7-4bf5-a5ef-f9c0addef11c.gif)


Criterio 3:
Dado que tengo un método generaDatos(12, 8)
Cuando pongo los valores fila 12 y columna 8
Entonces me aparece en el html una tabla con 12 filas y 8 columnas con datos randoms.

![Criterio3](https://user-images.githubusercontent.com/95092587/198672641-cc513899-efb5-4e68-ac1a-e3bc6b912c59.gif)


