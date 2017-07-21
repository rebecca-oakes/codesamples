object words{
	def main(args: Array[String]) {
		var digit:Int = 1181
		if(digit <= 20){
			print(digit + " becomes " + firstTwenty(digit))
		}
		else if (digit > 20 && digit < 100){
			var first = digit / 10
			var second = digit % 10
			if (second == 0){
				print (digit + " becomes " + firstTwenty(first))
			}
			else{
				print (digit + " becomes " + twoDigits(first) + " " + firstTwenty(second))
			}
		}
		else if (digit >= 100 && digit < 1000){
			var first = digit / 100
			var rem  = digit % 100
			if (rem <= 20){
				if (rem == 0){
					print (digit + " becomes " + firstTwenty(first) + " hundred")
				}
				else{
					print (digit + " becomes " + firstTwenty(first) + " hundred and " + firstTwenty(rem))
				}
			}
			else {
				var second = rem / 10
				var third = rem % 10
				if (third == 0){
					print (digit + " becomes " + firstTwenty(first) + " hundred and " + twoDigits(second))
				}
				else{
					print (digit + " becomes " + firstTwenty(first) + " hundred and " + twoDigits(second) + " " + firstTwenty(third))
				}
			}
		}
		else if (digit >= 1000 && digit < 10000){
			var first = digit / 1000
			var rem = digit % 1000
			if (rem == 0){
				print (digit + " becomes " + firstTwenty(first) + " thousand")
			}
			else if (rem <= 20){
				print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(rem))
			}
			else {
				var second = rem / 100
				rem = rem % 100
				
				if (rem == 0){
					print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(second) + " hundred")
				}
				else if(rem <= 20){
					print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(second) + " hundred and " + firstTwenty(rem))
				}
				else {
					var third = rem / 10
					var fourth = rem % 10
					
					if(second == 0 && third == 0){
						print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(fourth))
					}
					else if(second == 0 && fourth == 0){
						print (digit + " becomes " + firstTwenty(first) + " thousand and " + twoDigits(third))
					}				
					else if (second == 0){
						print (digit + " becomes " + firstTwenty(first) + " thousand and " + twoDigits(third) + " " + firstTwenty(fourth))
					}
					else if (third == 0){
						print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(second) + " hundred and " + firstTwenty(fourth))
					}
					else if (fourth == 0){
						print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(second) + " hundred and " + twoDigits(third))
					}
					else {
						print (digit + " becomes " + firstTwenty(first) + " thousand and " + firstTwenty(second) + " hundred and " + twoDigits(third) + " " + firstTwenty(fourth))
					}
				}
			}
		}
	}
	def firstTwenty(digit:Int):String = digit match{
		case 1 => "one"
		case 2 => "two"
		case 3 => "three"
		case 4 => "four"
		case 5 => "five"
		case 6 => "six"
		case 7 => "seven"
		case 8 => "eight"
		case 9 => "nine"
		case 10 => "ten"
		case 11 => "eleven"
		case 12 => "twelve"
		case 13 => "thirteen"
		case 14 => "fourteen"
		case 15 => "fifteen"
		case 16 => "sixteen"
		case 17 => "seventeen"
		case 18 => "eighteen"
		case 19 => "nineteen"
		case 20 => "twenty"
		case _ => " "
	}	
	
	def twoDigits(digit:Int):String = digit match{
		case 2 => "twenty"
		case 3 => "thirty"
		case 4 => "fourty"
		case 5 => "fifty"
		case 6 => "sixty"
		case 7 => "seventy"
		case 8 => "eighty"
		case 9 => "ninety"
		case _ => " "
	}	
}