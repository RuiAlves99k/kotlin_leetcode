package learn.hashing

/**
 * Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 *
 * Each letter in magazine can only be used once in ransomNote.
 * Example 1:
 *
 * Input: ransomNote = "a", magazine = "b"
 * Output: false
 * Example 2:
 *
 * Input: ransomNote = "aa", magazine = "ab"
 * Output: false
 * Example 3:
 *
 * Input: ransomNote = "aa", magazine = "aab"
 * Output: true
 */
class RansomNote {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val occurrencesNote = hashMapOf<Char, Int>()
        for (letter in ransomNote){
            occurrencesNote[letter] = occurrencesNote.getOrDefault(letter, 0) + 1
        }
        for (letter in magazine) {
            if (occurrencesNote.contains(letter)){
                occurrencesNote[letter] = occurrencesNote.getOrDefault(letter, 0) -1
            }
        }
        for (letter in occurrencesNote.keys){
            if (occurrencesNote.getOrDefault(letter, 0) > 0){
                return false
            }
        }
        return true
    }
}