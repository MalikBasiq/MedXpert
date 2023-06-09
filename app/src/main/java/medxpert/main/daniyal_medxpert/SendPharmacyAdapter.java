package medxpert.main.daniyal_medxpert;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import medxpert.main.daniyal_medxpert.ModelMedicine.MedicineModel;

public class SendPharmacyAdapter extends RecyclerView.Adapter<SendPharmacyAdapter.viewHolder>{


    private Context context;

    private ArrayList<MedicineModel> arrayList;

    public SendPharmacyAdapter(Context context, ArrayList<MedicineModel> medlist)
    {
        this.context=context;
        this.arrayList=medlist;
    }
    @NonNull
    @Override
    public SendPharmacyAdapter.viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.send_pharmacy_item_design,parent,false);
        return new SendPharmacyAdapter.viewHolder(view);
        //return null;
    }

    @Override
    public void onBindViewHolder(@NonNull SendPharmacyAdapter.viewHolder holder, int position) {

        MedicineModel medicineModel = arrayList.get(position);

        holder.medicineName.setText(medicineModel.getMedicineName());
        holder.morningQuantity.setText(medicineModel.getMorningQuantity());
        holder.eveningQuantity.setText(medicineModel.getEveningQuantity());
        holder.nightQuantity.setText(medicineModel.getNightQuantity());
        holder.duration.setText(medicineModel.getDuration());
        holder.direction.setText(medicineModel.getDirection());


    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder {
        TextView medicineName, morningQuantity, eveningQuantity, nightQuantity, duration, direction;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            medicineName = itemView.findViewById(R.id.nameofmedicine);
            morningQuantity = itemView.findViewById(R.id.quantitymorning);
            eveningQuantity = itemView.findViewById(R.id.quantityevening);
            nightQuantity = itemView.findViewById(R.id.quantitynight);
            duration = itemView.findViewById(R.id.duration);
            direction = itemView.findViewById(R.id.direction);

        }
    }
}
