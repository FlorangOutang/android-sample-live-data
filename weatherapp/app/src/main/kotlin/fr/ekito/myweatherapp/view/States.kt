package fr.ekito.myweatherapp.view

open class State

object LoadingState : State()

data class ErrorState(val error: Throwable) : State()