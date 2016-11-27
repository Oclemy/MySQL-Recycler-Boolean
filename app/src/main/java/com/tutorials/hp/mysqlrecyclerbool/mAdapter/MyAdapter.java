package com.tutorials.hp.mysqlrecyclerbool.mAdapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorials.hp.mysqlrecyclerbool.R;
import com.tutorials.hp.mysqlrecyclerbool.mModel.Spacecraft;

import java.util.ArrayList;

/**
 * Created by Oclemy on 11/5/2016 for ProgrammingWizards Channel and http://www.camposha.info.
 */
public class MyAdapter extends RecyclerView.Adapter<MyViewHolder> {
    /*
    INSTANCE FIELDS
     */
    private Context c;
    private ArrayList<Spacecraft> spacecrafts;

    /*
    CONSTRUCTOR
     */
    public MyAdapter(Context c, ArrayList<Spacecraft> spacecrafts) {
        this.c = c;
        this.spacecrafts = spacecrafts;
    }

    /*
    INITIALIZE VIEWHOLDER
     */
    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v= LayoutInflater.from(c).inflate(R.layout.model,parent,false);
        return new MyViewHolder(v);
    }

    /*
    BIND DATA
     */
    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        Spacecraft s=spacecrafts.get(position);

        holder.txtName.setText(s.getName());
        holder.txtPropellant.setText(s.getPropellant());
        holder.chkTechExists.setChecked(s.getTechnologyExists()==1);
    }

    /*
    TOTAL NUM OF SPACECRAFTS
     */
    @Override
    public int getItemCount() {
        return spacecrafts.size();
    }
}
