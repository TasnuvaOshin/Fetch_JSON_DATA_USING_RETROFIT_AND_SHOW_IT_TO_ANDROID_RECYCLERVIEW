package csejobinterview.csejobinterviewquestion.RetrofitWork;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import csejobinterview.csejobinterviewquestion.R.layout;

public class DataAdapter extends RecyclerView.Adapter<DataViewHolder> {

    private List<DataSetClass> list;
    private Context context;

    public DataAdapter() {
    }

    public DataAdapter(List<DataSetClass> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public DataViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        return new DataViewHolder(LayoutInflater.from(context).
                inflate(layout.every_row, viewGroup, false));
    }

    @Override
    public void onBindViewHolder(@NonNull DataViewHolder dataViewHolder, int i) {
        DataSetClass currentdata = list.get(i);
        dataViewHolder.name.setText(currentdata.getName());
        dataViewHolder.education.setText(currentdata.getEducation());
        dataViewHolder.hobby.setText(currentdata.getHobby());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
