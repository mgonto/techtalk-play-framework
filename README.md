# Play! Framework
En este repo se encontrara una presentacion que sera dada como capacitación de Play! Framework, junto con un ejemplo practico y varios ejercicios para ser resueltos
## Ejemplo
El ejemplo es una agenda. En dicha agenda, uno podra guardar contactos y luego listarlos.
El ejemplo se separa en 5 branches. Cada branch es considerado un paso que agrega nuevas funcionalidades a la aplicación. El branch ejemplo-final tiene la version terminada.
## Ejercicios
Hay varios ejercicios ha ser realizados sobre el ejemplo-final. Cada uno de estos ejercicios tiene un branch con la solución propuesta.
* Busqueda: El ejercicio consiste en crear una nueva página que permita realizar busquedas sobre los nombres de los contactos.
* Edicion: El ejercicio consiste en agregar una pagina de edición para cada contacto y linquear a la misma desde la lista de contactos. Es importante chequear aqui las rutas para que quede una URL simpatica
* Mails: El ejercicio consiste en agregarle un mail a cada uno de los contactos (ademas de su nombre y su telefono). Dicha propiedad debe tener una validacion que la haga requerida y que sea un mail. Luego de crear cada nuevo contacto, la aplicacion enviara un mail a ese contacto con su nombre y telefono para corroborar que la informacion es correcta. Es importante enviar este mail tanto en formato TXT como HTML para que cualquier persona pueda recibirlo
* Job Annoy: Este ejercicio depende del ejercicio anterior. La idea del ejercicio es dar al usuario la habilidad de molestar a sus contactos. Cada contacto debe tener un switch on y off para molestarlo (que debera ser activado y desactivado mediante un link desde la lista). Se debera crear un job que se corra cada 10 segundos que envie un mail molestando a todas las personas que tienen dicho switch en on.