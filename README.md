# Employee Management Frontend

Este es el frontend de una aplicación de gestión de empleados desarrollada con Angular. La aplicación se conecta a un backend para obtener y mostrar información sobre los empleados.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Abre una terminal y navega a la carpeta del proyecto: `cd employee-management-frontend`.
3. Instala las dependencias utilizando npm: `npm install`.

## Uso

1. Ejecuta el servidor de desarrollo: `ng serve`.
2. Abre un navegador y ve a `http://localhost:4200` para ver la aplicación.

## Características

- Lista de empleados con detalles individuales.
- Cálculo de salario anual.
- Navegación entre vistas.
- Estilos utilizando Bootstrap.

-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

# Employee Management Backend

Este es el backend de una aplicación de gestión de empleados desarrollada con Spring Boot. Proporciona una API REST para administrar información sobre los empleados.

## Instalación

1. Clona este repositorio en tu máquina local.
2. Abre tu IDE y selecciona `Importar Proyecto` o similar, luego selecciona la carpeta del proyecto: `employee-management-backend`.

## Uso

1. Inicia la aplicación en tu IDE.
2. La API REST estará disponible en `http://localhost:8080`.

## Endpoints

- `GET /api/v1/employees`: Obtiene una lista de empleados.
- `GET /api/v1/employee/{id}`: Obtiene detalles de un empleado por su ID.
- `POST /api/v1/employee`: Agrega un nuevo empleado.
- `PUT /api/v1/employee/{id}`: Actualiza los detalles de un empleado existente.
- `DELETE /api/v1/employee/{id}`: Elimina un empleado por su ID.

## Tecnologías

- Java
- Spring Boot
- H2 Database
- RESTful API




