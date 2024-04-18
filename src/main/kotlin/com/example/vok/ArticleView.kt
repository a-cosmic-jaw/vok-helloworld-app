package com.example.vok

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.*
import com.vaadin.flow.router.*

@Route("article", layout = MainLayout::class)
class ArticleView: KComposite(), HasUrlParameter<Long> {
    private lateinit var title: Text
    private lateinit var text: Text
    private val root = ui {
        verticalLayout {
            div {
                strong("Title: ")
                this@ArticleView.title = text("")
            }
            div {
                strong("Text: ")
                this@ArticleView.text = text("")
            }
        }
    }

    override fun setParameter(event: BeforeEvent, articleId: Long?) {
        val article = Article.getById(articleId!!)
        title.text = article.title
        text.text = article.text
    }

    companion object {
        fun navigateTo(articleId: Long) = navigateToView(ArticleView::class, articleId)
    }
}