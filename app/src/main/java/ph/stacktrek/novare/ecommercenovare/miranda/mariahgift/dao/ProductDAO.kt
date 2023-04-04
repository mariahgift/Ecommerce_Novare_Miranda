package ph.stacktrek.novare.ecommercenovare.miranda.mariahgift.dao

import android.content.ContentValues
import android.content.Context
import android.database.Cursor
import ph.stacktrek.novare.ecommercenovare.miranda.mariahgift.model.Product
import java.sql.SQLException

interface ProductDAO {
    fun addProduct(product: Product)
    fun getProducts(): ArrayList<Product>
    fun updateProduct(product: Product)
    fun deleteProduct(product: Product)
}

class ProductDAOStubImplementation: ProductDAO{
    private var productList: ArrayList<Product> = ArrayList()

    init{
        productList.add(Product("Corned Beef"))
        productList.add(Product("Canned Tuna"))
        productList.add(Product("Canned Carrots and Corn"))
        productList.add(Product("Powdered Milk"))
        productList.add(Product("Coffee"))
        productList.add(Product("Canned Beer"))
        productList.add(Product("Canned Soda"))
        productList.add(Product("Creamer"))
        productList.add(Product("Bottled Water"))
        productList.add(Product("Bottled Soda"))
        productList.add(Product("Bottled Tea"))
        productList.add(Product("Bottled Milk Tea"))
    }

    override fun addProduct(product: Product) {
        productList.add(product)
    }

    override fun getProducts(): ArrayList<Product> = productList

    //TODO("Not yet implemented")
    override fun updateProduct(product: Product) {

    }

    //TODO("Not yet implemented")
    override fun deleteProduct(product: Product) {

    }

}

class ProductDAOSQLLiteImplementation(var context: Context): ProductDAO{
    override fun addProduct(product: Product) {
        val databaseHandler = DatabaseHandler(context)
        val db = databaseHandler.writableDatabase

        val contentValues = ContentValues()
        contentValues.put(DatabaseHandler.TABLE_PRODUCT_NAME, product.name)
        contentValues.put(DatabaseHandler.TABLE_PRODUCT_DESCRIPTION, product.description)

        var status = db.insert(DatabaseHandler.TABLE_PRODUCT,
            null,
            contentValues)
        db.close()
    }

    override fun getProducts(): ArrayList<Product> {
        val databaseHandler = DatabaseHandler(context)
        val db = databaseHandler.readableDatabase
        var result = ArrayList<Product>()
        var cursor: Cursor? = null

        val columns =  arrayOf(DatabaseHandler.TABLE_PRODUCT_ID,
            DatabaseHandler.TABLE_PRODUCT_NAME, DatabaseHandler.TABLE_PRODUCT_DESCRIPTION)

        try {
            cursor = db.query(DatabaseHandler.TABLE_PRODUCT,
                columns,
                null,
                null,
                null,
                null,
                null)

        }catch (sqlException: SQLException){
            db.close()
            return result
        }

        var product: Product
        if(cursor.moveToFirst()){
            do{
                product = Product("")
                product.description = cursor.getString(2) ?: ""
                product.name = cursor.getString(1)
                product.id = cursor.getInt(0).toString()
                result.add(product)
            }while(cursor.moveToNext())
        }
        return result
    }

    override fun updateProduct(product: Product) {
        TODO("Not yet implemented")
    }

    override fun deleteProduct(product: Product) {
        TODO("Not yet implemented")
    }

}