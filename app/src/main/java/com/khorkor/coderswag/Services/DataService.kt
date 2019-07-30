package com.khorkor.coderswag.Services

import com.khorkor.coderswag.Model.Category
import com.khorkor.coderswag.Model.Product

object DataService {

    val categories = listOf(
        Category("SHIRTS","shirtimage"),
        Category("HOODIES", "hoodieimage"),
        Category("HATS", "hatimage"),
        Category("DIGITAL","digitalgoodsimage")
    )

    val hats = listOf(
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4"),
        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Hat Black", "$20", "hat2"),
        Product("Devslopes Hat White", "$18", "hat3"),
        Product("Devslopes Hat Snapback", "$22", "hat4")
    )

    val hoodies = listOf(
        Product("Developes Hoodie Gray", "$28", "hoodie1"),
        Product("Developes Hoodie Red", "$32", "hoodie2"),
        Product("Developes Gray Hoodie", "$28", "hoodie3"),
        Product("Developes Black Hoodie", "$32", "hoodie4"),
        Product("Developes Hoodie Gray", "$28", "hoodie1"),
        Product("Developes Hoodie Red", "$32", "hoodie2"),
        Product("Developes Gray Hoodie", "$28", "hoodie3"),
        Product("Developes Black Hoodie", "$32", "hoodie4"),
        Product("Developes Hoodie Gray", "$28", "hoodie1"),
        Product("Developes Hoodie Red", "$32", "hoodie2"),
        Product("Developes Gray Hoodie", "$28", "hoodie3"),
        Product("Developes Black Hoodie", "$32", "hoodie4")
    )

    val shirts = listOf(
        Product("Developes Shirt Black","$18", "shirt1"),
        Product("Developes Badge Light Gray","$20", "shirt2"),
        Product("Developes Logo Shirt Red","$22", "shirt3"),
        Product("Developes Hustle","$22", "shirt4"),
        Product("Kickflip Studios","$18", "shirt5"),
        Product("Developes Shirt Black","$18", "shirt1"),
        Product("Developes Badge Light Gray","$20", "shirt2"),
        Product("Developes Logo Shirt Red","$22", "shirt3"),
        Product("Developes Hustle","$22", "shirt4"),
        Product("Kickflip Studios","$18", "shirt5"),
        Product("Developes Shirt Black","$18", "shirt1"),
        Product("Developes Badge Light Gray","$20", "shirt2"),
        Product("Developes Logo Shirt Red","$22", "shirt3"),
        Product("Developes Hustle","$22", "shirt4"),
        Product("Kickflip Studios","$18", "shirt5")
    )


    val digitalGood = listOf<Product>()

    fun getProducts(category: String) : List<Product>{

        return when(category) {
            "SHIRTS" -> shirts
            "HATS" -> hats
            "HOODIES" -> hoodies
            else -> digitalGood
        }

    }
}