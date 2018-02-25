package com.example.linggom.berliantoparlinggomansaragih_1202150016_modul3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Linggom on 25/02/2018.
 */

    public class Daftarmenu extends AppCompatActivity {
        RecyclerView recv;
        menuadapter adptr;
        List<listmenu> daftarmenu;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.daftarmenu);
            //set title bar menjadi Dafter Air Mineral
            setTitle("Daftar Air Mineral");

            //membuat array list baru dengan nama daftarmenu
            daftarmenu = new ArrayList<>();
            //mendapat penanganan recycler view
            recv = findViewById(R.id.rvmenu);
            recv.setHasFixedSize(true);
            //kondisi ketika orientasi menjadi landscape
            if(getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
                //maka akan menampilkan 2 grid
                recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 2));
                //jika orientasi menjadi portrait
            }else {
                //maka akan menampilkan satu grid saja
                recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 1));
            }
            //menjalankan fungsi input data
            inputdata();
        }

        @Override
        public void onConfigurationChanged(Configuration newConfig) {
            super.onConfigurationChanged(newConfig);
            if(newConfig.orientation== Configuration.ORIENTATION_LANDSCAPE){
                recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 2));
            }else {
                recv.setLayoutManager(new GridLayoutManager(Daftarmenu.this, 1));
            }
        }

        public void inputdata(){
            //memasukkan data ke dalam array
            daftarmenu.add(new listmenu(R.drawable.ades, "Ades", "Ini adalah air mineral merk Ades. \nAdes (Lorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem."));
            daftarmenu.add(new listmenu(R.drawable.amidis,"Amidis", "Ini adalah air mineral merk Amidis. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.aqua, "Aqua", "Ini adalah air mineral merk Aqua. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.cleo, "Cleo", "Ini adalah air mineral merk Cleo. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.club, "Club", "Ini adalah air mineral merk Club. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.equil, "Equil", "Ini adalah air mineral merk Equil. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.evian, "Evian", "Ini adalah air mineral merk Evian. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.leminerale, "leMinerale", "Ini adalah air mineral merk leMinerale. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem."));
            daftarmenu.add(new listmenu(R.drawable.nestle, "Nestle", "Ini adalah air mineral merk Nestle. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.pristine, "Pristine", "Ini adalah air mineral merk Pristine. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            daftarmenu.add(new listmenu(R.drawable.vit, "Vit", "Ini adalah air mineral merk Vit. \nLorem ipsum dolor sit amet, consectetur adipiscing elit. Maecenas\n" +
                    "        vitae semper quam. In a metus ut nisl pharetra hendrerit et a leo. Curabitur nec sapien\n" +
                    "        odio. Vestibulum a mollis felis. Cras molestie felis nibh, ut maximus mauris feugiat\n" +
                    "        tincidunt. Curabitur ultricies eros sed ipsum pulvinar vehicula. Maecenas volutpat,\n" +
                    "        massa sit amet aliquam eleifend, massa lorem tempor sapien, eget finibus massa dolor\n" +
                    "        molestie lorem. Suspendisse at purus mauris. Proin nibh ligula, suscipit vel pharetra\n" +
                    "        posuere, bibendum id lorem"));
            //membuat adapter baru yang menghubungkan kelas ini dengan data yang ingin ditampilkan
            adptr = new menuadapter(this,daftarmenu);
            //menguhubungkan recycler view dengan adapter
            recv.setAdapter(adptr);
        }
    }


