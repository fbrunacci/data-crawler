package org.nyway.es.data

// BEGIN model classes
data class Page(
    val url: String,
    val title: String,
    val description: String,
    val tags: List<String>,
    val domain: String
)
// END model classes
