package my.toru.stackovertrend.ui.main.mvp;

import java.util.List;

/**
 * Created by toruchoi on 20/10/2017.
 */

public interface MainView {
    void onShowToast(String msg);
    void onShowProgress();
    void onHideProgress();
    void onUpdateMainList(List<String> list);
}