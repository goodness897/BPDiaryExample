package com.compet.bpdiaryexample;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseExpandableListAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by goodn on 2016-12-24.
 */

public class NotiAdapter extends BaseExpandableListAdapter {

    List<NotiGroupItem> items = new ArrayList<>();

    public void put(String groupTitle, String groupDate, String childContent) {
        NotiGroupItem groupItem = null;

        groupItem = new NotiGroupItem();
        groupItem.setTitle(groupTitle);
        groupItem.setDate(groupDate);
        items.add(groupItem);

        if(!TextUtils.isEmpty(childContent)) {
            NotiChildItem child = new NotiChildItem();
            child.setChildContent(childContent);
            groupItem.getChildItems().add(child);
        }

        notifyDataSetChanged();
    }

    @Override
    public int getGroupCount() {
        return items.size();
    }

    @Override
    public int getChildrenCount(int groupPosition) {
        return items.get(groupPosition).getChildItems().size();
    }

    @Override
    public Object getGroup(int groupPosition) {
        return items.get(groupPosition);
    }

    @Override
    public Object getChild(int groupPosition, int childPosition) {
        return items.get(groupPosition).getChildItems().get(childPosition);
    }

    @Override
    public long getGroupId(int groupPosition) {
        return ((long)groupPosition);
    }

    @Override
    public long getChildId(int groupPosition, int childPosition) {
        return ((long)groupPosition)<<32|childPosition;
    }

    @Override
    public boolean hasStableIds() {
        return true;
    }

    @Override
    public View getGroupView(int groupPosition, boolean isExpanded, View convertView, ViewGroup parent) {
        NotiGroupView view;
        if(convertView == null) {
            view = new NotiGroupView(parent.getContext());

        } else {
            view = (NotiGroupView)convertView;
        }
        view.setGroupItem(items.get(groupPosition));

        if (isExpanded) {
            view.getIndicatorView().setImageResource(R.drawable.ic_noti_acodi_sel);
        } else {
            view.getIndicatorView().setImageResource(R.drawable.ic_device_list_down);
        }

        return view;

    }

    @Override
    public View getChildView(int groupPosition, int childPosition, boolean isLastChild, View convertView, ViewGroup parent) {
        NotiChildView view;
        if(convertView == null) {
            view = new NotiChildView(parent.getContext());
        } else {
            view = (NotiChildView)convertView;
        }
        view.setChildItem(items.get(groupPosition).getChildItems().get(childPosition));

        return view;
    }

    @Override
    public boolean isChildSelectable(int groupPosition, int childPosition) {
        return true;
    }
}
