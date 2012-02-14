# Play! Framework
En este repo se encontrara una presentación que sera dada como capacitación de Play! Framework, junto con un ejemplo practico y varios ejercicios para ser resueltos.

Para poder ver la presentacion hacer click [aqui](http://zauberlabs.github.com/techtalk-play-framework/ "Presentacion de Play!") o ir al siguiente link: http://zauberlabs.github.com/techtalk-play-framework/

## Ejemplo
El ejemplo es una agenda. En dicha agenda, uno podra guardar contactos y luego listarlos.
El ejemplo se separa en 5 branches. Cada branch es considerado un paso que agrega nuevas funcionalidades a la aplicación. El branch ejemplo-final tiene la version terminada.
## Ejercicios
Hay varios ejercicios ha ser realizados sobre el ejemplo-final. Cada uno de estos ejercicios tiene un branch con la solución propuesta:

1.  __Busqueda:__ El ejercicio consiste en crear una nueva página que permita realizar busquedas sobre los nombres de los contactos.
1.  __Edicion:__ El ejercicio consiste en agregar una pagina de edición para cada contacto y linquear a la misma desde la lista de contactos. Es importante chequear aqui las rutas para que quede una URL simpatica
1.  __Mails:__ El ejercicio consiste en agregarle un mail a cada uno de los contactos (ademas de su nombre y su telefono). Dicha propiedad debe tener una validacion que la haga requerida y que sea un mail. Luego de crear cada nuevo contacto, la aplicacion enviara un mail a ese contacto con su nombre y telefono para corroborar que la informacion es correcta. Es importante enviar este mail tanto en formato TXT como HTML para que cualquier persona pueda recibirlo
1.  __Job Annoy:__ Este ejercicio depende del ejercicio anterior. La idea del ejercicio es dar al usuario la habilidad de molestar a sus contactos. Cada contacto debe tener un switch on y off para molestarlo (que debera ser activado y desactivado mediante un link desde la lista). Se debera crear un job que se corra cada 10 segundos que envie un mail molestando a todas las personas que tienen dicho switch en on.

## Branches
A continuación, se enumerarán todos los Branches con su correspondiente explicación:

*  __gh-pages__: En este branch encontrarán la presentacion que fue dada en Zauber Software sobre Play!. Dicha presentacion fue realizada utilizando el template de Google para presentaciones con HTML5.
*  __master__: Contiene este readme
*  __ejemplo, ejemplo-step-#__: Esta serie de branches contienen los diversos pasos que fueron mostrados en la presentacion de Play! para crear la Agenda.
*  __ejemplo-final__: Aquí esta la versión terminada del ejemplo
*  __ejercicio-*__: Aquí estan las soluciones a los ejercicios enunciados en la sección anterior
*  __completo__: Este branch es un merge del ejemplo-final con todos los ejercicios propuestos.