package philosophicas.orinoco

/** Table class. Holds columns objects */
class Table(var name: String, var dataBase: Database) {
    var columns = ArrayList<Column<out Any>>()

    fun createLocalStore(): String {
        var sql = "create table $name if no exits "
        columns.forEach { c ->
            sql = "$sql ${c.SQLiteColumnConstructor}"
        }
        return sql
    }


}