package kr.tjeit.a20181215_01_helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    Button signUpBtn;
    CheckBox allCheckBox;
    EditText idEdt;
    EditText pwEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        allCheckBox = findViewById(R.id.allCheckBox);
        signUpBtn = findViewById(R.id.signUpBtn);
        idEdt = findViewById(R.id.idEdt);
        pwEdt = findViewById(R.id.pwEdt);

        //signUpBtn.setText("회원가입");
        
        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputUserId = idEdt.getText().toString();
                String inputUserPw = pwEdt.getText().toString();

                Toast.makeText(SignUpActivity.this, String.format("ID : %s, PW : %s 로 로그인 합니다.", inputUserId, inputUserPw), Toast.LENGTH_SHORT).show();

                Log.d("회원가입시도","id : "+inputUserId);
            }
        });
        
        allCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                
                if (isChecked) {
                    Toast.makeText(SignUpActivity.this, "전체 체크 됨", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(SignUpActivity.this, "체크 해제 됨", Toast.LENGTH_SHORT).show();
                }
                
            }
        });
        
        signUpBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Toast.makeText(SignUpActivity.this, "버튼 길게 눌림", Toast.LENGTH_SHORT).show();

//                false면 롱클릭 후, 일반클릭 이벤트도 실행. true면 롱클릭만 실행되고 마무리
                return true;
            }
        });
    }
    
    
}
