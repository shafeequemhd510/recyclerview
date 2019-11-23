package com.example.myrecdone;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class UserAdapter extends RecyclerView.Adapter <UserAdapter.UserHolder>{

    List<Users>users;


    UserAdapter(List<Users>users){this.users=users;}



    @NonNull
    @Override
    public UserHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater=LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.userlayout,parent,false);


        return new UserHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserHolder holder, final int position) {
      /* final int pictureName= users.get(position).picname;
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),Display.class);

                intent.putExtra("imageId",pictureName);
                v.getContext().startActivity(intent);
            }
        });*/

      holder.imageView.setOnClickListener(new View.OnClickListener() {

          int pictureName=users.get(position).picname;
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(v.getContext(),Display.class);
              intent.putExtra("imageId",pictureName);
              v.getContext().startActivity(intent);

          }
      });

        holder.imageView.setImageResource(users.get(position).picname);

        holder.textView.setText(users.get(position).discription);


    }

    @Override
    public int getItemCount()
    {
        return users.size();
    }

    public class UserHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textView;

        public UserHolder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.imageView);
            textView=itemView.findViewById(R.id.textView);

        }


        }
    }
