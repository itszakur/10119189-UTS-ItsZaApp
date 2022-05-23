package com.example.a10119189_myselfapps;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class Daily extends AppCompatActivity {

    //(19 Mei 2022, 10119189,Reza Kurnia, IF-5)
    DrawerLayout drawerLayout;
    Context context, contextFriend;
    RecyclerView recyclerView, recyclerViewFriend;
    RecyclerView.Adapter recyclerViewAdapter, recyclerViewAdapterFriend;
    RecyclerView.LayoutManager recylerViewLayoutManager,recylerViewLayoutManageFriend;
    String[] subjects = {
            "Bangun", "Mandi", "Bersih-bersih", "Kuliah", "Main Game", "Nonton Film",
            "Olahraga", "Besih-bersih","Istirahat"
    };
    int[] subjectImage ={
            R.drawable.ic_bangun,R.drawable.ic_mandi,
            R.drawable.ic_bersihbersih,R.drawable.ic_kuliah,
            R.drawable.ic_console,R.drawable.ic_film,
            R.drawable.ic_basket,R.drawable.ic_bersihbersih,
            R.drawable.ic_tidur
    };
    String[] subjectsName = {
            "Kiki Mulyadi", "Albee Akbar", "Eza Aryodillah"
    };
    int[] subjectImageFriend ={
            R.drawable.myfriend1,R.drawable.myfriend3,
            R.drawable.myfriend2
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daily);

        context = getApplicationContext();
        recyclerView = findViewById(R.id.recyclerView);
        recylerViewLayoutManager = new LinearLayoutManager(context);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerView.setLayoutManager(recylerViewLayoutManager);
        recyclerViewAdapter = new AdapterRecyclerView(subjects, subjectImage,context );
        recyclerView.setAdapter(recyclerViewAdapter);

        contextFriend = getApplicationContext();
        recyclerViewFriend = findViewById(R.id.recyclerViewFriend);
        recylerViewLayoutManageFriend = new LinearLayoutManager(contextFriend,LinearLayoutManager.HORIZONTAL,false);
        //context,LinearLayoutManager.HORIZONTAL,false
        recyclerViewFriend.setLayoutManager(recylerViewLayoutManageFriend);
        recyclerViewAdapterFriend = new AdapterRecyclerViewFriend(subjectsName, subjectImageFriend,contextFriend );
        recyclerViewFriend.setAdapter(recyclerViewAdapterFriend);



        drawerLayout = findViewById(R.id.DrawerLayout);
    }
    public void ClickMenu(View view){
        //Open drawer
        com.example.a10119189_myselfapps.HomeActivity.openDrawer(drawerLayout);

    }
    public void ClickLogo(View view){
        com.example.a10119189_myselfapps.HomeActivity.closeDrawer(drawerLayout);
    }
    public void ClickHome(View view){
        //redirect to home
        com.example.a10119189_myselfapps.HomeActivity.redirectActivity(this, com.example.a10119189_myselfapps.HomeActivity.class);
    }
    public void ClickDaily(View view){
        //recreate
        recreate();
    }

    public void ClickGallery(View view){
        //redirect to gallery
        com.example.a10119189_myselfapps.HomeActivity.redirectActivity(this, com.example.a10119189_myselfapps.Gallery.class);
    }
    public void ClickMusic(View view){
        //redirect to music
        com.example.a10119189_myselfapps.HomeActivity.redirectActivity(this, com.example.a10119189_myselfapps.Music.class);
    }
    public void ClickProfile(View view){
        //redirect to profile
        com.example.a10119189_myselfapps.HomeActivity.redirectActivity(this,Profile.class);
    }
    public void ClickLogout(View view){
        //close
        com.example.a10119189_myselfapps.HomeActivity.logout(this);
    }

    @Override
    protected void onPause() {
        super.onPause();
        //close drawer
        com.example.a10119189_myselfapps.HomeActivity.closeDrawer(drawerLayout);
    }
}