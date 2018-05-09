package com.example.ryota.remotesystemstempfiles;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class VideoListHolder extends RecyclerView.ViewHolder {
    public TextView videoNameTextView;
    public VideoListHolder(View itemView) {
        super(itemView);
        videoNameTextView = itemView.findViewById(R.id.videoNameTextView);
    }
}
