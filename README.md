# Calculadora Compleja

Este es un proyecto de una calculadora compleja desarrollada en Java utilizando JavaFX. La calculadora permite realizar operaciones básicas como suma, resta, multiplicación, división y cálculo de restos, y está diseñada para una interacción tanto con botones como con entradas de teclado.

## Características

- Operaciones aritméticas básicas: suma, resta, multiplicación, división y resto.
- Interfaz gráfica de usuario (GUI) interactiva usando JavaFX.
- Soporte para entrada mediante teclado.
- Manejo de errores en las operaciones.
- Reemplazo automático de operadores al ingresar un nuevo operador.

## Capturas de Pantalla

![Captura de pantalla](path/to/screenshot.png)

## Requisitos

- JDK 11 o superior
- JavaFX SDK

## Instalación

1. Clona este repositorio:
    ```bash
    git clone https://github.com/tuusuario/calculadora-compleja.git
    ```

2. Importa el proyecto en tu IDE preferido (IntelliJ, Eclipse, etc.).

3. Asegúrate de tener configurada la biblioteca de JavaFX en tu proyecto. Puedes seguir [esta guía](https://openjfx.io/openjfx-docs/) para configurar JavaFX.

## Uso

Para ejecutar la calculadora, simplemente ejecuta la clase `Main` desde tu IDE.

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
calculadora-compleja/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── example/
│   │   │           └── calculadoracompleja/
│   │   │               ├── CalculadoraComplejaController.java
│   │   │               ├── Main.java
│   │   │               └── DTO/
│   │   │                   └── Operaciones.java
│   │   └── resources/
│   │       └── com/
│   │           └── example/
│   │               └── calculadoracompleja/
│   │                   └── calculadora.fxml
└── README.md
