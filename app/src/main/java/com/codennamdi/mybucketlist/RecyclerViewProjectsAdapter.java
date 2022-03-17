package com.codennamdi.mybucketlist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerViewProjectsAdapter extends RecyclerView.Adapter<RecyclerViewProjectsAdapter.projectsViewHolder> {

    private Projects[] projects;

    public RecyclerViewProjectsAdapter(Projects[] projects) {
        this.projects = projects;
    }

    @Override
    public int getItemCount() {
        return projects.length;
    }

    @NonNull
    @Override
    public projectsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_projects_items, parent, false);
        return new projectsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull projectsViewHolder holder, int position) {
        holder.bind(projects[position], position);
    }

    static class projectsViewHolder extends RecyclerView.ViewHolder {

        //Class variable
        ImageView iLoveImage;
        TextView iLoveTitle;
        TextView iLoveDescription;
        RatingBar iLoveRatingBar;


        public projectsViewHolder(@NonNull View itemView) {
            super(itemView);

            //Finding ids
            iLoveImage = itemView.findViewById(R.id.image_view_project_item_image);
            iLoveTitle = itemView.findViewById(R.id.text_view_project_items_title);
            iLoveDescription = itemView.findViewById(R.id.text_view_project_items_description);
            iLoveRatingBar = itemView.findViewById(R.id.rating_bar);
        }

        public void bind(Projects project, int position) {
            String titleNumber = position + 1 + ". " + project.title;
            iLoveTitle.setText(titleNumber);
            iLoveDescription.setText(project.description);
            iLoveImage.setImageResource(project.image);
            iLoveRatingBar.setRating(project.rating);
        }
    }
}

