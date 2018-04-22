package com.panibrat.hashtable.Sentence_Similarity_734

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SolutionTest {

    val sol = Solution()

    @Test
    fun areSentencesSimilarExample1() {
        val pairs = arrayOf(
                arrayOf("great", "fine"),
                arrayOf("acting", "drama"),
                arrayOf("skills", "talent"))
        val words1 = arrayOf("great", "acting", "skills")
        val words2 = arrayOf("fine", "drama", "talent")
        assertThat(sol.areSentencesSimilar(words1, words2, pairs)).isTrue()
    }

    @Test
    fun areSentencesSimilarExample2() {
        val pairs = emptyArray<Array<String>>()
        val words1 = arrayOf("great")
        val words2 = arrayOf("doubleplus", "good")
        assertThat(sol.areSentencesSimilar(words1, words2, pairs)).isFalse()
    }

    @Test
    fun areSentencesSimilarExample3() {
        val pairs = emptyArray<Array<String>>()
        val words1 = arrayOf("great")
        val words2 = arrayOf("great")
        assertThat(sol.areSentencesSimilar(words1, words2, pairs)).isTrue()
    }


}