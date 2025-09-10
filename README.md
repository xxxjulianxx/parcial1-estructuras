# Parcial 1 - Estructuras de Datos

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
   
   ---

## Resultados esperados
1. La lista original de estudiantes.

2. La lista ordenada por edad (Bubble Sort).

3. La lista ordenada por semestre (Insertion Sort).

4. Una búsqueda lineal por programId.

5. Una búsqueda binaria por age.

---

## Ejemplo de ejecución

``` Original List of Students ```
Program ID: 101, Program: Computer Science, Age: 20, Semester: 4, Stratum: 3, Completed: 15, Pending: 5
Program ID: 102, Program: Business, Age: 22, Semester: 6, Stratum: 2, Completed: 20, Pending: 2
Program ID: 103, Program: Engineering, Age: 19, Semester: 2, Stratum: 4, Completed: 8, Pending: 10
Program ID: 104, Program: Law, Age: 24, Semester: 8, Stratum: 5, Completed: 25, Pending: 1
Program ID: 105, Program: Medicine, Age: 21, Semester: 5, Stratum: 3, Completed: 18, Pending: 4
Program ID: 106, Program: Psychology, Age: 23, Semester: 7, Stratum: 2, Completed: 22, Pending: 2
Program ID: 107, Program: Design, Age: 18, Semester: 1, Stratum: 1, Completed: 5, Pending: 12
Program ID: 108, Program: Architecture, Age: 25, Semester: 9, Stratum: 6, Completed: 30, Pending: 0
Program ID: 109, Program: Education, Age: 20, Semester: 3, Stratum: 4, Completed: 12, Pending: 6
Program ID: 110, Program: Nursing, Age: 26, Semester: 10, Stratum: 5, Completed: 32, Pending: 0

``` Students Sorted by Age (Bubble Sort) ```
Program ID: 107, Program: Design, Age: 18, Semester: 1, Stratum: 1, Completed: 5, Pending: 12
Program ID: 103, Program: Engineering, Age: 19, Semester: 2, Stratum: 4, Completed: 8, Pending: 10
Program ID: 101, Program: Computer Science, Age: 20, Semester: 4, Stratum: 3, Completed: 15, Pending: 5
Program ID: 109, Program: Education, Age: 20, Semester: 3, Stratum: 4, Completed: 12, Pending: 6
Program ID: 105, Program: Medicine, Age: 21, Semester: 5, Stratum: 3, Completed: 18, Pending: 4
Program ID: 102, Program: Business, Age: 22, Semester: 6, Stratum: 2, Completed: 20, Pending: 2
Program ID: 106, Program: Psychology, Age: 23, Semester: 7, Stratum: 2, Completed: 22, Pending: 2
Program ID: 104, Program: Law, Age: 24, Semester: 8, Stratum: 5, Completed: 25, Pending: 1
Program ID: 108, Program: Architecture, Age: 25, Semester: 9, Stratum: 6, Completed: 30, Pending: 0
Program ID: 110, Program: Nursing, Age: 26, Semester: 10, Stratum: 5, Completed: 32, Pending: 0

``` Students Sorted by Semester (Insertion Sort) ```
Program ID: 110, Program: Nursing, Age: 26, Semester: 10, Stratum: 5, Completed: 32, Pending: 0
Program ID: 108, Program: Architecture, Age: 25, Semester: 9, Stratum: 6, Completed: 30, Pending: 0
Program ID: 104, Program: Law, Age: 24, Semester: 8, Stratum: 5, Completed: 25, Pending: 1
Program ID: 106, Program: Psychology, Age: 23, Semester: 7, Stratum: 2, Completed: 22, Pending: 2
Program ID: 102, Program: Business, Age: 22, Semester: 6, Stratum: 2, Completed: 20, Pending: 2
Program ID: 105, Program: Medicine, Age: 21, Semester: 5, Stratum: 3, Completed: 18, Pending: 4
Program ID: 101, Program: Computer Science, Age: 20, Semester: 4, Stratum: 3, Completed: 15, Pending: 5
Program ID: 109, Program: Education, Age: 20, Semester: 3, Stratum: 4, Completed: 12, Pending: 6
Program ID: 103, Program: Engineering, Age: 19, Semester: 2, Stratum: 4, Completed: 8, Pending: 10
Program ID: 107, Program: Design, Age: 18, Semester: 1, Stratum: 1, Completed: 5, Pending: 12

``` Linear Search by Program ID (102) ```
Student found:
Program ID: 102, Program: Business, Age: 22, Semester: 6, Stratum: 2, Completed: 20, Pending: 2

``` Binary Search by Age (21) ```
Student found:
Program ID: 105, Program: Medicine, Age: 21, Semester: 5, Stratum: 3, Completed: 18, Pending: 4

