package com.example.myapplication.Fragments;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.myapplication.Adapter.HotProductAdapter;
import com.example.myapplication.Adapter.ManufacturerAdapter;
import com.example.myapplication.Models.HotProduct;
import com.example.myapplication.Models.Manufacturer;
import com.example.myapplication.R;
import com.example.myapplication.api.ApiService;

import java.util.ArrayList;
import java.util.List;

import me.relex.circleindicator.CircleIndicator3;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class HomeFragment extends Fragment {

    private ViewPager2 hotProductViewPager2;
    private HotProductAdapter hotProductAdapter;
    private CircleIndicator3 circleIndicator3;
    private List<HotProduct> hotProductList;
    private ManufacturerAdapter manufacturerAdapter;

    private List<Manufacturer> listManufacturers;
    private RecyclerView rcvManufacturer;
    private final Handler handler = new Handler();
    private final Runnable runnable = new Runnable() {
        @Override
        public void run() {
            if (hotProductViewPager2.getCurrentItem() == hotProductList.size() -1){
                hotProductViewPager2.setCurrentItem(0);
            }else {
                hotProductViewPager2.setCurrentItem(hotProductViewPager2.getCurrentItem() +1);
            }
        }
    };


    public HomeFragment() {
        // Required empty public constructor
    }
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false);

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);

        sliderImageHotProduct();
        showListManufacturer();
    }

    private void initView(View view) {
        hotProductViewPager2 = view.findViewById(R.id.viewpager2_introHotProduct);
        circleIndicator3 = view.findViewById(R.id.circleIndicator);
        rcvManufacturer = view.findViewById(R.id.rcv_manufacturer);
    }
    private List<HotProduct> getListHotProducts (){
        List<HotProduct> list = new ArrayList<>();
        list.add((new HotProduct(R.drawable.image_test, "siêu sell giảm \ngiá tận 20%")));
        list.add((new HotProduct(R.drawable.image_test, "siêu sell giảm \ngiá tận 20%")));
        list.add((new HotProduct(R.drawable.image_test, "siêu sell giảm \ngiá tận 20%")));
        list.add((new HotProduct(R.drawable.image_test, "siêu sell giảm \ngiá tận 20%")));


        return list;
    }
    private void sliderImageHotProduct(){
        hotProductList = getListHotProducts();
        hotProductAdapter = new HotProductAdapter(hotProductList);
        hotProductViewPager2.setAdapter(hotProductAdapter);
        circleIndicator3.setViewPager(hotProductViewPager2);
        hotProductViewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                super.onPageSelected(position);
                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 3000);
            }
        });
    }
    private void showListManufacturer(){
        listManufacturers = new ArrayList<>();
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false);
        rcvManufacturer.setLayoutManager(linearLayoutManager);
        callApiGetManufacturer();
    }
    private void callApiGetManufacturer(){
        ApiService.apiService.getListManufacturers().enqueue(new Callback<List<Manufacturer>>() {
            @Override
            public void onResponse(Call<List<Manufacturer>> call, Response<List<Manufacturer>> response) {
                listManufacturers = response.body();
                Log.d("body", String.valueOf(listManufacturers));
                manufacturerAdapter = new ManufacturerAdapter(listManufacturers);
                rcvManufacturer.setAdapter(manufacturerAdapter);
            }

            @Override
            public void onFailure(Call<List<Manufacturer>> call, Throwable t) {
                Toast.makeText(getActivity(), "call api failure", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public void onPause() {
        super.onPause();
        handler.removeCallbacks(runnable);
    }

    @Override
    public void onResume() {
        super.onResume();
        handler.postDelayed(runnable, 3000);
    }
}