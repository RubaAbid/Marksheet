package com.ruba.marksheet;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



public class NewActivity extends MainActivity {

    Button mSheet;
    TextView result;
    EditText edit_total, edit_java, edit_php, edit_html;
    int total_no = 0, obtained_no = 0 , percent = 0, java_no, php_no, html_no;


    /** Called when the activity is first created. */

    @Override

    public void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.marksheet);

        edit_total = (EditText)findViewById(R.id.edit_total);
        edit_java = (EditText)findViewById(R.id.edit_java);
        edit_php = (EditText)findViewById(R.id.edit_php);
        edit_html = (EditText)findViewById(R.id.edit_html);
        mSheet = (Button)findViewById(R.id.marks);
        result = (TextView)findViewById(R.id.tvresult);

        mSheet.setOnClickListener(new View.OnClickListener(){



            public void onClick(View v) {

                // TODO Auto-generated method stub
                total_no = Integer.parseInt(edit_total.getText().toString());
                java_no = Integer.parseInt(edit_java.getText().toString());
                php_no = Integer.parseInt(edit_php.getText().toString());
                html_no = Integer.parseInt(edit_html.getText().toString());
                obtained_no = java_no + php_no + html_no;
                percent = (obtained_no *100)/ total_no;

                if(percent >= 33 )

                {

                    result.setText("Total Marks are: "+ total_no + "\nObtained Marks are: "+obtained_no+"\nPercentage: "+ percent +"\nResult: Pass");

                }

                else

                {

                    result.setText("Total Marks are: "+ total_no + "\nObtained Marks are: "+obtained_no+"\nResult: Fail");

                }
            }
        });
    }
}
