package philosophicas.orinoco

class StringColumn(name: String) : Column<String>(name) {

    //Members implementations
    override var localName: String = name
    override var remoteName: String = name
    override var stringValue: String = ""

    override var value: String
        get() = stringValue
        set(value) {
            stringValue = value
        }

    override val SQLiteColumnConstructor: String
        get() = "$localName TEXT "

    override val remoteConstructor: HashMap<String, String>
        get() {
            var r = super.remoteConstructor
            r.put("type", "string")
            return r
        }
}