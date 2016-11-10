package com.example.hosea.dr_r_android.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.androidquery.AQuery;
import com.example.hosea.dr_r_android.R;

public class MainActivity extends AppCompatActivity {

    private AQuery aq = new AQuery(this);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View button1 = findViewById(R.id.btn_main_1);
        button1.setOnClickListener(mClick);

        findViewById(R.id.btn_main_2).setOnClickListener(mClick);

        findViewById(R.id.btn_main_3).setOnClickListener(mClick);

        findViewById(R.id.btn_main_4).setOnClickListener(mClick);

        ImageView img = (ImageView) this.findViewById(R.id.img);
        aq.id(img).image("https://www.google.co.kr/images/branding/googlelogo/2x/googlelogo_color_272x92dp.png");

    }


    View.OnClickListener mClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.btn_main_1:
                    startActivity(new Intent(getApplicationContext(), ReadDiaryActivity.class));
                    break;
                case R.id.btn_main_2:
                    startActivity(new Intent(getApplicationContext(), WriteDiaryActivity.class));
                    break;
                case R.id.btn_main_3:
                    startActivity(new Intent(getApplicationContext(), ApplicationQnaActivity.class));
                    break;
                case R.id.btn_main_4:
                    startActivity(new Intent(getApplicationContext(), CallDrActivity.class));
                    break;
                //TODO shere버튼 생성 예정
//                    case R.id.share:
//                        Intent msg = new Intent(Intent.ACTION_SEND);
//                        msg.addCategory(Intent.CATEGORY_DEFAULT);
//                        msg.putExtra(Intent.EXTRA_SUBJECT, R.string.app_name);
//                        msg.putExtra(Intent.EXTRA_TEXT, "애플리케이션 공유하세요");
//                        msg.putExtra(Intent.EXTRA_TITLE, "제목");
//                        msg.setType("text/plain");
//                        startActivity(Intent.createChooser(msg, "공유하기"));
//                        break;
                default:
                    break;
            }
        }
    };

}