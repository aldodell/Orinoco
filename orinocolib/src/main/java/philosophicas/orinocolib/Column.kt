package philosophicas.orinoco


/** Abstract class of a column data */
abstract class Column<T>(name: String) {

    var name: String = name

    /** Alias for local column name */
    abstract var localName: String

    /** alias for remote column name */
    abstract var remoteName: String

    /** Value to send to and receive from database(remote) */
    abstract var stringValue: String

    /** Data transformer for send and receive remote data*/
    abstract var value: T

    abstract val SQLiteColumnConstructor: String

    open val remoteConstructor: HashMap<String, String>
        get() {
            var r = HashMap<String, String>()
            r.put("name", name)
            return r
        }

}