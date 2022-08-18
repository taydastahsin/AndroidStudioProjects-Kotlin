package com.taydatahsin.myapplication9

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_row.view.*
//recycler oluşurturdum
class recycllerClass(var kahramanListesi:ArrayList<String>,val kahramanImage:ArrayList<Int>) : RecyclerView.Adapter<recycllerClass.SuperKahramanVH>() {

    class SuperKahramanVH(itemView: View) : RecyclerView.ViewHolder( itemView) {//verdiğimiz değişkeni sınıf olarak tanımladım


    }
//Tanımlanan sınıfın fonksiyonlarını çağırdım
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {//ekran açılınca recycler 'ın nasıl çalışmasını gösteren kısım
        val itemView=LayoutInflater.from(parent.context).inflate(R.layout.recycler_row,parent,false)
        return SuperKahramanVH(itemView)
    }

    override fun getItemCount(): Int {//recycler adetini belirleyen kısım
        return  kahramanListesi.size
    }

    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {//ekran açılınca recycler 'a eklencek kısım
       holder.itemView.recyclerViewTextView.text=kahramanListesi.get(position)
        holder.itemView.setOnClickListener {
            val intent =Intent(holder.itemView.context,MainActivity2::class.java)
            intent.putExtra("superKahraman",kahramanListesi.get((position)))
            /*
            val singleton =singletonClass.secilenKahraman
            singleton.gorsel=kahramanImage.get(position)

             */
            intent.putExtra("kahramanGörselleri",kahramanImage.get(position))


            holder.itemView.context.startActivity(intent)
        }

    }



}