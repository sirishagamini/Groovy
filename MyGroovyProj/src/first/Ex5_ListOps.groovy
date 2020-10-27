package first

class Ex5_ListOps {
	static void main(def args) {
		def fulllist=[11, 2, 19, 5, "Mango", "Apple", "Watermelon"]
		def strlist=fulllist.minus([11, 2, 19, 5])
		def Intlist=fulllist.minus(["Mango", "Apple", "Watermelon"])
		println "Sorted String list  : ${strlist.sort()}"
		println "Sorted Interger list: ${Intlist.sort()}"
	}
}
