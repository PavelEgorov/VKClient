package com.egorovsoft.vkclient.presenter

import com.egorovsoft.vkclient.view.MainView

class MainPresenter(val view: MainView) {

    fun getStringResurce(id : Int):String = view.getStringResurceById(id)
    /// Мне не нравится, что я получаю значение от View(пусть и через интерфейс). В идеале должен быть Observer и View должно иметь подписку на изменения
    /// Presenter вызывает событие и View его отрабатывает.
    /// В нашем случае View возвращает результат в Presenter... Не правильно...

}