package com.example.tapesh.officeproject;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

/**
 * Created by TAPESH on 5/17/2016.
 */
public class OneFragment extends Fragment {
    FrameLayout frameLayout;
    FragmentTransaction ft;
    Button btn,btnhide,btnsubmit,btnmakepayment;
    View view;
    EditText editphonenumber,editBillNo,editBillAmount;
    String ephonenumber,eBillNo,eBillAmount;
    SetGetClass setget;
    public OneFragment()
    {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }



    @Override
   public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view=inflater.inflate(R.layout.fragment_one,container,false);

        btn=(Button)view.findViewById(R.id.button2);
        btnhide=(Button)view.findViewById(R.id.button3);
        btnsubmit=(Button)view.findViewById(R.id.button1);
        btnmakepayment=(Button)view.findViewById(R.id.button4);

        editphonenumber=(EditText)view.findViewById(R.id.editText1);
        editBillNo=(EditText)view.findViewById(R.id.editText2);
        editBillAmount=(EditText)view.findViewById(R.id.editText3);



        frameLayout=(FrameLayout)view.findViewById(R.id.your_placeholder);
        btnhide.setVisibility(View.GONE);



        btnmakepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ephonenumber=editphonenumber.getText().toString();
                eBillNo=editBillNo.getText().toString();
                eBillAmount=editBillAmount.getText().toString();


                if((!ephonenumber.equals(""))&&(!eBillNo.equals(""))&&(!eBillAmount.equals("")) ) {
                   // Toast.makeText(getActivity(), "button4", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getActivity(), MakePaymentActivity.class);
                    Bundle extras = new Bundle();
                    extras.putString("phonenumber",ephonenumber);
                    extras.putString("billno",eBillNo);
                    extras.putString("billamount",eBillAmount);
                    intent.putExtras(extras);
                    startActivity(intent);
                }else
                {
                    Toast.makeText(getActivity(), "Enter All Fields", Toast.LENGTH_SHORT).show();
                }
                }
        });




        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frameLayout.setVisibility(View.VISIBLE);
                btnhide.setVisibility(View.VISIBLE);
                btnsubmit.setVisibility(View.GONE);
                btnmakepayment.setVisibility(View.GONE);
                ft = getActivity().getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.your_placeholder, new InnerFragment());
                ft.commit();


                // Toast.makeText(getActivity(),"click",Toast.LENGTH_LONG).show();
            }
        });


        btnhide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                btnhide.setVisibility(View.GONE);
                btnsubmit.setVisibility(View.VISIBLE);
                btnmakepayment.setVisibility(View.VISIBLE);
                ft = getActivity().getSupportFragmentManager().beginTransaction();

                ft.addToBackStack(null);
                ft.commit();
                frameLayout.setVisibility(View.GONE);

            }
        });



        return view;

    }




}
