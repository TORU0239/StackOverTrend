package my.toru.stackovertrend.di;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import my.toru.stackovertrend.ui.main.MainActivityComponent;

/**
 * Created by toruchoi on 20/10/2017.
 */

@Module(subcomponents = {MainActivityComponent.class})
public class AppModule {
    @Provides
    @Singleton
    Context provideContext(Application application){
        return application;
    }
}
