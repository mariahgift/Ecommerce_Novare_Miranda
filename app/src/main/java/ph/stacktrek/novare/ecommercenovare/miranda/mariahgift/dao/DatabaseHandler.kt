package ph.stacktrek.novare.ecommercenovare.miranda.mariahgift.dao

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHandler(context: Context):
    SQLiteOpenHelper(context, DATABASENAME,null, DATABASEVERSION) {

    companion object {
        private val DATABASEVERSION = 1
        private val DATABASENAME = "ProductsDatabase"

        const val TABLE_PRODUCT = "product_table"
        const val TABLE_PRODUCT_ID = "id"
        const val TABLE_PRODUCT_NAME = "name"
        const val TABLE_PRODUCT_DESCRIPTION = "description"
        const val TABLE_PRODUCT_PRICE = "price"
        const val TABLE_PRODUCT_BRAND = "brand"
        const val TABLE_PRODUCT_MEASUREMENT = "measurement"
        const val TABLE_PRODUCT_MEASUREMENT_UNIT = "measurement_unit"
        const val TABLE_PRODUCT_QUANTITY = "quantity"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        val CREATE_PRODUCTS_TABLE =
            "CREATE TABLE $TABLE_PRODUCT " +
                    "($TABLE_PRODUCT_ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "$TABLE_PRODUCT_NAME TEXT, " +
                    "$TABLE_PRODUCT_DESCRIPTION TEXT, " +
                    "$TABLE_PRODUCT_PRICE INTEGER, " +
                    "$TABLE_PRODUCT_BRAND TEXT, " +
                    "$TABLE_PRODUCT_MEASUREMENT REAL, " +
                    "$TABLE_PRODUCT_MEASUREMENT_UNIT TEXT, " +
                    "$TABLE_PRODUCT_QUANTITY REAL)"

        db?.execSQL(CREATE_PRODUCTS_TABLE)

        db?.execSQL("Insert into $TABLE_PRODUCT ($TABLE_PRODUCT_NAME, $TABLE_PRODUCT_DESCRIPTION, $TABLE_PRODUCT_PRICE) values ('Sun Flower Earrings', 'Color: Yellow and White', 167)")
        db?.execSQL("Insert into $TABLE_PRODUCT ($TABLE_PRODUCT_NAME, $TABLE_PRODUCT_DESCRIPTION, $TABLE_PRODUCT_PRICE) values ('Pickle Rick Keychain', 'Color: Green', 456)")
        db?.execSQL("Insert into $TABLE_PRODUCT ($TABLE_PRODUCT_NAME, $TABLE_PRODUCT_DESCRIPTION, $TABLE_PRODUCT_PRICE) values ('Koro-sensei Keychain', 'Color: Yellow and Black', 360)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db!!.execSQL("DROP TABLE IF EXISTS $TABLE_PRODUCT")
        onCreate(db)
    }

}