# language: es

Característica: El usuario se registra en el sitio

   Esquema del escenario: El usuario realiza el registro
    Dado que el usuario abre la pagina "https://www.demoblaze.com/"
    Cuando el usuario desea registrarse e ingresa  "<user>" y "<password>"
    Entonces ve el mensaje "<message>"

   Ejemplos:
    |user     | password           | message              |
    |20250604 | Pruebas2025060404  | Sign up successful.  |


  Esquema del escenario: El usuario realiza el registro no exitoso
    Dado que el usuario abre la pagina "https://www.demoblaze.com/"
    Cuando el usuario desea registrarse e ingresa "<user>" existente y "<password>"
    Entonces ve el mensaje de error "<message>"

    Ejemplos:
      |user   | password           | message                   |
      |202506 | Pruebas2025060404  | This user already exist.  |