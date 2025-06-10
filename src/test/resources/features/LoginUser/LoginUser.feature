# language: es

  Característica: El usuario realiza login

    Esquema del escenario: Un usuario inicia sesión y compra un monitor
      Dado que el usuario abre la pagina "https://www.demoblaze.com/"
      Cuando el usuario inicia sesion ingresando "<user>" y "<password>"
      Entonces al realizar el login puede ver "<message>"
      Ejemplos:
        | user     | password                | message                   |
        | 202506   | Pruebas2025060404       | Sign up successful.  |


    Esquema del escenario: El usuario realiza el registro no exitoso
      Dado que el usuario abre la pagina "https://www.demoblaze.com/"
      Cuando el usuario inicia sesion ingresando "<user>" y "<password>"
      Entonces ve el mensaje de error "<message>"

      Ejemplos:
        |user   | password           | message              |
        |test   | test4415645*!@#$!  | Sign up successful.  |