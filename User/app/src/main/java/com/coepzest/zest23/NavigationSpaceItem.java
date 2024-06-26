package com.coepzest.zest23;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;

public class NavigationSpaceItem extends NavigationItem<NavigationSpaceItem.ViewHolder>{

    private int spaceDp;

    public NavigationSpaceItem(int spaceDp) {
        this.spaceDp = spaceDp;
    }

    @Override
    public ViewHolder createViewHolder(ViewGroup parent) {
        Context c = parent.getContext();
        View view = new View(c);
        int height = (int) (c.getResources().getDisplayMetrics().density * spaceDp);
        view.setLayoutParams(new ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                height));
        return new ViewHolder(view);
    }

    @Override
    public boolean isSelectable() {
        return false;
    }

    @Override
    public void bindViewHolder(ViewHolder holder) {

    }

    public class  ViewHolder extends NavigationAdapter.ViewHolder{

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
