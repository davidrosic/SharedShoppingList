package david.rosic.shoppinglist;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Fragment_Login fragmentLogin;
    private Fragment_Register fragmentRegister;
    private Button btnLogin;
    private Button btnRegister;
    public static final String DB_NAME = "shared_list_app.db";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentLogin = Fragment_Login.newInstance("param1","param2");
        fragmentRegister = Fragment_Register.newInstance("param1","param2");

        btnLogin = findViewById(R.id.main_act_btn_login);
        btnRegister = findViewById(R.id.main_act_btn_register);

        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.main_act_btn_login:
                btnLogin.setVisibility(View.INVISIBLE);
                btnRegister.setVisibility(View.INVISIBLE);
                getSupportFragmentManager().beginTransaction().add(R.id.main_act_main_frame, fragmentLogin).commit();
                break;
            case R.id.main_act_btn_register:
                btnLogin.setVisibility(View.INVISIBLE);
                btnRegister.setVisibility(View.INVISIBLE);
                getSupportFragmentManager().beginTransaction().add(R.id.main_act_main_frame, fragmentRegister).commit();
                break;
        }
    }

    @Override
    public void onBackPressed() {
        if (fragmentLogin.isAdded()) {
            getSupportFragmentManager().beginTransaction().remove(fragmentLogin).commit();
        }
        if (fragmentRegister.isAdded()) {
            getSupportFragmentManager().beginTransaction().remove(fragmentRegister).commit();
        }
        btnLogin.setVisibility(View.VISIBLE);
        btnRegister.setVisibility(View.VISIBLE);
    }

}