package com.example.vok

import com.github.vokorm.*
import com.gitlab.mvysny.jdbiorm.Dao

data class Article(
    override var id: Long? = null,

    var title: String? = null,

    var text: String? = null
) : KEntity<Long> {
    companion object : Dao<Article, Long>(Article::class.java)
}