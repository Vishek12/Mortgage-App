package ca.yorku.themortageapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /*
    * This method is invoked when the app is first launched
    */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    //3 helper methods

    //this method retreives what is entered by the user (textView)
    private String getInputOfTextField(int id) {
        View view = findViewById(id);
        EditText editText = (EditText) view;
        String input = editText.getText().toString();
        return input;
    }

    //this mutator sets the mutator outputs text
    private void setContentsOfTextView(int id, String newContents) {
        View view = findViewById(id);
        TextView textView = (TextView) view;
        textView.setText(newContents);
    }

    //Controller method to be attached to GUI components

    public void computeMonthlyPaymentClicked(View view){

        //we want to retreive the principle, interest rate and the amortization entered by the user

        String principle = getInputOfTextField(R.id.principle_Input);

        String amortization =  getInputOfTextField(R.id.amortization_Input);

        String interest = getInputOfTextField(R.id.interest_Input);

        //now we create a mortage model object with the retreived inputs
        MortgageModel m1 = new MortgageModel(principle, amortization, interest);

        String monthlyAmount = m1.computePayment();

        //Display output to the user
        setContentsOfTextView(R.id.monthly, monthlyAmount);


    }









}