package my.toru.stackovertrend.di;

import android.app.Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import my.toru.stackovertrend.app.AndroidApp;

/**
 * Created by toruchoi on 20/10/2017.
 */

@Component(modules = {AndroidInjectionModule.class, ActivityBuilder.class, AppModule.class})
public interface AppComponent {
    @Component.Builder
    interface Builder{
        @BindsInstance Builder application(Application application);
        AppComponent build();
    }

    void inject(AndroidApp app);
}