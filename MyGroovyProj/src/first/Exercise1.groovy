package first

class Exercise1 {
	static void main(args) {
	def x;
	int y;
	def arr=[1, 2.0, "apple",true, x, y]
	
	arr.each { println "Value is: " + it +". Data type is: " + it.getClass() }
}
}