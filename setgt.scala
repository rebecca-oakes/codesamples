class Results {
	private var _phy:Int = 0
	
	def physics_ = (x:Int):Unit = _phy = x	
	def physics:Int = _phy
}

object Stuff {
	var res = new Results()
	var total:Int = 0
	
	res.physics = 75
	total = res.physics + 100
	print(total)
}