package com.rojincalculatetaxamount;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText etSalary;
    private Button btnCalculate;
    private TextView tvOutput, tvTotal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etSalary = findViewById(R.id.etSalary);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvOutput = findViewById(R.id.tvOutput);
        tvTotal=findViewById(R.id.tvTotal);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Validation()) {

                    float salary = Float.parseFloat(etSalary.getText().toString());
                    RojinCalculateTax rojincalculatetax = new RojinCalculateTax(salary);
                    tvTotal.setText(Float.toString(rojincalculatetax.getRojin_totalsalary()));
                    tvOutput.setText(Float.toString(rojincalculatetax.calculateTax()));
                }
            }
        });

    }

    public Boolean Validation(){

        if (TextUtils.isEmpty(etSalary.getText())){

            etSalary.requestFocus();
            etSalary.setError("Please enter salary");
            return false;
        }
        return true;
    }
}
