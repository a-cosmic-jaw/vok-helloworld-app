package com.example.vok

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.router.Route

@Route("create-article", layout = MainLayout::class)
class CreateArticleView: KComposite() {
    private val binder = beanValidationBinder<Article>()
    private val root = ui {
        verticalLayout {
            h1("New Article")
            textField("Title") {
                bind(binder).bind(Article::title)
            }
            textArea("Text") {
                bind(binder).bind(Article::text)
            }
            button("Save Article") {
                onClick {
                    val article = Article()
                    if (binder.writeBeanIfValid(article)) {
                        article.save()
                    }
                }
            }
        }
    }

    private fun onClick(function: () -> Unit) {

    }
}