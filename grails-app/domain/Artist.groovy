class Artist {
    String name
    static hasMany = [albums:Album]

    static constraints = {
        name unique:true, size:3..20, matches:/[^_]*/
    }
    
    String toString() {
        name
    }
}
