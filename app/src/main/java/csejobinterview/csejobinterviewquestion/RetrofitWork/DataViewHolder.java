package csejobinterview.csejobinterviewquestion.RetrofitWork;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import csejobinterview.csejobinterviewquestion.R;

public class DataViewHolder extends RecyclerView.ViewHolder {

    TextView name, education, hobby;

    public DataViewHolder(@NonNull View itemView) {
        super(itemView);

        name = itemView.findViewById(R.id.name);
        education = itemView.findViewById(R.id.education);
        hobby = itemView.findViewById(R.id.hobby);
    }
}
