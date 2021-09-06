package com.example.recycleview_bai3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Folder_Adapter extends RecyclerView.Adapter<Folder_Adapter.ViewHolder> {

    private ArrayList mFolder;
    private Context mContext;

    public Folder_Adapter(ArrayList mFolder, Context mContext) {
        this.mFolder = mFolder;
        this.mContext = mContext;
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        private View folderView;
        public TextView name;
        public ViewHolder(@NonNull View folderView)
        {
            super((folderView));
            folderView = folderView;
            name =folderView.findViewById(R.id.name);
        }

    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater =LayoutInflater.from(mContext);
        View bookItem =inflater.inflate(R.layout.folder_item,parent,false);
        ViewHolder viewHolder = new ViewHolder(bookItem);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Folder folder = (Folder) mFolder.get(position);
        holder.name.setText(folder.getmName());

    }

    @Override
    public int getItemCount() {
        return mFolder.size();
    }
}
