object totals {
	def main(args: Array[String]) {
		var phy = 85
		var che = 89
		var mat = 91

		var total:Float = phy + che + mat 
		var per:Float = total/450 * 100

		print("Physics Marks: " + phy + "/150")
		print("Chemistry Marks: " + che + "/150")
		print("Maths Marks: " + mat + "/150")
		print("Total Marks: " + total + "/450")
		print("Percentage: " + per + "%")
		if (per > 60){print("Remarks: Passed course")}
		else{print("Remarks: Failed course")}
	}
}