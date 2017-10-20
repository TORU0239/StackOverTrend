package my.toru.stackovertrend.ui.main.mvp;

import javax.inject.Inject;

/**
 * Created by toruchoi on 20/10/2017.
 */

public class MainPresenterImp implements MainPresenter {

    MainView mainView;

    @Inject
    public MainPresenterImp(MainView mainView) {
        this.mainView = mainView;
    }

    @Override
    public void onTriggerFetchData() {
        mainView.onShowToast("fetch success!");
    }
}