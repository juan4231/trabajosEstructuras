# Evaluación de Taller 2

**Estudiante:** Juan Camilo (20258002615_JuanCamilo_trabajosEstructuras)
**Nota Final:** / 50 Puntos

| Actividad | Puntos Obtenidos | Puntos Máximos | Observaciones |
|-----------|:---:|:---:|---|
| Activad 1 (TAD) | 3.5 | 5.0 | Faltan comentarios Javadoc detallando entradas/salidas/errores y si es lineal/no lineal (0/1.5 pts) |
| Activad 2 (Arreglos) | 5.0 | 5.0 | Completa. |
| Activad 3 (Vector) | 2.5 | 5.0 | Falta comentario explicando el uso de Vector y su Thread-Safety frente a ArrayList (0/2.5 pts). Realiza bien la comparación de tiempos. |
| Activad 4 (String) | 4.0 | 5.0 | Falta explicación teórica sobre la inmutabilidad basándose en las referencias de memoria (1/2 pts). |
| Activad 5 (Matrices) | 5.0 | 5.0 | Implementación correcta. |
| Activad 6 (ArrayList) | 3.5 | 5.0 | Producto implementa equals, pero faltan comentarios teóricos sobre equals y redimensionamiento del Carrito (0/1.5 pts). |
| Activad 7 (Stack) | 5.0 | 5.0 | Correcto manejo de Pila y validación de vacíos. |
| Activad 8 (Queue) | 4.5 | 5.0 | Falta el comentario explicando la diferencia entre `poll()` y `remove()` (0/0.5 pts). |
| Activad 9 (HashMap) | 4.5 | 5.0 | Implementación correcta, pero el comentario sobre O(1) es muy escueto/no explicativo (1/1.5 pts). |
| Orden del Desarrollador | 3.0 | 5.0 | Estructura en carpetas (1/1.25), .gitignore correcto (1.25/1.25), README incompleto sin índice ni reflexiones ni nombre (0/1.25). Se revisó historial de commits. |
| **Total** | 40.5 | **50.0** | |

## Detalles de Evaluación

### Actividad 1: Diseño Conceptual (TADs)
- **Abstracción (40% - 2 pts):** ✅ 2.0 (Uso de interface sin lógica interna).
- **Completitud (30% - 1.5 pts):** ✅ 1.5 (Tipos de datos de entrada/salida coherentes).
- **Clasificación/Javadoc (30% - 1.5 pts):** ❌ 0.0 (No hay comentarios Javadoc ni se menciona tipo de estructura).

### Actividad 2: Monitoreo Climático (Arreglos Estáticos)
- **Uso de Índices (40% - 2 pts):** ✅ 2.0.
- **Delimitación (30% - 1.5 pts):** ✅ 1.5 (Try-Catch implementado para el índice 24).
- **Eficiencia (30% - 1.5 pts):** ✅ 1.5.

### Actividad 3: Sistema Bancario Legacy (Clase Vector)
- **Justificación (50% - 2.5 pts):** ❌ 0.0 (No argumenta el uso de Vector ni su característica Thread-Safe).
- **Análisis de Costo (25% - 1.25 pts):** ✅ 1.25 (Identifica la penalización ejecutando comparación con ArrayList).
- **Operatividad (25% - 1.25 pts):** ✅ 1.25 (Implementa correctamente Vector).

### Actividad 4: Validador de Documentos (Strings e Inmutabilidad)
- **Manipulación (40% - 2.0 pts):** ✅ 2.0 (Uso correcto de trim, toUpperCase, substring).
- **Concepto (40% - 2.0 pts):** ⚠️ 1.0 (Imprime hash codes pero falta la explicación explícita sobre la inmutabilidad).
- **Eficiencia (20% - 1.0 pts):** ✅ 1.0 (Uso de StringBuilder con reverse).

### Actividad 5: Reserva de Cine (Matrices)
- **Modelado (30% - 1.5 pts):** ✅ 1.5.
- **Recorrido (40% - 2.0 pts):** ✅ 2.0.
- **Lógica (30% - 1.5 pts):** ✅ 1.5.

### Actividad 6: Carrito de Compras Dinámico (ArrayList)
- **Dinamismo (40% - 2.0 pts):** ✅ 2.0.
- **Operaciones (30% - 1.5 pts):** ✅ 1.5.
- **Teoría (30% - 1.5 pts):** ❌ 0.0 (Faltan comentarios explicando la sobreescritura de equals y el redimensionamiento de capacidad).

### Actividad 7: Historial de Navegador (Stack / Pila)
- **Lógica LIFO (50% - 2.5 pts):** ✅ 2.5.
- **API Stack (30% - 1.5 pts):** ✅ 1.5.
- **Robustez (20% - 1.0 pts):** ✅ 1.0 (Evita errores de pop en pila vacía).

### Actividad 8: Sistema de Tickets de Soporte (Queue / Cola)
- **Lógica FIFO (50% - 2.5 pts):** ✅ 2.5.
- **Implementación (30% - 1.5 pts):** ✅ 1.5.
- **Manejo de Vacío (20% - 1.0 pts):** ⚠️ 0.5 (Se maneja bien la cola vacía con poll, pero falta el comentario explicando la diferencia entre poll y remove).

### Actividad 9: Inventario por Código (Mapas / HashMap)
- **Asociación (40% - 2.0 pts):** ✅ 2.0.
- **Unicidad (30% - 1.5 pts):** ✅ 1.5 (Demuestra colisión actualizando precio).
- **Eficiencia (30% - 1.5 pts):** ⚠️ 1.0 (Comenta `// O(1) promedio` pero falta explicar que no recorre todo el mapa).

### Orden del Desarrollador (GitHub y Buenas Prácticas)
- **Estructura de Carpetas:** ✅ 1.0/1.25 (Carpetas independientes, aunque no siguen estrictamente la convención de nombres Ejemplo: Actividad1_TAD).
- **Ignorar Archivos Temporales (.gitignore):** ✅ 1.25/1.25.
- **Documentación (README.md):** ❌ 0.0/1.25 (Incompleto, sin nombre, sin reflexiones).
- **Historial de Cambios (Commits):** ✅ 0.75/1.25 (Repositorio inicializado).
