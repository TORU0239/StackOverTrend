package my.toru.stackovertrend.ui.main;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by toruchoi on 20/10/2017.
 */

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}