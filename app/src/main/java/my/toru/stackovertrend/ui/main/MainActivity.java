package my.toru.stackovertrend.ui.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import dagger.android.AndroidInjection;
import my.toru.stackovertrend.R;
import my.toru.stackovertrend.ui.main.mvp.MainPresenter;
import my.toru.stackovertrend.ui.main.mvp.MainView;

public class MainActivity extends AppCompatActivity implements MainView{

    @Inject
    MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter.onTriggerFetchData();
    }

    @Override
    public void onShowToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onShowProgress() {}

    @Override
    public void onHideProgress() {}

    @Override
    public void onUpdateMainList(List<String> list) {}
}