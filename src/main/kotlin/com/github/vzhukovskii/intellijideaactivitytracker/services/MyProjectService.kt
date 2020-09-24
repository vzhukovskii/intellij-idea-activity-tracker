package com.github.vzhukovskii.intellijideaactivitytracker.services

import com.intellij.openapi.project.Project
import com.github.vzhukovskii.intellijideaactivitytracker.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
