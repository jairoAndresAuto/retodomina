#language: es
Característica: Como analista de automatizacion de pruebas o desarrollador
  Quiero probar el iniciar de sesion de la aplicacion
  Para verificar la calidad de la aplicacion

  Antecedentes:
    Dado que el usuario ingreso a Saucedemo

  Escenario: Validar que al ingresar el usuario y contrasena correctos el sistema nos muestra el nombre de la aplicacion
    Cuando autentica con usuario y contrasena
      |User         |Password    |
      |standard_user|secret_sauce|
    Entonces el sistema debera mostrar la aplicacion homme

  Escenario: Validar que al ingresar el usuario y contrasena correctos el sistema nos muestra el nombre de la aplicacion (Usuario Bloqueado)
    Cuando autentica con usuario y contrasena
      |User            |Password    |
      |locked_out_user |secret_sauce|
    Entonces el sistema debera mostrar la aplicacion homme