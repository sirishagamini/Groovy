package first

class Ex3_Fibonacci {
	static void main(def args) {
		def a=0
		def b=1
		println("$a\n$b")
		//println b
		def c=0
		for(def i=1;i<10;i++) {
			c=a+b
			println c
			(a,b)=[b,c]
		}
	}
}
