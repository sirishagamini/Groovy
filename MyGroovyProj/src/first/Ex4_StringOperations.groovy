package first

class Ex4_StringOperations {
	static void main(def args) {
		def str="This is a Groovy Language"
		def revstr=str.reverse()
		println revstr
		println "The reverse of $str is :" +str.reverse()
		
		def subst=str.substring(1)
		def subst1=str.substring(2, 7)
		println subst
		println subst1
		println 'split string is:' +str.split("")
		println 'split string is:' +str.split(" ")
		println 'Removing of word Groovy is: '+str.minus("Groovy")
		println 'Lower case of string is:' +str.toLowerCase()
		println 'Lower case of string is:' +str.toUpperCase()
	}
}

