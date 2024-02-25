**Clases abstractas en Java.**
Este proyecto, realizado en Java utilizando IntelliJ IDEA, tiene como objetivo practicar el uso de clases abstractas en Java, específicamente en el contexto de la creación de elementos HTML para su consumo en un navegador web.

**Elementos de HTML**
*Los elementos de HTML que se están implementando son: input, select, y textarea.

1. Clase abstracta ElementoForm
Contiene los atributos valor y nombre.
Implementa los métodos validadores y manejo de errores.
2. Clase InputForm
Contiene el atributo tipo.
Implementa el método toString.
3. Clase Textarea
Contiene los atributos filas y columnas.
4. Clase SelectForm
Contiene una lista de opciones que se representa como un ArrayList.
5. Clase Opcion
Contiene los atributos valor, nombre y selected.
El atributo selected es de tipo booleano.
Package Validador
Este paquete contiene una jerarquía de clases para validar los elementos del formulario.

Clase abstracta Validador
Contiene el atributo protegido mensaje y el método abstracto isValido.
Clase EmailValidador
Valida la correcta escritura de direcciones de correo electrónico utilizando expresiones regulares.
Clase LargoValidador
Contiene los atributos min y max.
Valida que el campo tenga un número mínimo y máximo de caracteres.
Clase NoNuloValidador
Valida que el campo no sea nulo.
Clase NumeroValidador
Valida que se ingrese un número.
Clase RequeridoValidador
No permite que el campo esté vacío.
**Contribuciones**  
- Se reciben aportes y contribuciones para mejorar este proyecto. 
- Si tienes sugerencias, correcciones o nuevas características que agregar.


