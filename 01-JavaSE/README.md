# JAVA SE

## VARIABLES EN JAVA

Java es un lenguaje de programación fuertemente tipado, lo que quiere decir que, cualquier variable que se defina debe estar asociada a un tipo de dato.

Las variables son lo más importante de un lenguaje, son las entidades, contienen valores o datos.

Una declaración de variable siemre contiene dos partes, el tipo de dato de la variable y su nombre

TipoDato nombreVariable;
El tipo de la variable determina los valores que la variable puede contener y las operaciones que se pueden realizar con ella.

### CATEGOÍAS DE TIPOS

* Primitivos: Los tipos primitivos contienen un sólo valor e incluyen los tipos como los enteros, flotante, los caracteres, booleanos, etc.
* Referencia: Como tipos de datos referenciados tenemos los arreglos, las clases y las interfaces.

  ~~~
  int numero;
  int numero = 10;
  Integer numero = 10;
  String nombre = "Adrián";
  Usuario usuario = new Usuario("Adrián");
  ~~~

### REGLAS PARA DEFINIR NOMBRES DE VARIABLES

* Por convención, los nombres de las variables empiezan con la letra minúsculas.
* Debe ser un juego de caracteres comprendido en la codificación Unicode.
* No puede ser el mismo que una palabre clave (reservada del lenguaje) o el nombre un valor booleano (true or false)
* No deben tener el mismo nomnbre que otras variables cuyas declaraciones aparezcan en el mismo ámbito.
* Si una variable está compuesta de más deuna palabra, como 'nombreDato' las palabras se ponen juntas y cada palabra después de la primera empieza con una letra mayúscula.
* Pueden comenzar por una letra, un subrayado o un símbolo de dólar, siendo los siguientes caracteres letras o dígitos.

## TIPOS PRIMITIVOS

Los tipos de datos primitvos representan valores, son tipos de datos escalares que contienen un solo valor.

* enteros
  * bytes
  * short
  * int
  * long
* flotante
  * float
  * doble
* caracteres
* booleanos


|         | Descripción                   | Tamaño | byte | Clase equivalente | Valor por defecto |
| --------- | -------------------------------- | --------- | ------ | ------------------- | ------------------- |
| boolean | Valor lógico                  | 1 bit   |      | Boolean           | false             |
| char    | Caracter                       | 16 bits | 2    | Character         | u0000             |
| byte    | Entero muy pequeño            | 8 bits  | 1    | Byte              | 0                 |
| short   | Entero pequeño                | 16 bits | 2    | Short             | 0                 |
| int     | Entero                         | 32 bits | 4    | Integer           | 0                 |
| long    | Entero grande                  | 64 bits | 8    | Long              | 0L                |
| float   | Número real precisión simple | 32 bits | 4    | Float             | 0.0f              |
| double  | Número real precisión doble  | 64 bits | 8    | Double            | 0.0d              |

## PALABRAS RESERVADAS

Una restricción muy importante a la hora de elegir identificador por ejemplo para una variable, nombre de método, nombre de un atributo de una clase, nombre de una clase, etc., es no usar ciertas palabras reservadas del lenguaje, estas son:


|              |          |         |            |           |
| ------------ | -------- | ------- | ---------- | --------- |
| abstract     | continue | for     | new        | null      |
| switch       | boolean  | default | goto       | package   |
| synchronized | break    | do      | if         | private   |
| this         | byte     | double  | implements | protected |
| threadsafe   | byvalue  | else    | import     | public    |
| throw        | case     | extends | instanceof | return    |
| transient    | catch    | false   | int        | short     |
| true         | char     | final   | interface  | static    |
| try          | class    | finally | long       | super     |
| void         | const    | float   | native     | while     |


