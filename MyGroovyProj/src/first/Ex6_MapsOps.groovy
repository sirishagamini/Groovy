package first

class Ex6_MapsOps {
	static void main(args) {
		def map= [:]
		map.put(1, "Cats")
		map.put(2, "Dogs")
		map.put(3, "Wolves")
		
		//Print each pair with loop
		for(def item : map) {
			println item
		}
		
		//Merge new key-value pairs
		def newMap = map.plus([4: "Horses", 5: "Donkeys"])
		println newMap
		
		//Print the values in ascending order
		println newMap.values().sort()
		println newMap.values().sort { it.length() }
	}
	}

