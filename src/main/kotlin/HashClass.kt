import java.util.HashMap

class HashClass {

    private val myHash = HashMap<String, Double>()

    fun insertComponentsInHash(): HashMap<String, Double> {
        myHash["Banana"] = 1.65
        myHash["Maça"] = 2.00
        myHash["Abacate"] = 5.00

        return myHash
    }
}