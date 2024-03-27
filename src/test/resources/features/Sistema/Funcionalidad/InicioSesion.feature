#language: es
Característica: como automatizador
  Quiero probar el inicio de sesion de la aplicacion
  Para verificar la calidad de la aplicacion

  Escenario: Validar que al ingresar el usuario y contrasena correctos el sistema nos muestra el nombre de la aplicacion
    Dado Abrir la pagina web
    Cuando me autentico con Usuario y Contrasena
      |User         |Password    |
      |standard_user|secret_sauce|
    Entonces el sistema deberia mostrar la aplicacion homme