package org.example.structural.composite.category

import java.util.LinkedList

fun main() {
    val rootCategory = initializeCategoryHierarchy()
    printCategoryHierarchy("", rootCategory)
    println("*********************************")
    val cat = findCategory("2-1", rootCategory)
    println("find the category: $cat")
    if (cat != null) {
        printCategoryPath(cat)
    }
}

fun printCategoryPath(category: Category): Boolean {
    val parent = category.parent ?: return false
    val hasPrefix = printCategoryPath(parent)
    val prefix = if (hasPrefix) "->" else ""
    print("$prefix$category")
    return true
}

fun findCategory(id: String, root: Category): Category? {
    if (root.id == id) return root
    val queue = LinkedList<Category>()
    queue.offer(root)
    while (queue.isNotEmpty()) {
        var size = queue.size
        while (size-- > 0) {
            val category = queue.poll()
            if (category.id == id) {
                return category
            }
            category.getChildren().forEach { child ->
                queue.offer(child)
            }
        }
    }
    return null
}

fun printCategoryHierarchy(prefix: String, category: Category) {
    if (category.isLeaf()) {
        println("$prefix$category")
    }
    category.getChildren().forEach { child ->
        if (category.name == "---") {
            printCategoryHierarchy(prefix, child)
        } else {
            printCategoryHierarchy("$prefix$category->", child)
        }
    }
}

fun initializeCategoryHierarchy(): Category {
    val rootCategory = Category("---", "0")
    val level1 = Category("男性衣服", "1")
    val level2 = Category("女性衣服", "2")
    rootCategory.addChild(level1)
    rootCategory.addChild(level2)
    val level1_1 = Category("長褲", "1-1")
    val level1_2 = Category("衣服", "1-2")
    level1.addChild(level1_1)
    level1.addChild(level1_2)
    val level2_1 = Category("長褲", "2-1")
    val level2_2 = Category("衣服", "2-2")
    level2.addChild(level2_1)
    level2.addChild(level2_2)
    return rootCategory
}
