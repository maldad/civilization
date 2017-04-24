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

### Mostrar las ventajas del uso de patrones.

+ Como las civilizaciones son únicas, el patrón Singleton sólo permite una instancia de cada una.
+ Usar el patrón decorador permite dotar a los ciudadanos de nuevas funcionalidades, como una mayor capacidad de carga o resistencia al desplazarse.
+ Con el patrón estrategia, se pueden crear nuevos oficios para los ciudadanos solamente agregando una nueva clase, en lugar de crear otro atributo o utilizar enumerados.



### Diseño de la solución usando patrones de diseño.
![uml-civilization]("https://raw.githubusercontent.com/maldad/civilization/master/Civilization/src/civilization/uml.png" "Diagrama UML")
