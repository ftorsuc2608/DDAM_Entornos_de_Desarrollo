# 🧾 Práctica: **Añadir y usar una librería externa en Eclipse**

## 🎯 Objetivo

Aprender a incorporar una **librería externa (`.jar`)** al *Build Path* de un proyecto Java en Eclipse, y utilizar clases contenidas en esa librería desde nuestro código.

---

## Realización de la práctica

### **1. Crear el proyecto**

![Creación del proyecto](../img/create_java_project.png)

![Comprobación proyecto](../img/comprobacion_proyecto.png)

![Creación carpeta lib](../img/carpeta_lib.png)

![Descarga del paquete](../img/joda_time.png)

![Copiar el paquete](../img/copy_joda_time.png)

![Ruta buildpath](../img/ruta_build_path.png)

![Terminar buildpath](../img/build_path_hecho.png)

![Creación paquete](../img/creacion_paquete.png)

![Creacion clase](../img/creacion_clase.png)

![Código](../img/code.png)

![Consola](../img/salida_consola.png)

# Reflexión final

## ¿Qué pasaría si exporto el proyecto a un .zip y se lo paso a un amigo o me lo llevo al ordenador de casa? ¿Funcionaría? Razona la respuesta.

  Funcionaría, siempre y cuando el JDK sea compatible con la versión utilizada (la misma versión o una superior).
  
## ¿Qué pasaría si eliminas el archivo `.jar` de la carpeta `lib`? *(puedes moverla a otro directorio para probarlo)* ¿Qué ha pasado y por qué?

  Java ya no es capaz de encontrar el '.jar' porque el build path apuntaba a la ruta del paquete, al moverlo ya no es capaz de encontrarlo, a menos que modifiquemos la ruta.

## Y si agrego la librería con `Add External JARs...`. ¿Observas alguna diferencia en la configuración del Build Path? ¿Crees que si lo exporto a .zip y se lo paso a un compañero le funcionaría?

  Al agregar la librería con 'Add External JARs...' no se aprecian diferencias, pero si se lo paso a un compañero no funcionará, porque el paquete no se copiará junto con el proyecto.

## ¿Por qué no es recomendable usar `Add External JARs…` en proyectos que vas a compartir?

  Porque el paquete no se copiará con el proyecto y habrá que añadirlo de nuevo de forma manual.
