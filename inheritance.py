class Magic:
    def cast(self):
        print("I am casting magic")
    
class Elemental(Magic):
    def cast(self):
        super().cast()
        print("I am casting elemental magic")
        
    def type(self, element):
        print("I am casting a spell of type %s" %(element))
        
class White(Magic):
    def cast(self):
        super().cast()
        print("I am casting a healing spell")
        
    def heal(self):
        print("You have been healed by this spell")
        
class Barrier(Elemental, White):
    def cast(self):
        super().cast()
        print("I am casting a barrier spell")
        
    def type(self, element):
        super().type(element)
        print("I am casting a barrier of type %s" %(element))
        
    def heal(self):
        super().heal()
        print("This barrier has healing properties")

b = Barrier()

b.cast()
b.type("fire")
b.type("water")
b.heal()