
## 🧾 Práctica: **Añadir y usar una librería externa en Eclipse**

### 🎯 Objetivo

Aprender a incorporar una **librería externa (`.jar`)** al *Build Path* de un proyecto Java en Eclipse, y utilizar clases contenidas en esa librería desde nuestro código.

---

### **1. Crear el proyecto**

1. Abre Eclipse y crea un nuevo proyecto Java:
   **File → New → Java Project**
   Nombre: `EjemploLibreria`
2. Verifica que se crea la carpeta `src` y la librería del sistema:
   `JRE System Library [JavaSE-21]`

---

### **2. Crear la estructura del proyecto**

1. Dentro del proyecto, crea una carpeta llamada `lib` (clic derecho sobre el proyecto → **New → Folder → lib**).
2. Descarga la librería **Joda-Time** (versión 2.12.7) desde el siguiente enlace:
   👉 [https://repo1.maven.org/maven2/joda-time/joda-time/2.12.7/joda-time-2.12.7.jar](https://repo1.maven.org/maven2/joda-time/joda-time/2.12.7/joda-time-2.12.7.jar)
3. Copia el archivo descargado dentro de la carpeta `lib`.

---

### **3. Añadir la librería al Build Path**

1. Clic derecho sobre el proyecto → **Build Path → Configure Build Path…**
2. En la pestaña **Libraries**, pulsa **Add JARs…**
3. Localiza el archivo `lib/joda-time-2.12.7.jar` dentro del proyecto y selecciónalo.
4. Pulsa **Apply and Close**.
   → El `.jar` aparecerá ahora bajo **Referenced Libraries** en el *Package Explorer*.

---

### **4. Crear el paquete y la clase**

1. Clic derecho en `src` → **New → Package**
   Nombre: `es.iessaladillo.dam1.ed.u2`
2. Dentro de ese paquete, crea una clase llamada `EjemploLibreria.java`.

---

### **5. Escribir el código**

Copia el siguiente contenido:

```java
package es.iessaladillo.dam1.ed.u2;

import org.joda.time.LocalDate;   // importamos clase de la librería externa

public class EjemploLibreria {
    public static void main(String[] args) {
        LocalDate hoy = new LocalDate();        // Fecha actual
        LocalDate futuro = hoy.plusDays(10);    // Fecha dentro de 10 días

        //Escribe tú las dos próximas líneas de código:
        //Muestra el mensaje en consola "Hoy es: XXX", donde XXX es el valor de la variable hoy.
        //Muestra el mensaje en consola "Dentro de 10 días será: XXX", donde XXX es el valor de la variable futuro.
    }
}
```

---

### ▶️ **6. Ejecutar y comprobar el resultado**

Haz clic derecho en el archivo `EjemploLibreria.java` → **Run As → Java Application**

La salida esperada en la consola será algo similar a:

```
Hoy es: 2025-10-07
Dentro de 10 días será: 2025-10-17
```

---

### 💡 **7. Reflexión final**

Lee el siguiente apartado, dónde se explica la diferencia entre añadir una librería del mismo proyecto o una externa y contesta a las siguientes preguntas:

* ¿Qué pasaría si exporto el proyecto a un .zip y se lo paso a un amigo o me lo llevo al ordenador de casa? ¿Funcionaría? Razona la respuesta.
* ¿Qué pasaría si eliminas el archivo `.jar` de la carpeta `lib`? *(puedes moverla a otro directorio para probarlo)* ¿Qué ha pasado y por qué?
* Y si agrego la librería con `Add External JARs...`. ¿Observas alguna diferencia en la configuración del Build Path? ¿Crees que si lo exporto a .zip y se lo paso a un compañero le funcionaría?
* ¿Por qué no es recomendable usar `Add External JARs…` en proyectos que vas a compartir?

---

## Cuándo usar **Add JARs…** vs **Add External JARs…**

| Opción                 | Cuándo usarla                                                                                                              | Qué hace realmente                                                                                                                                                                                                                                  |
| ---------------------- | -------------------------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Add JARs…**          | Cuando el `.jar` está **dentro del propio proyecto** (por ejemplo en una carpeta `lib/` dentro de `src/` o al mismo nivel) | Eclipse crea una **referencia relativa**. Si mueves o compartes el proyecto (por ejemplo, en un pendrive o repositorio), el JAR **viaja con él**. ✅ Recomendado para clase o trabajo colaborativo.                                                  |
| **Add External JARs…** | Cuando el `.jar` está **fuera del proyecto**, por ejemplo en tu escritorio o en `Descargas`                                | Eclipse crea una **ruta absoluta** (por ejemplo `/Users/diego/Downloads/joda-time.jar`). Si compartes el proyecto, el JAR **no se incluirá** y habrá errores en otros equipos. ⚠️ No recomendado salvo que sea una librería compartida globalmente. |

👉 En resumen:

* **Para prácticas o proyectos individuales:** usa **Add JARs…** (librería dentro del proyecto).
* **Para librerías comunes en varios proyectos (instaladas en el sistema):** usa **Add External JARs…**.
