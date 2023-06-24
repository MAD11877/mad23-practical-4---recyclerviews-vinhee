package sg.edu.np.mad.practical4;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class myViewHolder extends RecyclerView.ViewHolder{
    TextView txt;
    TextView txt2;
    ImageView pfp;


    public myViewHolder(View itemView){
        super(itemView);
        txt = itemView.findViewById(R.id.ProfileName);
        txt2 = itemView.findViewById(R.id.Description);
        pfp = itemView.findViewById(R.id.ProfileImg);
    }
}

