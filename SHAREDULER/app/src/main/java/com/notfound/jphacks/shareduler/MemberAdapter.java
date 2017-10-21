package com.notfound.jphacks.shareduler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Locale;

public class MemberAdapter extends BaseAdapter {
    Context context;
    LayoutInflater layoutInflater = null;
    ArrayList<MemberList> member;

    public MemberAdapter(Context context) {
        this.context = context;
        this.layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setMemberList(ArrayList<MemberList> member) {
        this.member = member;
    }

    @Override
    public int getCount() {
        return member.size();
    }

    @Override
    public Object getItem(int position) {
        return member.get(position);
    }

    @Override
    public long getItemId(int position) {
        return member.get(position).getID();
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = layoutInflater.inflate(R.layout.list_member,parent,false);

        ((TextView)convertView.findViewById(R.id.name)).setText(String.valueOf(member.get(position).getName()));
        ((TextView)convertView.findViewById(R.id.distance)).setText(String.valueOf(member.get(position).getDistance()));
        ((TextView)convertView.findViewById(R.id.timeMillis)).setText(String.valueOf(member.get(position).getTimeMIllis()));
        int mode = member.get(position).getMode();
        String str;
        if(mode==0){
            str="歩き";
        }else if(mode==2){
            str="車";
        }else if(mode==3){
            str="交通機関";
        }else {
            str="自転車";
        }
        ((TextView)convertView.findViewById(R.id.mode)).setText(str);


        return convertView;
    }

}
