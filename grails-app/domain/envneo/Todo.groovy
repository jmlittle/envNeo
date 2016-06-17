package envneo

class Todo {
	String name
	
    static constraints = {
		name nullable: true
    }

	static mapWith = "neo4j"
}
