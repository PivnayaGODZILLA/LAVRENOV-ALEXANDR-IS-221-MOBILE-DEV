fun main() {
    val mat = arrayOf(
        arrayOf(1,2,3),
        arrayOf(2,4,5),
        arrayOf(2,5,5)

    )
    for (row in mat) {
        println(row.contentToString())
    }
    println()
    val trsn = transposeMatrix(mat)
    for (row in trsn) {
        println(row.contentToString())
    }
}
fun transposeMatrix(matrix: Array<Array<Int>>): Array<Array<Int>> {
    val rows = matrix.size
    val columns = matrix[0].size
    val transposedMatrix = Array(columns) { Array(rows) { 0 } }

    for (i in 0 until rows) {
        for (j in 0 until columns) {
            transposedMatrix[j][i] = matrix[i][j]
        }
    }

    return transposedMatrix
}