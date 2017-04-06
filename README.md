# Civilization
Uso de 5 Patrones de diseño en un proyecto.

## Juego Simulador De Civilizacion

## Simulación del progreso de una civilización en un videojuego (modo texto)

### Planteamiento del problema.

Desde los inicios del uso doméstico de las computadoras los usuarios las han utilizado para su entretenimiento a través de videojuegos, iniciando con juegos de simulación y estrategia primitivos en los que el objetivo es progreso de una civilización, en el caso de los videojuego de estrategia en tiempo real (RTS por sus siglas en ingles) el problema radica en programar la interacción del comportamiento de una civilización y los elementos que la conforman, con otras civilizaciones aledañas dentro del mundo del juego (Aliados y Enemigos).

### Análisis.

+ Un jugador maneja una civilización única que se identifica por un nombre y un color.
+ El objetivo principal es guiar a la civilización que se controla por el camino del progreso.
+ Dentro del juego existen otras civilizaciones que pueden ser aliadas o enemigas.
+ Las aliadas pueden contribuir al objetivo principal.
+ Mientras que las enemigas, tratarán de impedirlo, ya sea privando de recursos o territorio.
+ El control de recursos y territorio se lleva a cabo mediante los ciudadanos de cada civilización.
+ Los ciudadanos se encargan de:
  - Recolectar recursos (leñador, minero, agricultor, pescador)
  - Construir edificios (constructor)
  - Explorar (explorador, explorador a caballo)
  - Defender la ciudad (milicias)
+ Cada oficio se puede mejorar dependiendo del progreso de la civilización.
+ El juego se gana al alcanzar un límite de progreso antes que todos los demás.

### Diseño de la solución usando patrones de diseño.

                        |———————————————————|                
                        | Civilizacion      | 
                        |———————————————————|
                        | — nombre : String |
                        | — color  : String |
                        |———————————————————|


      |———————————————————————————————|  
      | Ciudadano                     |           |——————————————————————————————|
      |———————————————————————————————| ◁———————— | CiudadanoExplorador          | 
      | # oficio : Oficio             |           |——————————————————————————————|
      | # HP     : int                |           | — stamina : int              |
      | # atk    : int                |           |——————————————————————————————|
      | # def    : int                |           | CiudadanoExplorador(x : int, |
      |———————————————————————————————|           | y : int, z : int)            |
      | + Ciudadano(x : int,          |           |——————————————————————————————| 
      | y : int, z : int)             |           | + mostrar    : void          |
      | + mostrar        : void       |           | + getStamina : int           |
      | + comparar       : void       |           |——————————————————————————————|
      | + ejeOficio(objC : Ciudadano) |
      |———————————————————————————————| ◁———————— |——————————————————————————————| 
          △                                       | CiudadanoRecolector          |
          |                                       |——————————————————————————————|
          |                                       | — capacidad : int            |
|——————————————————————————————|                  |——————————————————————————————|
| CiudadanoGuerrero            |                  | CiudadanoRecolector(x : int, |
|——————————————————————————————|                  | y : int, z : int)            |
| — stamina : int              |                  |——————————————————————————————|
|——————————————————————————————|                  | + mostrar    : void          |
| CiudadanoGuerrero(x : int,   |                  | + getCapacidad : int         |
| y : int, z : int)            |                  |——————————————————————————————|
|——————————————————————————————|
| + mostrar    : void          |
| + getStamina : int           |
|——————————————————————————————|





### Mostrar las ventajas del uso de patrones.
