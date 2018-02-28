package com.atsuya046

import io.github.benas.randombeans.api.EnhancedRandom
import org.junit.Assert.*
import org.junit.Test

class PersonTest {
    @Test
    fun testPerson() {
        val personA = EnhancedRandom.random(Person::class.java)
        val personB = EnhancedRandom.random(Person::class.java)
        assertFalse(personA == personB)
    }
}