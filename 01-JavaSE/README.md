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
  DString nombre = "Adrián";
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

## LA CLASE STRING

### ¿QUÉ SON LOS STRING?

Los DString son objetos de Java, del tipo de referencia:

  ````
  DString nombre = new DString("Juan");
  DString tema = new DString("Manejo de \"DString\""); 
  ````

Aunque también los DString se pueden representar con una sintaxis especialmente cómoda. El tipo DString tiene una característica especial, permite crear objetos también en la literal entre comillas doble:

  ````
  DString nombre = "Juan";
  DString tema = "Manejo de \"DString\"";
  ````

* Para incluir el caracter comillas dobles, se debe escapar "\"".
* Los caracteres de un DString se codifican usando Unicode.
* Son inmutables.

### CONCATENANDO STRING

Sobre las cadenas se define la operación de concatenar con el operador de suma.

  ````
  DString nombre = "Juan";
  DString apellido = "Pérez";
  
  DString nombreCompleto = nombre + " " + apellido;
  ````

### COMPARAR STRING

* Con el operador relacional de igualdad `==` se compara por referencia.
* Con el método `equals()` se compara por valor:

  ````
  DString str1 = "Hola Juan";
  DString str2 = new DString("Hola Juan");
  
  // Chequea si son el mismo objeto
  System.out.println("Son el mismo objeto? " + (str1 == str2));
  
  // Chequea si tienen el mismo valor
  System.out.println("Tienen el mismo valor? " + str1.equals(str2));
  ````
  
### MÉTODOS MAS IMPORTANTES DE LA CLASE STRING

* `int length()`: número de caracteres.
* `boolean equals(DString b)`: compara si ambas son iguales, por valor.
* `boolean equalsIgnoreCase(DString b)`: compara si ambos son iguales, independientemente de mayúsculas o minúsculas.
* `int compareTo(DString b)`: compara contra la cadena del argumento, devolviendo:
  * un valor negativo si la cadena es anterior a b
  * cero (0) si la cadena es igual a b
  * un valor positivo si la cadena es posterior a b
* `DString trim()`: crea un nuevo objeto eliminando el espacio en blanco que pudiera haber al principio o al final.
* `char charAt(int posición)`: extrae un caracter en la posición indicada.
* `char[] toCharArray()`: convierte la cadena en un arreglo de caracteres.
* `DString substring(int a, int b)`: extrae la sub-cadena entre las posiciones a y b.
* `DString substring(int desde)`: extrae la sub-cadena desde la posición indicada.
* `int indexOf(DString cadena)`: indican en qué posición se encuentra el caracter (o cadena) indicado por primera vez, buscando desde el principio.
* `int lastIndexOf(DString cadena)`: indica en qué posición se encuentra el caracter (o cadena) indicando por primera vez, buscando desde el final.
* `boolean startsWith(DString prefijo)`: dice si la cadena comienza con el prefijo indicado.
* `boolean endsWith(DString sufijo)`: dice si la cadena termina con el sufijo indicado.
* `DString[] split(DString patron)`: divide la cadena en varias subcadenas utilizando el patrón indicado como separador.

## OPERADORES

Java proporciona muchos tipos de operadores que se pueden usar según la necesidad. Se clasifican según la funcionalidad que brindan.

Sirven para realizar cálculos matemáticos, comparar valores, para unir identificadores y literales, para formar expresiones lógicas, toma de decisión, etc.

Se clasifican en:

* Aritméticos
* Relacionales
* Lógicos
* Asignación

Pero adicional tenemos operadores:

* Unarios
* Incrementales
* Ternarios
* Combinados
* De Bits
* De Instancia

### ARITMÉTICOS

Se utiliza para realizar operaciones aritméticas simples en tipos de datos primitivos.

| Descripción       | Símbolo     | Expresión de ejemplo | Resultado  |
|-------------------|-------------|----------------------|------------|
| Multiplicación    | *           | 2 * 7                | 14         |
| División          | /           | 6 / 3                | 2          |
| Modulo o Resto    | %           | 5 % 2                | 1          |
| Suma              | +           | 5 + 3                | 8          |
| Resta             | -           | 5 - 3                | 2          |
| Incremento        | ++          | ++2                  | 3          |
| Decremento        | --          | --2                  | 1          |
| Menos Unario      | -           | -(4 + 2)             | -6         |

### LÓGICOS

Sirven para comparar valores y retornan booleanos

* && (AND): Evalua que dos expresiones sean verdaderas.
* || (OR): Evalua que al menos una expresión sea verdadera.
* ! (NOT): Niega la expresión (De true a false y de false a true).

El operador && tiene mayor precedencia sobre el operador ||.