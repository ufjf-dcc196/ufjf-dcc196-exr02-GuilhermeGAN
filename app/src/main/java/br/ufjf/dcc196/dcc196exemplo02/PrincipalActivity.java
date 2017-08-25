package br.ufjf.dcc196.dcc196exemplo02;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PrincipalActivity extends AppCompatActivity {
    private EditText numero01;
    private EditText numero02;
    private TextView resultado;
    private Button  botaoSoma;
    private Button  botaoSub;
    private Button  botaoMult;
    private Button  botaoDiv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        //1 - Encontre os componentes de entrada
        numero01 = (EditText) findViewById(R.id.numero01);
        numero02 = (EditText) findViewById(R.id.numero02);

        //2 - Procure os componentes de saida
        resultado = (TextView) findViewById(R.id.resultado);

        //3 - Procure os componentes de controle
        botaoSoma = (Button) findViewById(R.id.somar);
        botaoSub = (Button) findViewById(R.id.sub);
        botaoMult = (Button) findViewById(R.id.mult);
        botaoDiv = (Button) findViewById(R.id.divisao);

        //4 - Configurar os ouvintes para eventos

        Soma soma = new Soma();
        botaoSoma.setOnClickListener(soma);
        Sub sub = new Sub();
        botaoSub.setOnClickListener(sub);
        Mult mult = new Mult();
        botaoMult.setOnClickListener(mult);
        Div div = new Div();
        botaoDiv.setOnClickListener(div);
    }

    private class Soma implements View.OnClickListener{

        @Override
        public void onClick(View view) {
          Integer n1 = Integer.parseInt(numero01.getText().toString());
          Integer n2 = Integer.parseInt(numero02.getText().toString());

            Integer soma = n1 + n2;

            resultado.setText("A soma de " + n1 + " e " + n2 + " é: " + soma);
        }
    }

    private class Sub implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Integer n1 = Integer.parseInt(numero01.getText().toString());
            Integer n2 = Integer.parseInt(numero02.getText().toString());

            Integer sub = n1 - n2;

            resultado.setText("A subtração de " + n1 + " e " + n2 + " é: " + sub);
        }
    }

    private class Mult implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Integer n1 = Integer.parseInt(numero01.getText().toString());
            Integer n2 = Integer.parseInt(numero02.getText().toString());

            Integer mult = n1 * n2;

            resultado.setText("A multiplicação de " + n1 + " e " + n2 + " é: " + mult);
        }
    }

    private class Div implements View.OnClickListener{

        @Override
        public void onClick(View view) {
            Integer n1 = Integer.parseInt(numero01.getText().toString());
            Integer n2 = Integer.parseInt(numero02.getText().toString());

            Integer div = n1/n2;

            resultado.setText("A divisão de " + n1 + " e " + n2 + " é: " + div);
        }
    }
}
