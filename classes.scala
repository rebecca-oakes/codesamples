class ONE {
	def add(x:Int, y:Int){
		print(x + " + " + y + " = " + (x + y)) 
	}
	
	def subtract(x:Int, y:Int){
		var z = x - y
		println(x + " - " + y + " = " + z)
	}
}

class TWO extends ONE {
	override def add(x:Int, y:Int){
		var z = x + y
		println(x + " + " + y + " = " + z)
	}
}

object oneTwo{
	def main(args: Array[String]) {
		var x = 10
		var y = 5
		val ot = new TWO()
		
		ot.add(x, y)
		ot.subtract(x, y)
	}
}