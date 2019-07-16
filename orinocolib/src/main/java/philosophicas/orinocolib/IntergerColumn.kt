package philosophicas.orinoco

class IntegerColumn(
    name: String,
    var autoIncrement: Boolean = false,
    var primaryKey: Boolean = false
) : Column<Int>(name) {

    //Members implementations
    override var localName: String = name
    override var remoteName: String = name
    override var stringValue: String = ""

    override var value: Int
        get() = stringValue.toInt()
        set(value) {
            stringValue = value.toString()
        }

    override val SQLiteColumnConstructor: String
        get() {
            var r = "$localName INT "
            if (primaryKey) r = "$r PRIMARY KEY"
            if (autoIncrement) r = "$r AUTOINCREMENT"
            return r
        }

    override val remoteConstructor: HashMap<String, String>
        get() {
            var r = super.remoteConstructor
            //var r = HashMap<String, String>()
            //r.put("name", name)
            r.put("type", "integer")
            r.put("autoIncrement", if (autoIncrement) "true" else "false")
            r.put("primaryKey", if (primaryKey) "true" else "false")
            return r
        }
}
