package my.toru.stackovertrend.di;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import my.toru.stackovertrend.ui.main.MainActivity;
import my.toru.stackovertrend.ui.main.MainActivityComponent;

/**
 * Created by toruchoi on 20/10/2017.
 */

@Module
public abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> bindMainActivity(MainActivityComponent.Builder builder);
}