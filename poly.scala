class ONE {
	def message() {
		print("Hello World")
	}
}

class TWO extends ONE {
	override def message() {
		print("This is testing polymorphism")
	}
}

object OneTwo{
	def main(args: Array[String]) {
		val ot:ONE = new TWO()
		
		ot.message()
	}
}