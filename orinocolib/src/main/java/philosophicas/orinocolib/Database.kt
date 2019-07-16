package philosophicas.orinoco

/** Main class of a database */
class Database(
    var localPath: String = "",
    var remotePath: String = "",
    var user: String = "",
    var password: String = ""
) {
    var tables = ArrayList<Table>()

    constructor() : this("", "", "", "")
    constructor(localPath: String, remotePath: String) : this(localPath, remotePath, "", "")

}