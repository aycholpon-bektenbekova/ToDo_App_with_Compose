package com.example.todoappwithcompose.navigation

import androidx.navigation.NavHost
import androidx.navigation.NavHostController
import com.example.todoappwithcompose.util.Action
import com.example.todoappwithcompose.util.Constants.LIST_SCREEN

class Screens(navController: NavHostController) {
val list: (Action) -> Unit = { action ->
    navController.navigate("list|/${action.name}") {
        popUpTo(LIST_SCREEN) { inclusive = true}
    }
}
    val task: (Int) -> Unit = {taskId ->
        navController.navigate("task/$taskId")
    }
}