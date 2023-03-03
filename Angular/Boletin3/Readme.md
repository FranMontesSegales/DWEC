Estructura de carpeta para los archivos del Boletin3

ngStyle, ngTemplate y ngClass:

/// ngStyle ///
La directiva de atributo ngStyle actualiza los estilos de un elemento HTML, proporciona una o más propiedades de estilo.

ej: <p [ngStyle]="{'color':'pink','background-color':'#jf1'>caca de mono</p>

/// ngTemplate ///
 Es una plantilla de angular, la cual se puede reutilizar con facilidad para crear componentes.
  
 ```<table>
  <tr *ngFor="let item of lista">
    <td>
            {{item}}
  </td>
    </tr>
</table>
```

/// ngClass ///
Permite establecer una o más clases a un elemento HTML.

<p [ngClass]="{'rojo': flag, 'azul': !flag}">
    Hola
</p>
