# Comparación de Algoritmos: Enfoques Iterativos vs. Recursivos

Este repositorio contiene la implementación en **Java** de tres ejercicios algorítmicos fundamentales resueltos mediante dos paradigmas de programación: **Iterativo** y **Recursivo**.

El objetivo del proyecto es analizar y comparar ambos enfoques en términos de implementación, ejecución y complejidad computacional (Tiempo y Espacio).

## 📂 Estructura del Proyecto

El código fuente está organizado de manera modular:

* **`src/Ejercicios/`**: Contiene la lógica pura de los algoritmos.
    * `Suma.java`: Suma de elementos de un arreglo.
    * `Maximo.java`: Búsqueda del máximo (Divide y Vencerás vs Lineal).
    * `Invertir.java`: Inversión de cadenas de texto.
* **`src/Pruebas/`**: Contiene los métodos de prueba unitaria para cada ejercicio.
* **`src/Main.java`**: Punto de entrada principal con un menú interactivo en consola.

## 🚀 Instrucciones de Ejecución

Para compilar y ejecutar este proyecto, asegúrate de tener instalado el **JDK (Java Development Kit)**.

### 1. Compilar
Abre tu terminal en la carpeta raíz del código fuente (donde se encuentra `Main.java`) y ejecuta:

```bash
javac Main.java Ejercicios/*.java Pruebas/*.java
```

### 2. Ejecutar
Una vez compilado, inicia el programa con:

```bash
java Main
```
---
## 💻 Ejemplos de Funcionamiento

El programa cuenta con un menú interactivo. A continuación se muestran ejemplos de uso:

### Ejercicio 1: Sumar un Arreglo
* **Entrada:** `1 5 10 4`
* **Salida:**
    ```text
    Iterativo: 20
    Recursivo: 20
    ```

### Ejercicio 2: Máximo de un Arreglo (Divide y Vencerás)
Genera números aleatorios y busca el mayor.
* **Entrada:** `Cantidad de elementos: 5`
* **Salida:**
    ```text
    Arreglo generado: [ 12 85 4 99 23 ]
    Max Iterativo: 99
    Max Recursivo: 99
    ✅ Validación correcta.
    ```

### Ejercicio 3: Invertir una Cadena
* **Entrada:** `Hola Mundo`
* **Salida:**
    ```text
    Original:  Hola Mundo
    Iterativo: odnuM aloH
    Recursivo: odnuM aloH
    ```

  ---

## 📊 Análisis de Complejidad

Comparativa teórica del rendimiento de ambas implementaciones:

| Algoritmo | Enfoque | Complejidad Temporal | Complejidad Espacial | Justificación |
| :--- | :--- | :---: | :---: | :--- |
| **Suma Arreglo** | Iterativo | $O(n)$ | $O(1)$ | Solo usa variables locales (`i`, `total`). |
| | Recursivo | $O(n)$ | $O(n)$ | Ocupa espacio en la pila de llamadas (Stack) proporcional a $N$. |
| **Máximo** | Iterativo | $O(n)$ | $O(1)$ | Recorrido lineal simple. |
| | Recursivo | $O(n)$ | $O(\log n)$ | Divide y Vencerás. La altura del árbol de recursión es logarítmica. |
| **Invertir Cadena**| Iterativo | $O(n)$ | $O(n)$ | El `StringBuilder` ocupa espacio proporcional a la cadena nueva. |
| | Recursivo | $O(n)$ | $O(n)$ | Requiere profundidad en la pila igual a la longitud de la cadena. |

### Conclusiones
1.  **Eficiencia de Memoria:** El enfoque **iterativo** es generalmente más eficiente en espacio ($O(1)$ para la suma y máximo), evitando errores de *StackOverflow* en entradas muy grandes.
2.  **Claridad Conceptual:** El enfoque **recursivo** es más natural para problemas de estructura de árbol (como Divide y Vencerás en el ejercicio del Máximo), aunque conlleva un costo mayor de memoria.

---
**Autor:** Andrew Batista Garcia

**Fecha:** Noviembre 2025
