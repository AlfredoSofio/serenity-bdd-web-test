# language: es

  Característica: El usuario

      Escenario: Un usuario no registrado compra un teléfono
      Dado que un usuario accede al sitio
      Cuando el usuario selecciona la categoría "Phones"
      Y agrega el producto "Samsung galaxy s6" al carrito
      Y confirma la compra ingresando:
      | Nombre        | País   | Ciudad | Tarjeta         | Mes | Año  |
      | Juan Pérez    | Perú   | Lima   | 4111111111111111 | 12  | 2025 |
      Entonces el sistema debe mostrar el mensaje de confirmación con el ID de orden generado

      @Demoblaze @CompraAnonima @Laptop
      Escenario: Un usuario no registrado compra una laptop
      Dado que un usuario anónimo accede al sitio "https://www.demoblaze.com"
      Cuando el usuario selecciona la categoría "Laptops"
      Y agrega el producto "Sony vaio i5" al carrito
      Y confirma la compra ingresando:
      | Nombre        | País     | Ciudad  | Tarjeta         | Mes | Año  |
      | Ana González  | Colombia | Bogotá  | 5555444433332222 | 10  | 2024 |
      Entonces el sistema debe mostrar el mensaje de confirmación con el ID de orden generado

      @Demoblaze @CompraAnonima @TelefonoYLaptop
      Escenario: Un usuario no registrado compra un teléfono y una laptop
      Dado que un usuario anónimo accede al sitio "https://www.demoblaze.com"
      Cuando el usuario agrega el producto "Nokia lumia 1520" desde "Phones"
      Y agrega el producto "MacBook air" desde "Laptops"
      Y confirma la compra ingresando:
      | Nombre         | País    | Ciudad  | Tarjeta         | Mes | Año  |
      | Pedro Martínez | México  | CDMX    | 4111222233334444 | 08  | 2026 |
      Entonces el sistema debe mostrar el mensaje de confirmación con el ID de orden generado
      Y el total refleje la suma de los dos productos

      @Demoblaze @Registro @Exitoso
      Escenario: Un usuario no registrado crea una cuenta exitosamente
      Dado que un usuario anónimo accede al sitio "https://www.demoblaze.com"
      Cuando el usuario accede al formulario de registro
      Y registra un usuario nuevo con:
      | Usuario       | Contraseña     |
      | user_test123  | Password!2024  |
      Entonces el sistema debe mostrar un mensaje de "Sign up successful"

      @Demoblaze @Registro @Fallido
      Escenario: Un usuario no registrado no puede crear una cuenta con usuario ya existente
      Dado que un usuario anónimo accede al sitio "https://www.demoblaze.com"
      Cuando el usuario accede al formulario de registro
      Y intenta registrar un usuario existente con:
      | Usuario      | Contraseña    |
      | demouser     | cualquier123  |
      Entonces el sistema debe mostrar el mensaje de error "This user already exist."

#@Demoblaze @Login @Exitoso
#Escenario: Un usuario inicia sesión exitosamente
#Dado que un usuario accede al sitio "https://www.demoblaze.com"
#Cuando el usuario ingresa sus credenciales válidas:
#| Usuario  | Contraseña |
#| demouser | testing123 |
#Entonces el sistema debe mostrar el nombre de usuario en la esquina superior derecha

#@Demoblaze @Login @Fallido
#Escenario: Un usuario no puede iniciar sesión por contraseña inválida
#Dado que un usuario accede al sitio "https://www.demoblaze.com"
#Cuando el usuario intenta iniciar sesión con:
#| Usuario  | Contraseña     |
#| demouser | incorrecto999  |
#Entonces el sistema debe mostrar el mensaje de error "Wrong password."
