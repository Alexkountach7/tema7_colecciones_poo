# Práctica MERCADAW - Compra Online

## 1. Introducción

En esta práctica se ha desarrollado una aplicación en Java que simula una compra online de un supermercado llamado MERCADAW.
El objetivo es que un cliente pueda iniciar sesión, añadir productos a un carrito, aplicar promociones y ver el resumen final del pedido.

---

## 2. Estructura del programa

El programa está dividido en varias clases:

* AppZonaClientes: clase principal donde se ejecuta el programa.
* Mercadaw: se encarga de generar y almacenar los clientes.
* Cliente: representa a cada usuario con sus datos.
* Pedido: gestiona los productos del carrito y el importe total.
* Producto: enum donde se definen los productos disponibles.

---

## 3. Funcionamiento

### Inicio de sesión

Primero se generan varios clientes de forma aleatoria con usuario y contraseña.
Después, el usuario introduce sus datos para acceder.

Si los datos son incorrectos, puede intentarlo hasta 3 veces.
Si son correctos, puede empezar la compra.

---

### Creación del pedido

Cuando el cliente inicia sesión, se crea un pedido vacío.
Este pedido utiliza un HashMap para almacenar los productos y su cantidad.

---

### Añadir productos

El usuario puede elegir productos del listado.

* Si el producto ya está en el pedido, se incrementa la cantidad.
* Si no está, se añade con cantidad 1.

Cada vez que se añade un producto, se actualiza el importe total.

---

### Cálculo del importe

El importe total se va acumulando según se añaden productos al carrito.

---

### Promociones

Se aplican dos promociones:

Promo 3x2: por cada 3 productos iguales, solo se pagan 2.
Por ejemplo, si hay 3 unidades se paga 2, si hay 6 se paga 4.

Descuento del 10%: después de aplicar el 3x2, se reduce el total un 10%.

---

### Resumen del pedido

Se muestra un resumen con los productos añadidos, la cantidad y el importe total.

---

### Ordenar por unidades

También se puede mostrar el pedido ordenado por cantidad de productos de mayor a menor.

Para ello, se convierte el HashMap en una lista y se ordena.

---

## 4. Estructuras de datos utilizadas

* HashMap: para guardar productos y cantidades.
* HashSet: para almacenar los clientes sin repetir.
* ArrayList: para ordenar los productos.

---

## 5. Generación de clientes

Los clientes se generan automáticamente con un usuario y contraseña de 8 caracteres.
Se utilizan letras y números aleatorios.

---

## 6. Problemas encontrados

Durante la práctica surgieron algunos errores:

* La contraseña se hacía más larga de 8 caracteres porque no se reiniciaba en el bucle.
* Se usaba case '1' en lugar de case 1 en el switch.
* Se intentó ordenar directamente un HashMap, lo cual no es posible.

---

## 7. Conclusión

Esta práctica ha servido para trabajar con colecciones en Java y entender mejor cómo organizar un programa en varias clases.
También ha ayudado a aplicar lógica como el cálculo de importes y promociones.

---

## 8. Mejoras posibles

* Permitir eliminar productos del carrito.
* Mejorar la interacción con el usuario.
* Añadir más validaciones en la entrada de datos.

---
