#language: es
Característica: Como analista de automatizacion de pruebas o desarrollador
  Quiero probar el iniciar de sesion de la aplicacion
  Para verificar la calidad de la aplicacion

  Antecedentes:
    Dado que el usuario ingreso a Saucedemo

  Escenario: Validar que al ingresar el usuario y contrasena correctos el sistema nos muestra el nombre de la aplicacion
    Dado que procede a autenticarse con usuario y contrasena
    Cuando procede a agregar los productos
    E ingresa al carrito y elimina el primer producto agregado
    Y Realizar checkout
    Entonces el sistema debera mostrar el mensaje de exito
    Y Luego cierra la sesion
