package sg.edu.np.mad.practical4;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Random;

public class ListActivity extends AppCompatActivity {

    final String TAG = "List Activity";
    ArrayList<MyObject> Object_List = new ArrayList<>();
    ImageView profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        for (int i = 0; i < 20; i++) {
            MyObject obj = new MyObject();

            Random randomNum = new Random();
            int ranNum = randomNum.nextInt(999999999);

            Random randomDesc = new Random();
            int ranDesc = randomDesc.nextInt(999999999);

            String Name = "Name" + ranNum;
            String Description = "Description: " + ranDesc;

            obj.setMyUser(Name);
            obj.setMyDescription(Description);

            Object_List.add(obj);
        }

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new myAdapter(Object_List, this));
    }
}
