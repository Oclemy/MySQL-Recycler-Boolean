package com.tutorials.hp.mysqlrecyclerbool.mAdapter;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.tutorials.hp.mysqlrecyclerbool.R;

/**
 * Created by Oclemy on 11/5/2016 for ProgrammingWizards Channel and http://www.camposha.info.
 */
public class MyViewHolder extends RecyclerView.ViewHolder {


    TextView txtName,txtPropellant;
    CheckBox chkTechExists;
    public MyViewHolder(View view) {
        super(view);

         txtName = (TextView) view.findViewById(R.id.nameTxt);
         txtPropellant = (TextView) view.findViewById(R.id.txtPropellant);

         chkTechExists = (CheckBox) view.findViewById(R.id.chkTechExists);
    }
}
