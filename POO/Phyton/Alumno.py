        """Creamos la clase Alumno"""

class Alumno:

        """Init es la manera de identificar una variable en este caso nombre"""
    def __init__(self, nombre):
        """Self seria el argumento de la clase"""
        self.nombre = nombre    

    def saludar(self):
        """Imprime un saludo en pantalla."""
        print(f"Hola, {self.nombre}")


        """Establecemos en nombre para nuestra clase alumno"""
alumno = Alumno("Lorian")

        """LLamamos a la funcion saludar"""
alumno.saludar()