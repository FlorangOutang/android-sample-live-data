package fr.ekito.myweatherapp.view

open class Event

object LoadingEvent : Event()

object SuccessEvent : Event()

data class FailedEvent(val error : Throwable) : Event()