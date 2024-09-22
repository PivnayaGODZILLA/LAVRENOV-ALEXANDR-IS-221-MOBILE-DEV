
fun main() {
    val originalMatrix = arrayOf(

        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )

    val doneMatrix = transMatrix(originalMatrix)

    println("Original Matrix:")
    for (row in originalMatrix) {
        println(row.contentToString())
    }

    println("Transposed Matrix:")
    for (row in doneMatrix) {
        println(row.contentToString())
    }
}

fun transMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val r = matrix.size
    val c = matrix[0].size
    val transposedMatrix = Array(c) { Array(r) { 0 } }

    for (i in 0 until r) {
        for (j in 0 until c) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}