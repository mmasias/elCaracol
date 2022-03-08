# El caracol

## Reto base
Un caracol resbala y se cae en un pozo de 20 metros de profundidad, aterrizando en un saliente ubicado entre 10 y 20 metros. A partir de allí empieza su carrera por salir a la superficie, subiendo por las mañanas entre 1 y 4 metros, pero cayendo por las noches entre 0 y 2 metros.

Desarrolle un programa que relate y grafique, día a día, las peripecias del caracol durante su intento de salida. Se debe indicar, entre otras cosas, la profundidad en la que está el caracol, el día, lo que ha subido por la mañana y lo que ha bajado por la noche. Asimismo, se ha de graficar en modo [ASCII](https://es.wikipedia.org/wiki/ASCII) el caracol en el pozo. 

### Algunos detalles...
Puede utilizar como referencia la tabla que se aporta debajo para la representación gráfica. Asimismo, simplifique la representación de la profundidad a valores enteros. Esto es, si la profundidad del caracol es -13.5413 represéntelo en la posición -13.

    |Personaje|Representación|
    --------------------------
    |Borde      |   [__]    |
    |Pared      |   []      |
    |Fondo      |   :.      |
    |Caracol    |   _@)_/’  |
    |Agua       |   ~~~~    |
    |Coche      |   O---O   |

## Retos extendidos
### Cansancio
* Extienda el simulacro anterior para que el caracol, pasados 10 días sin salir del pozo reduzca el máximo que puede subir a 3 metros. 
* Si pasan más de 20 días y aún no sale del pozo, entonces el caracol puede subir como máximo 2 metros por día.
* Finalmente, si pasan 50 días sin salir del pozo, el caracol muere de inanición.
### Coches
El pozo se encuentra cerca de una carretera, y por día hay un 35% de probabilidad de que un coche aparque cerca del pozo. En este caso, ocasiona un ligero temblor que hace caer al caracol 2 metros.
* Represente esta situación en el viaje del caracol.

### Clima
En la localidad donde está situado el pozo, cada día existe un 5 % de probabilidad de lluvia fuerte, un 10% de probabilidad de lluvia media y un 85% de probabilidad de buen clima.  En caso de lluvia fuerte, el pozo se inunda y ve reducida su profundidad en 5 metros. En caso de lluvia débil, igualmente por el agua, el pozo ve reducida su profundidad en 2 metros.
* Represente esta situación en el viaje del caracol.
> En ninguno de los casos el caracol puede quedar debajo del agua o debajo de la profundidad del pozo
## Sugerencias de presentación
**Representación general del escenario**

    [__]              [__]
      []:. :. :. :. :.[] _ __ 0
      []:. :. :. :. :.[] _ __ 1
      []:. :. :. :. :.[] _ __ 2
      []:. :. :. :. :.[] _ __ 3
      []:. :. :. :. :.[] _ __ 4
      []:. :. :. :. :.[] _ __ 5
      []:. :. :. :. :.[] _ __ 6
      []:. :. :. :. :.[] _ __ 7
      []:. :. :. :. :.[] _ __ 8
      []:. :. :. :. :.[] _ __ 9
      []:. :. :. :. :.[] _ __ 10
      []:. :. :. :. :.[] _ __ 11
      []:. :. :. :. :.[] _ __ 12
      []    _@)_/’    [] _ __ 13
      []:. :. :. :. :.[] _ __ 14
      []:. :. :. :. :.[] _ __ 15
      []:. :. :. :. :.[] _ __ 16
      []:. :. :. :. :.[] _ __ 17
      []:. :. :. :. :.[] _ __ 18
      []:. :. :. :. :.[] _ __ 19
      []~~~~~~~~~~~~~~[] _ __ 20
      [][][][][][][][][] 

**Día 6:** El caracol ascendió 3.12 m, resbaló 1.81 m y al final del día está a -4.54 m de profundidad.
![](./images/caracolASCII_dia6.png)

**Día 26:** Llueve y pasa un coche. El pozo se ha llenado de agua y tiene ahora 12 metros de profundidad.
![](./images/caracolASCII_dia26.png)

**Dia 50:** El caracol no logró salir del pozo.
![](./images/caracolASCII_dia50.png)
