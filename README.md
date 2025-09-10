# Parcial 1 - Estructuras de Datos (Java)

Este proyecto implementa en **Java** una solución para la gestión de estudiantes de una universidad, como parte del Parcial 1 de la materia *Estructuras de Datos*.  

Incluye:
- Clase `Student` para representar a los estudiantes.
- Algoritmos de **ordenamiento**:
  - Bubble Sort (por edad, ascendente).
  - Insertion Sort (por semestre, descendente).
- Algoritmos de **búsqueda**:
  - Búsqueda lineal (por `programId`).
  - Búsqueda binaria (por `age`, requiere que el arreglo esté ordenado previamente).
- Conjunto de **10 estudiantes de ejemplo** con datos coherentes.

---

## Requisitos previos

1. Tener instalado **Java JDK 17** o superior.  
   - Descargar desde [Oracle JDK](https://www.oracle.com/java/technologies/javase-downloads.html) o [OpenJDK](https://jdk.java.net/).  
   - Instalar normalmente (se recomienda la ruta por defecto: `C:\Program Files\Java\jdk-17`).  

2. Configurar las **variables de entorno** en Windows:
   - Abrir: **Panel de control → Sistema → Configuración avanzada del sistema → Variables de entorno**.
   - Buscar la variable **Path** y editarla.
   - Agregar la ruta a la carpeta `bin` de tu JDK, por ejemplo:
     ```
     C:\Program Files\Java\jdk-17\bin
     ```
   - Guardar cambios.

3. Verificar instalación en la terminal (`cmd` o PowerShell):
   ```bash
   java -version
   javac -version
