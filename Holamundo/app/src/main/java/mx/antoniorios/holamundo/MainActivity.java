package mx.antoniorios.holamundo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView tv1;
    private EditText et1;

    private Button btn1;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1=(TextView)findViewById(R.id.textView1);
        btn1=(Button)findViewById(R.id.button1);
        et1=(EditText) findViewById(R.id.textInput1);
        random= new Random();
        btn1.setOnClickListener(
                new View.OnClickListener(){

                    @Override
                    public void onClick(View view) {
                        ////version 1
                        String[] textos= {
                                "texto 1","texto 2","texto 3","texto 4"
                        };
                        int indice= random.nextInt(4);
                        //tv1.setText(textos[indice]);
                        ///version 1

                        String mensaje=et1.getText().toString();
                        tv1.setText(mensaje);

                    }
                });


    }
}
