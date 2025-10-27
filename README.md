🏥 Clínica Spring Boot Zambrano - BD

Este proyecto es una aplicación desarrollada con Spring Boot y JPA (Jakarta Persistence) para la gestión de información médica en una clínica.
Permite manejar datos de pacientes, médicos, historias clínicas y tarjetas profesionales de forma estructurada en una base de datos relacional. ⚙️💉

🚀 Tecnologías Utilizadas

☕ Java 17+

🌱 Spring Boot

🧩 Spring Data JPA

🗄️ MySQL / PostgreSQL (o cualquier base de datos relacional compatible)

🕒 Jakarta Persistence (JPA)

🧠 Hibernate

🧬 Estructura del Proyecto

El proyecto está dividido en diferentes entidades del dominio médico:

👨‍⚕️ Entidad Medico

Representa a los doctores del sistema.
Contiene información como nombre, especialidad, experiencia, teléfono, correo y dirección.
Está relacionada uno a uno (1:1) con TarjetaProfesional.

🎓 Entidad TarjetaProfesional

Guarda los datos de la tarjeta profesional del médico, como número, entidad emisora, fechas de emisión y vencimiento, y observaciones.
Se relaciona 1:1 con Medico.

🧍 Entidad Paciente

Representa a los pacientes registrados en la clínica.
Incluye información personal como nombre completo, tipo y número de documento, edad, género, teléfono, dirección, correo y fecha de registro.
Está relacionada uno a uno (1:1) con HistoriaClinica.

📋 Entidad HistoriaClinica

Almacena la historia clínica del paciente.
Contiene datos como motivo de consulta, diagnóstico, tratamiento, alergias, antecedentes médicos y resultados de exámenes.
Se relaciona 1:1 con Paciente.

🔗 Relaciones entre Entidades
Entidad Principal	Relación	Entidad Asociada
👨‍⚕️ Medico	1:1	🎓 TarjetaProfesional
🧍 Paciente	1:1	📋 HistoriaClinica
📦 Estructura del Código
src/
└── main/
    ├── java/com/example/ClinicaSpringBootZambrano_BD/
    │   └── modelos/
    │       ├── Paciente.java
    │       ├── HistoriaClinica.java
    │       ├── Medico.java
    │       └── TarjetaProfesional.java
    └── resources/
        ├── application.properties
        └── data.sql (opcional)


Ejecuta el proyecto desde la clase principal de Spring Boot.

🧪 Próximas Mejoras

✨ Implementar controladores REST para cada entidad
🧩 Crear servicios y repositorios con Spring Data
📱 Desarrollar una interfaz web para gestión médica
🧠 Añadir autenticación y roles (paciente, médico, administrador)

👨‍💻 Autora 

Desarrollado por Dariannys Zambrano
💼 Proyecto académico
📅 Año: 2025
