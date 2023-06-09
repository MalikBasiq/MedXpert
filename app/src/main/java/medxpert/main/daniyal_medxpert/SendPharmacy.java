package medxpert.main.daniyal_medxpert;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

import medxpert.main.daniyal_medxpert.ModelMedicine.MedicineModel;
import medxpert.main.daniyal_medxpert.SendPharmacyAdapter;

public class SendPharmacy extends AppCompatActivity
{

    LinearLayoutManager linearLayout;
    RecyclerView SendPharmacyRecycler;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_send_pharmacy);

        Intent intent = getIntent();

        ArrayList<MedicineModel> SelectedItems = (ArrayList<MedicineModel>) intent.getSerializableExtra("SelectedItems");

        SendPharmacyRecycler=findViewById(R.id.recyclersendpharmacy);




        SendPharmacyAdapter sendpharmacyadapterobj = new SendPharmacyAdapter(this, SelectedItems ); //passing array list "routine_Intake_List" inside it

        SendPharmacyRecycler.setAdapter(sendpharmacyadapterobj);
        linearLayout = new LinearLayoutManager(this);
        SendPharmacyRecycler.setLayoutManager(linearLayout);


//        TextView result = findViewById(R.id.result);
//            String res =myList.get(1).getMedicineName();
//            System.out.println(res);
//
//        result.setText(res);


        //ArrayList<MedicineModel> checkedItems = getIntent().getParcelableArrayListExtra("selectedItems");

    }
}