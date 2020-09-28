# Práctica: Catálogo Astronómico

La tarea consiste en implementar la clase ´CatalogoAstronomico`  que, como su nombre indica, representa un catálogo de astros.

Para ello debemos implementar el código Java necesario para resolver los siguientes ejercicios:

## Pasos previos:

* Abre Android Studio
* Selecciona la opción VCS / Get from Version Control... / 
* En el campo URL introduce : 
https://github.com/jesus-tomas-girones/catalogo_astronomico.git y haz click en el botón azul de clonar
* En la ventana emergente te preguntará si quieres abrir el proyecto. Indica que si.

## Ejercicio 1 “Clase Astro” 
1. Abre la clase `Astro` e impleméntala con los siguientes requisitos:
* Atributos: nombre (`String`), tipo (`String`), brillo observado desde la Tierra (`double`) y distancia en años luz desde la Tierra (`double`).
* Añade los getters y setters para estos atributos. 
* Constructores:
 Un constructor general con los parámetros apropiados para inicializar todos los atributos de objeto, en el mismo orden que han sido descritos en el punto anterior. 
 Un constructor por defecto que cree un Astro de nombre "Sirius", brillo -1.42 y distancia 8.7.
* Métodos:  
```java 
public boolean masDistante(Astro otro) {...}
```
Devuelve true o false, en función de si nuestro astro está mas distante que el otro astro.


```java 
public int masDistante(Astro otro) {...}
```
      
Requiere un parámetro del tipo `Astro` denominado otro. Devuelve un valor entero que será 1 si nuestro astro es más brillante que otro, -1 si nuestro astro es menos brillante y 0 si ambos astros son igual de brillantes.

```java 
public int visibleCon() {...}
```

Devuelve un `String` que describa la forma en la que el astro puede ser observado. Dicho string será:
  * `"a simple vista"`, si su brillo es menor que 5
  * `"con prismáticos"`, si su brillo es mayor o igual que 5 y menor que 7
  * `"con telescopio"`, si su brillo es mayor o igual que 7 y menor que 25
  * `"con grandes telescopios"`, si su brillo es mayor o igual que 25


```java 
public String toString() {...}
```

Devuelve un `String` con el siguiente formato: `"objeto-Astro {nombre: X, brillo: Z, distancia: K}"`; p.e., `"objeto-Astro {nombre: Sirius, brillo: -1.42, distancia: 8.7}"`


```java 
public boolean equals(Object o) {...}
```

Para comprobar si dos objetos `Astro` son iguales. Dos astros son iguales si todos sus atributos coinciden. Puedes generarlo automáticamente pulsando con el botón derecho del ratón en el editor y seleccionando la opción `generate/equals()`.

2. Abre la clase `Principal` y crea varios objetos de tipo `Astro` probando alguno de sus métodos.

3. Para ejecutar la clase `Principal` seleccionala con el botón derecho en el explorador del proyecto y selecciona la opción `Run`.

4. Para verificar que la clase `Astro` cumple los requisitos del ejercicio, abre la carpeta `catalogo / tests` en el navegador del proyecto y abre la clase `AstroTest`. Quita los comentarios (/* ... */). Pulsa con el botón derecho sobre la clase `AstroTest` y selecciona la opción `Run`.

5. Verifica que pasan todos los tests. En caso que algún test falle, comprueba el problema y trata de solucionarlo.

## Ejercicio 2 “Clases Planeta, Estrella y Galaxia” 

1. Completa la implementación de los siguientes tres descendientes de `Astro`:
* `Planeta`, con los atributos adicionales:
```java
Estrella sistema_solar;
boolean habitado;
```
* `Estrella`, con los atributos adicionales:
```java
int planetas;
Galaxia galaxia;
```
* `Galaxia`, sin atributos adicionales.
* Añade los métodos `toString()` para que se muestren de la siguiente forma:
```javascript
objeto-Astro {nombre: tierra, tipo: PLANETA, brillo: 0.0, distancia: 0.0, habitado: true, estrella: Sol}
objeto-Astro {nombre: Sol, tipo: ESTRELLA, brillo: 4.0, distancia: 149.6, galaxia: Vía Lactea}
objeto-Astro {nombre: Vía Lactea, tipo: GALAXIA, brillo: 0.0, distancia: 1275.0 }
```

2. Para verificar que las clases cumple los requisitos del ejercicio, abre la carpeta `catalogo / tests` en el navegador del proyecto y abre la clase `GalaxiaTest` , `EstrellaTest` y `PlanetaTest`. Quita los comentarios (/* ... */). Pulsa con el botón derecho sobre la clase y selecciona la opción `Run`.

3. Verifica que pasan todos los tests. En caso que algún test falle, comprueba el problema y trata de solucionarlo.


## Ejercicio 3 “Clase CatalogoAstronomico”
1. Implementa la clase `CatalogoAstronomico` que debe tener los siguientes atributos:


* Un `ArrayList catalogo`, que es una lista de los astros del catálogo.
*	Un `HashSet galaxias`, que es un conjunto de `String` con los nombres de las galaxias a las que pertenecen los astros del catálogo. Cuando se añade una galaxia al catálogo, también se de incluir en este conjunto. 
*	Un número entero `numAstrosSimpleVista`, que representa el número de astros a simple vista que contiene el catálogo (ver clase Astro).

NOTA: estos atributos no deben tener `getters`, pero no `setters`.

La case `CatalogoAstronomico` debe implementar los métodos que se indican a continuación.:

```java
boolean esEstrellaSimpleVista(int i); //Devuelve true si el Astro en una posición válida del catálogo es una estrella visible a simple vista
boolean anade(Astro a); //Añade un astro al catálogo y devuelve true si se ha podido añadir. Si el nombre ya existe no será añadido.
void borrar(String nombre); //Elimina el astro con el nombre indicado. 
Astro buscaAstro(String nombre); //Busca un astro por su nombre
Astro primeroMasBrillanteQue(Astro a); // Devuelve el primer Astro del catálogo que es más brillante en magnitud absoluta que un Astro dado (lo de primero puede tener varias interpretaciones)
Astro[]List<Astro> filtraAstrosSimpleVista(); //Devuelve un array de objetos Astro con las estrellas visibles a simple vista que contiene el catálogo (creo que se van a liar menos si usan una lista)
Astro masBrillante (); //Devuelve el Astro que es más brillante en magnitud absoluta de todos los del catálogo
```

Además, debe incluir un método `toString()` que devuelva un string que muestre la lista de astros que contiene separados por ; Por ejemplo:

```javascript
objeto-Astro {nombre: tierra, tipo: PLANETA, brillo: 0.0, distancia: 0.0, habitado: true, estrella: Sol}; 
objeto-Astro {nombre: Sol, tipo: ESTRELLA, brillo: 4.0, distancia: 149.6, galaxia: Vía Lactea}; 
objeto-Astro {nombre: Vía Lactea, tipo: GALAXIA, brillo: 0.0, distancia: 1275.0 }
```

2. Para verificar que la clase cumple los requisitos del ejercicio, utiliza los test definidos en `CatalogoAstronomicoTest`.

## Entrega de la práctica

* Selecciona la opción de Android Studio:
```
 VCS / Import into Version Control / Share Projet on GitHub.
```
* Te indicará que ya está en GitHub. No obtante queremos subirlo a nuestro propio repositorio. Haz click en `Share Anyway`
* Parca la opción `Private` y pulsa el botón `Share`.
* Comparte el proyecto con la cuenta de github del profesor:
  * Desde GitHub en el navegador, ve al proyecto.
  * Haz click en la opción de `Settings` arriba a la derecha.
  * Elije la opción de `Manage access` a la izquierda.
  * Haz click en el botón verde de `Invite a collaborator`. 
  * Introduce el nombre que te indicará el profesor en el campo de búsqueda y haz click en añadir.