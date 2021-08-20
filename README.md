# Reto002
Repositorio creado con el fin de dar solución al reto 02 Misión Tic 2022 grupo #07
Reto 2
Descripción del problema:
La fundación Nueva Generación recibirá en donación de algunos productos alimentarios los cuales se necesita
determinar el valor total por cada uno de ellos y total de los productos alimentarios donados. Para lo cual se
contrata sus servicios de desarrollador, en donde se ha determinado el modelo de clases que nos permite
gestionar el programa el cual es el siguiente:
Todos los productos alimentarios comparten los atributos pesoBase, tipoAlimento, los cuales son valores que
pueden modificar su precio final, se cuenta también con el atributo precioBase, el cual representa el precio del
productos alimentarios antes de sumar los respectivos valores según la evaluación de los atributos pesoBase,
tipoAlimento, El método calcularPrecio() permite obtener el precio final para cualquier producto alimentario
de la siguiente forma:
precioFinal = precioBase + adicion
La adición se establece según lo siguiente:
Si el tipo de alimento(tipoAlimento) del producto alimentario es ‘N’ (Natural), se le adiciona $40, ‘C’
(Conservantes) se adiciona $20.
Del mismo modo, si el peso del producto alimentario es mayor o igual a 0 y menos o igual a 9 se adiciona $6,
si el peso es mayor a 9 y menos o igual a 16 se le adiciona $8, si es mayor a 16 se adiciona $20.
Los productos alimentarios del tipo bebidas cuentan con el atributo lugarOrigen, el cual agrega un valor
adicional al precio de la bebidas de la siguiente forma:
Si la lugarOrigen de la bebidas es ‘N’ (Nacional), se adiciona $5, si es ‘I’ (Internacional) se adiciona $15.
LUGAR_ORIGEN = ‘N’
Si no se tiene valor para el atributo lugarOrigen, este debe inicializarse con el valor de la contante.
Los productos alimentarios del tipo refrigerados cuentan el atributo temperatura, el cual agrega un valor
adicional al precio de los refrigerados de la siguiente forma:
Si la temperatura el refrigerado es mayor o igual 5 grados y menor 10 grados se adiciona $20, si la temperatura
es mayor a igual 10 y menos o igual a 15 se le adiciona $18, si es menor a 5 o mayor a 15 se adiciona $5.
Se tiene un valor constante para la temperatura
TEMPERATURA = 10
Si no se tiene valor para el atributo temperatura, este debe inicializarse con el valor de la contante.
Cada uno de los atributos de la clase productos alimentarios, tienen una constante que define un valor por
defecto con el cual se puede calcular el precio del productos alimentarios si no se envía ningún valor al
constructor de la clase:
TIPO_ALIMENTO = ‘N’
PRECIO_BASE = 80.0
PESO_BASE = 5
Si no se tiene valor para los atributos, este debe inicializarse con el valor de la contante
Los atributos de la clase PrecioTotal son: tProductosAlimentarios, tBebidas, tRefrigerados y
listaProductosAlimentarios. Este último atributo contiene todos los productos alimentarios recibidos en
donación, los cuales son almacenados en un array (tipo producto alimentario) y son entregados al constructor
de la clase PrecioTotal.
En el método main(), desde donde se llama al método mostrarTotales(), el cual debe imprimir en consola:
El precio total de los Productos Alimentarios es de { tProductosAlimentarios }
La suma del precio de las Bebidas es de { tBebidas }
La suma del precio de los Refrigerados es de { tlRefrigerados }
