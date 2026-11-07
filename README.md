\# Taller de Automatización de Pruebas - Unidad II



\## Objetivos del Proyecto

Profesionalizar el ciclo de desarrollo mediante la integración de un flujo de trabajo ágil basado en \*\*Integración Continua (CI)\*\*, asegurando la calidad del código a través de pruebas unitarias atómicas, aisladas e independientes.



\## Requisitos de Software

\* Java JDK 17

\* Apache Maven 3.8+

\* Git



\## Comandos Principales Utilizados

\* `git init`: Inicializa el repositorio local.

\* `git checkout -b <nombre\_rama>`: Crea y cambia a una rama de trabajo.

\* `mvn clean compile`: Limpia el directorio de salida y compila el código fuente.

\* `mvn test`: Ejecuta de forma automática todas las pruebas unitarias del proyecto.



\## Explicación del Pipeline y Estructura

El proyecto sigue el estándar de Maven dividiendo el código productivo de las pruebas en `src/main` y `src/test`. El archivo `.github/workflows/ci.yml` define un pipeline automatizado bajo el principio de \*Pipeline as Code\*. Cada cambio gatilla un contenedor limpio en Ubuntu, descarga las dependencias necesarias, compila el código fuente y corre los tests. Al finalizar, genera un reporte en formato XML/TXT dentro de `target/surefire-reports/`, el cual queda guardado como artefacto público navegable para garantizar total visibilidad a los desarrolladores y al equipo de QA.



