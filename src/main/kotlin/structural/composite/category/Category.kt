package org.example.structural.composite.category

class Category(
    val name: String,
    val id: String,
) {
    var parent: Category? = null

    private val children = mutableListOf<Category>()

    fun addChild(category: Category) {
        children.add(category)
        category.parent = this
    }

    fun getChildren(): List<Category> = children

    fun isLeaf() = children.isEmpty()

    override fun toString(): String {
        return "($name <$id>)"
    }
}
