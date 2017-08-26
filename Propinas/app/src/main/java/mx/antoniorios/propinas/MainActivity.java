package mx.antoniorios.propinas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt10;
    private Button bt20;
    private EditText number;
    private TextView propina;
    private TextView cantidad;
    private TextView total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt10=(Button)findViewById(R.id.bt10);
        bt20=(Button)findViewById(R.id.bt20);
        number=(EditText)findViewById(R.id.cantNumber);
        cantidad=(TextView) findViewById(R.id.canttext);
        total=(TextView) findViewById(R.id.totalText);
        propina=(TextView) findViewById(R.id.propinaText);


        bt10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                    colocaPropina(.10);


            }
        });

        bt20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                colocaPropina(.15);


            }
        });

    }

    private void colocaPropina(double porcentaje){

        String numero=number.getText().toString();
        if(!numero.equals(""))
        {
            double dCant= Double.parseDouble(numero);
            double dPro=dCant*(porcentaje);
            double dTot=dCant+dPro;
            cantidad.setText("Cantidad: "+dCant);
            propina.setText("Propina: "+dPro);
            total.setText("Total: "+dTot);
        }
        else
        {
            cantidad.setText("Cantidad: 0");
            propina.setText("Propina: 0");
            total.setText("Total: 0");
        }


    }
}
