package model;

/**
 * Created by wington on 2/1/17.
 */

public class NavDrawerItem {
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isShowNotify() {
        return showNotify;
    }

    public void setShowNotify(boolean showNotify) {
        this.showNotify = showNotify;
    }

    private boolean showNotify;
    private String title;

    public NavDrawerItem(){

    }

    public NavDrawerItem(boolean showNotify, String title){
        this.showNotify = showNotify;
        this.title = title;
    }
}
