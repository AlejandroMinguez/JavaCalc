# Calculadora Compleja

Este es un proyecto de una calculadora compleja desarrollada en Java utilizando JavaFX. La calculadora permite realizar operaciones básicas como suma, resta, multiplicación, división y cálculo de restos, y está diseñada para una interacción tanto con botones como con entradas de teclado.

## Características

- Operaciones aritméticas básicas: suma, resta, multiplicación, división y resto.
- Interfaz gráfica de usuario (GUI) interactiva usando JavaFX.
- Soporte para entrada mediante teclado.
- Manejo de errores en las operaciones.
- Reemplazo automático de operadores al ingresar un nuevo operador.

## Capturas de Pantalla

[![Calculadora.png](https://i.postimg.cc/4yVPd9Y2/image.png)](https://postimg.cc/rRyxZzC5)

## Requisitos

- JDK 11 o superior
- JavaFX SDK

## Instalación

1. Clona este repositorio:
    ```bash
       https://github.com/AlejandroMinguez/JavaCalculator.git
    ```

2. Importa el proyecto en tu IDE preferido (IntelliJ, Eclipse, etc.).

3. Asegúrate de tener configurada la biblioteca de JavaFX en tu proyecto. Puedes seguir [esta guía](https://openjfx.io/openjfx-docs/) para configurar JavaFX.

## Uso

Para ejecutar la calculadora, simplemente ejecuta la clase `calculadoraCompleja.java` desde tu IDE.

### Controles

- **Botones**: Utiliza los botones en la interfaz gráfica para ingresar números y operadores.
- **Teclado**: Puedes usar las teclas numéricas y operadores para realizar las operaciones:
    - `0-9`: Ingresar números.
    - `+`, `-`, `*`, `/`, `%`: Operadores.
    - `.`: Punto decimal.
    - `Enter` o `=`: Calcular el resultado.
    - `Escape`: Borrar la pantalla.
    - `Backspace`: Borrar el último carácter.

## Estructura del Proyecto

```plaintext
│   .gitignore
│   mvnw
│   mvnw.cmd
│   pom.xml
│
├───.idea
│       .gitignore
│       compiler.xml
│       encodings.xml
│       jarRepositories.xml
│       misc.xml
│       uiDesigner.xml
│       vcs.xml
│       workspace.xml
│
├───.mvn
│   └───wrapper
│           maven-wrapper.jar
│           maven-wrapper.properties
│
├───src
│   └───main
│       ├───java
│       │   │   module-info.java
│       │   │
│       │   └───com
│       │       └───example
│       │           └───calculadoracompleja
│       │               │   calculadoraCompleja.java
│       │               │   CalculadoraComplejaController.java
│       │               │
│       │               └───DTO
│       │                       Operaciones.java
│       │
│       └───resources
│           └───com
│               └───example
│                   └───calculadoracompleja
│                           calculadoraCompleja-view.fxml
│
└───target
    ├───classes
    │   │   module-info.class
    │   │
    │   └───com
    │       └───example
    │           └───calculadoracompleja
    │               │   calculadoraCompleja-view.fxml
    │               │   calculadoraCompleja.class
    │               │   CalculadoraComplejaController$1.class
    │               │   CalculadoraComplejaController.class
    │               │
    │               └───DTO
    │                       Operaciones.class
    │
    └───generated-sources
        └───annotations
