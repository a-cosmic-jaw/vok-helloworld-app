package com.example.vok

import com.github.mvysny.karibudsl.v10.*
import com.vaadin.flow.component.Component
import com.vaadin.flow.router.Route
import java.lang.reflect.InvocationTargetException

@Route("")
class MyWelcomeView: KComposite() {
    private val root = ui {
        verticalLayout {
            h1("Hello, Vaadin-on-Kotlin!")
        }
    }
}