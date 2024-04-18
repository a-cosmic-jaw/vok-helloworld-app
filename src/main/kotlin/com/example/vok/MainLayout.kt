package com.example.vok

import com.github.mvysny.karibudsl.v10.KComposite
import com.github.mvysny.karibudsl.v10.div
import com.vaadin.flow.component.page.Viewport
import com.vaadin.flow.router.RouterLayout

class MainLayout : KComposite(), RouterLayout {
    private val root = ui {
        div {
            setSizeFull()
        }
    }
}