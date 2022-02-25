package com.example.myfirstapp;

import android.graphics.Color;
import androidx.annotation.NonNull;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class ScoreAdapter extends RecyclerView.Adapter<ScoreAdapter.ViewHolder>{
    @NonNull
    @Override
    public ScoreAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.scoreboard_line, parent, false);
        Log.d("Debug", "On createViewHolder");
        return new ViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull ScoreAdapter.ViewHolder viewHolder, int i) {
        viewHolder.setScore(ScoreSingleton.getInstance().score_list.get(i));

      /*  if(i%2 == 0){
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#5E8E8E"));
        } else {
            viewHolder.itemView.setBackgroundColor(Color.parseColor("#DFF2D6"));
        }

       */

        Log.d("Debug", "onBind");

    }

    @Override
    public int getItemCount() {
        int size = ScoreSingleton.getInstance().score_list.size();
        Log.d("Debug", "getItemCount "+size);
        return size;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        private TextView textViewNote;
        private TextView textViewDate;
        private TextView textViewPosition;

        public ViewHolder( View itemView) {
            super(itemView);
            textViewDate = itemView.findViewById(R.id.textview_score_date);
            textViewNote = itemView.findViewById(R.id.textview_score_note);
            textViewPosition = itemView.findViewById(R.id.textview_score_position);
            Log.d("Debug", "élément associé");
        }

        public void setScore(Score score){
            textViewNote.setText(Integer.toString(score.note)+"/20");
            textViewDate.setText(score.date);
            textViewPosition.setText("Partie "+Integer.toString(score.position)+" :");

            Log.d("Debug", "Setscore");
        }
    }
}