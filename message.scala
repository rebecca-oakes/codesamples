class ONE {
	var message = "Hello there"
	
	def printMessage(name:String){
		print(message + " " + name)
	}
}

object TWO {
	def main(args: Array[String]) {
		var name = "Rebecca"
		val one = new ONE()
		
		one.printMessage(name)
	}
}