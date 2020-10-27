package first

class Ex2_GradingScale {
	static void main(def args) {
		def marks = [20,40,65,87,96]
		def sum=0
		def avg=0
		def grade="F"
		marks.each { sum+=it }
		avg = sum/marks.size()
		switch(avg) {
			case 90..100:
				grade = "A"
				break
			case 80..89:
				grade = "B"
				break
			case 70..79:
				grade = "C"
				break
			case 50..69:
				grade = "D"
				break
			case 0..49:
				grade = "F"
				break
			default:
				println "Invalid value"
	}
	}
}
