#language: es
Característica: Como responsable de las cuentas de deposito del banco Parabank
  Quiero que los clientes del banco puedan crear una cuenta de ahorro o corriente de forma autonoma
  Para agilizar el proceso de creacion de cuentas y descongestionar sucursales físicas

  Escenario: El cliente debe estar creado en el sistema para crear una cuenta
    validar el sistema no permite crear cuentas para usuarios inexistentes

    Cuando intento crear una cuenta "0" obteniendo fondos de la cuenta "13344" para un cliente no existente con ID "12745"
    Entonces el sistema no debera permitir crear la cuenta
