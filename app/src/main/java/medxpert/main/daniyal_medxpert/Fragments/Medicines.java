package medxpert.main.daniyal_medxpert.Fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import medxpert.main.daniyal_medxpert.AdapterMedicine.MedicineAdapter;
import medxpert.main.daniyal_medxpert.ModelMedicine.MedicineModel;
import medxpert.main.daniyal_medxpert.R;

import medxpert.main.daniyal_medxpert.SendPharmacy;
import medxpert.main.daniyal_medxpert.medicalrecordLayout2;
import medxpert.main.daniyal_medxpert.medicalrecordlayout1Adapter;
import medxpert.main.daniyal_medxpert.medicalrecordlayout1model;

import java.util.ArrayList;


public class Medicines extends Fragment {

    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        ArrayList<MedicineModel> selectedItems = new ArrayList<>(); //to detect checked medicines
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_medicines, container, false);

        recyclerView = view.findViewById(R.id.recyclerview1);

        ArrayList<MedicineModel> list = new ArrayList<>();
        list.add(new MedicineModel("Panadol (10mg)", "1","1", "1", "4 days", "2 hours after meal"));
        list.add(new MedicineModel("Amoxil", "0","1", "1", "4 days", "2 hours after meal"));
        list.add(new MedicineModel("brufin", "1","1", "1", "4 days", "2 hours after meal"));
        list.add(new MedicineModel("imodium", "4","1", "1", "4 days", "2 hours after meal"));
        list.add(new MedicineModel("leflox", "1","1", "1", "4 days", "2 hours after meal"));
        list.add(new MedicineModel("coldrex", "1","1", "1", "4 days", "2 hours after meal"));
        list.add(new MedicineModel("ceridal", "1","1", "1", "4 days", "2 hours after meal"));




        MedicineAdapter adapter = new MedicineAdapter(list, getContext());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(linearLayoutManager);
        Button btn = view.findViewById(R.id.sendpharmacy);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<MedicineModel> selectedItems = adapter.getSelectedItems();




                Intent intent = new Intent(getActivity(), SendPharmacy.class);
                intent.putExtra("SelectedItems", selectedItems);
                startActivity(intent);
//                intent.putParcelableArrayListExtra("selectedItems", (ArrayList<? extends Parcelable>) selectedItems);
//
//                startActivity(intent);
            }
        });
//
//        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
//        recyclerView.setLayoutManager(linearLayoutManager);


//        Button btn = view.findViewById(R.id.sendpharmacy);
//        btn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Intent intent = new Intent(getActivity(), SendPharmacy.class);
//                startActivity(intent);
//            }
//        });

        return view;
    }
}