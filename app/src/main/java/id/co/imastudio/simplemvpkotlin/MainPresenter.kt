package id.co.imastudio.simplemvpkotlin

/**
 * Created by nandoseptianhusni on 2/17/18.
 */
class MainPresenter {


    var mainView : MainView? = null

    constructor(mainView: MainView?) {
        this.mainView = mainView
    }


    fun logicView(input : String){

        //kondisional check dia kosong apa enggak
        if(input.isEmpty()){
            mainView?.Salah()
        }
        else{
            mainView?.Success()
        }

    }

}