class PersonaPyt:
    '''Atributos'''
    nombre = ""
    apellidos = ""
    edad = 0
    estatura = 0.0
    peso = 0.0

    def __init__(self, nombre, apellidos, edad, estatura, peso):
        '''self es como dif'''
        self.nombre = nombre
        self.apellidos = apellidos
        self.edad = edad
        self.estatura = estatura
        self.peso = peso

        #getters y setters
        def setNombre(self, nombre):
            self.nombre = nombre
        def setApellidos(self, apellidos):
            self.apellidos = apellidos
        def setEdad(self, edad):
            self.edad = edad
        def setPeso(self, peso):
            self.peso = peso
        def getNombre(self):
            return self.nombre
        def getApellidos(self, apellidos):
            return  self.apellidos
        '''def getEdad(self, edad):
            return self.edad 
        def getEstatura(self, estatura):
            return self.estatura
        def getPeso(self, peso):
            return self.peso '''
        def calcularIMC(self):
            return self.peso / pow(self.altura, 2)
        persona = PersonaPyt("Eduardo", "Bojorquez", 41,1.75, 95.0)

        print("Nombre: " +persona.getNombre())
        print("Apellido: " +persona.getApellido())
        print("IMC: " +persona.calcularIMC())

