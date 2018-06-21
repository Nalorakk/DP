package com.example.alex.diplom;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class LibraActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_libra);

        final TextView stakan = findViewById(R.id.stakan);
        final TextView stlog = findViewById(R.id.stlog);
        final TextView chlog = findViewById(R.id.chlog);
        Spinner spinner = findViewById(R.id.spinner2);
        final TextView stakantext = findViewById(R.id.stakantext);
        final TextView stlogtext = findViewById(R.id.stlogtext);
        final TextView chlogtext = findViewById(R.id.chlogtext);
        ArrayAdapter adapter = ArrayAdapter.createFromResource(this, R.array.libra, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String[] stakanS = getResources().getStringArray(R.array.librastakan);
                String[] stlogS = getResources().getStringArray(R.array.librastlog);
                String[] chlogS = getResources().getStringArray(R.array.librachlog);
                if(stakanS[position].equals("-"))
                {
                    stakantext.setVisibility(View.INVISIBLE);
                    stakan.setVisibility(View.INVISIBLE);
                }
                else
                {
                    stakantext.setVisibility(View.VISIBLE);
                    stakan.setVisibility(View.VISIBLE);
                    stakan.setText(stakanS[position]);
                }
                if(stlogS[position].equals("-"))
                {
                    stlogtext.setVisibility(View.INVISIBLE);
                    stlog.setVisibility(View.INVISIBLE);
                }
                else
                {
                    stlogtext.setVisibility(View.VISIBLE);
                    stlog.setVisibility(View.VISIBLE);
                    stlog.setText(stlogS[position]);
                }
                if(chlogS[position].equals("-"))
                {
                    chlogtext.setVisibility(View.INVISIBLE);
                    chlog.setVisibility(View.INVISIBLE);
                }
                else
                {
                    chlogtext.setVisibility(View.VISIBLE);
                    chlog.setVisibility(View.VISIBLE);
                    chlog.setText(chlogS[position]);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });


    }
    public void onClickLibraS(View view)
    {

        EditText textl = findViewById(R.id.editText);
        TextView stakan = findViewById(R.id.stakan);
        TextView stlog = findViewById(R.id.stlog);
        TextView chlog = findViewById(R.id.chlog);
        int st, sg, cg;
        String editextif = textl.getText().toString();
//        int nul = Integer.parseInt(editextif);
        if (editextif.length()==0)
        {
            Toast.makeText(LibraActivity.this, "Поле не может быть пустым", Toast.LENGTH_SHORT).show();
        }

//            else if (nul == 0)
//            {
//                Toast.makeText(LibraActivity.this, "Введите положительное число", Toast.LENGTH_SHORT).show();
//            }
            else
            {
                st = Integer.parseInt(textl.getText().toString()) / Integer.parseInt(stakan.getText().toString());
                sg = Integer.parseInt(textl.getText().toString()) / Integer.parseInt(stlog.getText().toString());
                cg = Integer.parseInt(textl.getText().toString()) / Integer.parseInt(chlog.getText().toString());
                stakan.setText(Integer.toString(st));
                stlog.setText(Integer.toString(sg));
                chlog.setText(Integer.toString(cg));
            }

    }


}
