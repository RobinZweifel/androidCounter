package ch.rz.counter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView count;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = (TextView)findViewById(R.id.count);
    }

    public void countUp(View view){
        counter++;
        String counterStr = Integer.toString(counter);
        count.setText(counterStr);

    }

    public void countDown(View view){
        counter--;
        String counterStr = Integer.toString(counter);
        count.setText(counterStr);

    }

    public void setToZero(View view){
        counter = 0;
        String counterStr = Integer.toString(counter);
        count.setText(counterStr);
    }
}