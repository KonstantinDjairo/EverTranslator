package tw.firemaples.onscreenocr.views;

import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;

import tw.firemaples.onscreenocr.R;

/**
 * Created by louis1chen on 31/10/2016.
 */

public class FloatingBarMenu {
    private Context context;
    private PopupMenu popupMenu;
    private OnFloatingBarMenuCallback callback;

    public FloatingBarMenu(Context context, View anchor, OnFloatingBarMenuCallback callback) {
        this.context = context;
        this.callback = callback;

        popupMenu = new PopupMenu(context, anchor);
        popupMenu.inflate(R.menu.menu_floating_bar);
        popupMenu.setOnMenuItemClickListener(onMenuItemClickListener);
    }

    public void show() {
        popupMenu.show();
    }

    private PopupMenu.OnMenuItemClickListener onMenuItemClickListener = new PopupMenu.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            popupMenu.dismiss();
            int itemId = item.getItemId();
            if (itemId == R.id.menu_close) {
                if (callback != null) {
                    callback.onCloseItemClick();
                }
            }
            return false;
        }
    };

    public interface OnFloatingBarMenuCallback {
        void onCloseItemClick();
    }
}
