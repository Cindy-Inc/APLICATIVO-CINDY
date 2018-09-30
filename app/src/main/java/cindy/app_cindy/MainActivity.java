package cindy.app_cindy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends DebugActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }

    public void logar(View v) {
        TextView tLogin = (TextView) findViewById(R.id.tLogin);
        TextView tSenha = (TextView) findViewById(R.id.tSenha);
        String login = tLogin.getText().toString();
        String senha = tSenha.getText().toString();
        if (login.equals("admin") && senha.equals("admin")) {
            Intent intent = new Intent(getApplicationContext(), MainCindy.class);
            startActivity(intent);

        } else {
            alert("Login e senha incorretos.");
        }
    }

    public void cadastro(View v) {

        Intent intent = new Intent(getApplicationContext(), Cadastro.class);
        startActivity(intent);

    }

    private void alert(String s) {
        //A classe Toast mostra um alerta temporário muito comum no Android
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();

    }


}
