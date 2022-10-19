package com.develoware.vape;

import static android.content.ContentValues.TAG;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.QueryDocumentSnapshot;
import com.google.firebase.firestore.QuerySnapshot;

import java.util.ArrayList;

public class ShopDeviceMouthActivity extends Activity {

    String title = "입호흡 기기";

    // Define
    TextView shop_main_menu_title;

    ScrollView shop_main_content_scroll;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_main);

        RecyclerView shop_main_content_rv;
        //RecyclerView.Adapter adapter = new CustomAdapter(this);
        //RecyclerView.LayoutManager layout_manager = new LinearLayoutManager(this);
        //ArrayList<Product> arrayList;

        // Declare
        shop_main_menu_title = findViewById(R.id.shop_main_menu_title);

        shop_main_content_scroll = findViewById(R.id.shop_main_content_scroll);
        shop_main_content_rv = findViewById(R.id.shop_main_content_rv);

        // Function
        shop_main_menu_title.setText(title);

        shop_main_content_rv.setHasFixedSize(true);
        //shop_main_content_rv.setLayoutManager(layout_manager);
        FirebaseFirestore firestore = FirebaseFirestore.getInstance();
        firestore.collection("users")
                .get()
                .addOnCompleteListener(new OnCompleteListener<QuerySnapshot>() {
                    @Override
                    public void onComplete(@NonNull Task<QuerySnapshot> task) {
                        // 데이터를 가져오는 작업이 잘 동작했을 떄
                        if (task.isSuccessful()) {
                            for (QueryDocumentSnapshot document : task.getResult()) {
                                Log.d("TAG", document.getId() + " => " + document.getData());
                                System.out.println("TAG : "+document.getData());
                            }
                        }
                        // 데이터를 가져오는 작업이 에러났을 때
                        else {
                            Log.w("TAG", "Error => ", task.getException());
                        }
                    }
                });

        EventChangeListener();
    }

    private void EventChangeListener() {
    }
}
