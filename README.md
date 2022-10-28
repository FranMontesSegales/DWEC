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






![gifEjercicio](https://user-images.githubusercontent.com/95092587/198666507-a0bb5d75-0134-4d83-bd4e-8ba3b4120847.gif)


