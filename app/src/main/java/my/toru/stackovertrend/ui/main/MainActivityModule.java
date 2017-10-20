package my.toru.stackovertrend.ui.main;

import dagger.Module;
import dagger.Provides;
import my.toru.stackovertrend.ui.main.mvp.MainPresenter;
import my.toru.stackovertrend.ui.main.mvp.MainPresenterImp;
import my.toru.stackovertrend.ui.main.mvp.MainView;

/**
 * Created by toruchoi on 20/10/2017.
 */

@Module
public class MainActivityModule {
    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @Provides
    MainPresenter provideMainPresenter(MainView mainView){
        return new MainPresenterImp(mainView);
    }
}